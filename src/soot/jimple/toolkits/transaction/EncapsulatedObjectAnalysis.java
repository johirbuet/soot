package soot.jimple.toolkits.transaction;

import soot.*;
import soot.util.*;
import java.util.*;
import soot.toolkits.mhp.*;
import soot.toolkits.graph.*;
import soot.toolkits.scalar.*;
import soot.jimple.toolkits.callgraph.*;
import soot.tagkit.*;
import soot.jimple.internal.*;
import soot.jimple.*;
import soot.jimple.spark.sets.*;
import soot.jimple.spark.pag.*;
import soot.toolkits.scalar.*;

// EncapsulatedObjectAnalysis written by Richard L. Halpert, 2006-12-26
// Checks if all methods of a class are "object-pure", meaning that
// they read and write only themselves and new local objects

public class EncapsulatedObjectAnalysis // extends ForwardFlowAnalysis
{
	List cachedClasses;
	List objectPureMethods;
	List objectPureInitMethods;
	
	public EncapsulatedObjectAnalysis()
	{
		cachedClasses = new ArrayList();
		objectPureMethods = new ArrayList();
		objectPureInitMethods = new ArrayList();
	}
	
	public boolean isMethodPureOnObject(SootMethod sm)
	{
		if( !cachedClasses.contains(sm.getDeclaringClass()) && sm.isConcrete() ) // NOT A COMPLETE SOLUTION (ignores subclassing)
		{
			SootMethod initMethod = null;
			Collection methods = sm.getDeclaringClass().getMethods();
			Iterator methodsIt = methods.iterator();
			List mayBePureMethods = new ArrayList(methods.size());
			while(methodsIt.hasNext())
			{
				SootMethod method = (SootMethod) methodsIt.next();
				if(method.isConcrete())
				{
					if(method.getSubSignature().startsWith("void <init>"))
						initMethod = method;
					Body b = method.retrieveActiveBody();
					EncapsulatedMethodAnalysis ema = new EncapsulatedMethodAnalysis(new ExceptionalUnitGraph(b));
					if(ema.isPure())
					{
						mayBePureMethods.add(method);
					}
				}
			}
			
			if(mayBePureMethods.size() == methods.size())
				objectPureMethods.addAll(mayBePureMethods);
			else if(initMethod != null)
				objectPureMethods.add(initMethod);
			if(initMethod != null)
				objectPureInitMethods.add(initMethod);
		}
		
		return objectPureMethods.contains(sm);
	}
	
	public boolean isInitMethodPureOnObject(SootMethod sm)
	{
		G.v().out.print("Testing Init Method Encapsulation: " + sm + " Encapsulated: ");
		if(isMethodPureOnObject(sm))
		{
			boolean ret = objectPureInitMethods.contains(sm);
			G.v().out.println(ret);
			return ret;
		}
		G.v().out.println("false");
		return false;
	}
	
	public List getObjectPureMethodsSoFar()
	{
		return objectPureMethods;
	}
}

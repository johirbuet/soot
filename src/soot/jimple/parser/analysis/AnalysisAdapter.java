/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.analysis;

import java.util.*;
import soot.jimple.parser.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAFile(AFile node)
    {
        defaultCase(node);
    }

    public void caseAAbstractModifier(AAbstractModifier node)
    {
        defaultCase(node);
    }

    public void caseAFinalModifier(AFinalModifier node)
    {
        defaultCase(node);
    }

    public void caseANativeModifier(ANativeModifier node)
    {
        defaultCase(node);
    }

    public void caseAPublicModifier(APublicModifier node)
    {
        defaultCase(node);
    }

    public void caseAProtectedModifier(AProtectedModifier node)
    {
        defaultCase(node);
    }

    public void caseAPrivateModifier(APrivateModifier node)
    {
        defaultCase(node);
    }

    public void caseAStaticModifier(AStaticModifier node)
    {
        defaultCase(node);
    }

    public void caseASynchronizedModifier(ASynchronizedModifier node)
    {
        defaultCase(node);
    }

    public void caseATransientModifier(ATransientModifier node)
    {
        defaultCase(node);
    }

    public void caseAVolatileModifier(AVolatileModifier node)
    {
        defaultCase(node);
    }

    public void caseAStrictfpModifier(AStrictfpModifier node)
    {
        defaultCase(node);
    }

    public void caseAEnumModifier(AEnumModifier node)
    {
        defaultCase(node);
    }

    public void caseAAnnotationModifier(AAnnotationModifier node)
    {
        defaultCase(node);
    }

    public void caseAClassFileType(AClassFileType node)
    {
        defaultCase(node);
    }

    public void caseAInterfaceFileType(AInterfaceFileType node)
    {
        defaultCase(node);
    }

    public void caseAExtendsClause(AExtendsClause node)
    {
        defaultCase(node);
    }

    public void caseAImplementsClause(AImplementsClause node)
    {
        defaultCase(node);
    }

    public void caseAFileBody(AFileBody node)
    {
        defaultCase(node);
    }

    public void caseASingleNameList(ASingleNameList node)
    {
        defaultCase(node);
    }

    public void caseAMultiNameList(AMultiNameList node)
    {
        defaultCase(node);
    }

    public void caseAClassNameSingleClassNameList(AClassNameSingleClassNameList node)
    {
        defaultCase(node);
    }

    public void caseAClassNameMultiClassNameList(AClassNameMultiClassNameList node)
    {
        defaultCase(node);
    }

    public void caseAFieldMember(AFieldMember node)
    {
        defaultCase(node);
    }

    public void caseAMethodMember(AMethodMember node)
    {
        defaultCase(node);
    }

    public void caseAVoidType(AVoidType node)
    {
        defaultCase(node);
    }

    public void caseANovoidType(ANovoidType node)
    {
        defaultCase(node);
    }

    public void caseASingleParameterList(ASingleParameterList node)
    {
        defaultCase(node);
    }

    public void caseAMultiParameterList(AMultiParameterList node)
    {
        defaultCase(node);
    }

    public void caseAParameter(AParameter node)
    {
        defaultCase(node);
    }

    public void caseAThrowsClause(AThrowsClause node)
    {
        defaultCase(node);
    }

    public void caseABooleanBaseTypeNoName(ABooleanBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseAByteBaseTypeNoName(AByteBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseACharBaseTypeNoName(ACharBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseAShortBaseTypeNoName(AShortBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseAIntBaseTypeNoName(AIntBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseALongBaseTypeNoName(ALongBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseAFloatBaseTypeNoName(AFloatBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseADoubleBaseTypeNoName(ADoubleBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseANullBaseTypeNoName(ANullBaseTypeNoName node)
    {
        defaultCase(node);
    }

    public void caseABooleanBaseType(ABooleanBaseType node)
    {
        defaultCase(node);
    }

    public void caseAByteBaseType(AByteBaseType node)
    {
        defaultCase(node);
    }

    public void caseACharBaseType(ACharBaseType node)
    {
        defaultCase(node);
    }

    public void caseAShortBaseType(AShortBaseType node)
    {
        defaultCase(node);
    }

    public void caseAIntBaseType(AIntBaseType node)
    {
        defaultCase(node);
    }

    public void caseALongBaseType(ALongBaseType node)
    {
        defaultCase(node);
    }

    public void caseAFloatBaseType(AFloatBaseType node)
    {
        defaultCase(node);
    }

    public void caseADoubleBaseType(ADoubleBaseType node)
    {
        defaultCase(node);
    }

    public void caseANullBaseType(ANullBaseType node)
    {
        defaultCase(node);
    }

    public void caseAClassNameBaseType(AClassNameBaseType node)
    {
        defaultCase(node);
    }

    public void caseABaseNonvoidType(ABaseNonvoidType node)
    {
        defaultCase(node);
    }

    public void caseAQuotedNonvoidType(AQuotedNonvoidType node)
    {
        defaultCase(node);
    }

    public void caseAIdentNonvoidType(AIdentNonvoidType node)
    {
        defaultCase(node);
    }

    public void caseAFullIdentNonvoidType(AFullIdentNonvoidType node)
    {
        defaultCase(node);
    }

    public void caseAArrayBrackets(AArrayBrackets node)
    {
        defaultCase(node);
    }

    public void caseAEmptyMethodBody(AEmptyMethodBody node)
    {
        defaultCase(node);
    }

    public void caseAFullMethodBody(AFullMethodBody node)
    {
        defaultCase(node);
    }

    public void caseADeclaration(ADeclaration node)
    {
        defaultCase(node);
    }

    public void caseAUnknownJimpleType(AUnknownJimpleType node)
    {
        defaultCase(node);
    }

    public void caseANonvoidJimpleType(ANonvoidJimpleType node)
    {
        defaultCase(node);
    }

    public void caseALocalName(ALocalName node)
    {
        defaultCase(node);
    }

    public void caseASingleLocalNameList(ASingleLocalNameList node)
    {
        defaultCase(node);
    }

    public void caseAMultiLocalNameList(AMultiLocalNameList node)
    {
        defaultCase(node);
    }

    public void caseALabelStatement(ALabelStatement node)
    {
        defaultCase(node);
    }

    public void caseABreakpointStatement(ABreakpointStatement node)
    {
        defaultCase(node);
    }

    public void caseAEntermonitorStatement(AEntermonitorStatement node)
    {
        defaultCase(node);
    }

    public void caseAExitmonitorStatement(AExitmonitorStatement node)
    {
        defaultCase(node);
    }

    public void caseATableswitchStatement(ATableswitchStatement node)
    {
        defaultCase(node);
    }

    public void caseALookupswitchStatement(ALookupswitchStatement node)
    {
        defaultCase(node);
    }

    public void caseAIdentityStatement(AIdentityStatement node)
    {
        defaultCase(node);
    }

    public void caseAIdentityNoTypeStatement(AIdentityNoTypeStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssignStatement(AAssignStatement node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAGotoStatement(AGotoStatement node)
    {
        defaultCase(node);
    }

    public void caseANopStatement(ANopStatement node)
    {
        defaultCase(node);
    }

    public void caseARetStatement(ARetStatement node)
    {
        defaultCase(node);
    }

    public void caseAReturnStatement(AReturnStatement node)
    {
        defaultCase(node);
    }

    public void caseAThrowStatement(AThrowStatement node)
    {
        defaultCase(node);
    }

    public void caseAInvokeStatement(AInvokeStatement node)
    {
        defaultCase(node);
    }

    public void caseALabelName(ALabelName node)
    {
        defaultCase(node);
    }

    public void caseACaseStmt(ACaseStmt node)
    {
        defaultCase(node);
    }

    public void caseAConstantCaseLabel(AConstantCaseLabel node)
    {
        defaultCase(node);
    }

    public void caseADefaultCaseLabel(ADefaultCaseLabel node)
    {
        defaultCase(node);
    }

    public void caseAGotoStmt(AGotoStmt node)
    {
        defaultCase(node);
    }

    public void caseACatchClause(ACatchClause node)
    {
        defaultCase(node);
    }

    public void caseANewExpression(ANewExpression node)
    {
        defaultCase(node);
    }

    public void caseACastExpression(ACastExpression node)
    {
        defaultCase(node);
    }

    public void caseAInstanceofExpression(AInstanceofExpression node)
    {
        defaultCase(node);
    }

    public void caseAInvokeExpression(AInvokeExpression node)
    {
        defaultCase(node);
    }

    public void caseAReferenceExpression(AReferenceExpression node)
    {
        defaultCase(node);
    }

    public void caseABinopExpression(ABinopExpression node)
    {
        defaultCase(node);
    }

    public void caseAUnopExpression(AUnopExpression node)
    {
        defaultCase(node);
    }

    public void caseAImmediateExpression(AImmediateExpression node)
    {
        defaultCase(node);
    }

    public void caseASimpleNewExpr(ASimpleNewExpr node)
    {
        defaultCase(node);
    }

    public void caseAArrayNewExpr(AArrayNewExpr node)
    {
        defaultCase(node);
    }

    public void caseAMultiNewExpr(AMultiNewExpr node)
    {
        defaultCase(node);
    }

    public void caseAArrayDescriptor(AArrayDescriptor node)
    {
        defaultCase(node);
    }

    public void caseAReferenceVariable(AReferenceVariable node)
    {
        defaultCase(node);
    }

    public void caseALocalVariable(ALocalVariable node)
    {
        defaultCase(node);
    }

    public void caseABinopBoolExpr(ABinopBoolExpr node)
    {
        defaultCase(node);
    }

    public void caseAUnopBoolExpr(AUnopBoolExpr node)
    {
        defaultCase(node);
    }

    public void caseANonstaticInvokeExpr(ANonstaticInvokeExpr node)
    {
        defaultCase(node);
    }

    public void caseAStaticInvokeExpr(AStaticInvokeExpr node)
    {
        defaultCase(node);
    }

    public void caseABinopExpr(ABinopExpr node)
    {
        defaultCase(node);
    }

    public void caseAUnopExpr(AUnopExpr node)
    {
        defaultCase(node);
    }

    public void caseASpecialNonstaticInvoke(ASpecialNonstaticInvoke node)
    {
        defaultCase(node);
    }

    public void caseAVirtualNonstaticInvoke(AVirtualNonstaticInvoke node)
    {
        defaultCase(node);
    }

    public void caseAInterfaceNonstaticInvoke(AInterfaceNonstaticInvoke node)
    {
        defaultCase(node);
    }

    public void caseAMethodSignature(AMethodSignature node)
    {
        defaultCase(node);
    }

    public void caseAArrayReference(AArrayReference node)
    {
        defaultCase(node);
    }

    public void caseAFieldReference(AFieldReference node)
    {
        defaultCase(node);
    }

    public void caseAIdentArrayRef(AIdentArrayRef node)
    {
        defaultCase(node);
    }

    public void caseAQuotedArrayRef(AQuotedArrayRef node)
    {
        defaultCase(node);
    }

    public void caseALocalFieldRef(ALocalFieldRef node)
    {
        defaultCase(node);
    }

    public void caseASigFieldRef(ASigFieldRef node)
    {
        defaultCase(node);
    }

    public void caseAFieldSignature(AFieldSignature node)
    {
        defaultCase(node);
    }

    public void caseAFixedArrayDescriptor(AFixedArrayDescriptor node)
    {
        defaultCase(node);
    }

    public void caseASingleArgList(ASingleArgList node)
    {
        defaultCase(node);
    }

    public void caseAMultiArgList(AMultiArgList node)
    {
        defaultCase(node);
    }

    public void caseALocalImmediate(ALocalImmediate node)
    {
        defaultCase(node);
    }

    public void caseAConstantImmediate(AConstantImmediate node)
    {
        defaultCase(node);
    }

    public void caseAIntegerConstant(AIntegerConstant node)
    {
        defaultCase(node);
    }

    public void caseAFloatConstant(AFloatConstant node)
    {
        defaultCase(node);
    }

    public void caseAStringConstant(AStringConstant node)
    {
        defaultCase(node);
    }

    public void caseAClzzConstant(AClzzConstant node)
    {
        defaultCase(node);
    }

    public void caseANullConstant(ANullConstant node)
    {
        defaultCase(node);
    }

    public void caseAAndBinop(AAndBinop node)
    {
        defaultCase(node);
    }

    public void caseAOrBinop(AOrBinop node)
    {
        defaultCase(node);
    }

    public void caseAXorBinop(AXorBinop node)
    {
        defaultCase(node);
    }

    public void caseAModBinop(AModBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpBinop(ACmpBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpgBinop(ACmpgBinop node)
    {
        defaultCase(node);
    }

    public void caseACmplBinop(ACmplBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpeqBinop(ACmpeqBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpneBinop(ACmpneBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpgtBinop(ACmpgtBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpgeBinop(ACmpgeBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpltBinop(ACmpltBinop node)
    {
        defaultCase(node);
    }

    public void caseACmpleBinop(ACmpleBinop node)
    {
        defaultCase(node);
    }

    public void caseAShlBinop(AShlBinop node)
    {
        defaultCase(node);
    }

    public void caseAShrBinop(AShrBinop node)
    {
        defaultCase(node);
    }

    public void caseAUshrBinop(AUshrBinop node)
    {
        defaultCase(node);
    }

    public void caseAPlusBinop(APlusBinop node)
    {
        defaultCase(node);
    }

    public void caseAMinusBinop(AMinusBinop node)
    {
        defaultCase(node);
    }

    public void caseAMultBinop(AMultBinop node)
    {
        defaultCase(node);
    }

    public void caseADivBinop(ADivBinop node)
    {
        defaultCase(node);
    }

    public void caseALengthofUnop(ALengthofUnop node)
    {
        defaultCase(node);
    }

    public void caseANegUnop(ANegUnop node)
    {
        defaultCase(node);
    }

    public void caseAQuotedClassName(AQuotedClassName node)
    {
        defaultCase(node);
    }

    public void caseAIdentClassName(AIdentClassName node)
    {
        defaultCase(node);
    }

    public void caseAFullIdentClassName(AFullIdentClassName node)
    {
        defaultCase(node);
    }

    public void caseAQuotedName(AQuotedName node)
    {
        defaultCase(node);
    }

    public void caseAIdentName(AIdentName node)
    {
        defaultCase(node);
    }

    public void caseTIgnored(TIgnored node)
    {
        defaultCase(node);
    }

    public void caseTAbstract(TAbstract node)
    {
        defaultCase(node);
    }

    public void caseTFinal(TFinal node)
    {
        defaultCase(node);
    }

    public void caseTNative(TNative node)
    {
        defaultCase(node);
    }

    public void caseTPublic(TPublic node)
    {
        defaultCase(node);
    }

    public void caseTProtected(TProtected node)
    {
        defaultCase(node);
    }

    public void caseTPrivate(TPrivate node)
    {
        defaultCase(node);
    }

    public void caseTStatic(TStatic node)
    {
        defaultCase(node);
    }

    public void caseTSynchronized(TSynchronized node)
    {
        defaultCase(node);
    }

    public void caseTTransient(TTransient node)
    {
        defaultCase(node);
    }

    public void caseTVolatile(TVolatile node)
    {
        defaultCase(node);
    }

    public void caseTStrictfp(TStrictfp node)
    {
        defaultCase(node);
    }

    public void caseTEnum(TEnum node)
    {
        defaultCase(node);
    }

    public void caseTAnnotation(TAnnotation node)
    {
        defaultCase(node);
    }

    public void caseTClass(TClass node)
    {
        defaultCase(node);
    }

    public void caseTInterface(TInterface node)
    {
        defaultCase(node);
    }

    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    public void caseTBoolean(TBoolean node)
    {
        defaultCase(node);
    }

    public void caseTByte(TByte node)
    {
        defaultCase(node);
    }

    public void caseTShort(TShort node)
    {
        defaultCase(node);
    }

    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    public void caseTLong(TLong node)
    {
        defaultCase(node);
    }

    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    public void caseTDouble(TDouble node)
    {
        defaultCase(node);
    }

    public void caseTNullType(TNullType node)
    {
        defaultCase(node);
    }

    public void caseTUnknown(TUnknown node)
    {
        defaultCase(node);
    }

    public void caseTExtends(TExtends node)
    {
        defaultCase(node);
    }

    public void caseTImplements(TImplements node)
    {
        defaultCase(node);
    }

    public void caseTBreakpoint(TBreakpoint node)
    {
        defaultCase(node);
    }

    public void caseTCase(TCase node)
    {
        defaultCase(node);
    }

    public void caseTCatch(TCatch node)
    {
        defaultCase(node);
    }

    public void caseTCmp(TCmp node)
    {
        defaultCase(node);
    }

    public void caseTCmpg(TCmpg node)
    {
        defaultCase(node);
    }

    public void caseTCmpl(TCmpl node)
    {
        defaultCase(node);
    }

    public void caseTDefault(TDefault node)
    {
        defaultCase(node);
    }

    public void caseTEntermonitor(TEntermonitor node)
    {
        defaultCase(node);
    }

    public void caseTExitmonitor(TExitmonitor node)
    {
        defaultCase(node);
    }

    public void caseTGoto(TGoto node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTInstanceof(TInstanceof node)
    {
        defaultCase(node);
    }

    public void caseTInterfaceinvoke(TInterfaceinvoke node)
    {
        defaultCase(node);
    }

    public void caseTLengthof(TLengthof node)
    {
        defaultCase(node);
    }

    public void caseTLookupswitch(TLookupswitch node)
    {
        defaultCase(node);
    }

    public void caseTNeg(TNeg node)
    {
        defaultCase(node);
    }

    public void caseTNew(TNew node)
    {
        defaultCase(node);
    }

    public void caseTNewarray(TNewarray node)
    {
        defaultCase(node);
    }

    public void caseTNewmultiarray(TNewmultiarray node)
    {
        defaultCase(node);
    }

    public void caseTNop(TNop node)
    {
        defaultCase(node);
    }

    public void caseTRet(TRet node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTSpecialinvoke(TSpecialinvoke node)
    {
        defaultCase(node);
    }

    public void caseTStaticinvoke(TStaticinvoke node)
    {
        defaultCase(node);
    }

    public void caseTTableswitch(TTableswitch node)
    {
        defaultCase(node);
    }

    public void caseTThrow(TThrow node)
    {
        defaultCase(node);
    }

    public void caseTThrows(TThrows node)
    {
        defaultCase(node);
    }

    public void caseTVirtualinvoke(TVirtualinvoke node)
    {
        defaultCase(node);
    }

    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }

    public void caseTFrom(TFrom node)
    {
        defaultCase(node);
    }

    public void caseTTo(TTo node)
    {
        defaultCase(node);
    }

    public void caseTWith(TWith node)
    {
        defaultCase(node);
    }

    public void caseTCls(TCls node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTLBracket(TLBracket node)
    {
        defaultCase(node);
    }

    public void caseTRBracket(TRBracket node)
    {
        defaultCase(node);
    }

    public void caseTLParen(TLParen node)
    {
        defaultCase(node);
    }

    public void caseTRParen(TRParen node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    public void caseTColonEquals(TColonEquals node)
    {
        defaultCase(node);
    }

    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    public void caseTCmpeq(TCmpeq node)
    {
        defaultCase(node);
    }

    public void caseTCmpne(TCmpne node)
    {
        defaultCase(node);
    }

    public void caseTCmpgt(TCmpgt node)
    {
        defaultCase(node);
    }

    public void caseTCmpge(TCmpge node)
    {
        defaultCase(node);
    }

    public void caseTCmplt(TCmplt node)
    {
        defaultCase(node);
    }

    public void caseTCmple(TCmple node)
    {
        defaultCase(node);
    }

    public void caseTShl(TShl node)
    {
        defaultCase(node);
    }

    public void caseTShr(TShr node)
    {
        defaultCase(node);
    }

    public void caseTUshr(TUshr node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTFullIdentifier(TFullIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTQuotedName(TQuotedName node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTAtIdentifier(TAtIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTBoolConstant(TBoolConstant node)
    {
        defaultCase(node);
    }

    public void caseTIntegerConstant(TIntegerConstant node)
    {
        defaultCase(node);
    }

    public void caseTFloatConstant(TFloatConstant node)
    {
        defaultCase(node);
    }

    public void caseTStringConstant(TStringConstant node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}

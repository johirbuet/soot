/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AMultiNewExpr extends PNewExpr
{
    private TNewmultiarray _newmultiarray_;
    private TLParen _lParen_;
    private PBaseType _baseType_;
    private TRParen _rParen_;
    private final LinkedList<PArrayDescriptor> _arrayDescriptor_ = new LinkedList<PArrayDescriptor>();

    public AMultiNewExpr()
    {
        // Constructor
    }

    public AMultiNewExpr(
        @SuppressWarnings("hiding") TNewmultiarray _newmultiarray_,
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PBaseType _baseType_,
        @SuppressWarnings("hiding") TRParen _rParen_,
        @SuppressWarnings("hiding") List<PArrayDescriptor> _arrayDescriptor_)
    {
        // Constructor
        setNewmultiarray(_newmultiarray_);

        setLParen(_lParen_);

        setBaseType(_baseType_);

        setRParen(_rParen_);

        setArrayDescriptor(_arrayDescriptor_);

    }

    @Override
    public Object clone()
    {
        return new AMultiNewExpr(
            cloneNode(this._newmultiarray_),
            cloneNode(this._lParen_),
            cloneNode(this._baseType_),
            cloneNode(this._rParen_),
            cloneList(this._arrayDescriptor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiNewExpr(this);
    }

    public TNewmultiarray getNewmultiarray()
    {
        return this._newmultiarray_;
    }

    public void setNewmultiarray(TNewmultiarray node)
    {
        if(this._newmultiarray_ != null)
        {
            this._newmultiarray_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._newmultiarray_ = node;
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PBaseType getBaseType()
    {
        return this._baseType_;
    }

    public void setBaseType(PBaseType node)
    {
        if(this._baseType_ != null)
        {
            this._baseType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._baseType_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    public LinkedList<PArrayDescriptor> getArrayDescriptor()
    {
        return this._arrayDescriptor_;
    }

    public void setArrayDescriptor(List<PArrayDescriptor> list)
    {
        this._arrayDescriptor_.clear();
        this._arrayDescriptor_.addAll(list);
        for(PArrayDescriptor e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._newmultiarray_)
            + toString(this._lParen_)
            + toString(this._baseType_)
            + toString(this._rParen_)
            + toString(this._arrayDescriptor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._newmultiarray_ == child)
        {
            this._newmultiarray_ = null;
            return;
        }

        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._baseType_ == child)
        {
            this._baseType_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        if(this._arrayDescriptor_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._newmultiarray_ == oldChild)
        {
            setNewmultiarray((TNewmultiarray) newChild);
            return;
        }

        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._baseType_ == oldChild)
        {
            setBaseType((PBaseType) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        for(ListIterator<PArrayDescriptor> i = this._arrayDescriptor_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PArrayDescriptor) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}

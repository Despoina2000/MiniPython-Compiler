/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AArrayStatement extends PStatement
{
    private TId _id_;
    private PExpression _expression1_;
    private PExpression _expression2_;

    public AArrayStatement()
    {
    }

    public AArrayStatement(
        TId _id_,
        PExpression _expression1_,
        PExpression _expression2_)
    {
        setId(_id_);

        setExpression1(_expression1_);

        setExpression2(_expression2_);

    }
    public Object clone()
    {
        return new AArrayStatement(
            (TId) cloneNode(_id_),
            (PExpression) cloneNode(_expression1_),
            (PExpression) cloneNode(_expression2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayStatement(this);
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public PExpression getExpression1()
    {
        return _expression1_;
    }

    public void setExpression1(PExpression node)
    {
        if(_expression1_ != null)
        {
            _expression1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression1_ = node;
    }

    public PExpression getExpression2()
    {
        return _expression2_;
    }

    public void setExpression2(PExpression node)
    {
        if(_expression2_ != null)
        {
            _expression2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression2_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_expression1_)
            + toString(_expression2_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_expression1_ == child)
        {
            _expression1_ = null;
            return;
        }

        if(_expression2_ == child)
        {
            _expression2_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_expression1_ == oldChild)
        {
            setExpression1((PExpression) newChild);
            return;
        }

        if(_expression2_ == oldChild)
        {
            setExpression2((PExpression) newChild);
            return;
        }

    }
}

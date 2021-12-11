/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AMinusEqualCompEqs extends PCompEqs
{
    private TMinusEq _minusEq_;

    public AMinusEqualCompEqs()
    {
    }

    public AMinusEqualCompEqs(
        TMinusEq _minusEq_)
    {
        setMinusEq(_minusEq_);

    }
    public Object clone()
    {
        return new AMinusEqualCompEqs(
            (TMinusEq) cloneNode(_minusEq_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusEqualCompEqs(this);
    }

    public TMinusEq getMinusEq()
    {
        return _minusEq_;
    }

    public void setMinusEq(TMinusEq node)
    {
        if(_minusEq_ != null)
        {
            _minusEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _minusEq_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_minusEq_);
    }

    void removeChild(Node child)
    {
        if(_minusEq_ == child)
        {
            _minusEq_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_minusEq_ == oldChild)
        {
            setMinusEq((TMinusEq) newChild);
            return;
        }

    }
}

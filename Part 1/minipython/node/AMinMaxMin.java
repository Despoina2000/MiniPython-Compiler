/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AMinMaxMin extends PMaxMin
{
    private TMin _min_;

    public AMinMaxMin()
    {
    }

    public AMinMaxMin(
        TMin _min_)
    {
        setMin(_min_);

    }
    public Object clone()
    {
        return new AMinMaxMin(
            (TMin) cloneNode(_min_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinMaxMin(this);
    }

    public TMin getMin()
    {
        return _min_;
    }

    public void setMin(TMin node)
    {
        if(_min_ != null)
        {
            _min_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _min_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_min_);
    }

    void removeChild(Node child)
    {
        if(_min_ == child)
        {
            _min_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_min_ == oldChild)
        {
            setMin((TMin) newChild);
            return;
        }

    }
}

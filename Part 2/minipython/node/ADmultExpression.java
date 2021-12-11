/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ADmultExpression extends PExpression
{
    private PExpression _power_;
    private PExpression _value_;

    public ADmultExpression()
    {
    }

    public ADmultExpression(
        PExpression _power_,
        PExpression _value_)
    {
        setPower(_power_);

        setValue(_value_);

    }
    public Object clone()
    {
        return new ADmultExpression(
            (PExpression) cloneNode(_power_),
            (PExpression) cloneNode(_value_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADmultExpression(this);
    }

    public PExpression getPower()
    {
        return _power_;
    }

    public void setPower(PExpression node)
    {
        if(_power_ != null)
        {
            _power_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _power_ = node;
    }

    public PExpression getValue()
    {
        return _value_;
    }

    public void setValue(PExpression node)
    {
        if(_value_ != null)
        {
            _value_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _value_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_power_)
            + toString(_value_);
    }

    void removeChild(Node child)
    {
        if(_power_ == child)
        {
            _power_ = null;
            return;
        }

        if(_value_ == child)
        {
            _value_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_power_ == oldChild)
        {
            setPower((PExpression) newChild);
            return;
        }

        if(_value_ == oldChild)
        {
            setValue((PExpression) newChild);
            return;
        }

    }
}

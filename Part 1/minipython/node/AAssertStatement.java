/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAssertStatement extends PStatement
{
    private final LinkedList _tab_ = new TypedLinkedList(new Tab_Cast());
    private TAssert _assert_;
    private PExpression _expression_;
    private PGroupCommaExpr _groupCommaExpr_;

    public AAssertStatement()
    {
    }

    public AAssertStatement(
        List _tab_,
        TAssert _assert_,
        PExpression _expression_,
        PGroupCommaExpr _groupCommaExpr_)
    {
        {
            this._tab_.clear();
            this._tab_.addAll(_tab_);
        }

        setAssert(_assert_);

        setExpression(_expression_);

        setGroupCommaExpr(_groupCommaExpr_);

    }
    public Object clone()
    {
        return new AAssertStatement(
            cloneList(_tab_),
            (TAssert) cloneNode(_assert_),
            (PExpression) cloneNode(_expression_),
            (PGroupCommaExpr) cloneNode(_groupCommaExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssertStatement(this);
    }

    public LinkedList getTab()
    {
        return _tab_;
    }

    public void setTab(List list)
    {
        _tab_.clear();
        _tab_.addAll(list);
    }

    public TAssert getAssert()
    {
        return _assert_;
    }

    public void setAssert(TAssert node)
    {
        if(_assert_ != null)
        {
            _assert_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _assert_ = node;
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public PGroupCommaExpr getGroupCommaExpr()
    {
        return _groupCommaExpr_;
    }

    public void setGroupCommaExpr(PGroupCommaExpr node)
    {
        if(_groupCommaExpr_ != null)
        {
            _groupCommaExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _groupCommaExpr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_tab_)
            + toString(_assert_)
            + toString(_expression_)
            + toString(_groupCommaExpr_);
    }

    void removeChild(Node child)
    {
        if(_tab_.remove(child))
        {
            return;
        }

        if(_assert_ == child)
        {
            _assert_ = null;
            return;
        }

        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

        if(_groupCommaExpr_ == child)
        {
            _groupCommaExpr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _tab_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(_assert_ == oldChild)
        {
            setAssert((TAssert) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(_groupCommaExpr_ == oldChild)
        {
            setGroupCommaExpr((PGroupCommaExpr) newChild);
            return;
        }

    }

    private class Tab_Cast implements Cast
    {
        public Object cast(Object o)
        {
            TTab node = (TTab) o;

            if((node.parent() != null) &&
                (node.parent() != AAssertStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AAssertStatement.this))
            {
                node.parent(AAssertStatement.this);
            }

            return node;
        }
    }
}

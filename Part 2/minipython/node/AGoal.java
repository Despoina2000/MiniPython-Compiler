/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AGoal extends PGoal
{
    private final LinkedList _groupFuncStat_ = new TypedLinkedList(new GroupFuncStat_Cast());

    public AGoal()
    {
    }

    public AGoal(
        List _groupFuncStat_)
    {
        {
            this._groupFuncStat_.clear();
            this._groupFuncStat_.addAll(_groupFuncStat_);
        }

    }
    public Object clone()
    {
        return new AGoal(
            cloneList(_groupFuncStat_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGoal(this);
    }

    public LinkedList getGroupFuncStat()
    {
        return _groupFuncStat_;
    }

    public void setGroupFuncStat(List list)
    {
        _groupFuncStat_.clear();
        _groupFuncStat_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_groupFuncStat_);
    }

    void removeChild(Node child)
    {
        if(_groupFuncStat_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _groupFuncStat_.listIterator(); i.hasNext();)
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

    }

    private class GroupFuncStat_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PGroupFuncStat node = (PGroupFuncStat) o;

            if((node.parent() != null) &&
                (node.parent() != AGoal.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AGoal.this))
            {
                node.parent(AGoal.this);
            }

            return node;
        }
    }
}

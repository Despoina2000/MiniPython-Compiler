/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AStatementGroupFuncStat extends PGroupFuncStat
{
    private PStatement _statement_;

    public AStatementGroupFuncStat()
    {
    }

    public AStatementGroupFuncStat(
        PStatement _statement_)
    {
        setStatement(_statement_);

    }
    public Object clone()
    {
        return new AStatementGroupFuncStat(
            (PStatement) cloneNode(_statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatementGroupFuncStat(this);
    }

    public PStatement getStatement()
    {
        return _statement_;
    }

    public void setStatement(PStatement node)
    {
        if(_statement_ != null)
        {
            _statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statement_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_statement_);
    }

    void removeChild(Node child)
    {
        if(_statement_ == child)
        {
            _statement_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

    }
}

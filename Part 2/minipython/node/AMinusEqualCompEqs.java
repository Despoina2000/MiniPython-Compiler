/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AMinusEqualCompEqs extends PCompEqs
{

    public AMinusEqualCompEqs()
    {
    }
    public Object clone()
    {
        return new AMinusEqualCompEqs();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusEqualCompEqs(this);
    }

    public String toString()
    {
        return "";
    }

    void removeChild(Node child)
    {
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }
}

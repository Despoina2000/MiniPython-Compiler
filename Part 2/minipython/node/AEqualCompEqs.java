/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AEqualCompEqs extends PCompEqs
{

    public AEqualCompEqs()
    {
    }
    public Object clone()
    {
        return new AEqualCompEqs();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualCompEqs(this);
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

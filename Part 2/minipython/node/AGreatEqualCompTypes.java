/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AGreatEqualCompTypes extends PCompTypes
{

    public AGreatEqualCompTypes()
    {
    }
    public Object clone()
    {
        return new AGreatEqualCompTypes();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreatEqualCompTypes(this);
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

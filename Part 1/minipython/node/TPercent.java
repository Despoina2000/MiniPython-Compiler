/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TPercent extends Token
{
    public TPercent()
    {
        super.setText("%");
    }

    public TPercent(int line, int pos)
    {
        super.setText("%");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPercent(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPercent(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPercent text.");
    }
}

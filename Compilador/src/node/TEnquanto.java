/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TEnquanto extends Token
{
    public TEnquanto()
    {
        super.setText("enquanto");
    }

    public TEnquanto(int line, int pos)
    {
        super.setText("enquanto");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEnquanto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEnquanto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEnquanto text.");
    }
}

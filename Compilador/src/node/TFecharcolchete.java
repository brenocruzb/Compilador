/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TFecharcolchete extends Token
{
    public TFecharcolchete()
    {
        super.setText("]");
    }

    public TFecharcolchete(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFecharcolchete(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFecharcolchete(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFecharcolchete text.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TFimavalie extends Token
{
    public TFimavalie()
    {
        super.setText("fim avalie");
    }

    public TFimavalie(int line, int pos)
    {
        super.setText("fim avalie");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimavalie(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimavalie(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimavalie text.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALexp extends PLexp
{
    private PLini _lini_;

    public ALexp()
    {
        // Constructor
    }

    public ALexp(
        @SuppressWarnings("hiding") PLini _lini_)
    {
        // Constructor
        setLini(_lini_);

    }

    @Override
    public Object clone()
    {
        return new ALexp(
            cloneNode(this._lini_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALexp(this);
    }

    public PLini getLini()
    {
        return this._lini_;
    }

    public void setLini(PLini node)
    {
        if(this._lini_ != null)
        {
            this._lini_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lini_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lini_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lini_ == child)
        {
            this._lini_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lini_ == oldChild)
        {
            setLini((PLini) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
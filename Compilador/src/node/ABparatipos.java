/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ABparatipos extends PBparatipos
{
    private PParatipos _paratipos_;

    public ABparatipos()
    {
        // Constructor
    }

    public ABparatipos(
        @SuppressWarnings("hiding") PParatipos _paratipos_)
    {
        // Constructor
        setParatipos(_paratipos_);

    }

    @Override
    public Object clone()
    {
        return new ABparatipos(
            cloneNode(this._paratipos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABparatipos(this);
    }

    public PParatipos getParatipos()
    {
        return this._paratipos_;
    }

    public void setParatipos(PParatipos node)
    {
        if(this._paratipos_ != null)
        {
            this._paratipos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paratipos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paratipos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paratipos_ == child)
        {
            this._paratipos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._paratipos_ == oldChild)
        {
            setParatipos((PParatipos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

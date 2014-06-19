/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMaiorigParabool extends PParabool
{
    private TMaiorigual _maiorigual_;

    public AMaiorigParabool()
    {
        // Constructor
    }

    public AMaiorigParabool(
        @SuppressWarnings("hiding") TMaiorigual _maiorigual_)
    {
        // Constructor
        setMaiorigual(_maiorigual_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorigParabool(
            cloneNode(this._maiorigual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorigParabool(this);
    }

    public TMaiorigual getMaiorigual()
    {
        return this._maiorigual_;
    }

    public void setMaiorigual(TMaiorigual node)
    {
        if(this._maiorigual_ != null)
        {
            this._maiorigual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorigual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._maiorigual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._maiorigual_ == child)
        {
            this._maiorigual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._maiorigual_ == oldChild)
        {
            setMaiorigual((TMaiorigual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

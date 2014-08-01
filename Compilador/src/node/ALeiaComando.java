/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALeiaComando extends PComando
{
    private PComandoLeia _comandoLeia_;

    public ALeiaComando()
    {
        // Constructor
    }

    public ALeiaComando(
        @SuppressWarnings("hiding") PComandoLeia _comandoLeia_)
    {
        // Constructor
        setComandoLeia(_comandoLeia_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaComando(
            cloneNode(this._comandoLeia_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaComando(this);
    }

    public PComandoLeia getComandoLeia()
    {
        return this._comandoLeia_;
    }

    public void setComandoLeia(PComandoLeia node)
    {
        if(this._comandoLeia_ != null)
        {
            this._comandoLeia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoLeia_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoLeia_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoLeia_ == child)
        {
            this._comandoLeia_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoLeia_ == oldChild)
        {
            setComandoLeia((PComandoLeia) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

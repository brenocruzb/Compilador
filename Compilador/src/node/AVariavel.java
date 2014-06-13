/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AVariavel extends PVariavel
{
    private TIdentificador _identificador_;

    public AVariavel()
    {
        // Constructor
    }

    public AVariavel(
        @SuppressWarnings("hiding") TIdentificador _identificador_)
    {
        // Constructor
        setIdentificador(_identificador_);

    }

    @Override
    public Object clone()
    {
        return new AVariavel(
            cloneNode(this._identificador_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavel(this);
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identificador_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

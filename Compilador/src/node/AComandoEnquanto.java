/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AComandoEnquanto extends PComandoEnquanto
{
    private TEnquanto _enquanto_;
    private TAbreparenteses _abreparenteses_;
    private PExpLogica _expLogica_;
    private TFechaparenteses _fechaparenteses_;
    private TFaca _faca_;
    private PComandos _comandos_;
    private TFimenquanto _fimenquanto_;

    public AComandoEnquanto()
    {
        // Constructor
    }

    public AComandoEnquanto(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TAbreparenteses _abreparenteses_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TFechaparenteses _fechaparenteses_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") TFimenquanto _fimenquanto_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setAbreparenteses(_abreparenteses_);

        setExpLogica(_expLogica_);

        setFechaparenteses(_fechaparenteses_);

        setFaca(_faca_);

        setComandos(_comandos_);

        setFimenquanto(_fimenquanto_);

    }

    @Override
    public Object clone()
    {
        return new AComandoEnquanto(
            cloneNode(this._enquanto_),
            cloneNode(this._abreparenteses_),
            cloneNode(this._expLogica_),
            cloneNode(this._fechaparenteses_),
            cloneNode(this._faca_),
            cloneNode(this._comandos_),
            cloneNode(this._fimenquanto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoEnquanto(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
    }

    public TAbreparenteses getAbreparenteses()
    {
        return this._abreparenteses_;
    }

    public void setAbreparenteses(TAbreparenteses node)
    {
        if(this._abreparenteses_ != null)
        {
            this._abreparenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreparenteses_ = node;
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public TFechaparenteses getFechaparenteses()
    {
        return this._fechaparenteses_;
    }

    public void setFechaparenteses(TFechaparenteses node)
    {
        if(this._fechaparenteses_ != null)
        {
            this._fechaparenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaparenteses_ = node;
    }

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    public TFimenquanto getFimenquanto()
    {
        return this._fimenquanto_;
    }

    public void setFimenquanto(TFimenquanto node)
    {
        if(this._fimenquanto_ != null)
        {
            this._fimenquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimenquanto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enquanto_)
            + toString(this._abreparenteses_)
            + toString(this._expLogica_)
            + toString(this._fechaparenteses_)
            + toString(this._faca_)
            + toString(this._comandos_)
            + toString(this._fimenquanto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
            return;
        }

        if(this._abreparenteses_ == child)
        {
            this._abreparenteses_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._fechaparenteses_ == child)
        {
            this._fechaparenteses_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        if(this._fimenquanto_ == child)
        {
            this._fimenquanto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
            return;
        }

        if(this._abreparenteses_ == oldChild)
        {
            setAbreparenteses((TAbreparenteses) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._fechaparenteses_ == oldChild)
        {
            setFechaparenteses((TFechaparenteses) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        if(this._fimenquanto_ == oldChild)
        {
            setFimenquanto((TFimenquanto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
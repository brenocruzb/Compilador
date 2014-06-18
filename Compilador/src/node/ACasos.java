/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ACasos extends PCasos
{
    private PCasos _casos_;
    private TCaso _caso_;
    private PValor _valor_;
    private TDoispontos _doispontos_;
    private PComandos _comandos_;

    public ACasos()
    {
        // Constructor
    }

    public ACasos(
        @SuppressWarnings("hiding") PCasos _casos_,
        @SuppressWarnings("hiding") TCaso _caso_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") PComandos _comandos_)
    {
        // Constructor
        setCasos(_casos_);

        setCaso(_caso_);

        setValor(_valor_);

        setDoispontos(_doispontos_);

        setComandos(_comandos_);

    }

    @Override
    public Object clone()
    {
        return new ACasos(
            cloneNode(this._casos_),
            cloneNode(this._caso_),
            cloneNode(this._valor_),
            cloneNode(this._doispontos_),
            cloneNode(this._comandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACasos(this);
    }

    public PCasos getCasos()
    {
        return this._casos_;
    }

    public void setCasos(PCasos node)
    {
        if(this._casos_ != null)
        {
            this._casos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._casos_ = node;
    }

    public TCaso getCaso()
    {
        return this._caso_;
    }

    public void setCaso(TCaso node)
    {
        if(this._caso_ != null)
        {
            this._caso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caso_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TDoispontos getDoispontos()
    {
        return this._doispontos_;
    }

    public void setDoispontos(TDoispontos node)
    {
        if(this._doispontos_ != null)
        {
            this._doispontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doispontos_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._casos_)
            + toString(this._caso_)
            + toString(this._valor_)
            + toString(this._doispontos_)
            + toString(this._comandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._casos_ == child)
        {
            this._casos_ = null;
            return;
        }

        if(this._caso_ == child)
        {
            this._caso_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._doispontos_ == child)
        {
            this._doispontos_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._casos_ == oldChild)
        {
            setCasos((PCasos) newChild);
            return;
        }

        if(this._caso_ == oldChild)
        {
            setCaso((TCaso) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._doispontos_ == oldChild)
        {
            setDoispontos((TDoispontos) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
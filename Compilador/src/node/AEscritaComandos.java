/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEscritaComandos extends PComandos
{
    private PComandos _comandos_;
    private PComandoEscrita _comandoEscrita_;
    private TPontovirgula _pontovirgula_;

    public AEscritaComandos()
    {
        // Constructor
    }

    public AEscritaComandos(
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") PComandoEscrita _comandoEscrita_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setComandos(_comandos_);

        setComandoEscrita(_comandoEscrita_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEscritaComandos(
            cloneNode(this._comandos_),
            cloneNode(this._comandoEscrita_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscritaComandos(this);
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

    public PComandoEscrita getComandoEscrita()
    {
        return this._comandoEscrita_;
    }

    public void setComandoEscrita(PComandoEscrita node)
    {
        if(this._comandoEscrita_ != null)
        {
            this._comandoEscrita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoEscrita_ = node;
    }

    public TPontovirgula getPontovirgula()
    {
        return this._pontovirgula_;
    }

    public void setPontovirgula(TPontovirgula node)
    {
        if(this._pontovirgula_ != null)
        {
            this._pontovirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontovirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandos_)
            + toString(this._comandoEscrita_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        if(this._comandoEscrita_ == child)
        {
            this._comandoEscrita_ = null;
            return;
        }

        if(this._pontovirgula_ == child)
        {
            this._pontovirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        if(this._comandoEscrita_ == oldChild)
        {
            setComandoEscrita((PComandoEscrita) newChild);
            return;
        }

        if(this._pontovirgula_ == oldChild)
        {
            setPontovirgula((TPontovirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
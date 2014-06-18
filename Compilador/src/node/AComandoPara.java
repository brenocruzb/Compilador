/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AComandoPara extends PComandoPara
{
    private TPara _para_;
    private PVar _var_;
    private TDe _de_;
    private PParatipos _paratipos_;
    private TAte _ate_;
    private PAparatipos _aparatipos_;
    private TFaca _faca_;
    private PComandos _comandos_;
    private TFimpara _fimpara_;

    public AComandoPara()
    {
        // Constructor
    }

    public AComandoPara(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TDe _de_,
        @SuppressWarnings("hiding") PParatipos _paratipos_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") PAparatipos _aparatipos_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") TFimpara _fimpara_)
    {
        // Constructor
        setPara(_para_);

        setVar(_var_);

        setDe(_de_);

        setParatipos(_paratipos_);

        setAte(_ate_);

        setAparatipos(_aparatipos_);

        setFaca(_faca_);

        setComandos(_comandos_);

        setFimpara(_fimpara_);

    }

    @Override
    public Object clone()
    {
        return new AComandoPara(
            cloneNode(this._para_),
            cloneNode(this._var_),
            cloneNode(this._de_),
            cloneNode(this._paratipos_),
            cloneNode(this._ate_),
            cloneNode(this._aparatipos_),
            cloneNode(this._faca_),
            cloneNode(this._comandos_),
            cloneNode(this._fimpara_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoPara(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TDe getDe()
    {
        return this._de_;
    }

    public void setDe(TDe node)
    {
        if(this._de_ != null)
        {
            this._de_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._de_ = node;
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

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
    }

    public PAparatipos getAparatipos()
    {
        return this._aparatipos_;
    }

    public void setAparatipos(PAparatipos node)
    {
        if(this._aparatipos_ != null)
        {
            this._aparatipos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aparatipos_ = node;
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

    public TFimpara getFimpara()
    {
        return this._fimpara_;
    }

    public void setFimpara(TFimpara node)
    {
        if(this._fimpara_ != null)
        {
            this._fimpara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimpara_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._para_)
            + toString(this._var_)
            + toString(this._de_)
            + toString(this._paratipos_)
            + toString(this._ate_)
            + toString(this._aparatipos_)
            + toString(this._faca_)
            + toString(this._comandos_)
            + toString(this._fimpara_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._de_ == child)
        {
            this._de_ = null;
            return;
        }

        if(this._paratipos_ == child)
        {
            this._paratipos_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._aparatipos_ == child)
        {
            this._aparatipos_ = null;
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

        if(this._fimpara_ == child)
        {
            this._fimpara_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._de_ == oldChild)
        {
            setDe((TDe) newChild);
            return;
        }

        if(this._paratipos_ == oldChild)
        {
            setParatipos((PParatipos) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._aparatipos_ == oldChild)
        {
            setAparatipos((PAparatipos) newChild);
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

        if(this._fimpara_ == oldChild)
        {
            setFimpara((TFimpara) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
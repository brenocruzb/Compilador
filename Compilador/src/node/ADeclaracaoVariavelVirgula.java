/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoVariavelVirgula extends PDeclaracaoVariavelVirgula
{
    private PVariabilidade _variabilidade_;
    private PVariavel _variavel_;
    private TVirgula _virgula_;

    public ADeclaracaoVariavelVirgula()
    {
        // Constructor
    }

    public ADeclaracaoVariavelVirgula(
        @SuppressWarnings("hiding") PVariabilidade _variabilidade_,
        @SuppressWarnings("hiding") PVariavel _variavel_,
        @SuppressWarnings("hiding") TVirgula _virgula_)
    {
        // Constructor
        setVariabilidade(_variabilidade_);

        setVariavel(_variavel_);

        setVirgula(_virgula_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoVariavelVirgula(
            cloneNode(this._variabilidade_),
            cloneNode(this._variavel_),
            cloneNode(this._virgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoVariavelVirgula(this);
    }

    public PVariabilidade getVariabilidade()
    {
        return this._variabilidade_;
    }

    public void setVariabilidade(PVariabilidade node)
    {
        if(this._variabilidade_ != null)
        {
            this._variabilidade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variabilidade_ = node;
    }

    public PVariavel getVariavel()
    {
        return this._variavel_;
    }

    public void setVariavel(PVariavel node)
    {
        if(this._variavel_ != null)
        {
            this._variavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavel_ = node;
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variabilidade_)
            + toString(this._variavel_)
            + toString(this._virgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variabilidade_ == child)
        {
            this._variabilidade_ = null;
            return;
        }

        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variabilidade_ == oldChild)
        {
            setVariabilidade((PVariabilidade) newChild);
            return;
        }

        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class ASeNaoComandoSe extends PComandoSe
{
    private PExpr _expr_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private final LinkedList<PComando> _segundo_ = new LinkedList<PComando>();

    public ASeNaoComandoSe()
    {
        // Constructor
    }

    public ASeNaoComandoSe(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") List<?> _segundo_)
    {
        // Constructor
        setExpr(_expr_);

        setComando(_comando_);

        setSegundo(_segundo_);

    }

    @Override
    public Object clone()
    {
        return new ASeNaoComandoSe(
            cloneNode(this._expr_),
            cloneList(this._comando_),
            cloneList(this._segundo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeNaoComandoSe(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public LinkedList<PComando> getSegundo()
    {
        return this._segundo_;
    }

    public void setSegundo(List<?> list)
    {
        for(PComando e : this._segundo_)
        {
            e.parent(null);
        }
        this._segundo_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._segundo_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._comando_)
            + toString(this._segundo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._segundo_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._segundo_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPTotal().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inATotal(ATotal node)
    {
        defaultIn(node);
    }

    public void outATotal(ATotal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATotal(ATotal node)
    {
        inATotal(node);
        if(node.getPrograma() != null)
        {
            node.getPrograma().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        if(node.getSuperDeclaracaoVariavel() != null)
        {
            node.getSuperDeclaracaoVariavel().apply(this);
        }
        if(node.getCorpoPrograma() != null)
        {
            node.getCorpoPrograma().apply(this);
        }
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outATotal(node);
    }

    public void inANormalVariabilidade(ANormalVariabilidade node)
    {
        defaultIn(node);
    }

    public void outANormalVariabilidade(ANormalVariabilidade node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANormalVariabilidade(ANormalVariabilidade node)
    {
        inANormalVariabilidade(node);
        outANormalVariabilidade(node);
    }

    public void inAVariabilidade(AVariabilidade node)
    {
        defaultIn(node);
    }

    public void outAVariabilidade(AVariabilidade node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariabilidade(AVariabilidade node)
    {
        inAVariabilidade(node);
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        outAVariabilidade(node);
    }

    public void inASuperDeclaracaoVariavel(ASuperDeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outASuperDeclaracaoVariavel(ASuperDeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASuperDeclaracaoVariavel(ASuperDeclaracaoVariavel node)
    {
        inASuperDeclaracaoVariavel(node);
        if(node.getSuperDeclaracaoVariavel() != null)
        {
            node.getSuperDeclaracaoVariavel().apply(this);
        }
        if(node.getDeclaracaoVariavel() != null)
        {
            node.getDeclaracaoVariavel().apply(this);
        }
        outASuperDeclaracaoVariavel(node);
    }

    public void inAVazioSuperDeclaracaoVariavel(AVazioSuperDeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outAVazioSuperDeclaracaoVariavel(AVazioSuperDeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioSuperDeclaracaoVariavel(AVazioSuperDeclaracaoVariavel node)
    {
        inAVazioSuperDeclaracaoVariavel(node);
        outAVazioSuperDeclaracaoVariavel(node);
    }

    public void inAConjuntoDeclaracaoVariavel(AConjuntoDeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outAConjuntoDeclaracaoVariavel(AConjuntoDeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConjuntoDeclaracaoVariavel(AConjuntoDeclaracaoVariavel node)
    {
        inAConjuntoDeclaracaoVariavel(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoispontos() != null)
        {
            node.getDoispontos().apply(this);
        }
        if(node.getDeclaracaoVariavelVirgula() != null)
        {
            node.getDeclaracaoVariavelVirgula().apply(this);
        }
        if(node.getVariabilidade() != null)
        {
            node.getVariabilidade().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outAConjuntoDeclaracaoVariavel(node);
    }

    public void inADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoVariavel(ADeclaracaoVariavel node)
    {
        inADeclaracaoVariavel(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoispontos() != null)
        {
            node.getDoispontos().apply(this);
        }
        if(node.getVariabilidade() != null)
        {
            node.getVariabilidade().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getPontovirgula() != null)
        {
            node.getPontovirgula().apply(this);
        }
        outADeclaracaoVariavel(node);
    }

    public void inAEncadeamentoDeclaracaoVariavelVirgula(AEncadeamentoDeclaracaoVariavelVirgula node)
    {
        defaultIn(node);
    }

    public void outAEncadeamentoDeclaracaoVariavelVirgula(AEncadeamentoDeclaracaoVariavelVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEncadeamentoDeclaracaoVariavelVirgula(AEncadeamentoDeclaracaoVariavelVirgula node)
    {
        inAEncadeamentoDeclaracaoVariavelVirgula(node);
        if(node.getDeclaracaoVariavelVirgula() != null)
        {
            node.getDeclaracaoVariavelVirgula().apply(this);
        }
        if(node.getVariabilidade() != null)
        {
            node.getVariabilidade().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAEncadeamentoDeclaracaoVariavelVirgula(node);
    }

    public void inADeclaracaoVariavelVirgula(ADeclaracaoVariavelVirgula node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoVariavelVirgula(ADeclaracaoVariavelVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoVariavelVirgula(ADeclaracaoVariavelVirgula node)
    {
        inADeclaracaoVariavelVirgula(node);
        if(node.getVariabilidade() != null)
        {
            node.getVariabilidade().apply(this);
        }
        if(node.getVariavel() != null)
        {
            node.getVariavel().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outADeclaracaoVariavelVirgula(node);
    }

    public void inAVariavel(AVariavel node)
    {
        defaultIn(node);
    }

    public void outAVariavel(AVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavel(AVariavel node)
    {
        inAVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAVariavel(node);
    }

    public void inAVetorVariavel(AVetorVariavel node)
    {
        defaultIn(node);
    }

    public void outAVetorVariavel(AVetorVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        inAVetorVariavel(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getAbrecolchete() != null)
        {
            node.getAbrecolchete().apply(this);
        }
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        if(node.getFecharcolchete() != null)
        {
            node.getFecharcolchete().apply(this);
        }
        outAVetorVariavel(node);
    }

    public void inACorpoPrograma(ACorpoPrograma node)
    {
        defaultIn(node);
    }

    public void outACorpoPrograma(ACorpoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACorpoPrograma(ACorpoPrograma node)
    {
        inACorpoPrograma(node);
        if(node.getCorpoPrograma() != null)
        {
            node.getCorpoPrograma().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outACorpoPrograma(node);
    }

    public void inAVazioCorpoPrograma(AVazioCorpoPrograma node)
    {
        defaultIn(node);
    }

    public void outAVazioCorpoPrograma(AVazioCorpoPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioCorpoPrograma(AVazioCorpoPrograma node)
    {
        inAVazioCorpoPrograma(node);
        outAVazioCorpoPrograma(node);
    }

    public void inACTipo(ACTipo node)
    {
        defaultIn(node);
    }

    public void outACTipo(ACTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACTipo(ACTipo node)
    {
        inACTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACTipo(node);
    }

    public void inAITipo(AITipo node)
    {
        defaultIn(node);
    }

    public void outAITipo(AITipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAITipo(AITipo node)
    {
        inAITipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAITipo(node);
    }

    public void inATipo(ATipo node)
    {
        defaultIn(node);
    }

    public void outATipo(ATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipo(ATipo node)
    {
        inATipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outATipo(node);
    }
}

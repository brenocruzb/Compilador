/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTNumero(TNumero node);
    void caseTIdentificador(TIdentificador node);
    void caseTOperador(TOperador node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}

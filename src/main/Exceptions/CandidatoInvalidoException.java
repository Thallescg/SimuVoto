package main.Exceptions;

public class CandidatoInvalidoException extends ArithmeticException  {

    public CandidatoInvalidoException(String mensagem){
        super(mensagem);
    }

}
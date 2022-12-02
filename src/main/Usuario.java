package main;

import main.Exceptions.CPFInvalidoException;
import main.Exceptions.CandidatoInvalidoException;

public class Usuario {
    String nome;
    int NumCandidato;
    int cont1 =0;
    int cont2 =0;
    int cont3 =0;


    public String getNome() {
        return nome;
    }

    public int getNumCandidato() {
        return NumCandidato;
    }

    public void votar(int numCandidato){

        if(getNumCandidato() == 51){
            cont1++;
        } else if (getNumCandidato() == 77) {
            cont2++;
        } else if (getNumCandidato() == 43) {
            cont3++;
        }
        else throw new CandidatoInvalidoException("CPF invalido");
    }

    public String validarCPF(String nome ){
        if(nome == "NULL"){
            throw new CPFInvalidoException("CPF invalido");

        }
        else {
            return nome;
        }
    }
}
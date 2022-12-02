package main;

import main.Exceptions.CPFInvalidoException;
import main.Exceptions.CandidatoInvalidoException;

public class Main {
    public static void main(String[] args) {
        int Voto;
        String Cpf;
        Usuario Eleitor = new Usuario();

        try {
            Eleitor.votar(51);
        } catch (CandidatoInvalidoException candidatoInvalidoException) {
        }
        try {
            Eleitor.votar(43);
        } catch (CandidatoInvalidoException candidatoInvalidoException) {
        }
        try {
            Eleitor.votar(77);
        } catch (CandidatoInvalidoException candidatoInvalidoException) {
        }
        try {
            Eleitor.votar(33);
        } catch (CandidatoInvalidoException candidatoInvalidoException) {
            System.out.println("Candidato invalido");
        }

        try {
            Eleitor.validarCPF("152.732.666-70");
        }
        catch (main.Exceptions.CPFInvalidoException CPFInvalidoException){
        }
        try {
            Eleitor.validarCPF("929.535.906-25");
        }
        catch (CPFInvalidoException CPFInvalidoException){
        }
        try {
            Eleitor.validarCPF("024.303.316-09");
        }
        catch (CPFInvalidoException CPFInvalidoException){
        }
        try {
            Eleitor.validarCPF("NULL");
        }
        catch (CPFInvalidoException CPFInvalidoException){
            System.out.println("CPF invalido");
        }















    }
}
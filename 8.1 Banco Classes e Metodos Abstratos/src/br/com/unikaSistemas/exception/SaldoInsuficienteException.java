package br.com.unikaSistemas.exception;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message){
        super(message);
    }
}

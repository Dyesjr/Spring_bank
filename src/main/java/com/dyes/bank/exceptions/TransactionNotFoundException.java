package com.dyes.bank.exceptions;

public class TransactionNotFoundException extends RuntimeException{

    public TransactionNotFoundException(String message) { super(message);}
}

package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //usasse esse T para tornar generico, pq eu n sei oq vai devolver(return) e o class pq eu tenho que devolver alguma classe e para isso torna-se generica tbm;
    <T> T obterDados(String json, Class<T> classe);
}

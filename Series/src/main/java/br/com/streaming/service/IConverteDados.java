package br.com.streaming.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}

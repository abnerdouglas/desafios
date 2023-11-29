public record Endereco(String cep, String logradouro, String complemento,
                       String bairro, String localidade, String uf) {

    //Record gera implicitamente os metodos getters, setters e to String
    //Evita código repetitivo
}

package com.example.enums;

public enum TipoConta {
    ADMIN("Vendedores"),
    ADMIN2("GerentesProdutos"),
    MOD("Administradores"),
    USER("Clientes");
    private final String tipoConta;
    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}

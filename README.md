# SISTEMA AUTENTICAÇÃO E-COMMERCE PROVA FINAL
## Arquitetura de Aplicações Web
- Professor João Paulo Aramuni
- Centro Universitário Newton Paiva.


## Visão Geral
Este projeto é um  um sistema de autenticação e autorização para uma aplicação de e-
commerce, garantindo que apenas usuários autenticados e autorizados tenham acesso
aos recursos da aplicação. Desenvolvida em Java utilizando o framework Spring Boot. 
Ele fornece serviços de autenticação e gerenciamento de usuários com diferentes níveis de permissão, garantindo assim uma hierarquia entre VENDEDORES, CLIENTES, GERENTES DE PRODUTOS E ADMINISTRADORES

## Objetivos do projeto
- Registro de usuário: funcionalidade de registro permitindo que novos usuários se cadastrem com nome de usuário, senha e e-mail. Cada usuário deve ser identificado como administrador, gerente de produtos, vendedor ou cliente.

- Login seguro: sistema de login onde os usuários possam se autenticar utilizando suas credenciais (nome de usuário e senha).

- Geração de token JWT: Após um login bem-sucedido, gere um token JWT (JSON Web Token) que deve incluir informações como ID do usuário, tipo de conta e e-mail. a Implementação de endpoints que permitam o acesso baseado nos tipos de usuário, considerando as permissões e validações necessárias. Concentrando na criação correta dos endpoints.


## Estrutura do Projeto
Este projeto foi tambem estruturado na ferramenta figma conforme oa imagem e links abaixo. Para melhor visualização de sua estrutura de pastas, que segue a arquitetura REST ou seja,
se utilizando de bons padrões de programação, aplicados internacionalmente, em conjunto assim com suas classes, metodos, objetos demais componentes.
#### [https://www.figma.com/design/4gO1V9IpolLq03eogzkEYU/Untitled?node-id=0-1&t=iLFoU17CwooxU6UT-1](https://www.figma.com/design/fH2F4IlURA9v3ZM0hGQ32u/Untitled?node-id=0-1&t=lYXhPSKudQcrffeG-1)
![image](https://github.com/mauriciosadala/ProvaAV2_JWT/assets/125416578/f2fd6b1a-27f4-4c9e-853b-0e2c7ecb19f7)

O projeto está estruturado em diversos pacotes, cada um contendo classes com responsabilidades específicas:

- com.example.Autenticacao: Contém a classe principal para inicializar a aplicação.
- com.example.config: Configurações de segurança.
- com.example.controller: Controladores REST para autenticação e gerenciamento de usuários.
- com.example.enums: Enumerações utilizadas no projeto.
- com.example.security: Utilitários para geração e validação de tokens JWT.
- com.example.service: Serviços de autenticação e gerenciamento de usuários.


## Dependências
#### Spring Boot
- https://spring.io/projects/spring-boot
-  O spring boot é um framework java, voltado para aplicações web, sendo muito utilizado principalmente no espectro das APIs
#### Spring Security
- https://spring.io/projects/spring-security
- O spring security é a repartição do framework spring boot voltado para a area de segurança da arquitetura.
#### JWT 
- https://jwt.io
- O JSON web Token é um padrão criado para a internet visando a criptografia. Os tokens são gerados garantindo uma chance quase inesistente de se haver dois iguais. Caso inicia-se-mos a geração de dois em paralelo, o tempo nescessário para que dois identicos fossem gerados ao mesmo tempo é maior até doque a existencia da terra como conhecemos hoje.


## Início Rápido
#### Requisitos
- JDK 11+,
- Maven,

## Configuração,

#### SecurityConfig
- Configuração de segurança utilizando Spring Security. Define endpoints públicos e protegidos, além de configurar a autenticação básica.

#### AuthController
- Controlador REST para autenticação de usuários. Possui endpoints para login, obtenção de informações do usuário e acesso restrito para administradores.

#### TipoConta
- Enumeração que define os tipos de conta: ADMIN, MOD e USER.

#### JwtUtil
- Classe utilitária para geração e validação de tokens JWT.

#### AuthService
- Serviço para geração e extração de informações de tokens JWT.

## Endpoints

#### Autenticação
- POST /auth/login: Realiza o login de um usuario.
- GET /auth/user: Retorna informações do usuário cliente.
- GET /auth/admin: Endpoint restrito para Vendedores.
- GET /auth/admin2: Endpoint restrito para Gerentes De Produtos.

#### Gerenciamento de Usuários
- POST /usuario/salvar: Salva um novo usuário.
- DELETE /usuario/deletar: Deleta um usuário.
- GET /usuario/obtemTodos: Obtém todos os usuários.
- GET /usuario/obtemUsuarioPorId: Obtém um usuário pelo ID.

### Segurança
A aplicação utiliza Spring Security para gerenciar a autenticação e autorização. As senhas são criptografadas utilizando BCrypt. Tokens JWT são usados para autenticação de sessões.

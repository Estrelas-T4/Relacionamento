# Relacionamentos

------

Nesse projeto criamos exemplos de utilização de relacionamentos e mapeamento utilizando o 
ORM. Vimos quais os problemas os relacionamentos podem trazer e como resolver ele utilizando;
1. Cascade
2. DTOs
3. MappedBy

Principalmente vimos que relacionamentos bilaterais pode causar jsons infinitos e como resolver isso
utilizando DTOs

```json
{
  "id": 2,
  "periodo": "VESPERTINO",
  "curso": {
    "id": 1,
    "nome": "ADS"
  },
  "alunos": [
    {
      "cpf": "446.628.670-10",
      "nome": "Xablauso",
      "email": "xablauso2@xablausando.com",
      "enderecos": [
        {
          "id": 2,
          "logradouro": "Rua Muito louca",
          "numero": "765",
          "complemento": null,
          "cep": "01928"
        }
      ],
      "turmas": [
        {
          "id": 2,
          "periodo": "VESPERTINO",
          "curso": {
            "id": 1,
            "nome": "ADS"
          },
          "alunos": [
            {
              "cpf": "446.628.670-10",
              "nome": "Xablauso",
              "email": "xablauso2@xablausando.com",
              "enderecos": [
                {
                  "id": 2,
                  "logradouro": "Rua Muito louca",
                  "numero": "765",
                  "complemento": null,
                  "cep": "01928"
                }
              ],
              "turmas":...
```

-----

## Como Usar a API

----
### POST

- Endpoint: /cadastros
```json
{
      "cpf":"String",
      "nome":"String",
      "email":"String",
      "enderecos":[
              {
                  "logradouro":"String",
                  "cep":"String",
                  "numero":"String"
            }
      ]
}
```

----
### GET

- Endpoint: /cadastros/{cpf}

Response;
```json
{
      "cpf": "String",
      "nome": "String",
      "email": "String",
      "enderecos": [
            {
                  "id": 2,
                  "logradouro": "String",
                  "numero": "String",
                  "complemento": "String",
                  "cep": "String"
            }
      ],
      "turmas": [
            {
                  "id": 2,
                  "periodo": "String",
                  "curso": {
                        "id": 1,
                        "nome": "String"
                  }
            }
      ]
}
```
----
### DELETE

- Endpoint: /cadastros/{cpf}

- Response Status 204
---

### POST

- Endpoint: /turmas
```json
{
      "periodo":"VESPERTINO",
      "curso": {
            "id": 1
      }
}
```
Periodo enum;

1. VESPERTINO
1. NOTURNO
1. MATUTINO

---

### PUT

- Endpoint: /turmas
```json
{
      "alunoId": "446.628.670-10",
      "turmaId": 2
}
```

- Matrícula um cadastro como aluno de uma turma.

----

**IMPORTANTE** 

Os endpoints de turma ainda estão com o problema de json infinito
famosa recursividade. Faça o correção desse problema utilizando as DTOs.


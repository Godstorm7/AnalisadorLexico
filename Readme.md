## Tokens e descrições
adicione ao seu parser o reconhecimento de novos tokens
da linguagem java:
literalFloat, operador de exponenciação,
<<, >>, true, false, etc (3 extras)

- `literalFloat`
    - Representa um literal de ponto flutuante (ex.: `3.14`, `0.5`, `10.0`).
    - Token: `LITERAL_FLOAT`. Aceitar dígitos antes/ depois do ponto; terminador pode ser espaço ou operador/pontuação.

- `**`
    - Operador de exponenciação (token `EXP`).

- `<<`
    - Deslocamento à esquerda (token `SHL`). Operação bitwise: desloca bits para a esquerda.

- `>>`
    - Deslocamento à direita (token `SHR`). Mantém o sinal em números com sinal.

- `true` / `false`
    - Literais booleanos (tokens específicos `TRUE`, `FALSE`).

- `%`
  - Operador módulo (token `MOD`).

- `++`
  - Operador de incremento (token `INC`).

- `--`
  - Operador de decremento (token `DEC`).

- `+=` `-=` 
    - Atribuições compostas (tokens `ADD_ASSIGN`, `SUB_ASSIGN`).

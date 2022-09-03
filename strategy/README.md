# Strategy

O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis. Muito utilizado para reduzir o uso de if e elses no codigo.

## Aplicabilidade

-  Utilize o padrão Strategy quando você quer usar diferentes variantes de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução.
-  O padrão Strategy permite que você altere indiretamente o comportamento de um objeto durante a execução ao associá-lo com diferentes sub-objetos que pode fazer sub-tarefas específicas em diferentes formas.
-  Utilize o Strategy quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.


## Exemplo de Utilização do Strategy removendo varios ifs e elses

```bash
if ($tipoDesconto == "IPVA") {
  return orcamento.getValor().multiply(new BigDecimal("0.01"));
} else if ($tipoDesconto == "ICMS") {
  return orcamento.getValor().multiply(new BigDecimal("0.02"));
} else if ($tipoDesconto == "IPTU") {
  return orcamento.getValor().multiply(new BigDecimal("0.03"));
} else if ($tipoDesconto == "ISS") {
  return orcamento.getValor().multiply(new BigDecimal("0.04"));
} else {
  return orcamento.getValor().multiply(new BigDecimal("0.05"));
}
```

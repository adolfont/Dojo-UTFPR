defmodule CaixaEletronico do
  def notas(valor, nota) do
    div(valor, nota)
  end

  def calculanotas(valor, nota) do
    IO.puts("#{notas(valor, nota)} notas de: #{nota}")
    rem(valor, nota)
  end

  def mostra_cedulas_entregues(valor, _) when valor<2 do
    IO.puts("Sobrou #{valor}")
  end

  def mostra_cedulas_entregues(valor, notas_disponiveis) do
    [nota | notas_disponiveis] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    mostra_cedulas_entregues(valor, notas_disponiveis)
  end

  def main do
    notas_disponiveis = [100, 50, 20, 10, 5, 2]
    entrada = IO.gets("Digite o valor: ")
    {valor, _} = Integer.parse(entrada)
    mostra_cedulas_entregues(valor, notas_disponiveis)
  end
end

CaixaEletronico.main()

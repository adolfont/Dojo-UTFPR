defmodule CaixaEletronico do
  def notas(valor, nota) do
    div(valor, nota)
  end

  def calculanotas(valor, nota) do
    IO.puts("#{notas(valor, nota)} notas de: #{nota}")
    rem(valor, nota)
  end

  def main do
    notas_disponiveis = [100, 50, 20, 10, 5, 2]

    entrada = IO.gets("Digite o valor: ")

    {valor, _} = Integer.parse(entrada)

    [nota | notas_disponiveis] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    [nota | notas_disponiveis] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    [nota | notas_disponiveis] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    [nota | notas_disponiveis] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    [nota | notas_disponiveis] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    [nota | _] = notas_disponiveis
    valor = CaixaEletronico.calculanotas(valor, nota)
    IO.puts("sobrou #{valor}")
  end
end

CaixaEletronico.main()

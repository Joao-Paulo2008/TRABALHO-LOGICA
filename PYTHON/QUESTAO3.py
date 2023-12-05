quantidade_pessoas = int(input("digite a quantidade de pessoas: "))
nomes = []
idades = []

for i in range(quantidade_pessoas):
    nome = input(f"digite o nome da pessoa {i+1}: ")
    idade = int(input(f"digite a idade da pessoa {i+1}: "))
    nomes.append(nome)
    idades.append(idade)

indice_pessoa_mais_velha = idades.index(max(idades))
nome_pessoa_mais_velha = nomes[indice_pessoa_mais_velha]

print(f"a pessoa mais velha é {nome_pessoa_mais_velha}")
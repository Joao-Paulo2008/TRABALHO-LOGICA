velocidade_maxima = int(input("digite a velocidade máxima permitida: "))
velocidade_motorista = int(input("digite a velocidade do motorista: "))

multa = (velocidade_motorista - velocidade_maxima) * 5

if multa > 0:
    print(f"0 motorista receberá uma multa de R$ {multa},00")
else:
    print("não há multa.")
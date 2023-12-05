nota01 = int(input("digite a primeira nota: "))
nota02 = int(input("digite a segunda nota: "))

media = (nota01 + nota02)/2

if media >= 70:
    print(f'aluno aprovado')
if 40 <= media >= 69:
    print('aluno foi convidado ao exame')
exame = int(input("digite a nota do exame: ")) 
nota = exame + media
if nota==100:
    print(f'aluno aprovado')
else:
    print(f'aluno reprovado')




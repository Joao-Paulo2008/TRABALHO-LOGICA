#include <stdio.h>
#include <stdlib.h>




void main (){
int velocidadeMax = 0;
int velocidadeAnti = 0;
int multa = 5;
int multatotal = 0;


printf("Digite a velocidade permitida: ");
scanf("%d", &velocidadeMax);

printf("digite a velocidade alcançada: ");
scanf("%d", &velocidadeAnti);


if(velocidadeAnti > velocidadeMax){
    multatotal = (velocidadeAnti - velocidadeMax) * multa;
    printf("o valor da multa será: R$%d,00", multatotal);
}

else{
printf("Não haverá multa! ");
}




}



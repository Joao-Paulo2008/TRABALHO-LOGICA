#include <stdio.h>
#include <stdlib.h>




void main (){
float nota1 = 0;
float nota2 = 0;
float exame = 0;
float examemedia = 0;

printf("digite a primeira nota do aluno: ");
scanf("%f", &nota1);

printf("digite a segunda nota do aluno: ");
scanf("%f", &nota2);


float media = (nota1 + nota2)/2;

if(media >= 70){
    printf("aluno aprovado!");
}

else if( media >= 40 && media <= 69){
    printf(" o aluno irár a  o exame final! ");

    printf("digite a nota do exame final! ");
    scanf("%f", &exame);

examemedia = media + exame;


    if(examemedia >= 100){
        printf("aluno aprovado no exame final! ");

    }

    else{
        printf(" aluno reprovado no exame! ");
    }
}

else{
     printf("aluno reprovado! ");
}











}

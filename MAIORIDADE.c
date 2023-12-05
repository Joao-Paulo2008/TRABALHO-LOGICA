#include <stdio.h>
#include <string.h>

int main() {
    int n, idade_mais_velha = 0, indice_mais_velha;
    char nomes[50][100];

    printf("Digite a quantidade de pessoas: ");
    scanf("%d", &n);

    int idades[n];

    for (int i = 0; i < n; i++) {
        printf("Digite o nome da pessoa %d: ", i + 1);
        scanf("%s", nomes[i]);
        printf("Digite a idade da pessoa %d: ", i + 1);
        scanf("%d", &idades[i]);

        if (idades[i] > idade_mais_velha) {
            idade_mais_velha = idades[i];
            indice_mais_velha = i;
        }
    }

    printf("A pessoa mais velha é: %s\n", nomes[indice_mais_velha]);

    return 0;
}


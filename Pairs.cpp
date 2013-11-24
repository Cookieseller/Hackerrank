#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n;
    int k;
    int *nArr;
    int pairs = 0;

    scanf("%d", &n);
    scanf("%d", &k);
    nArr = (int *) malloc((n+1)*sizeof(int));
    memset(nArr, 0, (n+1)*sizeof(int));

    for (int i = 0; i < n; i++) {
        scanf("%d", nArr);

        int val = *nArr;
        nArr -= i;

        for (int j = 0; j < i; j++)
        {
            if ((val + k) == *(nArr + j) || (val - k) == *(nArr + j))
                pairs++;
        }
        nArr += i;
        nArr++;
    }
    nArr -= n;

    free(nArr);
    printf("%d", pairs);
    return 0;
}

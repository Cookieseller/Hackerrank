#include<stdio.h>
void next_move(int posX, int posY, char board[5][5]) {
    int distance = 12;
    int closestCellX = 6;
    int closestCellY = 6;
    
    fprintf(stderr, "Pos X: %d\r\n", posX);
    fprintf(stderr, "Pos Y: %d\r\n", posY);
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (board[i][j] == 'd') {
                int xDistance = posX - i;
                if (i > posX)
                    xDistance = i - posX;
                int yDistance = posY - j;
                if (j > posY)
                    yDistance = j - posY;
                if (xDistance + yDistance < distance) {
                    distance = xDistance + yDistance;
                    closestCellX = i;
                    closestCellY = j;
                    fprintf(stderr, "Distance X: %d\r\n", distance);
                }
            }
        }
    }
    
    fprintf(stderr, "Ziel X: %d\r\n", closestCellX);
    fprintf(stderr, "Ziel Y: %d\r\n", closestCellY);
    if (closestCellX > posX)
        printf("DOWN");
    else if (closestCellX < posX)
        printf("UP");
    else if (closestCellY > posY)
        printf("RIGHT");
    else if (closestCellY < posY)
        printf("LEFT");
    else
        printf("CLEAN");
}

int main(void) {
    int pos[2], i;
    char board[5][5], line[6];
    scanf("%d", &pos[0]);
    scanf("%d", &pos[1]);
    for(i=0; i<5; i++) {
        scanf("%s[^\\n]%*c", line);
        strncpy(board[i], line, 5);
    }
    next_move(pos[0], pos[1], board);
    return 0;
}
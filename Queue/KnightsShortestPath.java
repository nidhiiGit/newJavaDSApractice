import java.util.*;
public class KnightsShortestPath {
    static class cell{
        int x;
        int y;
        int dis;

        cell(int x, int y, int dis){
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    }

    public static Boolean isInside(int x, int y, int N){
        if(x>=1 && x<=N && y>=1 && y<=N){
            return true;
        }
        return false;
    }
    public static int distance(int knightPos[], int targetPos[], int N){
        int dx[]={-2, -1, 1, 2, 1, 2, -1, -2};
        int dy[]={-1, -2, 2, 1, -2, -1, 2, 1};

        Queue<cell> q = new LinkedList<>();

        q.add(new cell(knightPos[0], knightPos[1], 0));
        boolean visited[][] = new boolean[N + 1][N + 1];

        visited[knightPos[0]][knightPos[1]]=true;

        while(!q.isEmpty()){
            cell t = q.poll();
            if(t.x==targetPos[0] && t.y==targetPos[1]){
                return t.dis;
            }

            for(int i=0; i<8; i++){
                int x = t.x+dx[i];
                int y = t.y+dy[i];

                if(isInside(x,y,N) && !visited[x][y]){
                    visited[x][y]=true;

                    q.add(new cell(x, y, t.dis+1));
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int N=30;
        int knightPos[]={1,1};
        int targetPos[]={30,30};

        System.out.println(distance(knightPos, targetPos, N));
    }
}

import java.util.ArrayList;
class Disjoint {
    private int[] rank;
    private int[] uParent;
    Disjoint(int V){
        rank   = new int[V];
        uParent = new int[V];
        for(int i=0;i<rank.length;i++){
            rank[i]=0;
            uParent[i] = i;
        }
    }
    int findUparent(int x){
        if(x == uParent[x]) return x;
        return uParent[x] = findUparent(uParent[x]);
    }

    void unionByRank(int x, int y){

        int uParX = findUparent(x);
        int uParY = findUparent(y);
            if(uParY == uParX) return ;
        if(rank[uParX] == rank[uParY]){
            rank[uParX]++;
            uParent[uParY] = uParX;
        }else if(rank[uParX] > rank[uParY]){
            uParent[uParY] =uParX;
        }else{
            uParent[uParX] =uParY;
        }
    }
}

class Solution {

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {

        Disjoint ds = new Disjoint( V);
        for (int row = 0; row < adj.size(); row++) {
            for (int col = 0; col < adj.get(row).size(); col++) {
                if (adj.get(row).get(col) == 1) {
                    ds.unionByRank(row, col);
                }
            }
        }


        return 1;
    }
};
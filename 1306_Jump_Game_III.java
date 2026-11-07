class Solution {
    private boolean reach(int[] arr,int index,boolean[] visited){
        if(index<0 || index>=arr.length || visited[index]){
            return false;
        }
        if(arr[index]==0){
            return true;
        }
        visited[index]=true;
        int left=index-arr[index];
        int right=index+arr[index];

        return reach(arr,left,visited) || reach(arr,right,visited);
    }
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];

        return reach(arr,start,visited);
        
    }
}

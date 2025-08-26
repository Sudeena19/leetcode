class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal=0;
        int maxArea=0;

        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];

            double diagonalLength=Math.sqrt((length*length)+(width*width));
            int area=length*width;
            if(diagonalLength > maxDiagonal){

                maxDiagonal=diagonalLength;
                maxArea=area;

            }
            else if(diagonalLength==maxDiagonal && area>maxArea){
                maxArea=area;
            }


        }
        return maxArea;
    }
}
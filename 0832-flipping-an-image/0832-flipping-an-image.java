class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
         for (int i = 0; i < image.length; i++) {
            int j = 0;
            int rl = image[0].length - 1;
            while (j < rl) {
                int temp = image[i][j];
                image[i][j] = image[i][rl];
                image[i][rl] = temp;
                j++;
                rl--;
            }
        }
        int row = image[0].length;
        int col = image.length;
        for (int i = 0; i < image[0].length; i++) {
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
   
}
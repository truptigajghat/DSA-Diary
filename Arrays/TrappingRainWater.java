public class TrappingRainWater {
    public static int trappingwater(int[] height) {
        int n = height.length;

        //calculate left max boundary of each height 
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary of each height
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //initially trapped water is 0 
        int trappedWater = 0;

        for(int i=0; i<n; i++){

            //calculate water level
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            //calculate trapped water 
            trappedWater +=  waterLevel - height[i];
        }
        return trappedWater;
          
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingwater(height));
    }
}

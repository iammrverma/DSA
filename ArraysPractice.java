public class ArraysPractice{
    // TC=O(2*n) => O(n), SC=O(2*n) => O(n)
    public static int trappedRainWater(int[] height){ 
        int n=height.length, totalWater = 0;
        if (n<=2) return 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
            rightMax[n-1-i] = Math.max(height[n-1-i], rightMax[n-i]);
        }

        for (int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += waterLevel - height[i];
        }

        return totalWater;
    }

    public static int buyAndSellStocks(int[] prices){
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i=0; i<prices.length; i++){
            int sp = prices[i];//7
            if (sp > bp){
                int profit = sp-bp;
                if (profit > maxProfit) maxProfit = profit;
            }
            else bp = sp;
        }
        return maxProfit;
    }
}
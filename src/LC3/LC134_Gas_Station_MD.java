package LC3;

public class LC134_Gas_Station_MD {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int sumGas= 0;
        int sumCost=0;
        int tank=0;

        for (int i = 0; i < gas.length; i++) {
            sumGas+=gas[i];//adds all the gas available each loop
            sumCost+=cost[i];//adds all the cost each loop
            tank += gas[i] - cost[i];//how much gas is left
            if (tank<0){//if tank is empty
                tank=0; //reset tank to zero
                start= i+1;//reset and try new index
            }
        }

        if (sumGas<sumCost) {
            return -1;
        }

        return start;
    }
}

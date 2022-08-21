class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int maxi = 0;
        
        for(int i=0;i<=(blocks.size()-k);i++)
        {
            int count = 0;
            for(int j=i;j<(k+i);j++)
            {
                if(blocks[j]=='B')
                {
                    count++;
                }
            }
            maxi = max(maxi,count);
        }
        
        return k-maxi;
    }
};

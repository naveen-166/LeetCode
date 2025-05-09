class Solution {
    public String convert(String s, int numRows) {
        char [][] arr=new char[numRows][s.length()];
        int curr=0,row=0,col=0;
        while(curr<s.length())
        {
            while(curr<s.length() && row<numRows)
            {
                arr[row++][col]=s.charAt(curr++);
            }
            row-=2;
            row=Math.max(0,row);
            while(curr<s.length() && row>0)
            {
                arr[row--][++col]=s.charAt(curr++);
            }
            col++;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(arr[i][j]!=0)
                {
                    res.append(arr[i][j]);
                }
            }
        }
        return res.toString();
        
    }
}
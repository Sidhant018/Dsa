class Solution {
    public char findTheDifference(String s, String t) {
       /* char[]ch=s.toCharArray();
        char[]ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
                return ch1[i];
            }
        }
        return ch1[ch1.length-1];
    }
}*/char r=0;
   for(char e:s.toCharArray()){
    r^=e;//XOR krr rahe hai to find same characters  1 1 hoga toh 0 return krrta h XOR
   }
    for(char e:t.toCharArray()){
    r^=e;
    }
    return r;

    }
}

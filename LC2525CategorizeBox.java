class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        /*long volume=(long)(length*height*width);
        boolean b=false,h=false;
        if(length>=10000 || width>=10000 || height>=10000 || volume>=1000000000)
        {
            b=true;
        }
        if(mass>=100)
        {
            h=true;
        }
        if(b && h)
        {
            return "Both";
        }
        if(b)
        {
            return "Bulky";
        }
        if(h)
        {
            return "Heavy";
        }
        return "Neither";*/
        long volume = (long) length * width * height;
        
        boolean bulky = length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000;
        boolean heavy = mass >= 100;
        
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}
 

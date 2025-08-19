class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=0;
        if(ruleKey.equalsIgnoreCase("type")){
            a=0;
        }else if(ruleKey.equalsIgnoreCase("color")){
            a=1;
        }else{
            a=2;
        }int result=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(a).equalsIgnoreCase(ruleValue))result+=1;
        }return result;
    }
}
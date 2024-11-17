public class isPalindrome {
    public boolean probleme_Palindrome(int A) {
        // anchofo ila khdina wahed le nombre badi b - (-10 // 10-)
        if (A<0) {
            return false;
        }
        //convertir le nombre l une chaine de caractere bach n9ed nchof ra9m lowel
        String s = String.valueOf(A);
        int debut = 0;
        int fin = s.length() -1;
        while (debut<fin) {
            if (s.charAt(debut) != s.charAt(fin)) {
                return false;
            }
            debut ++;
            fin--;
        }
        return true;
    }
}

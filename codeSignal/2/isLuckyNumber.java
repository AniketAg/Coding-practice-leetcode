boolean isLuckyNumber(int n) {
    while(n!=0)
        if(n%10 == 7 || n%10 == 4)
            n = n / 10;
        else return false;
    return true;
}

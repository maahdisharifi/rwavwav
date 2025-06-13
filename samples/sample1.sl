


FuncDec first_func():
   int y
   if(6):                //if condition error
        y = 56
   else:
        y = 125
   return y++
end


FuncDec second_func():
    string x
    x = 5             //assignment error
    return 3
end


FuncDec third_func():
    char banana
    banana = 'b'
    return banana * 55 //incompatible operands
end


main():
    double tmp
    tmp = first_func()
    int test
    test = 0
    return tmp * test
end
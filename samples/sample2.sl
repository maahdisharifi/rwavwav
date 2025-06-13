
//no errors

FuncDec first_func():
    int apple
    apple = 10
    int x
    x=6
    return apple + x
end

FuncDec second_func():
    return 3
end

FuncDec third_func()
    double banana
    banana = 33 / second_func()
    return banana == 55
end


main():
    int test
    test = first_func()++
    bool first_bool
    bool second_bool
    first_bool = true || third_func()
    first_bool = test == first_func() && first_bool
    int tmp
    tmp = 55++ + 10 * first_func() + second_func()
    return tmp * test
end





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
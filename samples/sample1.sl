void cleanup(int* ptr1,int x):
    free(ptr1)
end

int main():
    int* ptr1 = malloc(sizeof(int) * 10)
    int* ptr2 = malloc(sizeof(int) * 20)
    cleanup(ptr1,12)
end
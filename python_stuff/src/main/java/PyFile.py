def table_of_mult():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())

    i: int
    j: int
    for j in range(c, d + 1):
        print ('\t'.join(str(j)))
    for i in range(a, b + 1):
        if c != d:
            print(str(i) + '\t' + str(i * j) + '\t' + str(i * j))
        else:
            print(str(i) + '\t' + str(i * j))


table_of_mult()

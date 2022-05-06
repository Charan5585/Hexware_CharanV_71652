# minimum array
arr = [1, 2, 3, 4, 5]
min = arr[0]

for i in range(0, 5):
    if(min > arr[i]):
        min = arr[i]
print("Minimum value of Array: %d" % min)

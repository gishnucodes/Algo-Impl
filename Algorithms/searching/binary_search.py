def binarysearch(arr, target):
    low = 0
    high = len(arr)-1

    while low <= high:
        mid = low + (high-low)//2

        if arr[mid]==target:
            return True
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return -1


arr = [1,2,5,0,22,88]
target = 22
arr = sorted(arr)
val=binarysearch(arr,target)
print(val)


            


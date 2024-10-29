def partition(arr,start,end):
    pivot = arr[end]
    current_index=start
    swap_marker=start-1

    while current_index<end:
        print(f'curr_index {current_index} | swap_marker {swap_marker}')
        if arr[current_index]>pivot:
            current_index+=1
        else:
            swap_marker+=1
            if current_index>swap_marker:
                arr[swap_marker],arr[current_index]=arr[current_index],arr[swap_marker]
            if current_index==swap_marker:
                current_index+=1
    swap_marker+=1
    arr[swap_marker],arr[end]=arr[end],arr[swap_marker]
    print('*****END OF CALL******')
    return swap_marker


def quick_sort(arr,start,end):
    if end > start:
        pivot = partition(arr,start,end)
        quick_sort(arr,start,pivot-1)
        quick_sort(arr,pivot+1,end)


arr=[2,3,5,0,1,8,7,6,9,4]
quick_sort(arr,0,len(arr)-1)
print(arr)

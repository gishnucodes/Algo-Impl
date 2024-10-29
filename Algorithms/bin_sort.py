def bin_sort(arr):
  """Sorts an array using the bin sort algorithm.

  Args:
    arr: The array to be sorted.

  Returns:
    The sorted array.
  """

  # Find the minimum and maximum values in the array
  min_val = min(arr)
  max_val = max(arr)

  # Calculate the range of the values
  range_val = max_val - min_val + 1

  # Create a list of bins
  bins = [[] for _ in range(range_val)]

  # Distribute the elements into the bins
  for val in arr:
    index = val - min_val
    print(index, val)
    bins[index].append(val)

  print(bins)
  # Sort each bin
  for bin in bins:
    bin.sort()

  # Concatenate the sorted bins
  sorted_arr = []
  for bin in bins:
    sorted_arr.extend(bin)

  return sorted_arr

# Example usage
arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
sorted_arr = bin_sort(arr)
print(sorted_arr)
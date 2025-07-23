import math

# Function to check if a number is a strong number
def is_strong_number(n):
    # Convert the number to string to extract digits
    digits = str(n)
    # Calculate the sum of factorials of digits
    sum_of_factorials = sum(math.factorial(int(digit)) for digit in digits)
    # Check if the sum is equal to the number
    return sum_of_factorials == n

# Find all strong numbers from 1 to 5000
strong_numbers = [num for num in range(1, 5001) if is_strong_number(num)]

# Print the strong numbers
print(strong_numbers)
def fibonacci(n: int, a: int, b: int):
    if n < 1:
        return
    print(a, end=" ")
    return fibonacci(n - 1, b, a + b)


def main():
    n = int(input("Enter the Number -> "))
    print("Fibonacci Series-> ", end=" ")
    fibonacci(n, 0, 1)


if __name__ == "__main__":
    main()

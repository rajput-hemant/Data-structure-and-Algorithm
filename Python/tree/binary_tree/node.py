class Node:
    def __init__(self) -> None:
        pass  # empty constructor

    def __init__(self, data):
        self.data = data
        self.left = self.right = None

    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

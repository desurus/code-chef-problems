"""
Problem: https://www.codechef.com/problems/FLOW004
Author: Oleksandr Kryshchenko <okryshchenko@gmail.com>
"""
class FirstNLast:
    """
    Unnecessary use of class declaration just to fill in space
    """
    def __init__(self, input_line):
        """
        Just a contrustor
        """
        self.input_line = input_line


    def find_sum(self):
        """
        Takes number and returns a sum of first and last digit of that number
        """
        first_number = self.input_line[0]
        last_number = self.input_line[-1]
        return int(first_number) + int(last_number)


def run_program():
    """
    Main function to be called when script is executed
    """
    tests = raw_input()
    for i in range(0, int(tests)):
        number_from_input = raw_input()
        find_sum_class = FirstNLast(number_from_input)
        print find_sum_class.find_sum()


if __name__ == "__main__":
    run_program()


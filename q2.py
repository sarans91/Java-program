def count_sets(row):
    count = 0
    for i in range(len(row) - 2):
        if row[i] != row[i + 1] and row[i + 1] != row[i + 2] and row[i] != row[i + 2]:
            count += 1
    return count

def orchard_winner(ashok_row, anand_row):
    ashok_count = count_sets(ashok_row)
    anand_count = count_sets(anand_row)

    if ashok_count > anand_count:
        return "Ashok"
    elif anand_count > ashok_count:
        return "Anand"
    else:
        return "Draw"

# Reading input
ashok_row = input().strip()
anand_row = input().strip()

# Check for invalid input (rows with less than 3 trees cannot form a set)
if len(ashok_row) < 3 or len(anand_row) < 3:
    print("Invalid input")
else:
    result = orchard_winner(ashok_row, anand_row)
    print(result)

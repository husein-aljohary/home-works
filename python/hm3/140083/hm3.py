
def openandRead(fname):
    file = open('data.txt', 'r')#file name
    info = file.read()
    c = len(info)
    return info, c
#1
def numlett(file):
    count = 0
    for i in file:
        if i.isalpha() == True:
            count = count + 1
    return count
#2
def unqch(file):
    count1 = 0
    nq = '[!@#$%^&*()_=+<>?/\|}{~:;.]'
    for i in file:
        if i in nq:
            count1 = count1 + 1
    return count1
#3
def frch(file):
    dic = {}
    for i in file:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    return dic
#4
def low(file):
    dic = {}
    for i in file:
        if i.islower() == True:
            if i in dic.keys():
                dic[i] += 1
            else:
                dic[i] = 1
    return dic   
#5
def up(file):
    dic = {}    
    for i in file:
        if i.isupper() == True:
            if i in dic.keys():
                dic[i] += 1
            else:
                dic[i] = 1
    return dic  
#6
def low2(file):
    dic = {}
    vowels = 'aeiou'
    for i in file:
        if i.islower() == True and i in vowels:
            if i in dic.keys():
                dic[i] += 1
            else:
                dic[i] = 1
    return dic  
#7
def up2(file):
    dic = {}
    vowels = 'AEIOU'
    for i in file:
        if i.isupper() == True and i in vowels:
            if i in dic.keys():
                dic[i] += 1
            else:
                dic[i] = 1
    return dic  
#8
def num(file):
    dic={}
    for i in file:
        if i.isnumeric() == True:
            if i in dic.keys():
                dic[i] += 1
            else:
                dic[i] = 1
    return dic  

def main():
    print("your first choice should be 0 to read the data file\n")
    while True:
        print("0: to read a text file and print its total number of characters")
        print("1: to print the total number of letters in the file")
        print("2: to print the total number of unique characters in the file")
        print("3: to print the frequency of each character in the file")
        print("4: to print the frequency of each lower case letter in the file (‘a-z’)")
        print("5: to print the frequency of each upper case letter in the file (‘A-Z’)")
        print("6: to print the frequency of each lower case vowel in the file (‘aeiou’)") 
        print("7: to print the frequency of each upper case vowel in the file (‘AEIOU’)") 
        print("8: to print the frequency of each digit in the file ('0123456789')")
        print("9: to Exit")
        print("\n")
        choice = int(input("\nenter your choice: "))
        if choice > 9:
            print("\nwrong choice")
        try:
            count = 0
            if choice == 0:
                print("the data file is :\n")
                with open('data.txt', 'r') as fin:
                     info = fin.readlines()
                stTable = {}
                i = 0
                while i < len(info):
                    info[i] = info[i].replace('\n','')
                    st = info[i].split('\t')
                    print(st)
                    i += 1
                print("\n")

                
                filename ="data.text"
                info, tch = openandRead(filename)
                print(f"the Total number of characters is: {tch}")
                print("\n")
                
            elif choice == 1:
                print(f"the total number of letters in the file: {numlett(info)}")
                print("\n")
                
            elif choice == 2:
                print(f"the total number of unique characters in the file is: {unqch(info)}")
                print("\n")

            elif choice == 3:
                print(f"the frequency of each character in the file ")
                print(frch(info))
                print("\n")

            elif choice == 4:
                print(f"the frequency of each Lower case letter in the file('a-z')")
                for i, j in low(info).items():
                    print(i,"    ",j)
                print("\n")

            elif choice == 5:
                print(f"the frequency of each upper case in the file ('A-Z')")
                for i, j in up(info).items():
                    print(i,"    ",j)
                print("\n")

            elif choice == 6:
                print(f"the frequency of each lower case in the file ('aeiou')")
                for i, j in low2(info).items():
                    print(i,"    ",j)
                print("\n")

            elif choice == 7:
                print(f"the frequency of each upper case in the file ('AEIOU')")
                for i, j in up2(info).items():
                    print(i,"   ",j)
                print("\n")

            elif choice == 8:
                print(f"the frequency of each digit in the file ('0123456789')")
                for i, j in num(info).items():
                    print(i,"    ",j)
                print("\n")

            elif choice == 9:
                print("\nthe program will exit")
                break
            
        except UnboundLocalError:
            print("\nyour first choice should be 0 to read the data file\n")
main()







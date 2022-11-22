
def main():
    print("your first choice should be 1 to enter your URL for a website\n")
    while True:
        print("1: to print the total number of letters in the file")
        print("2: to draw a pie chart that shows the occurrences of lower letters, upper letters, and digits")
        print("3: e to identify all of the links(i.e. URLs) and emailsthat may be available in the source of that webpage")
        print("4: to draw a column chart with the frequency of all letters in that webpage (A-Z and a-z)")
        print("5: to draw a column chart with the frequency of all characters on that webpage")
        print("6: to draw a pie chart with the frequency of digits in that webpage (0-9)")
        print("0: to Exit")
        print("\n")
        choice = int(input("\nenter your choice: "))
        if choice > 9:
            print("\nwrong choice")
        try:
            count = 1              
            if choice == 1:
                import urllib.request as web
                fp = web.urlopen(input("\nenter your website whith http:// in the first:"))
                #fp=web.urlopen("http://www.python.org")
                data=str(fp.read())
                fp.close()
                ########      
                count={}
                for x in data:
                    if x in '1234567890':
                        if x not in count:
                            count[x]=1
                        else:
                            count[x]+=1
                print(count)
                ########
                print(f" Total number of lower letters [a-z], the sum of occurrences for all lower letters")
                dic = {}
                c=0
                for i in data:
                    if i.islower() == True:
                        c+=1
                        if i in dic.keys():
                            dic[i] += 1
                        else:
                            dic[i] = 1
                #print(dic)
                print("\nthe total is: ",c)
                #print(c)
                for i, j in dic.items():
                    print(i,"    ",j)
                print("\n")
##################################################################
                print(f" Total number of upper letters [A-Z], the sum of occurrences for all lower letters")
                dic2 = {}
                c2=0
                for i in data:
                    if i.isupper() == True:
                        c2+=1
                        if i in dic2.keys():
                            dic2[i] += 1
                        else:
                            dic2[i] = 1
                #print(dic2)
                print("\nthe total is: ",c2)
                #print(c2)
                for i, j in dic2.items():
                    print(i,"    ",j)
                print("\n")                
##################################################################
                print(f" Total number of digits [0-9], the sum of occurrences for all digits")
                dic3 = {}
                c3=0
                for i in data:
                    if i.isnumeric() == True:
                        c3+=1
                        if i in dic3.keys():
                            dic3[i] += 1
                        else:
                            dic3[i] = 1
                #print(dic3)
                print("\nthe total is: ",c3)
                #print(c3)
                for i, j in dic3.items():
                    print(i,"    ",j)
                print("\n")
##################################################################
                string="href="
                coun = data.count(string)
                print("The Total number of occurrences for the string “href=”:", coun)
                print("\n")             
##################################################################
##################################################################
            elif choice == 2:
                import matplotlib.pyplot as plt
                v  = [c, c2, c3]
                l  = ["lower", "upper", "digits"]
                def pct(v):
                    def pct2(pct):
                        total = sum(v)
                        val = int(round(pct*total/100.0))
                        return '{v:d}'.format(p=pct,v=val)
                    return pct2
                plt.pie(v, labels=l, autopct=pct(v))
                plt.show()                    
##################################################################
##################################################################

            elif choice == 3:

                import re
                #print emails
                lst = re.findall('[\w\.-]+@[\w\.-]+(?:\.[\w]+)+', data)	
                print("emails: ",lst)
                #print links
                lst2 = re.findall('http:[:/a-z.-]+',data)	
                print("links: ",lst2)
                print("\n")
##################################################################
##################################################################
            elif choice == 4:
                dic4 = {}
                c4=0
                for i in data:
                    if i.isalpha() == True:
                        c4+=1
                        if i in dic4.keys():
                            dic4[i] += 1
                        else:
                            dic4[i] = 1
                print("\nthe total is: ",c4)
                import matplotlib.pyplot as plt

                for i, j in dic4.items():
                    print(i,"    ",j)


                plt.bar(dic4.keys(),dic4.values(),width=1,color="green")
                plt.show()
                    
                print("\n")
##################################################################
##################################################################
            elif choice == 5:
                import string
                dic5 = {}
                c5=0
            
                for i in data:
                    if i.isalpha() or i.isnumeric()  == True:
                        c5+=1
                        if i in dic5.keys():
                            dic5[i] += 1
                        else:
                            dic5[i] = 1
                print("\nthe total is: ",c5)
                import matplotlib.pyplot as plt
                for i, j in dic5.items():
                    print(i,"    ",j)
                plt.bar(dic5.keys(),dic5.values(),width=1,color="green")
                plt.show()
                    
                print("\n")
##################################################################
##################################################################    
            elif choice == 6:
                import matplotlib.pyplot as plt
                v  = dic3.values()
                l  = dic3.keys()
                def pct(v):
                    def pct2(pct):
                        total = sum(v)
                        val = int(round(pct*total/100.0))
                        return '{v:d}'.format(p=pct,v=val)
                    return pct2
                plt.pie(v, labels=l, autopct=pct(v))
                plt.show()
##################################################################
##################################################################

            elif choice == 0:
                print("\nthe program will exit")
                break
            
        except UnboundLocalError:
            print("\nyour first choice should be 1 to enter your URL for a website\n")
main()







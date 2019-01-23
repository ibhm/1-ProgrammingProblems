def mergesort(alist):
    if len(alist)>1:
        ##splitting part
        mid = len(alist)//2 ##number for middle of array

        lefthalf = alist[:mid]  ##length of left array
        righthalf = alist[mid:]  ##length of right array

        mergesort(lefthalf)   ##recurvsively going to help merge one left and right side
        mergesort(righthalf)  ##calls itself again and calls a merge sort on itself
        ##merge sort keeps dviding the initial array until there is only
        ##One element left in the smaller list
        ##123456
        ##123  
        ##12 sorts this and goes up from here <-very bottom
        i = 0
        j = 0
        k = 0

        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] < righthalf[j]:
                alist[k] = lefthalf[i]
                i=i+1
            else:
                alist[k] = righthalf[j]
                j=j+1
            k=k+1

        while i < len(lefthalf): ##for the very bottom lefthalf
            alist[k] = lefthalf[i]
            i=i+1
            k=k+1

        while j < len(righthalf): ##for the very bottom righthalf
            alist[k] = righthalf[j]
            j=j+1
            k=k+1
            
    ##recursively many arrays will be generated until only 1 element left in left and right half
    ##first two elements of alist will be the first two elements of left and right half
    ##next arrays will build upon whatever is remaining

    #   N LOG N
            
    print("Merging", alist)

a = [5,15,51,50,11,55,1,7,3]
if __name__ == '__main__':
    mergesort(a)
    print(a)
    

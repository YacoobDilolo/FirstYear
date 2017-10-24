#Yacoob Legong
#06 May 2014
def getvalues(data, value):
    xList = []
    for i in range(len(data)):
        if (data[i][-1]).lower()==value.lower():
            xList.append(data[i])
    return xList 
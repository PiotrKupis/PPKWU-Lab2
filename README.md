# PPKWU-Lab2

Project responsible for performing operation on passed string.

ENDPOINT  

Description: endpoint responsible for getting information about number of uppercase, lowercase, numbers, special characters and if contains its combination or contain passed substring  
Path: string/{string}/{substring} (GET)  
Params:  
    {string} - passed string   
    {substring} - passed substring   
Return: JSON object with data about passed string  

EXAMPLE:  
```
/string/aaAA12@#/AA  
```

Response:  
```
{  
    "uppercase": 2,    
    "lowercase": 2,  
    "numbers: 2,  
    "specialChars": 2,  
    "contains": true,  
    "combination": true
}   
```

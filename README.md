# PPKWU-Lab2

Project responsible for performing operation on passed string.

ENDPOINT  

Description: endpoint responsible for getting information about number of uppercase, lowercase, numbers, special characters and if contains its combination in passed string   
Path: string/{string} (GET)  
Params:  {string} - passed string     
Return: JSON object with data about passed string  

EXAMPLE:  
input  
```
/string/aaAA12@$
```

Response:  
```
{  
    "uppercase": 2,    
    "lowercase": 2,  
    "numbers: 2,  
    "specialChars": 2,  
    "combination": true
}   
```

# SILT
S-I-L-T stands for "Super Intelligent Ledger/Tracker" 

This is a simple ledger and spending tracker CLI program that allows users to watch their spending, see their balance, and view their past transactions. 
Users can also add deposits and payments to be stored in the future. 


The home screen, where users can decide to add transactions with deposits and payments, or to see reports on past transactions 

<img width="525" height="423" alt="Screenshot_20251017_004820" src="https://github.com/user-attachments/assets/1bd7ad7c-c29a-4ea2-9c68-4b3a6f1c5fae" />


The reporting screen, where users can choose what reports they would like to display. 

<img width="495" height="571" alt="Screenshot_20251017_004841" src="https://github.com/user-attachments/assets/a7c184a6-49e0-4bc9-9c4b-b85f6d07111b" />


The actual reports display, in this case all reports. The displayed reports of course change depending on the filter selected by the user. 

<img width="1064" height="971" alt="Screenshot_20251017_004908" src="https://github.com/user-attachments/assets/8f90a967-3221-4c7a-a970-8c3501b90ecd" />


The vendor search screen, where users can search transactions by vendor (or other user) specified when the transaction was created.   

<img width="929" height="407" alt="Screenshot_20251017_004947" src="https://github.com/user-attachments/assets/371eb0ae-714a-4ccf-99a5-aef37b483e7a" />



The application will likely work on any CL that's capable of running a JVM, but will look best and feel smoothest if ANSI escape codes are supported. 
These codes consist of bytes of text that, when printed to the console, are interpreted as commands. In this case, I use them to clear the screen between each menu display extremely simply. 

My most used sources of information were:
https://docs.oracle.com/
https://www.w3schools.com/java/
https://www.geeksforgeeks.org/java/

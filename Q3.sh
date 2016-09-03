grep -o -E '\w+' < HI.TXT | sort -u -f | wc -l > check.txt

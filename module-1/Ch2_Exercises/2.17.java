/*
Wind Chill measurement formula:
t_wc = 35.74 + 0.6215t_a - 35.75 v^0.16 + 0.4275t_a*v^0.16
t_a is the outside temperature in °F 
v is the speed measured in mph
and t_wc is the wind chill temperature.

The formula cannot be used for temperatures below -58° F or above 41° F
or for wind speeds below 2mph.

Write a program that prompts the user to enter a valid temperature
and a wind speed greater than or equal to 2mph
and displays the windchill temp.
math.pow(a, b) computes a^b
*/
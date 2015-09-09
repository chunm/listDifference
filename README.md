## Synopsis:

Just a small program that takes in two files and returns the differences between them.

## How it works:

The program takes in two files. It reads the first one into a Hash Map and then parses the other file for input and checks to see if that input exists as a key in the Hash Map. 
If the key does NOT EXIST in the Hash Map, then the input is added to a List.
In the end the list is printed out for the user to see. 

## Why I made this:

I had a small task at work where I had to go through two very large excel documents and find all the different entries.
Not wanting to manually crawl through hundreds of entries by pressing 'crtl' + 'f' I decided to write a small program that would find the differences for me in a few seconds.

## Installation/Use:

Just plug the main java file into a project in an IDE, add 2 files named "file1.txt" and "file2.txt" and you are all ready to run!
The only thing you might want to change is the regEx on lines 34 - 35, depending on what you are looking for.
This is kind of a specialized problem, but with a bit of modification it can be used to find so much more. 
package com.gdstruc.Module6;

public class Main {

    public static void main(String[] args) {

        int stuff[] ={1, 2 , 3, 4, 5 ,6, 7, 8, 8, 10};

        System.out.println(watchThis(stuff, 6));
    }

    public static int watchThis(int[] input, int value){


        for (int i = 0; i < input.length; i += 3) //Goes through the array by 3
        {

            if (i > input.length) //Keeps the code from checking beyond the array's length
            {
                i = input.length;
            }

            if (input[i] == value) //If the element is found instantly, it is returned
            {
                return i;
            }
            else if (input[i] > value)  //Checks if it has gone past the value its finding
            {
                for (int j = 0; j < 2; j++) //goes back and checks the 2 numbers it passed by
                {
                    i--;

                    if (input[i] == value)
                    {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

}



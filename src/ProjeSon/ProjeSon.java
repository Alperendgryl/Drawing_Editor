/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjeSon;

import java.util.Scanner;

/**
 *
 * @author Muhammed Alperen Doğruyol
 */
public class ProjeSon {
    
    public static void main(String[] args) {
        
        Scanner A = new Scanner (System.in);
        
        Options();
        
        int option = A.nextInt();
            
        if(option == 8){
            
            System.out.println("\nExit Program.\n");
            System.exit(0);
            
        }else if(option != 1){
        System.out.println("\nFirstly, you must create a picture before select the other options. !");
        }
            
            System.out.print("What is the height of picture = ");
            int height = A.nextInt();
            System.out.print("What is the width of picture = ");
            int width = A.nextInt();
            
            String picture [][] = new String [height][width];
            System.out.println("\n");
            for (int row = 0; row < height; row++) {
                for (int column = 0; column < width; column++) {
                    
                    picture[row][column] = "0";
                    System.out.print(picture[row][column]);
                }
                System.out.println("");
            }
            System.out.println();
            
        while (true){    
            
        Options();
        
        option = A.nextInt();
        
        if (option == 2 ){
            
            System.out.println("\nPicture Cleared. \n");
            
            for (int row = 0; row < height; row++) {
                for (int column = 0; column < width; column++) {
                    
                    picture[row][column] = "0";
                    System.out.print(picture[row][column]);
                }
                System.out.println("");
            }
            System.out.println();
        
        }else if(option == 3){
            
            System.out.print("Enter X = ");
            
            int X = A.nextInt();
            
            System.out.print("Enter Y = ");
            
            int Y = A.nextInt();
            
            System.out.print("Enter Color: ");
      
            String colour = A.next();
            
            picture[X][Y] = colour;
            
            for (int row = 0; row <height; row++) {
                for (int column = 0; column < width; column++) {
                    System.out.print(picture[row][column]);
                    
                }
                System.out.println("");
            }
            System.out.println();
            
        }else if (option == 4){
            
            System.out.print("Enter Y = ");
            
            int Y = A.nextInt();
            
            System.out.print("Enter X1 = ");
            
            int X1 = A.nextInt();
            
            System.out.print("Enter X2 = ");
            
            int X2 = A.nextInt();
            
            System.out.print("Enter Colour = ");
            
            String colour2 = A.next();
            
            for (int column = X1; column <= X2; column++) {
                picture[column][Y] = colour2;
            }
            
            for (int row = 0; row < height; row++) {
                for (int column = 0; column < width; column++) {
                    System.out.print(picture[row][column]);
                    
                }
                System.out.println("");   
            }
            System.out.println();
            
        }else if (option == 5){
            
            System.out.print("Enter X = ");
            
            int X3 = A.nextInt();
            
            System.out.print("Enter Y1 = ");
            
            int Y1 = A.nextInt();
            
            System.out.print("Enter Y2 = ");
            
            int Y2 = A.nextInt();
            
            System.out.print("Enter Colour = ");
            
            String colour3 = A.next();
            
            for (int row = Y1; row <= Y2; row++) {
                picture[X3][row] = colour3;
            }
                
                for (int roww = 0; roww < height; roww++) {
                    for (int column = 0; column < width; column++) {
                        System.out.print(picture[roww][column]);
                        
                    }
                    System.out.println("");
                }
                System.out.println();
                
        }else if (option == 6){
            
            System.out.print("Enter X1 = ");
            
            int X4 = A.nextInt();
            
            System.out.print("Enter Y1 = ");
            
            int Y3 = A.nextInt();
            
            System.out.print("Enter X2 = ");
                
            int X5 = A.nextInt();
                
            System.out.print("Enter Y2 = ");
                
            int Y4 = A.nextInt();
                
                System.out.print("Enter Colour = ");
                
                String colour4 = A.next();
                
                for (int row = X4; row <= X5; row++) {
                    for (int column = Y3; column < Y4; column++) {
                        picture[row][column] = colour4;
                    }
                }
                
                for (int row = 0; row < height; row++) {
                    for (int column = 0; column < width; column++) {
                        System.out.print(picture[row][column]);
                    }
                    System.out.println("");
            }
                System.out.println();
        
        }else if (option == 7){
            
            System.out.print("Enter X = ");
            
            int X6 = A.nextInt();
            
            System.out.print("Enter Y = ");
            
            int Y5 = A.nextInt();
            
            System.out.print("Enter Colour = ");
            
            String colour5 = A.next();
        
        }else if (option == 8){
            
            System.out.print("\nExit Program.\n");
            System.exit(0);
                
        }else{
            
            System.out.println("\nWrong Option Choice!\n ");
        }
        
        }
            
        
        
    }
    
    public static void Options(){
        
        System.out.println("The following options are available for you : \n"
                + "1- Create a picture \n"
                + "2- Clear the picture \n"
                + "3- Colour pixel (X,Y) in color C \n"
                + "4- Draw vertical segment \n"
                + "5- Draw horizontal segment \n"
                + "6- Draw filled rectangle in color C \n"
                + "7- Fills region with color C starting with pixel (X,Y) \n"
                + "8- Exit program");
        
        System.out.print("Choose An Option : ");
    }
    
}
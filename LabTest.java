/* Decompiler 37ms, total 111ms, lines 167 */
package lab7;

import java.util.Scanner;

public class LabTest {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] jersey = new int[5];
      int[] playerRating = new int[5];

      int i;
      for(i = 0; i < jersey.length; ++i) {
         System.out.println("Enter player " + (i + 1) + "'s jersey number: ");
         jersey[i] = scnr.nextInt();
         System.out.println("Enter player " + (i + 1) + "'s rating: ");
         playerRating[i] = scnr.nextInt();
      }

      System.out.println("MENU");
      System.out.println("u - Update player rating");
      System.out.println("a - Output players above a rating");
      System.out.println("r - Replace player");
      System.out.println("o - Output roster");
      System.out.println("q - Quit");

      for(char option = scnr.next().charAt(0); option != 'q'; option = scnr.next().charAt(0)) {
         int jerseySearch;
         int tempRating;
         label129: {
            label130: {
               label87:
               switch(option) {
               case 'o':
                  break label130;
               case 'r':
                  break;
               case 'u':
                  System.out.println("Enter a jersey number: ");
                  jerseySearch = scnr.nextInt();

                  for(i = 0; i < jersey.length; ++i) {
                     if (jersey[i] == jerseySearch) {
                        System.out.println("Enter a new rating for player: ");
                        playerRating[i] = scnr.nextInt();
                     }
                  }
               case 'a':
                  System.out.println("Enter a rating: ");
                  tempRating = scnr.nextInt();
                  System.out.println("ABOVE " + tempRating);
                  i = 0;

                  while(true) {
                     if (i >= playerRating.length) {
                        break label87;
                     }

                     if (playerRating[i] > tempRating) {
                        System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + playerRating[i]);
                     }

                     ++i;
                  }
               default:
                  break label129;
               }

               System.out.println("Enter a jersey number: ");
               jerseySearch = scnr.nextInt();

               for(i = 0; i < jersey.length; ++i) {
                  if (jersey[i] == jerseySearch) {
                     System.out.println("Enter a new jersey number: ");
                     jersey[i] = scnr.nextInt();
                     System.out.println("Enter a rating for new player: ");
                     playerRating[i] = scnr.nextInt();
                  }
               }
            }

            System.out.println("ROSTER");

            for(i = 0; i < jersey.length; ++i) {
               System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + playerRating[i]);
            }
         }

         System.out.println("MENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
         option = scnr.next().charAt(0);
         label114:
         switch(option) {
         case 'a':
            System.out.println("Enter a rating: ");
            tempRating = scnr.nextInt();
            System.out.println("ABOVE " + tempRating);
            i = 0;

            while(true) {
               if (i >= playerRating.length) {
                  break label114;
               }

               if (playerRating[i] > tempRating) {
                  System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + playerRating[i]);
               }

               ++i;
            }
         case 'o':
            System.out.println("ROSTER");
            i = 0;

            while(true) {
               if (i >= jersey.length) {
                  break label114;
               }

               System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + playerRating[i]);
               ++i;
            }
         case 'r':
            System.out.println("Enter a jersey number: ");
            jerseySearch = scnr.nextInt();
            i = 0;

            while(true) {
               if (i >= jersey.length) {
                  break label114;
               }

               if (jersey[i] == jerseySearch) {
                  System.out.println("Enter a new jersey number: ");
                  jersey[i] = scnr.nextInt();
                  System.out.println("Enter a rating for new player: ");
                  playerRating[i] = scnr.nextInt();
               }

               ++i;
            }
         case 'u':
            System.out.println("Enter a jersey number: ");
            jerseySearch = scnr.nextInt();

            for(i = 0; i < jersey.length; ++i) {
               if (jersey[i] == jerseySearch) {
                  System.out.println("Enter a new rating for player: ");
                  playerRating[i] = scnr.nextInt();
               }
            }
         }

         System.out.println("/nMENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
      }

   }
}

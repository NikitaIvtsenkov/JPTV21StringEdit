/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====StringEdit=====");
        System.out.print("Введите текст (латиницей): ");
        String text = scanner.nextLine();
        int repeat = 1;
        OUTER:
        do{
            System.out.println("Выберите номер функции: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Количество символов в тексте");
            System.out.println("2. Количество слов в тексте");
            System.out.println("3. Находит указанную подстроку в тексте");
            System.out.println("4. Заменяет указанную подстроку на другую подстроку.");
            System.out.print("Ваш выбор: ");
            int numberFunction = scanner.nextInt();
            scanner.nextLine();
            switch (numberFunction){
                case 0:
                    System.out.println("");
                    System.out.println("До свидания");
                    break OUTER;
                case 1:
                    System.out.println("");
                    int StringLengthWithoutSpaces = text.length();
                    System.out.print("Количество символов в тексте: " + StringLengthWithoutSpaces);
                    break;
                case 2:
                    System.out.println("");
                    String[] words = text.split("\\W+");
                    System.out.print("Количество слов в тексте: " + words.length);
                    break;
                
                case 3:
                    System.out.print("Введите подстроку для поиска: ");
                    String subStr = scanner.nextLine();
                    int indexSubStr = str.indexOf(subStr);
                    if(indexSubStr < 0) {
                        System.out.println("Такой подстроки нет");
                    }else{
                        indexSubStr++;
                        System.out.println("Подстрока находиться на "+indexSubStr+" позиции в строке");
                    }
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }
            if(repeat == 0) break;            
            
        }while(true);
        
    }
    
}

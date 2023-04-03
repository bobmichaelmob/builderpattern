/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondBuilderPattern;

import java.util.Date;

/**
 *
 * @author MOB
 */
public class MainTest {

    public static void main(String[] args) {
        Task task = new TaskBuilder(1)
                .setDescription("Hello Description")
                .setSummary("Test Summary")
                .setDone(false)
                .setDueDate(new Date())   
                .build();
  
        System.out.println(task);
        Task task1 = new TaskBuilder(2)
                .setDescription("")
                .setSummary("Second Test Summary")
                .setDone(false)
                .setDueDate(new Date())   
                .build();
  
        System.out.println(task1);
        Task task2 = new TaskBuilder(10)
                .setDescription("")
                .setDueDate(new Date())   
                .build();
  
        System.out.println(task2);
    }

}

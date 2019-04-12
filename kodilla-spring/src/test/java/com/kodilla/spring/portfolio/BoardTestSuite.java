package com.kodilla.spring.portfolio;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
       Board board = context.getBean(Board.class);
       board.getToDoList().add("To do");
       board.getDoneList().add("Done");
       board.getInProgressList().add("In progress!");

        //When
        System.out.println(board.getToDoList().get(0));
        System.out.println(board.getDoneList().get(0));
        System.out.println(board.getInProgressList().get(0));

        //Then
        //do nothing
    }

}

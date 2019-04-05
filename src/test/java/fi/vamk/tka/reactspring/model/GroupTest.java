package fi.vamk.tka.reactspring.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackageClasses = GroupRepository.class)

public class GroupTest {

    
    @Autowired
    private GroupRepository repository;
    @Test
    public void justTesting(){
        System.out.println("--------test,test,test-----------");
    }

    @Test
    public void againTesting(){
        System.out.println("--------hei,hai,hi-----------");
    }

    @Test
    public void addGroupAndVerifyTest(){
        System.out.println("--------hei,hai,hi-----------");
        //create an instance of GroupTest
        Group item = new Group();
        //set the group name to "Vaasa JUG"
        item.setName("Vaasa JUG");
        //add instance of GroupRepository to save it to database
        repository.save(item);
        //get the save one by findByName
        Group found = repository.findByName("Vaasa JUG");
        

            assertEquals(found.getName(),item.getName());
       
        
        //compare the initial and the saved one if the name is the same
        //use assertEquals
    }


}
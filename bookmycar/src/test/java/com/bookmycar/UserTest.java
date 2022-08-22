package com.bookmycar;




import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

import com.bookmycar.dao.UserRepository;
import com.bookmycar.exceptions.UserNotFoundException;
import com.bookmycar.model.User;
import com.bookmycar.service.UserService;

@SpringBootTest()
public class UserTest{	
   
       @Mock
       private UserRepository userRepository;

       @InjectMocks
       private UserService  userService;

       private User login;
    
   @BeforeEach
    public void setup() {
	   login = new User("a@gmail.com","aaa","Admin");
	   login.setUserId(1);
       
    }
   

   @DisplayName("JUnit test for userService getLoginDetailsByEmail method")
   @Test
   public void checkLoginTest() throws UserNotFoundException
   { 
	  
	   given(userRepository.findByEmail(login.getEmail()))
       .willReturn(Optional.of(login));

       // when
	   User checkUser=userService.getLoginDetailsByEmail(login.getEmail());

       // then
       assertThat(checkUser).isNotNull();
   }
   
}

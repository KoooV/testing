package com.kov.testing;

import com.kov.testing.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    User user;
    void setUp(){
        user = new User();
    }

    @Test
    @DisplayName("Correct case")
    void testFindByMail(){

    }


}

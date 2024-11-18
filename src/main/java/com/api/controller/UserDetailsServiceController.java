package com.api.controller;

import com.api.model.UserDetails;
import com.api.util.DataUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${api.base-path}")
public class UserDetailsServiceController {


    @GetMapping
    public UserDetails retrieveUserDetails(@RequestParam("userId") String userId) {
       return DataUtil.fetchDetails(userId);
    }
}

package com.hellokoding.auth.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {
//    @Autowired
//    private TrackerService trackerService;

    @RequestMapping(value = {"/tracker"}, method = RequestMethod.GET)
    public ResponseEntity<?> tracker() {
        System.out.println("INSIDE TRACKER:>>>>");
//        System.out.println("first name: " + tracker.getFname() + " last name: " + tracker.getLname() + " gender: " + tracker.getGender());
//        trackerService.saveTracker(tracker);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

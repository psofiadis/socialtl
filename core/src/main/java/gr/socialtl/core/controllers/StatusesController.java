package gr.socialtl.core.controllers;

import gr.socialtl.core.model.dto.StatusDTOImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Panagiotis on 12/29/2015.
 */
@RestController
@RequestMapping("/statuses")
public class StatusesController {

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public StatusDTOImpl getStatuses(){
        return new StatusDTOImpl("StatusID","The user is not logged in");
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public StatusDTOImpl getPostStatuses(){
        return new StatusDTOImpl("StatusID","The user is not logged in");
    }
}

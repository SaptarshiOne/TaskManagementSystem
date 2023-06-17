package collab.fullstack.backend.api.taskmanagement.webcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class ApiHealthCheck {

    @GetMapping("/status")
    public String getHealth()
    {
        return "<html><body><h1>Task Management System Is Up and Running ! </h1></body></html>";
    }
}

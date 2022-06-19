package link.staticks.backoffice.component.controller;

import link.staticks.backoffice.component.service.ComponentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ComponentController {
    private final ComponentService componentService;
}

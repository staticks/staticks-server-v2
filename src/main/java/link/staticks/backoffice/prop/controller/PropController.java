package link.staticks.backoffice.prop.controller;

import link.staticks.backoffice.prop.service.PropService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PropController {
    private final PropService propService;
}

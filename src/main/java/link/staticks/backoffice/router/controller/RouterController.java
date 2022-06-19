package link.staticks.backoffice.router.controller;

import link.staticks.backoffice.router.service.RouterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RouterController {
    private final RouterService routerService;
}

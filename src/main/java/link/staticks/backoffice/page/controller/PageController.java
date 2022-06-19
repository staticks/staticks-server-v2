package link.staticks.backoffice.page.controller;

import link.staticks.backoffice.page.service.PageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PageController {
    private final PageService pageService;
}

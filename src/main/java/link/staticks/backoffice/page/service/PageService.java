package link.staticks.backoffice.page.service;

import link.staticks.backoffice.page.repository.PageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PageService {
    private final PageRepository pageRepository;
}

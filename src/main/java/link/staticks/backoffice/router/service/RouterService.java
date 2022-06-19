package link.staticks.backoffice.router.service;

import link.staticks.backoffice.router.repository.RouterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RouterService {
    private final RouterRepository routerRepository;
}

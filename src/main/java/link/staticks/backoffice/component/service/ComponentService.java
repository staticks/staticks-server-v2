package link.staticks.backoffice.component.service;

import link.staticks.backoffice.component.repository.ComponentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ComponentService {
    private final ComponentRepository componentRepository;
}

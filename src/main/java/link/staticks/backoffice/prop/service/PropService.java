package link.staticks.backoffice.prop.service;

import link.staticks.backoffice.prop.repository.PropRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PropService {
    private final PropRepository propRepository;
}

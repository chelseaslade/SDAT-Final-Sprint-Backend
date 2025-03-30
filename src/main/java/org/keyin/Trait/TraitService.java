package org.keyin.Trait;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class TraitService {

    private final TraitRepository traitRepository;

    public TraitService(TraitRepository traitRepository) {
        this.traitRepository = traitRepository;
    }

    @Transactional
    public Trait addTrait(Trait trait) {
        return traitRepository.save(trait);
    }

    public List<Trait> getAllTraits() {
        return traitRepository.findAll();
    }
}

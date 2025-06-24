package com.berthaudiere.berthau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berthaudiere.berthau.ActivitySheetList;
import com.berthaudiere.berthau.data.entity.ActivitySheetEntity;
import com.berthaudiere.berthau.data.repository.ActivitySheetRepository;
import com.berthaudiere.berthau.service.exception.ActivitySheetNotFoundException;
import com.berthaudiere.berthau.web.dto.ActivitySheetDto;
import com.berthaudiere.berthau.web.sheet.ActivitySheet;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ActivitySheetService {

    @Autowired
    private ActivitySheetRepository activitySheetRepository;

    public List<ActivitySheetDto> getAllActivitySheets() {
    return activitySheetRepository.findAll().stream()
            .map(entity -> new ActivitySheetDto(
                    entity.getName(),
                    entity.getNbrOfPeople(),
                    entity.getGoal(),
                    entity.getPurpose(),
                    entity.getMaterial()))
            .toList();
}

    public ActivitySheetDto getById(Long id) {
        return activitySheetRepository.findById(id)
        .map(entity -> new ActivitySheetDto(
            entity.getName(),
            entity.getNbrOfPeople(),
            entity.getGoal(),
            entity.getPurpose(),
            entity.getMaterial()
        ))
                .orElseThrow(() -> new ActivitySheetNotFoundException(id));
    }

    public ActivitySheetDto persist(ActivitySheetDto activitySheetDto) {
        ActivitySheetEntity entity = activitySheetDto.toEntity();
        ActivitySheetEntity saved = activitySheetRepository.save(entity);

        return new ActivitySheetDto(
            saved.getName(),
            saved.getNbrOfPeople(), 
            saved.getGoal(),saved.getPurpose(),
            saved.getMaterial());

        }


    public ActivitySheetDto update(Long id, ActivitySheetDto dto) {
    ActivitySheetEntity existing = activitySheetRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Activité non trouvée pour l'id : " + id));

    existing.setName(dto.name());
    existing.setNbrOfPeople(dto.nbrOfPeople());
    existing.setGoal(dto.goal());
    existing.setPurpose(dto.purpose());
    existing.setMaterial(dto.material());

    ActivitySheetEntity saved = activitySheetRepository.save(existing);

    return new ActivitySheetDto(
        saved.getName(),
        saved.getNbrOfPeople(),
        saved.getGoal(),
        saved.getPurpose(),
        saved.getMaterial()
    );
}

    public void delete(Long id) {
    if (!activitySheetRepository.existsById(id)) {
        throw new EntityNotFoundException("Activité non trouvée pour l'id : " + id);
    }

    activitySheetRepository.deleteById(id);
    }

}

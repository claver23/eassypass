package com.etlions.easypass.business.impl;


import com.etlions.easypass.business.usecase.CreateEventUseCase;
import com.etlions.easypass.business.usecase.FindEventsNearUseCase;
import com.etlions.easypass.dto.EventDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements CreateEventUseCase , FindEventsNearUseCase {


    @Override
    public EventDto createEvent(EventDto eventDto) {
        return null;
    }

    @Override
    public List<EventDto> FindEventsNear() {
        return List.of();
    }
}

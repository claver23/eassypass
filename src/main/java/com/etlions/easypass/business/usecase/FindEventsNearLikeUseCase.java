package com.etlions.easypass.business.usecase;

import com.etlions.easypass.dto.EventDto;

import java.util.List;

public interface FindEventsNearLikeUseCase {

    List<EventDto> FindEventsNearLike(String textLike);
}

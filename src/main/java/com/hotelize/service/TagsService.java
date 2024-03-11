package com.hotelize.service;

import com.hotelize.domain.Tags;
import com.hotelize.repository.TagsRepository;
import com.hotelize.utils.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class TagsService extends ServiceManager<Tags, String> {

    private final TagsRepository tagsRepository;

    public TagsService(TagsRepository tagsRepository) {
        super(tagsRepository);
        this.tagsRepository = tagsRepository;
    }
}

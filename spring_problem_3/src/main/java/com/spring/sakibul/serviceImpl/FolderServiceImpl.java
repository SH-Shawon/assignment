package com.spring.sakibul.serviceImpl;


import com.spring.sakibul.dto.GetFolderIdsByIdResponseDto;
import com.spring.sakibul.entity.Folder;
import com.spring.sakibul.repository.FolderRepository;
import java.util.ArrayList;
import java.util.List;

import com.spring.sakibul.service.FolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FolderServiceImpl implements FolderService {

    private final FolderRepository folderRepository;

    @Override
    public GetFolderIdsByIdResponseDto getIdByFolderId(Integer folderId) {
        List<Integer> allSubFolderIds = new ArrayList<>();
        findAllSubFolderIds(folderId, allSubFolderIds);

        return new GetFolderIdsByIdResponseDto(allSubFolderIds);
    }

    private void findAllSubFolderIds(Integer parentId, List<Integer> allSubFolderIds) {
        List<Folder> subFolders = folderRepository.findByParentId(parentId);
        for (Folder subFolder : subFolders) {
            allSubFolderIds.add(subFolder.getId());
            findAllSubFolderIds(subFolder.getId(), allSubFolderIds);
        }
    }
}


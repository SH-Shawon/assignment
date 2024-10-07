package com.spring.sakibul.service;

import com.spring.sakibul.dto.GetFolderIdsByIdResponseDto;

public interface FolderService {
    GetFolderIdsByIdResponseDto getIdByFolderId(Integer folderId);
}

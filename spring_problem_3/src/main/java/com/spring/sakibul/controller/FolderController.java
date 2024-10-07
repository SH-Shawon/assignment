package com.spring.sakibul.controller;

import com.spring.sakibul.dto.GetFolderIdsByIdResponseDto;
import com.spring.sakibul.service.FolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class FolderController {

    private final FolderService folderService;

    @PostMapping("getidbyfolderid/{folderId}")
    public ResponseEntity<GetFolderIdsByIdResponseDto> getIdByFolderId(@PathVariable Integer folderId) {
        return new ResponseEntity<>(folderService.getIdByFolderId(folderId), HttpStatus.OK);
    }
}

package com.spring.sakibul.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetFolderIdsByIdResponseDto {
    private List<Integer> folderIds;
}


package com.spring.sakibul.repository;

import com.spring.sakibul.entity.Folder;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Integer> {
    List<Folder> findByParentId(Integer parentId);
}


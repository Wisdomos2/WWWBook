package com.community.weddingbook.Board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BoardRepository extends JpaRepository<Board, Integer> {

}

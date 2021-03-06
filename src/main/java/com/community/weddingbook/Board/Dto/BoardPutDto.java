package com.community.weddingbook.Board.Dto;

import com.community.weddingbook.Author.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardPutDto {

    Integer id;

    String title;

    String content;

    String password;
}

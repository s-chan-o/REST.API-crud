package com.example.board_crud.crud.Dto;


import com.example.board_crud.crud.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class BoardResponseDto {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BoardResponseDto(BoardEntity board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}

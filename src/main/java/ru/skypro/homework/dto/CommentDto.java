package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class CommentDto {
    private int id;
    private int author; //id автора комментария
    private String authorImage; //ссылка на аватар автора комментария
    private String authorFirstName;
    private String createdAt; //дата и время создания комментария в миллисекундах с 00:00:00 01.01.1970
    private String text;
}

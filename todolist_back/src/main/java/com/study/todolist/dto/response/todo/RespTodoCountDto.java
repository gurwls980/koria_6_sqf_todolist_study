package com.study.todolist.dto.response.todo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RespTodoCountDto {
    private int all;
    private int today;
    private int important;
    private int busy;
    private int complete;


}

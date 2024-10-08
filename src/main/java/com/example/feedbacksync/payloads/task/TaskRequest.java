package com.example.feedbacksync.payloads.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequest {
    private String taskName;
    private Boolean isCompleted;
    private Long goalId;
    private Long pipId;

}

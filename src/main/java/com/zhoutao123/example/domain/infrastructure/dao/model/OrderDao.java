package com.zhoutao123.example.domain.infrastructure.dao.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderDao {

    private Long id;

    private Long userId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

package garg.bhawana.spring_security_demo.models;

import java.util.UUID;

public record Task(
    UUID id,
    String description,
    TaskStatus status,
    long createdAt,
    long updatedAt
) {}
package com.smart.consumption.query.infrastructure.shared.mapper;

/**
 * Interface for generic mappers
 * @param <S> Source object (e.g., DTO, Domain)
 * @param <T> Target object (e.g., Entity, Domain)
 */
public interface GenericMapper<S, T> {
    T toTarget(S source);

    S toSource(T target);
}

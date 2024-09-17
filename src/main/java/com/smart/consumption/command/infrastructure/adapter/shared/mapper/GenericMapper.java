package com.smart.consumption.command.infrastructure.adapter.shared.mapper;

/**
 * Interface for generic mappers
 * @param <S> Source object (e.g., DTO, Domain)
 * @param <T> Target object (e.g., Entity, Domain)
 */
public interface GenericMapper<S, T> {
    T toTarget(S source);

    S toSource(T target);
}

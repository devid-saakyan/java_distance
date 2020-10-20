package com.company;

public interface Filter {
    public <T> Boolean apply(T obj);
}

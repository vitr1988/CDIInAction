package ru.otus.bean;

import javax.inject.Singleton;

@Singleton
public class StateManager {
    private int state;

    public StateManager next(){
        state++;
        return this;
    }

    public StateManager previous(){
        state--;
        return this;
    }

    public int getState(){
        return state;
    }
}

package com.google.android.gms.samples.vision.face.facetracker;

public interface Subject {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void update(String s);
}

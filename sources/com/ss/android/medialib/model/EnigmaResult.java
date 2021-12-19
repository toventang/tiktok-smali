package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class EnigmaResult {
    Enigma[] result;
    public float zoomFactor;

    static {
        Covode.recordClassIndex(36902);
    }

    public Enigma[] getResult() {
        return this.result;
    }

    public void setResult(Enigma[] enigmaArr) {
        this.result = enigmaArr;
    }
}

package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;

public class VEMusicWaveBean {
    private float[] waveBean;

    static {
        Covode.recordClassIndex(37659);
    }

    public float[] getWaveBean() {
        return this.waveBean;
    }

    public void setWaveBean(float[] fArr) {
        this.waveBean = fArr;
    }
}

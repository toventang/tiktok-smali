package com.ss.avframework.livestreamv2.core.audiorecord;

import com.bytedance.covode.number.Covode;

public interface IAudioRecordManager {

    public interface RecordStateCallback {
        static {
            Covode.recordClassIndex(100132);
        }

        void onError(int i2, String str);
    }

    static {
        Covode.recordClassIndex(100131);
    }

    void release();

    void setRecordPath(String str);

    void startAudioRecord();
}

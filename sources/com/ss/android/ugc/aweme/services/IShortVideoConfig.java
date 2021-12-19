package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IShortVideoConfig {

    public interface MusicWaveDataListener {
        static {
            Covode.recordClassIndex(79479);
        }
    }

    static {
        Covode.recordClassIndex(79478);
    }

    String cutsameSdkVersion();

    void enableHookLibrary(boolean z);

    List<String> getBOEBypassHostList();

    List<String> getBOEBypassPathList();

    boolean getUsingOnline();

    boolean isHookLibrary();

    boolean isRecording();

    long maxDuetVideoTime();

    long maxRecordingTime();

    long maxStitchVideoTime();
}

package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.RTCEngine;

public class RecordingConfig {
    public String dirPath;
    public RTCEngine.RecordingFileType recordingFileType = RTCEngine.RecordingFileType.RECORDING_FILE_TYPE_MP4;
    public RTCEngine.RecordingType recordingType = RTCEngine.RecordingType.RECORD_VIDEO_AND_AUDIO;

    static {
        Covode.recordClassIndex(100864);
    }

    public RecordingConfig() {
    }

    public RecordingConfig(String str, RTCEngine.RecordingFileType recordingFileType2, RTCEngine.RecordingType recordingType2) {
        this.dirPath = str;
        this.recordingFileType = recordingFileType2;
        this.recordingType = recordingType2;
    }
}

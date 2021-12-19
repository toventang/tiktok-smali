package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class LoaderEventInfo {
    public long bitrate = -1;
    public long bytesLoaded = -1;
    public int dataType = -1;
    public long elapsedRealtimeMs = -1;
    public long endOff = -1;
    public String fileHash;
    public long loadDurationMs = -1;
    public HashMap<String, String> mHeaders = new HashMap<>();
    public long off = -1;
    public int taskType = -1;
    public int what = -1;

    static {
        Covode.recordClassIndex(101127);
    }
}

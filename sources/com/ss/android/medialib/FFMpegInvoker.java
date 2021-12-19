package com.ss.android.medialib;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class FFMpegInvoker {
    public native int addFastReverseVideo(String str, String str2);

    public native int stopReverseVideo();

    static {
        Covode.recordClassIndex(36825);
        d.c();
    }
}

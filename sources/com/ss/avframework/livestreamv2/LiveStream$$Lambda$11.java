package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveStream$$Lambda$11 implements Runnable {
    private final LiveStream arg$1;
    private final int arg$10;
    private final boolean arg$2;
    private final long arg$3;
    private final String arg$4;
    private final int[] arg$5;
    private final String arg$6;
    private final Object arg$7;
    private final int arg$8;
    private final boolean arg$9;

    static {
        Covode.recordClassIndex(99877);
    }

    LiveStream$$Lambda$11(LiveStream liveStream, boolean z, long j2, String str, int[] iArr, String str2, Object obj, int i2, boolean z2, int i3) {
        this.arg$1 = liveStream;
        this.arg$2 = z;
        this.arg$3 = j2;
        this.arg$4 = str;
        this.arg$5 = iArr;
        this.arg$6 = str2;
        this.arg$7 = obj;
        this.arg$8 = i2;
        this.arg$9 = z2;
        this.arg$10 = i3;
    }

    public final void run() {
        this.arg$1.lambda$addSeiFieldWithNs$9$LiveStream(this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6, this.arg$7, this.arg$8, this.arg$9, this.arg$10);
    }
}

package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public class FDLeakDetector {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f27753a = new AtomicBoolean();

    private static native void doSetAddrs(long j2, long j3);

    private static native void doStartDetect(String str);

    static {
        Covode.recordClassIndex(16267);
    }
}

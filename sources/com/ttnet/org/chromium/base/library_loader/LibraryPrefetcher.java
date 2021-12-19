package com.ttnet.org.chromium.base.library_loader;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public class LibraryPrefetcher {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f155259a = new AtomicBoolean();

    private static native void nativeForkAndPrefetchNativeLibrary();

    private static native OrderedCodeInfo nativeGetOrderedCodeInfo();

    private static native int nativePercentageOfResidentNativeLibraryCode();

    private static native void nativePeriodicallyCollectResidency();

    static {
        Covode.recordClassIndex(103318);
    }

    static final class OrderedCodeInfo {

        /* renamed from: a  reason: collision with root package name */
        public final String f155260a;

        /* renamed from: b  reason: collision with root package name */
        public final long f155261b;

        /* renamed from: c  reason: collision with root package name */
        public final long f155262c;

        static {
            Covode.recordClassIndex(103319);
        }

        public final String toString() {
            return "filename = " + this.f155260a + " startOffset = " + this.f155261b + " length = " + this.f155262c;
        }

        public OrderedCodeInfo(String str, long j2, long j3) {
            this.f155260a = str;
            this.f155261b = j2;
            this.f155262c = j3;
        }
    }
}

package com.ttnet.org.chromium.base.library_loader;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.metrics.a;

public class LibraryLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f155252a;

    /* renamed from: b  reason: collision with root package name */
    public static LibraryLoader f155253b = new LibraryLoader();

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f155254d = true;

    /* renamed from: e  reason: collision with root package name */
    private static final a.c f155255e = new a.c("ChromiumAndroidLinker.RelinkerFallbackCount");

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f155256c;

    /* renamed from: f  reason: collision with root package name */
    private final Object f155257f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private int f155258g = -1;

    private native String nativeGetVersionNumber();

    private native boolean nativeLibraryLoaded(int i2);

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(long j2);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i2);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(long j2);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i2);

    private LibraryLoader() {
    }

    static {
        Covode.recordClassIndex(103317);
        boolean z = true;
        if (Build.VERSION.SDK_INT > 19) {
            z = false;
        }
        f155252a = z;
    }
}

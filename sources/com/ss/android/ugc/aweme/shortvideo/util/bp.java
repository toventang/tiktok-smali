package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEUtils;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoCoverCacheImpl f132270a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132271b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f132272c;

    /* renamed from: d  reason: collision with root package name */
    private final int f132273d;

    /* renamed from: e  reason: collision with root package name */
    private final int f132274e;

    static {
        Covode.recordClassIndex(86633);
    }

    bp(VideoCoverCacheImpl videoCoverCacheImpl, String str, int[] iArr, int i2, int i3) {
        this.f132270a = videoCoverCacheImpl;
        this.f132271b = str;
        this.f132272c = iArr;
        this.f132273d = i2;
        this.f132274e = i3;
    }

    public final void run() {
        VEUtils.getVideoFrames(this.f132271b, this.f132272c, this.f132273d, this.f132274e, false, new bq(this.f132270a));
    }
}

package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.b;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f140194a;

    /* renamed from: b  reason: collision with root package name */
    public final String f140195b;

    /* renamed from: c  reason: collision with root package name */
    public final String f140196c;

    /* renamed from: d  reason: collision with root package name */
    public final int f140197d;

    static {
        Covode.recordClassIndex(91589);
    }

    public final String toString() {
        return "ConcatFinishedEvent{videoPath='" + this.f140194a + '\'' + ", audioPath='" + this.f140195b + '\'' + ", statusCode=" + this.f140197d + ", metadata= " + this.f140196c + '}';
    }

    public f(String str, String str2, String str3, int i2) {
        this.f140194a = str;
        this.f140195b = str2;
        this.f140197d = i2;
        this.f140196c = str3;
    }
}

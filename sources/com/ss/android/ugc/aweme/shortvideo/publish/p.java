package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f129867a;

    /* renamed from: b  reason: collision with root package name */
    public final String f129868b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f129869c;

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f129870d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f129871e;

    static {
        Covode.recordClassIndex(85245);
    }

    public final String toString() {
        return "errorCode:" + this.f129867a + " stage:" + this.f129868b;
    }

    public p(String str, String str2, boolean z, Throwable th, Object obj) {
        l.d(str, "");
        l.d(str2, "");
        this.f129867a = str;
        this.f129868b = str2;
        this.f129869c = z;
        this.f129870d = th;
        this.f129871e = obj;
    }
}

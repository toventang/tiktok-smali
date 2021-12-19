package com.ss.ugc.live.a.a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f154004a;

    /* renamed from: b  reason: collision with root package name */
    public final long f154005b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f154006c;

    /* renamed from: d  reason: collision with root package name */
    public long f154007d;

    /* renamed from: e  reason: collision with root package name */
    public String f154008e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f154009f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f154010g;

    /* renamed from: h  reason: collision with root package name */
    public int f154011h = -1;

    static {
        Covode.recordClassIndex(102703);
    }

    public final void b() {
        this.f154011h++;
    }

    public final String a() {
        return this.f154006c[Math.min(this.f154011h, this.f154006c.length - 1)];
    }

    public String toString() {
        return "GetResourceRequest{mId='" + this.f154004a + "', mResourceId=" + this.f154005b + ", mUrls='" + Arrays.toString(this.f154006c) + "', mMd5='" + this.f154008e + "', mSourceFrom='" + this.f154007d + "', mNeedToUnzip=" + this.f154009f + '}';
    }

    public c(long j2, String[] strArr, String str) {
        this.f154004a = String.valueOf(j2);
        this.f154005b = j2;
        this.f154006c = strArr;
        this.f154008e = str;
        this.f154007d = 0;
        this.f154009f = true;
    }

    public c(String str, long j2, String[] strArr, String str2, long j3) {
        this.f154004a = str;
        this.f154005b = j2;
        this.f154006c = strArr;
        this.f154008e = str2;
        this.f154007d = j3;
        this.f154009f = true;
    }
}

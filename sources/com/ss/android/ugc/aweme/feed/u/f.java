package com.ss.android.ugc.aweme.feed.u;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.k;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f94013a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94014b;

    /* renamed from: c  reason: collision with root package name */
    private final int f94015c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94016d;

    /* renamed from: e  reason: collision with root package name */
    private final long f94017e;

    /* renamed from: f  reason: collision with root package name */
    private final long f94018f;

    /* renamed from: g  reason: collision with root package name */
    private final int f94019g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f94020h;

    /* renamed from: i  reason: collision with root package name */
    private final String f94021i;

    /* renamed from: j  reason: collision with root package name */
    private final String f94022j;

    /* renamed from: k  reason: collision with root package name */
    private final String f94023k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f94024l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f94025m;
    private final Lock n;

    static {
        Covode.recordClassIndex(59778);
    }

    f(d dVar, int i2, int i3, String str, long j2, long j3, int i4, Integer num, String str2, String str3, String str4, boolean z, boolean z2, Lock lock) {
        this.f94013a = dVar;
        this.f94014b = i2;
        this.f94015c = i3;
        this.f94016d = str;
        this.f94017e = j2;
        this.f94018f = j3;
        this.f94019g = i4;
        this.f94020h = num;
        this.f94021i = str2;
        this.f94022j = str3;
        this.f94023k = str4;
        this.f94024l = z;
        this.f94025m = z2;
        this.n = lock;
    }

    public final void run() {
        boolean z;
        d dVar = this.f94013a;
        int i2 = this.f94014b;
        int i3 = this.f94015c;
        String str = this.f94016d;
        long j2 = this.f94017e;
        long j3 = this.f94018f;
        int i4 = this.f94019g;
        Integer num = this.f94020h;
        String str2 = this.f94021i;
        String str3 = this.f94022j;
        String str4 = this.f94023k;
        boolean z2 = this.f94024l;
        boolean z3 = this.f94025m;
        Lock lock = this.n;
        WeakHandler weakHandler = dVar.mHandler;
        j jVar = new j(dVar, i2, i3, str, j2, j3, i4, num, str2, str3, str4, z2);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z3) {
            lock = null;
        }
        k.a(i2, i3, weakHandler, jVar, 0, z, lock);
    }
}

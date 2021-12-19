package com.ss.android.ugc.aweme.authorize.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeAuthorizePlatformDepend f67229a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AbstractC1045a f67230b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f67231c;

    static {
        Covode.recordClassIndex(41407);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new AuthCommonViewModel(this.f67229a, this.f67230b, this.f67231c);
    }

    public a(AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend, a.AbstractC1045a aVar, c.a aVar2) {
        l.d(awemeAuthorizePlatformDepend, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f67229a = awemeAuthorizePlatformDepend;
        this.f67230b = aVar;
        this.f67231c = aVar2;
    }
}

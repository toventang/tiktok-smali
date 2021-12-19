package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f116002a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116003b;

    /* renamed from: c  reason: collision with root package name */
    private final int f116004c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116005d;

    static {
        Covode.recordClassIndex(74808);
    }

    b(String str, String str2, int i2, int i3) {
        this.f116002a = str;
        this.f116003b = str2;
        this.f116004c = i2;
        this.f116005d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return BlockApi.a(this.f116002a, this.f116003b, this.f116004c, this.f116005d);
    }
}

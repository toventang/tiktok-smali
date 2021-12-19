package com.ss.android.ugc.aweme.common.e;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public class h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f76410a;

    /* renamed from: b  reason: collision with root package name */
    public final int f76411b;

    /* renamed from: c  reason: collision with root package name */
    public final int f76412c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f76413d;

    static {
        Covode.recordClassIndex(47170);
    }

    public static <T> h<T> a(T t, int i2) {
        return new h<>(Collections.singletonList(t), i2, true, 1);
    }

    public static <T> h<T> a(List<T> list, int i2, int i3) {
        return new h<>(list, i2, true, i3);
    }

    protected h(List<T> list, int i2, boolean z, int i3) {
        this.f76410a = list;
        this.f76411b = i2;
        this.f76413d = z;
        this.f76412c = i3;
    }
}

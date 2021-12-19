package com.bytedance.android.livesdk.gift.model.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.b;
import com.bytedance.covode.number.Covode;

public abstract class b<T extends com.bytedance.android.livesdk.model.b> {

    /* renamed from: a  reason: collision with root package name */
    public final int f17863a;

    /* renamed from: b  reason: collision with root package name */
    public T f17864b;

    static {
        Covode.recordClassIndex(9933);
    }

    public abstract String a();

    public abstract String b();

    public abstract ImageModel c();

    public abstract long d();

    public ImageModel f() {
        return null;
    }

    public boolean g() {
        return false;
    }

    public b(int i2, T t) {
        this.f17863a = i2;
        this.f17864b = t;
    }
}

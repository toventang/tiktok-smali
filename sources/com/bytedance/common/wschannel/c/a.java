package com.bytedance.common.wschannel.c;

import android.os.Handler;
import com.bytedance.common.wschannel.c.a.b;
import com.bytedance.covode.number.Covode;

public abstract class a<T extends b> implements d {

    /* renamed from: a  reason: collision with root package name */
    protected T f27021a;

    static {
        Covode.recordClassIndex(15952);
    }

    public abstract void a(c cVar, Handler handler);

    public a(T t) {
        this.f27021a = t;
    }
}

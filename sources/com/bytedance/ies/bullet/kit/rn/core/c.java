package com.bytedance.ies.bullet.kit.rn.core;

import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32381a;

    static {
        Covode.recordClassIndex(19056);
    }

    public abstract <T> T a(Class<T> cls);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.c(context, "");
        this.f32381a = context;
    }
}

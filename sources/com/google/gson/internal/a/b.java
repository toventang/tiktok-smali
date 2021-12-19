package com.google.gson.internal.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.d;
import java.lang.reflect.AccessibleObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f54738a;

    public abstract void a(AccessibleObject accessibleObject);

    static {
        b cVar;
        Covode.recordClassIndex(33943);
        if (d.f54867a < 9) {
            cVar = new a();
        } else {
            cVar = new c();
        }
        f54738a = cVar;
    }
}

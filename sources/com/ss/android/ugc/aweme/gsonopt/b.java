package com.ss.android.ugc.aweme.gsonopt;

import com.bytedance.covode.number.Covode;
import com.google.gson.v;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final String f99082a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f99083b = true;

    /* renamed from: c  reason: collision with root package name */
    final boolean f99084c = true;

    /* renamed from: d  reason: collision with root package name */
    v f99085d;

    /* renamed from: e  reason: collision with root package name */
    boolean f99086e;

    static {
        Covode.recordClassIndex(63120);
    }

    /* access modifiers changed from: package-private */
    public final Field a(Object obj) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(this.f99082a);
                if (declaredField != null) {
                    return declaredField;
                }
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public b(String str, v vVar, boolean z) {
        this.f99082a = str;
        this.f99085d = vVar;
        this.f99086e = z;
    }
}

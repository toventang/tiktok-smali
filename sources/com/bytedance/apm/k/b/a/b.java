package com.bytedance.apm.k.b.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class b extends WeakReference<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final String f25090a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25091b;

    static {
        Covode.recordClassIndex(14642);
    }

    private static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public b(Object obj, String str, String str2, ReferenceQueue<Object> referenceQueue) {
        super(a(obj, "referent"), (ReferenceQueue) a(referenceQueue, "referenceQueue"));
        this.f25090a = (String) a(str, "key");
        this.f25091b = (String) a(str2, StringSet.name);
    }
}

package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ga implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Object f142965a;

    static {
        Covode.recordClassIndex(93560);
    }

    ga(Object obj) {
        this.f142965a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return PreventServerSideCrashes.a(this.f142965a, method, objArr);
    }
}

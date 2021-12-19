package com.bytedance.android.livesdk.as;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final /* synthetic */ class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final b f14069a;

    /* renamed from: b  reason: collision with root package name */
    private final IMessageManagerV2 f14070b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f14071c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14072d;

    static {
        Covode.recordClassIndex(7803);
    }

    c(b bVar, IMessageManagerV2 iMessageManagerV2, Class cls, Object obj) {
        this.f14069a = bVar;
        this.f14070b = iMessageManagerV2;
        this.f14071c = cls;
        this.f14072d = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f14069a.a(this.f14070b, this.f14071c, this.f14072d, obj, method, objArr);
    }
}

package com.bytedance.android.livesdkapi;

import android.content.Context;
import android.util.Pair;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.al.b;
import com.bytedance.android.livesdk.livesetting.other.LiveSettingsWriteDelayTimeSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.android.livesdkapi.host.g;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.o;
import f.a.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f23196a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f23197b;

    static {
        Covode.recordClassIndex(13748);
    }

    private f() {
    }

    public static d a() {
        if (!f23196a) {
            return null;
        }
        return b.a();
    }

    public static void a(c cVar) {
        MethodCollector.i(209);
        if (!f23197b) {
            synchronized (f.class) {
                try {
                    if (!f23197b) {
                        a.a(IHostAction.class, cVar.j());
                        a.a(IHostContext.class, cVar.a());
                        a.a(com.bytedance.android.live.base.b.a.class, cVar.d());
                        a.a(IHostNetwork.class, cVar.i());
                        a.a(g.class, cVar.e());
                        a.a(IHostPlugin.class, cVar.f());
                        a.a(IHostApp.class, cVar.c());
                        a.a(IHostShare.class, cVar.h());
                        a.a(IHostUser.class, cVar.l());
                        a.a(com.bytedance.android.livesdkapi.host.b.class, cVar.b());
                        a.a(IHostWallet.class, cVar.g());
                        a.a(j.class, cVar.k());
                        a.a(k.class, cVar.m());
                        a.a(e.class, cVar.n());
                        a.a(com.bytedance.android.livesdkapi.host.c.class, cVar.p());
                        a.a(h.class, cVar.q());
                        a.a(com.bytedance.android.livesdkapi.host.d.class, null);
                        a.a(com.bytedance.android.livesdkapi.host.f.class, null);
                        a.a(com.bytedance.android.livesdkapi.c.a.class, cVar.o());
                        a.a(i.class, cVar.r());
                        a("com.bytedance.android.live.service.initializer.ServiceInitializer", "init");
                        f23197b = true;
                    }
                } finally {
                    MethodCollector.o(209);
                }
            }
            return;
        }
        MethodCollector.o(209);
    }

    public static void a(Context context, o oVar) {
        if (context != null && oVar != null) {
            t.b(LiveSettingsWriteDelayTimeSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new g(oVar), com.bytedance.android.livesdk.util.rxutils.i.f22196a);
        }
    }

    public static void a(String str, String str2) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(declaredMethod, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_livesdkapi_TTLiveSDK_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                Object obj = a2.second;
                return;
            }
            com.bytedance.helios.sdk.a.a(declaredMethod.invoke(null, objArr), declaredMethod, new Object[]{null, objArr}, "com_bytedance_android_livesdkapi_TTLiveSDK_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}

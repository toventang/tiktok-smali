package com.ss.android.ugc.aweme.video.simplayer;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.model.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f143878a = "SimLifecycleManager";

    /* renamed from: b  reason: collision with root package name */
    public boolean f143879b;

    /* renamed from: c  reason: collision with root package name */
    OnUIPlayListener f143880c;

    /* renamed from: d  reason: collision with root package name */
    OnUIPlayListener f143881d;

    /* renamed from: e  reason: collision with root package name */
    public int f143882e = 1;

    /* renamed from: f  reason: collision with root package name */
    final h f143883f = h.i.a((h.f.a.a) b.f143886a);

    static {
        Covode.recordClassIndex(94149);
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143886a = new b();

        static {
            Covode.recordClassIndex(94151);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            c cVar = c.f148702a;
            l.a((Object) cVar, "");
            boolean z = true;
            if (cVar.getPlayerBackgroundSleepStrategy() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public final OnUIPlayListener a(OnUIPlayListener onUIPlayListener) {
        this.f143879b = false;
        return (OnUIPlayListener) Proxy.newProxyInstance(OnUIPlayListener.class.getClassLoader(), new Class[]{OnUIPlayListener.class}, new a(this, onUIPlayListener));
    }

    static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f143884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnUIPlayListener f143885b;

        static {
            Covode.recordClassIndex(94150);
        }

        a(i iVar, OnUIPlayListener onUIPlayListener) {
            this.f143884a = iVar;
            this.f143885b = onUIPlayListener;
        }

        private static Object a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_video_simplayer_LifecycleManager$createProxyListener$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_video_simplayer_LifecycleManager$createProxyListener$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            l.a((Object) method, "");
            String name = method.getName();
            l.a((Object) name, "");
            if (l.a((Object) name, (Object) "equals")) {
                return Boolean.valueOf(l.a(this.f143885b, objArr[0]));
            }
            if (l.a((Object) name, (Object) "hashCode")) {
                return Integer.valueOf(this.f143885b.hashCode());
            }
            if ((!l.a((Object) name, (Object) "onPlayProgressChange")) && (!l.a((Object) name, (Object) "onBufferedPercent")) && (!l.a((Object) name, (Object) "onBufferedTimeMs"))) {
                l.a((Object) name, (Object) "toString");
            }
            if (!l.a((Object) name, (Object) "onRenderFirstFrame") || objArr == null || objArr.length <= 1) {
                z = false;
            } else {
                z = true;
            }
            boolean a2 = l.a((Object) name, (Object) "onPreparePlay");
            if (!this.f143884a.f143879b) {
                OnUIPlayListener onUIPlayListener = this.f143885b;
                if (objArr == null) {
                    objArr = new Object[0];
                }
                return a(method, onUIPlayListener, Arrays.copyOf(objArr, objArr.length));
            } else if (z) {
                Method method2 = this.f143885b.getClass().getMethod("onResumePlay", String.class);
                l.a((Object) method2, "");
                method2.invoke(this.f143885b, objArr[0]);
                this.f143884a.f143879b = false;
                method2.getName();
                return 0;
            } else if (!a2) {
                return null;
            } else {
                if (this.f143884a.f143882e > 0) {
                    i iVar = this.f143884a;
                    iVar.f143882e--;
                    return null;
                }
                this.f143884a.f143879b = false;
                this.f143884a.f143882e = 1;
                OnUIPlayListener onUIPlayListener2 = this.f143885b;
                if (objArr == null) {
                    objArr = new Object[0];
                }
                return a(method, onUIPlayListener2, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }
}

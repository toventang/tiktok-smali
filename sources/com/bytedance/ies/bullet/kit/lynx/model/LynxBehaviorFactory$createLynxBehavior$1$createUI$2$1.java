package com.bytedance.ies.bullet.kit.lynx.model;

import android.util.Pair;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.c;
import com.bytedance.ies.bullet.kit.lynx.api.i;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import h.f.b.l;
import java.lang.reflect.Method;

public final class LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1 extends LynxUIMethodInvokerProxy {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f32361a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LynxUI f32362b;

    static {
        Covode.recordClassIndex(19006);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_bullet_kit_lynx_model_LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_bullet_kit_lynx_model_LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1(i iVar, LynxUI lynxUI) {
        this.f32361a = iVar;
        this.f32362b = lynxUI;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.model.LynxUIMethodInvokerProxy
    public final void a(String str, ReadableMap readableMap, Callback callback) {
        l.c(str, "");
        l.c(str, "");
        Method method = this.f32361a.b().get(str);
        if (method != null) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                l.a((Object) parameterTypes, "");
                if (parameterTypes.length == 0) {
                    a(method, this.f32361a, new Object[0]);
                } else if (parameterTypes.length == 1) {
                    Class<?> cls = parameterTypes[0];
                    if (l.a(cls, ReadableMap.class)) {
                        a(method, this.f32361a, new Object[]{readableMap});
                    } else if (l.a(cls, Callback.class)) {
                        a(method, this.f32361a, new Object[]{callback});
                    } else if (l.a(cls, BulletReadableMap.class)) {
                        a(method, this.f32361a, new Object[]{b.a(readableMap)});
                    } else if (l.a(cls, c.class)) {
                        a(method, this.f32361a, new Object[]{b.a(callback)});
                    }
                } else if (parameterTypes.length != 2) {
                    c a2 = b.a(callback);
                    if (a2 != null) {
                        a2.a(4);
                    }
                } else if (l.a(parameterTypes[0], ReadableMap.class) && l.a(parameterTypes[1], Callback.class)) {
                    a(method, this.f32362b, new Object[]{readableMap, callback});
                } else if (l.a(parameterTypes[0], BulletReadableMap.class) && l.a(parameterTypes[1], c.class)) {
                    a(method, this.f32362b, new Object[]{b.a(readableMap), b.a(callback)});
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback] */
    @Override // com.bytedance.ies.bullet.kit.lynx.model.LynxUIMethodInvokerProxy, com.lynx.tasm.behavior.utils.a
    public final /* synthetic */ void invoke(LynxUI<? extends View> lynxUI, String str, ReadableMap readableMap, Callback callback) {
        a(str, readableMap, callback);
    }
}

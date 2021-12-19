package com.lynx.tasm.behavior.utils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LynxUIMethodsExecutor {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, a<?>> f56444a = new HashMap();

    static {
        Covode.recordClassIndex(35213);
    }

    public static class FallbackLynxUIMethodInvoker<T extends LynxBaseUI> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, Method> f56445a;

        static {
            Covode.recordClassIndex(35214);
        }

        private static Object a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_behavior_utils_LynxUIMethodsExecutor$FallbackLynxUIMethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_lynx_tasm_behavior_utils_LynxUIMethodsExecutor$FallbackLynxUIMethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        public FallbackLynxUIMethodInvoker(Class<? extends LynxBaseUI> cls) {
            this.f56445a = b.a(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.a
        public void invoke(T t, String str, ReadableMap readableMap, Callback callback) {
            Method method = this.f56445a.get(str);
            if (method == null) {
                callback.invoke(3);
                return;
            }
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 0) {
                    a(method, t, new Object[0]);
                } else if (parameterTypes.length == 1) {
                    if (parameterTypes[0] == ReadableMap.class) {
                        a(method, t, new Object[]{readableMap});
                    } else if (parameterTypes[0] == Callback.class) {
                        a(method, t, new Object[]{callback});
                    }
                } else if (parameterTypes[0] == ReadableMap.class && parameterTypes[1] == Callback.class) {
                    a(method, t, new Object[]{readableMap, callback});
                } else {
                    callback.invoke(4);
                    LLog.a(3, "FallbackMethodInvoker", "invoke target method: params invalid");
                }
            } catch (Exception e2) {
                callback.invoke(1);
                LLog.a("FallbackMethodInvoker", "invoke target method exception," + e2.getMessage());
            }
        }
    }

    public static <T> T a(Class<?> cls) {
        String str = cls.getName() + "$$MethodInvoker";
        try {
            return (T) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new RuntimeException("Unable to instantiate methods invoker for ".concat(String.valueOf(str)), e2);
        }
    }
}

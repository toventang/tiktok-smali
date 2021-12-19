package com.bytedance.ies.bullet.lynx_adapter_impl;

import android.util.Pair;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.lynx.lynx_adapter.a.a;
import com.bytedance.ies.lynx.lynx_adapter.annotation.LynxPropWrapper;
import com.bytedance.ies.lynx.lynx_adapter.annotation.LynxUIMethodWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.c;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.e;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.i;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import h.f.b.l;
import h.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32481a = new a();

    private a() {
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.a$a  reason: collision with other inner class name */
    public static final class C0696a extends com.lynx.tasm.behavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f32482a;

        static {
            Covode.recordClassIndex(19247);
        }

        @Override // com.lynx.tasm.behavior.a
        public final com.lynx.tasm.a b() {
            return null;
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxFlattenUI b(j jVar) {
            return null;
        }

        @Override // com.lynx.tasm.behavior.a
        public final ShadowNode a() {
            return new LynxBehaviorFactoryKt$transform$2();
        }

        @Override // com.lynx.tasm.behavior.a
        public final LynxUI<?> a(j jVar) {
            LynxPropWrapper lynxPropWrapper;
            l.c(jVar, "");
            c cVar = this.f32482a;
            new e(jVar.getBaseContext());
            i<? extends View> a2 = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Method[] declaredMethods = a2.getClass().getDeclaredMethods();
            l.a((Object) declaredMethods, "");
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                l.a((Object) method, "");
                Annotation[] annotations = method.getAnnotations();
                l.a((Object) annotations, "");
                int length = annotations.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Annotation annotation = annotations[i2];
                    if ((annotation instanceof LynxPropWrapper) || (annotation instanceof LynxUIMethodWrapper)) {
                        arrayList.add(method);
                    } else {
                        i2++;
                    }
                }
            }
            for (Method method2 : arrayList) {
                l.a((Object) method2, "");
                Annotation[] annotations2 = method2.getAnnotations();
                l.a((Object) annotations2, "");
                int length2 = annotations2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    Annotation annotation2 = annotations2[i3];
                    if (!(annotation2 instanceof LynxPropWrapper)) {
                        i3++;
                    } else if (annotation2 != null && (lynxPropWrapper = (LynxPropWrapper) annotation2) != null) {
                        linkedHashMap.put(lynxPropWrapper.name(), method2);
                    }
                }
                Annotation[] annotations3 = method2.getAnnotations();
                l.a((Object) annotations3, "");
                int length3 = annotations3.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        break;
                    }
                    Annotation annotation3 = annotations3[i4];
                    if (!(annotation3 instanceof LynxUIMethodWrapper)) {
                        i4++;
                    } else if (annotation3 != null) {
                        a2.b().put(method2.getName(), method2);
                    }
                }
            }
            new C0697a(a2, linkedHashMap);
            LynxBehaviorFactoryKt$transform$3 lynxBehaviorFactoryKt$transform$3 = new LynxBehaviorFactoryKt$transform$3(a2, jVar, jVar);
            try {
                if (!a2.b().isEmpty()) {
                    Field declaredField = LynxUIMethodsExecutor.class.getDeclaredField("a");
                    l.a((Object) declaredField, "");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(null);
                    if (obj != null) {
                        ((HashMap) obj).put(lynxBehaviorFactoryKt$transform$3.getClass(), new LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1(a2, lynxBehaviorFactoryKt$transform$3));
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return lynxBehaviorFactoryKt$transform$3;
        }

        /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.a$a$a  reason: collision with other inner class name */
        public static final class C0697a extends a.C0761a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f32483a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Map f32484b;

            static {
                Covode.recordClassIndex(19248);
            }

            private static Object a(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_bullet_lynx_adapter_impl_LynxBehaviorFactory$createLynxBehavior$1$createUI$1$3_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    return a2.second;
                }
                Object invoke = method.invoke(obj, objArr);
                com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_bullet_lynx_adapter_impl_LynxBehaviorFactory$createLynxBehavior$1$createUI$1$3_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            C0697a(i<? extends View> iVar, Map map) {
                this.f32483a = iVar;
                this.f32484b = map;
            }

            @Override // com.bytedance.ies.lynx.lynx_adapter.a.a, com.bytedance.ies.lynx.lynx_adapter.a.a.C0761a
            public final void a(String str, Object obj) {
                l.c(str, "");
                if (this.f32484b.get(str) != null) {
                    Object obj2 = this.f32484b.get(str);
                    if (obj2 == null) {
                        l.a();
                    }
                    Method method = (Method) obj2;
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        try {
                            if (l.a(parameterTypes[0], ReadableMapWrapper.class) && (obj instanceof ReadableMap)) {
                                a(method, this.f32483a, new Object[]{b.a((ReadableMap) obj)});
                            } else if (!l.a(parameterTypes[0], ReadableArrayWrapper.class) || !(obj instanceof ReadableArray)) {
                                a(method, this.f32483a, new Object[]{obj});
                            } else {
                                a(method, this.f32483a, new Object[]{b.a((ReadableArray) obj)});
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0696a(c cVar, String str, boolean z) {
            super(str, z);
            this.f32482a = cVar;
        }
    }

    static {
        Covode.recordClassIndex(19246);
    }

    public static com.lynx.tasm.behavior.a a(c cVar) {
        l.c(cVar, "");
        return new C0696a(cVar, cVar.f34201a, cVar.f34202b);
    }
}

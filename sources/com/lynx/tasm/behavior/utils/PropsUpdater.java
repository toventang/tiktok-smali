package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.d;
import com.lynx.tasm.behavior.v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PropsUpdater {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, LynxUISetter<?>> f56447a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, ShadowNodeSetter<?>> f56448b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Settable> f56449c = new HashMap();

    static {
        Covode.recordClassIndex(35217);
    }

    public static class FallbackLynxUISetter<T extends LynxBaseUI> implements LynxUISetter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, d.j> f56450a;

        static {
            Covode.recordClassIndex(35218);
        }

        private FallbackLynxUISetter(Class<? extends LynxBaseUI> cls) {
            this.f56450a = d.a(cls);
        }

        public /* synthetic */ FallbackLynxUISetter(Class cls, byte b2) {
            this(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.LynxUISetter
        public void setProperty(LynxBaseUI lynxBaseUI, String str, v vVar) {
            d.j jVar = this.f56450a.get(str);
            if (jVar != null) {
                jVar.a(lynxBaseUI, vVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class FallbackShadowNodeSetter<T extends ShadowNode> implements ShadowNodeSetter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, d.j> f56451a;

        static {
            Covode.recordClassIndex(35219);
        }

        private FallbackShadowNodeSetter(Class<? extends ShadowNode> cls) {
            this.f56451a = d.b(cls);
        }

        /* synthetic */ FallbackShadowNodeSetter(Class cls, byte b2) {
            this(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
        public final void a(ShadowNode shadowNode, String str, v vVar) {
            d.j jVar = this.f56451a.get(str);
            if (jVar != null) {
                jVar.a(shadowNode, vVar);
            }
        }
    }

    private static <T extends ShadowNode> ShadowNodeSetter<T> b(Class<? extends ShadowNode> cls) {
        Map<Class<?>, ShadowNodeSetter<?>> map = f56448b;
        ShadowNodeSetter<?> shadowNodeSetter = map.get(cls);
        if (shadowNodeSetter == null) {
            shadowNodeSetter = (ShadowNodeSetter) a(cls);
            if (shadowNodeSetter == null) {
                shadowNodeSetter = new FallbackShadowNodeSetter<>(cls, (byte) 0);
            }
            map.put(cls, shadowNodeSetter);
        }
        return shadowNodeSetter;
    }

    public static <T> T a(Class<?> cls) {
        String str = cls.getName() + "$$PropsSetter";
        T t = (T) f56449c.get(str);
        if (t != null) {
            return t;
        }
        try {
            return (T) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new RuntimeException("Unable to instantiate methods getter for ".concat(String.valueOf(str)), e2);
        }
    }

    public static <T extends ShadowNode> void a(T t, v vVar) {
        ShadowNodeSetter b2 = b(t.getClass());
        ReadableMapKeySetIterator keySetIterator = vVar.f56468a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            b2.a(t, keySetIterator.nextKey(), vVar);
        }
    }
}

package com.lynx.tasm.behavior.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<LynxUI, com.lynx.tasm.a.b> f55802a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public WeakHashMap<LynxUI, com.lynx.tasm.a.b> f55803b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<LynxUI, com.lynx.tasm.a.b> f55804c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<LynxUI, com.lynx.tasm.a.b> f55805d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public WeakHashMap<LynxUI, String> f55806e = new WeakHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f55807f = true;

    /* renamed from: g  reason: collision with root package name */
    private ConcurrentHashMap<String, WeakReference<View>> f55808g = new ConcurrentHashMap<>();

    /* renamed from: com.lynx.tasm.behavior.b.b$b  reason: collision with other inner class name */
    public interface AbstractC1259b {
        static {
            Covode.recordClassIndex(34899);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(34900);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(34895);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f55815a = new b();

        static {
            Covode.recordClassIndex(34898);
        }
    }

    public final void a(LynxView lynxView) {
        for (LynxUI lynxUI : this.f55804c.keySet()) {
            if (lynxUI.mContext.f55901i.f56067a == lynxView) {
                lynxUI.execResumeAnim();
            }
        }
    }

    public final synchronized void a(LynxUI lynxUI, com.lynx.tasm.a.b bVar) {
        MethodCollector.i(12168);
        this.f55803b.put(lynxUI, bVar);
        lynxUI.setEnterAnim(bVar);
        MethodCollector.o(12168);
    }

    public final synchronized void b(LynxUI lynxUI, com.lynx.tasm.a.b bVar) {
        MethodCollector.i(12309);
        this.f55802a.put(lynxUI, bVar);
        lynxUI.setExitAnim(bVar);
        MethodCollector.o(12309);
    }

    public final synchronized void c(LynxUI lynxUI, com.lynx.tasm.a.b bVar) {
        MethodCollector.i(12445);
        this.f55804c.put(lynxUI, bVar);
        lynxUI.setResumeAnim(bVar);
        MethodCollector.o(12445);
    }

    public final synchronized void d(LynxUI lynxUI, com.lynx.tasm.a.b bVar) {
        MethodCollector.i(12447);
        this.f55805d.put(lynxUI, bVar);
        lynxUI.setPauseAnim(bVar);
        MethodCollector.o(12447);
    }

    public static <T> void a(Map<LynxUI, T> map, LynxView lynxView) {
        Iterator<Map.Entry<LynxUI, T>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().mContext.f55901i.f56067a == lynxView) {
                it.remove();
            }
        }
    }

    public final synchronized View a(String str, LynxUI lynxUI) {
        View view;
        MethodCollector.i(12017);
        WeakReference<View> weakReference = this.f55808g.get(str);
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null) {
            for (Map.Entry<LynxUI, String> entry : this.f55806e.entrySet()) {
                LynxUI key = entry.getKey();
                if (lynxUI != key && entry.getValue().equals(str)) {
                    T t = key.mView;
                    MethodCollector.o(12017);
                    return t;
                }
            }
        }
        MethodCollector.o(12017);
        return view;
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(LynxUI lynxUI, String str) {
        MethodCollector.i(11862);
        this.f55806e.put(lynxUI, str);
        MethodCollector.o(11862);
    }
}

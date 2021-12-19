package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.c;
import com.lynx.tasm.c.b;
import com.lynx.tasm.c.d;
import com.lynx.tasm.core.JSProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class l implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<k> f55928a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<j> f55929b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<JSProxy> f55930c;

    static {
        Covode.recordClassIndex(34948);
    }

    public final j a() {
        return this.f55929b.get();
    }

    public final void b() {
        Iterator<k> it = this.f55928a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final k a(int i2) {
        Iterator<k> it = this.f55928a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.f55906a == i2) {
                return next;
            }
        }
        return null;
    }

    public final void a(k kVar) {
        if (!this.f55928a.contains(kVar)) {
            this.f55928a.add(kVar);
        }
    }

    public final void a(LynxBaseUI lynxBaseUI) {
        Iterator<k> it = this.f55928a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.f55908c == lynxBaseUI) {
                this.f55928a.remove(next);
                return;
            }
        }
    }

    public l(j jVar, JSProxy jSProxy) {
        this.f55929b = new WeakReference<>(jVar);
        this.f55930c = new WeakReference<>(jSProxy);
    }

    public final void a(int i2, JavaOnlyMap javaOnlyMap) {
        this.f55929b.get().f55897e.b(new b(i2, "intersection", javaOnlyMap));
    }

    @Override // com.lynx.tasm.c.b
    public final void a(c.EnumC1267c cVar, d dVar) {
        if (this.f55928a.size() != 0) {
            if (cVar != c.EnumC1267c.kLynxEventTypeLayoutEvent) {
                if (cVar == c.EnumC1267c.kLynxEventTypeCustomEvent) {
                    String str = dVar.f56492e;
                    if (!str.equals("scroll") && !str.equals("scrolltoupper") && !str.equals("scrolltolower")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            b();
        }
    }

    public final void a(int i2, int i3, JavaOnlyMap javaOnlyMap) {
        JSProxy jSProxy = this.f55930c.get();
        if (jSProxy != null) {
            jSProxy.a(i2, i3, javaOnlyMap);
        }
    }
}

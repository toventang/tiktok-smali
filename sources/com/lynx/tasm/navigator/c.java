package com.lynx.tasm.navigator;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static c f56794a = new c();

    /* renamed from: b  reason: collision with root package name */
    f f56795b;

    /* renamed from: c  reason: collision with root package name */
    private Stack<a> f56796c = new Stack<>();

    /* renamed from: d  reason: collision with root package name */
    private Map<b, a> f56797d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private int f56798e = Integer.MAX_VALUE;

    public static c a() {
        return f56794a;
    }

    static {
        Covode.recordClassIndex(35368);
    }

    private c() {
    }

    public final a c() {
        Stack<a> stack = this.f56796c;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return this.f56796c.peek();
    }

    public final boolean b() {
        a c2 = c();
        if (c2 == null || c2.f56776a.isEmpty()) {
            return false;
        }
        c2.a((LynxView) c2.f56779d.remove(c2.f56776a.pop()));
        return true;
    }

    public final void a(b bVar) {
        a remove = this.f56797d.remove(bVar);
        if (remove != null) {
            Iterator<d> it = remove.f56776a.iterator();
            while (it.hasNext()) {
                remove.f56779d.remove(it.next());
            }
            remove.f56776a.clear();
            if (remove.f56778c != null) {
                remove.f56778c.clear();
            }
            Iterator<a> it2 = this.f56796c.iterator();
            while (it2.hasNext()) {
                if (it2.next() == remove) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    public final void a(b bVar, LynxView lynxView) {
        a aVar = new a(bVar, this.f56798e);
        if (lynxView != null) {
            aVar.f56777b = new WeakReference<>(lynxView);
        }
        this.f56796c.push(aVar);
        this.f56797d.put(bVar, aVar);
    }
}

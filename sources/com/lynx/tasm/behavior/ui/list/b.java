package com.lynx.tasm.behavior.ui.list;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.c;
import com.lynx.tasm.c.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    final c f56180a;

    /* renamed from: b  reason: collision with root package name */
    RunnableC1261b f56181b;

    /* renamed from: c  reason: collision with root package name */
    LinkedList<a> f56182c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    LinkedList<a> f56183d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f56184e;

    static {
        Covode.recordClassIndex(35114);
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        h f56185a;

        /* renamed from: b  reason: collision with root package name */
        String f56186b;

        /* renamed from: c  reason: collision with root package name */
        int f56187c;

        /* renamed from: d  reason: collision with root package name */
        String f56188d;

        static {
            Covode.recordClassIndex(35115);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f56185a.f56243a.f56245b == null || this.f56186b == null) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "{type='" + this.f56186b + "', position=" + this.f56187c + ", key='" + this.f56188d + "'}";
        }

        public a(h hVar, String str) {
            this.f56185a = hVar;
            this.f56186b = str;
            this.f56187c = hVar.getLayoutPosition();
            if (hVar.f56243a.f56245b != null) {
                this.f56188d = hVar.f56243a.f56245b.f56439a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f56181b == null) {
            RunnableC1261b bVar = new RunnableC1261b(this);
            this.f56181b = bVar;
            this.f56184e.postDelayed(bVar, 50);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.b$b  reason: collision with other inner class name */
    public static class RunnableC1261b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<b> f56189a;

        static {
            Covode.recordClassIndex(35116);
        }

        public final void run() {
            UIComponent uIComponent;
            UIComponent uIComponent2;
            b bVar = this.f56189a.get();
            if (bVar != null) {
                bVar.f56181b = null;
                if (UIList.f56161h) {
                    LLog.b("UIList", "Courier flush pending " + bVar.f56183d.size() + " " + Arrays.toString(bVar.f56183d.toArray()) + " flushing " + bVar.f56182c.size() + " " + Arrays.toString(bVar.f56182c.toArray()));
                }
                while (bVar.f56182c.size() > 0) {
                    a removeFirst = bVar.f56182c.removeFirst();
                    if (removeFirst.a()) {
                        Iterator<a> it = bVar.f56182c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                a next = it.next();
                                if (b.a(removeFirst, next)) {
                                    bVar.f56182c.remove(next);
                                    break;
                                }
                            } else {
                                Iterator<a> it2 = bVar.f56183d.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        a next2 = it2.next();
                                        if (b.a(removeFirst, next2)) {
                                            bVar.f56183d.remove(next2);
                                            break;
                                        }
                                    } else if (removeFirst.a() && (uIComponent = removeFirst.f56185a.f56243a.f56245b) != null && uIComponent.getEvents() != null && uIComponent.getEvents().containsKey(removeFirst.f56186b) && (uIComponent2 = removeFirst.f56185a.f56243a.f56245b) != null) {
                                        if (UIList.f56161h) {
                                            LLog.b("UIList", "sendNodeEvent " + removeFirst.f56186b + "  " + removeFirst.f56187c + " " + removeFirst.f56188d);
                                        }
                                        g a2 = g.a(uIComponent2.getSign(), removeFirst.f56186b);
                                        a2.a("position", Integer.valueOf(removeFirst.f56187c));
                                        a2.a("key", removeFirst.f56188d);
                                        bVar.f56180a.a(a2);
                                    }
                                }
                            }
                        }
                    }
                }
                bVar.f56182c = bVar.f56183d;
                bVar.f56183d = new LinkedList<>();
                if (bVar.f56182c.size() > 0) {
                    bVar.b();
                }
            }
        }

        public RunnableC1261b(b bVar) {
            this.f56189a = new WeakReference<>(bVar);
        }
    }

    public b(c cVar) {
        this.f56180a = cVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f56184e = handler;
        RunnableC1261b bVar = new RunnableC1261b(this);
        this.f56181b = bVar;
        handler.postDelayed(bVar, 500);
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void a(h hVar) {
        if (UIList.f56161h) {
            LLog.b("UIList", "onNodeAppear " + hVar.getLayoutPosition());
        }
        this.f56183d.push(new a(hVar, "nodeappear"));
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void b(h hVar) {
        if (UIList.f56161h) {
            LLog.b("UIList", "onNodeDisappear " + hVar.getLayoutPosition());
        }
        this.f56183d.push(new a(hVar, "nodedisappear"));
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void c(h hVar) {
        Iterator<a> it = this.f56182c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f56185a == hVar) {
                next.f56188d = hVar.f56243a.f56245b.f56439a;
            }
        }
        Iterator<a> it2 = this.f56183d.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.f56185a == hVar) {
                next2.f56188d = hVar.f56243a.f56245b.f56439a;
            }
        }
    }

    static boolean a(a aVar, a aVar2) {
        if (aVar.f56188d != null || aVar2.f56188d != null) {
            return TextUtils.equals(aVar.f56188d, aVar2.f56188d);
        }
        if (aVar.f56187c == aVar2.f56187c) {
            return true;
        }
        return false;
    }
}

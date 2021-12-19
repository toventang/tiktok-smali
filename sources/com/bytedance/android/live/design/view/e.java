package com.bytedance.android.live.design.view;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final Queue<b> f9428a;

    /* renamed from: b  reason: collision with root package name */
    final Map<View, a> f9429b;

    /* renamed from: c  reason: collision with root package name */
    private b f9430c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9431d;

    static {
        Covode.recordClassIndex(4809);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        long f9435a;

        /* renamed from: b  reason: collision with root package name */
        b f9436b;

        /* renamed from: c  reason: collision with root package name */
        View.OnLayoutChangeListener f9437c;

        /* renamed from: d  reason: collision with root package name */
        h f9438d;

        /* renamed from: e  reason: collision with root package name */
        d f9439e;

        static {
            Covode.recordClassIndex(4812);
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        List<b> f9433a;

        /* renamed from: b  reason: collision with root package name */
        View.OnAttachStateChangeListener f9434b;

        static {
            Covode.recordClassIndex(4811);
        }

        private a() {
            this.f9433a = new LinkedList();
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f9440a = new e((byte) 0);

        static {
            Covode.recordClassIndex(4813);
        }
    }

    private e() {
        this.f9428a = new LinkedList();
        this.f9429b = new HashMap();
        this.f9431d = true;
    }

    private void a() {
        b poll;
        if (this.f9431d && this.f9430c == null && (poll = this.f9428a.poll()) != null) {
            a(poll);
            this.f9430c = poll;
            j.a(poll);
        }
    }

    /* synthetic */ e(byte b2) {
        this();
    }

    private void a(b bVar) {
        this.f9428a.remove(bVar);
        a aVar = this.f9429b.get(bVar.f9438d.f9457b);
        if (aVar != null && !aVar.f9433a.isEmpty()) {
            aVar.f9433a.remove(bVar);
            if (aVar.f9433a.isEmpty()) {
                bVar.f9438d.f9457b.removeOnAttachStateChangeListener(aVar.f9434b);
                this.f9429b.remove(bVar.f9438d.f9457b);
            }
        }
    }

    public final long a(h hVar) {
        b bVar = new b();
        bVar.f9435a = SystemClock.uptimeMillis();
        bVar.f9438d = hVar;
        bVar.f9436b = new f(this, hVar);
        a aVar = this.f9429b.get(bVar.f9438d.f9457b);
        if (aVar == null) {
            aVar = new a((byte) 0);
            this.f9429b.put(bVar.f9438d.f9457b, aVar);
            aVar.f9434b = new View.OnAttachStateChangeListener() {
                /* class com.bytedance.android.live.design.view.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4810);
                }

                public final void onViewAttachedToWindow(View view) {
                }

                public final void onViewDetachedFromWindow(View view) {
                    e eVar = e.this;
                    a aVar = eVar.f9429b.get(view);
                    if (aVar != null && !aVar.f9433a.isEmpty()) {
                        for (b bVar : aVar.f9433a) {
                            eVar.f9428a.remove(bVar);
                        }
                    }
                    eVar.f9429b.remove(view);
                }
            };
            bVar.f9438d.f9457b.addOnAttachStateChangeListener(aVar.f9434b);
        }
        aVar.f9433a.add(bVar);
        this.f9428a.offer(bVar);
        a();
        return bVar.f9435a;
    }

    public final void a(boolean z) {
        this.f9431d = z;
        if (z) {
            a();
            return;
        }
        b bVar = this.f9430c;
        if (bVar != null) {
            a(bVar.f9435a, 5);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(h hVar, int i2) {
        if (hVar.f9466k != null) {
            hVar.f9466k.a(i2);
        }
        this.f9430c = null;
        a();
    }

    public final void a(long j2, int i2) {
        b next;
        b bVar = this.f9430c;
        if (bVar == null || bVar.f9435a != j2) {
            Iterator<b> it = this.f9428a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.f9435a == j2) {
                    a(next);
                }
            }
            return;
        }
        next = this.f9430c;
        this.f9430c = null;
        if (next == null) {
            return;
        }
        if (next.f9439e != null) {
            next.f9439e.f9427a = i2;
            next.f9439e.dismiss();
        } else if (next.f9437c != null) {
            next.f9438d.f9457b.removeOnLayoutChangeListener(next.f9437c);
            a();
        }
    }
}

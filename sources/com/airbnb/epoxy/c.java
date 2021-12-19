package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final Executor f5012a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0071c f5013b;

    /* renamed from: c  reason: collision with root package name */
    final j.e<s<?>> f5014c;

    /* renamed from: d  reason: collision with root package name */
    final b f5015d = new b((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    volatile List<? extends s<?>> f5016e;

    /* renamed from: f  reason: collision with root package name */
    public volatile List<? extends s<?>> f5017f = Collections.emptyList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.c$c  reason: collision with other inner class name */
    public interface AbstractC0071c {
        static {
            Covode.recordClassIndex(2121);
        }

        void a(k kVar);
    }

    static {
        Covode.recordClassIndex(2116);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private volatile int f5030a;

        /* renamed from: b  reason: collision with root package name */
        private volatile int f5031b;

        static {
            Covode.recordClassIndex(2120);
        }

        private b() {
        }

        /* access modifiers changed from: package-private */
        public final synchronized int a() {
            int i2;
            MethodCollector.i(4721);
            i2 = this.f5030a + 1;
            this.f5030a = i2;
            MethodCollector.o(4721);
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean b() {
            boolean c2;
            MethodCollector.i(4722);
            c2 = c();
            this.f5031b = this.f5030a;
            MethodCollector.o(4722);
            return c2;
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean c() {
            MethodCollector.i(4830);
            if (this.f5030a > this.f5031b) {
                MethodCollector.o(4830);
                return true;
            }
            MethodCollector.o(4830);
            return false;
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean a(int i2) {
            boolean z;
            MethodCollector.i(4840);
            if (this.f5030a != i2 || i2 <= this.f5031b) {
                z = false;
            } else {
                z = true;
                this.f5031b = i2;
            }
            MethodCollector.o(4840);
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends j.a {

        /* renamed from: a  reason: collision with root package name */
        final List<? extends s<?>> f5027a;

        /* renamed from: b  reason: collision with root package name */
        final List<? extends s<?>> f5028b;

        /* renamed from: c  reason: collision with root package name */
        private final j.e<s<?>> f5029c;

        static {
            Covode.recordClassIndex(2119);
        }

        @Override // androidx.recyclerview.widget.j.a
        public final int a() {
            return this.f5027a.size();
        }

        @Override // androidx.recyclerview.widget.j.a
        public final int b() {
            return this.f5028b.size();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.j.a
        public final Object a(int i2, int i3) {
            return this.f5029c.c(this.f5027a.get(i2), this.f5028b.get(i3));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.j.a
        public final boolean b(int i2, int i3) {
            return this.f5029c.a(this.f5027a.get(i2), this.f5028b.get(i3));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.j.a
        public final boolean c(int i2, int i3) {
            return this.f5029c.b(this.f5027a.get(i2), this.f5028b.get(i3));
        }

        a(List<? extends s<?>> list, List<? extends s<?>> list2, j.e<s<?>> eVar) {
            this.f5027a = list;
            this.f5028b = list2;
            this.f5029c = eVar;
        }
    }

    public final synchronized boolean a(List<s<?>> list) {
        boolean b2;
        MethodCollector.i(6150);
        b2 = this.f5015d.b();
        a(list, this.f5015d.a());
        MethodCollector.o(6150);
        return b2;
    }

    public final synchronized boolean a(List<? extends s<?>> list, int i2) {
        MethodCollector.i(6156);
        if (this.f5015d.a(i2)) {
            this.f5016e = list;
            if (list == null) {
                this.f5017f = Collections.emptyList();
            } else {
                this.f5017f = Collections.unmodifiableList(list);
            }
            MethodCollector.o(6156);
            return true;
        }
        MethodCollector.o(6156);
        return false;
    }

    public final void a(final int i2, final List<? extends s<?>> list, final k kVar) {
        ab.f4995c.execute(new Runnable() {
            /* class com.airbnb.epoxy.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2118);
            }

            public final void run() {
                boolean a2 = c.this.a(list, i2);
                if (kVar != null && a2) {
                    c.this.f5013b.a(kVar);
                }
            }
        });
    }

    c(Handler handler, AbstractC0071c cVar, j.e<s<?>> eVar) {
        this.f5012a = new w(handler);
        this.f5013b = cVar;
        this.f5014c = eVar;
    }
}

package com.ss.android.ugc.aweme.notification.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f113865a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f113866b;

    /* renamed from: c  reason: collision with root package name */
    private C2917a f113867c;

    /* renamed from: d  reason: collision with root package name */
    private final b f113868d;

    static {
        Covode.recordClassIndex(73220);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.a$a  reason: collision with other inner class name */
    public final class C2917a {
        static {
            Covode.recordClassIndex(73221);
        }

        public final void a() {
            a.this.f113865a.b(a.this.f113866b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C2917a() {
        }

        public final C2917a a(int i2, int i3) {
            a.this.f113865a.a(i2, 3, i3, 3);
            return this;
        }

        public final C2917a b(int i2, int i3) {
            a.this.f113865a.a(i2, 4, i3, 4);
            return this;
        }
    }

    public final C2917a a() {
        MethodCollector.i(508);
        synchronized (C2917a.class) {
            try {
                if (this.f113867c == null) {
                    this.f113867c = new C2917a();
                }
            } catch (Throwable th) {
                MethodCollector.o(508);
                throw th;
            }
        }
        this.f113865a.a(this.f113866b);
        C2917a aVar = this.f113867c;
        MethodCollector.o(508);
        return aVar;
    }

    public a(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        this.f113866b = constraintLayout;
        b bVar = new b();
        this.f113868d = bVar;
        bVar.a(constraintLayout);
    }
}

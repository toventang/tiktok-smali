package com.ss.android.ugc.aweme.comment.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final b f72861a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f72862b;

    /* renamed from: c  reason: collision with root package name */
    private a f72863c;

    /* renamed from: d  reason: collision with root package name */
    private final b f72864d;

    static {
        Covode.recordClassIndex(44882);
    }

    public final a a() {
        MethodCollector.i(303);
        synchronized (a.class) {
            try {
                if (this.f72863c == null) {
                    this.f72863c = new a();
                }
            } catch (Throwable th) {
                MethodCollector.o(303);
                throw th;
            }
        }
        this.f72861a.a(this.f72862b);
        a aVar = this.f72863c;
        MethodCollector.o(303);
        return aVar;
    }

    public final class a {
        static {
            Covode.recordClassIndex(44883);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        public final a a(int i2, int i3) {
            o.this.f72861a.a(i2, 3, i3, 4);
            return this;
        }
    }

    public o(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        this.f72862b = constraintLayout;
        b bVar = new b();
        this.f72864d = bVar;
        bVar.a(constraintLayout);
    }
}

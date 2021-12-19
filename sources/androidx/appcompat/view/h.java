package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.h.aa;
import androidx.core.h.ab;
import androidx.core.h.z;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<z> f1106a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    aa f1107b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1108c;

    /* renamed from: d  reason: collision with root package name */
    private long f1109d = -1;

    /* renamed from: e  reason: collision with root package name */
    private Interpolator f1110e;

    /* renamed from: f  reason: collision with root package name */
    private final ab f1111f = new ab() {
        /* class androidx.appcompat.view.h.AnonymousClass1 */

        /* renamed from: b  reason: collision with root package name */
        private boolean f1113b;

        /* renamed from: c  reason: collision with root package name */
        private int f1114c;

        static {
            Covode.recordClassIndex(319);
        }

        @Override // androidx.core.h.aa, androidx.core.h.ab
        public final void a(View view) {
            if (!this.f1113b) {
                this.f1113b = true;
                if (h.this.f1107b != null) {
                    h.this.f1107b.a(null);
                }
            }
        }

        @Override // androidx.core.h.aa, androidx.core.h.ab
        public final void b(View view) {
            int i2 = this.f1114c + 1;
            this.f1114c = i2;
            if (i2 == h.this.f1106a.size()) {
                if (h.this.f1107b != null) {
                    h.this.f1107b.b(null);
                }
                this.f1114c = 0;
                this.f1113b = false;
                h.this.f1108c = false;
            }
        }
    };

    static {
        Covode.recordClassIndex(318);
    }

    public final h c() {
        if (!this.f1108c) {
            this.f1109d = 250;
        }
        return this;
    }

    public final void b() {
        if (this.f1108c) {
            Iterator<z> it = this.f1106a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f1108c = false;
        }
    }

    public final void a() {
        if (!this.f1108c) {
            Iterator<z> it = this.f1106a.iterator();
            while (it.hasNext()) {
                z next = it.next();
                long j2 = this.f1109d;
                if (j2 >= 0) {
                    next.a(j2);
                }
                Interpolator interpolator = this.f1110e;
                if (interpolator != null) {
                    next.a(interpolator);
                }
                if (this.f1107b != null) {
                    next.a(this.f1111f);
                }
                next.c();
            }
            this.f1108c = true;
        }
    }

    public final h a(Interpolator interpolator) {
        if (!this.f1108c) {
            this.f1110e = interpolator;
        }
        return this;
    }

    public final h a(aa aaVar) {
        if (!this.f1108c) {
            this.f1107b = aaVar;
        }
        return this;
    }

    public final h a(z zVar) {
        if (!this.f1108c) {
            this.f1106a.add(zVar);
        }
        return this;
    }

    public final h a(z zVar, z zVar2) {
        this.f1106a.add(zVar);
        zVar2.b(zVar.a());
        this.f1106a.add(zVar2);
        return this;
    }
}

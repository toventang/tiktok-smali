package androidx.h;

import androidx.h.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final u f3062a;

    /* renamed from: b  reason: collision with root package name */
    final c<T> f3063b;

    /* renamed from: c  reason: collision with root package name */
    Executor f3064c = androidx.a.a.a.a.f784b;

    /* renamed from: d  reason: collision with root package name */
    AbstractC0045a<T> f3065d;

    /* renamed from: e  reason: collision with root package name */
    boolean f3066e;

    /* renamed from: f  reason: collision with root package name */
    i<T> f3067f;

    /* renamed from: g  reason: collision with root package name */
    i<T> f3068g;

    /* renamed from: h  reason: collision with root package name */
    int f3069h;

    /* renamed from: i  reason: collision with root package name */
    i.c f3070i = new i.c() {
        /* class androidx.h.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1092);
        }

        @Override // androidx.h.i.c
        public final void a(int i2, int i3) {
            a.this.f3062a.a(i2, i3);
        }

        @Override // androidx.h.i.c
        public final void b(int i2, int i3) {
            a.this.f3062a.a(i2, i3, null);
        }
    };

    /* renamed from: androidx.h.a$a  reason: collision with other inner class name */
    interface AbstractC0045a<T> {
        static {
            Covode.recordClassIndex(1095);
        }
    }

    static {
        Covode.recordClassIndex(1091);
    }

    public final int a() {
        i<T> iVar = this.f3067f;
        if (iVar != null) {
            return iVar.size();
        }
        i<T> iVar2 = this.f3068g;
        if (iVar2 == null) {
            return 0;
        }
        return iVar2.size();
    }

    public a(RecyclerView.a aVar, j.e<T> eVar) {
        this.f3062a = new b(aVar);
        this.f3063b = new c.a(eVar).a();
    }
}

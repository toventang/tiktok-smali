package androidx.recyclerview.widget;

import androidx.core.g.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ad;
import androidx.recyclerview.widget.ag;
import com.bytedance.covode.number.Covode;

final class v {

    /* renamed from: a  reason: collision with root package name */
    final ag.c f4210a;

    /* renamed from: b  reason: collision with root package name */
    final ad.d f4211b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.a<RecyclerView.ViewHolder> f4212c;

    /* renamed from: d  reason: collision with root package name */
    final a f4213d;

    /* renamed from: e  reason: collision with root package name */
    public int f4214e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.c f4215f = new RecyclerView.c() {
        /* class androidx.recyclerview.widget.v.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1625);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b() {
            v.this.f4213d.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            v vVar = v.this;
            vVar.f4214e = vVar.f4212c.getItemCount();
            v.this.f4213d.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            v.this.f4213d.a(v.this, i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            v.this.f4214e += i3;
            v.this.f4213d.a(v.this, i2, i3);
            if (v.this.f4214e > 0 && v.this.f4212c.mStateRestorationPolicy == RecyclerView.a.EnumC0056a.PREVENT_WHEN_EMPTY) {
                v.this.f4213d.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            v.this.f4214e -= i3;
            v.this.f4213d.b(v.this, i2, i3);
            if (v.this.f4214e <= 0 && v.this.f4212c.mStateRestorationPolicy == RecyclerView.a.EnumC0056a.PREVENT_WHEN_EMPTY) {
                v.this.f4213d.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            boolean z = true;
            if (i4 != 1) {
                z = false;
            }
            g.a(z, (Object) "moving more than 1 item is not supported in RecyclerView");
            v.this.f4213d.c(v.this, i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            v.this.f4213d.a(v.this, i2, i3, obj);
        }
    };

    interface a {
        static {
            Covode.recordClassIndex(1626);
        }

        void a();

        void a(v vVar, int i2, int i3);

        void a(v vVar, int i2, int i3, Object obj);

        void b();

        void b(v vVar, int i2, int i3);

        void c(v vVar, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(1624);
    }

    v(RecyclerView.a<RecyclerView.ViewHolder> aVar, a aVar2, ag agVar, ad.d dVar) {
        this.f4212c = aVar;
        this.f4213d = aVar2;
        this.f4210a = agVar.a(this);
        this.f4211b = dVar;
        this.f4214e = aVar.getItemCount();
        aVar.registerAdapterDataObserver(this.f4215f);
    }
}

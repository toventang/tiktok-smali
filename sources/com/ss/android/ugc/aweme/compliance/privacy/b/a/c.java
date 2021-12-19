package com.ss.android.ugc.aweme.compliance.privacy.b.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.d;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.e;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final e.c f77347a;

    /* renamed from: b  reason: collision with root package name */
    final d.AbstractC1784d f77348b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.a<RecyclerView.ViewHolder> f77349c;

    /* renamed from: d  reason: collision with root package name */
    final a f77350d;

    /* renamed from: e  reason: collision with root package name */
    public int f77351e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.c f77352f = new RecyclerView.c() {
        /* class com.ss.android.ugc.aweme.compliance.privacy.b.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(47838);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            c cVar = c.this;
            cVar.f77351e = cVar.f77349c.getItemCount();
            c.this.f77350d.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            c.this.f77350d.a(c.this, i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            c.this.f77351e += i3;
            c.this.f77350d.a(c.this, i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            c.this.f77351e -= i3;
            c.this.f77350d.b(c.this, i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            if (i4 == 1) {
                c.this.f77350d.c(c.this, i2, i3);
                return;
            }
            throw new IllegalArgumentException("moving more than 1 item is not supported in RecyclerView");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            c.this.f77350d.a(c.this, i2, i3, obj);
        }
    };

    interface a {
        static {
            Covode.recordClassIndex(47839);
        }

        void a();

        void a(c cVar, int i2, int i3);

        void a(c cVar, int i2, int i3, Object obj);

        void b(c cVar, int i2, int i3);

        void c(c cVar, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(47837);
    }

    c(RecyclerView.a<RecyclerView.ViewHolder> aVar, a aVar2, e eVar, d.AbstractC1784d dVar) {
        this.f77349c = aVar;
        this.f77350d = aVar2;
        this.f77347a = eVar.a(this);
        this.f77348b = dVar;
        this.f77351e = aVar.getItemCount();
        aVar.registerAdapterDataObserver(this.f77352f);
    }
}

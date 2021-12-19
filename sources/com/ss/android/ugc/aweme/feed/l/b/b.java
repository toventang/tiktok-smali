package com.ss.android.ugc.aweme.feed.l.b;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.l.b.c;
import h.f.b.l;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final C2269b f93576e = new C2269b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f93577a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f93578b;

    /* renamed from: c  reason: collision with root package name */
    public c f93579c;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<c> f93580d;

    public interface c {
        static {
            Covode.recordClassIndex(59275);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(59272);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.b$b  reason: collision with other inner class name */
    public static final class C2269b {
        static {
            Covode.recordClassIndex(59274);
        }

        private C2269b() {
        }

        public /* synthetic */ C2269b(byte b2) {
            this();
        }
    }

    public static final class d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f93583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f93584b;

        static {
            Covode.recordClassIndex(59276);
        }

        @Override // com.ss.android.ugc.aweme.feed.l.b.c.a
        public final void a() {
            this.f93583a.a(this.f93584b);
        }

        d(b bVar, int i2) {
            this.f93583a = bVar;
            this.f93584b = i2;
        }
    }

    public static final class e implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f93585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f93586b;

        static {
            Covode.recordClassIndex(59277);
        }

        @Override // com.ss.android.ugc.aweme.feed.l.b.c.a
        public final void a() {
            if (!this.f93585a.f93578b) {
                this.f93585a.a(this.f93586b);
            }
        }

        public e(b bVar, int i2) {
            this.f93585a = bVar;
            this.f93586b = i2;
        }
    }

    public final void a() {
        b();
        this.f93580d.clear();
        this.f93577a = null;
        this.f93578b = true;
        this.f93579c = null;
    }

    public final void b() {
        int size = this.f93580d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f93580d.valueAt(i2).f93587a = null;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<c> f93581a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public c f93582b;

        static {
            Covode.recordClassIndex(59273);
        }

        public final a a(c cVar) {
            l.d(cVar, "");
            this.f93581a.append(cVar.f93588b, cVar);
            return this;
        }
    }

    public b(SparseArray<c> sparseArray) {
        l.d(sparseArray, "");
        this.f93580d = sparseArray;
    }

    public final void a(int i2) {
        c valueAt;
        int i3 = i2 + 1;
        if (i3 >= this.f93580d.size() || (valueAt = this.f93580d.valueAt(i3)) == null) {
            c cVar = this.f93579c;
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        this.f93577a = valueAt;
        valueAt.a(new d(this, i3));
        c cVar2 = this.f93579c;
    }
}

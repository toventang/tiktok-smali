package androidx.recyclerview.widget;

import androidx.c.d;
import androidx.c.g;
import androidx.core.g.f;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class af {

    /* renamed from: a  reason: collision with root package name */
    final g<RecyclerView.ViewHolder, a> f3974a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final d<RecyclerView.ViewHolder> f3975b = new d<>();

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(1546);
        }

        void a(RecyclerView.ViewHolder viewHolder);

        void a(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar, RecyclerView.f.c cVar2);

        void b(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar, RecyclerView.f.c cVar2);

        void c(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar, RecyclerView.f.c cVar2);
    }

    static {
        Covode.recordClassIndex(1544);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static f.a<a> f3976d = new f.b(20);

        /* renamed from: a  reason: collision with root package name */
        int f3977a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.f.c f3978b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.f.c f3979c;

        private a() {
        }

        static {
            Covode.recordClassIndex(1545);
        }

        static a a() {
            a acquire = f3976d.acquire();
            if (acquire == null) {
                return new a();
            }
            return acquire;
        }

        static void a(a aVar) {
            aVar.f3977a = 0;
            aVar.f3978b = null;
            aVar.f3979c = null;
            f3976d.release(aVar);
        }
    }

    af() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f3974a.clear();
        this.f3975b.c();
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(long j2) {
        return this.f3975b.a(j2, null);
    }

    /* access modifiers changed from: package-private */
    public final void c(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f3974a.put(viewHolder, aVar);
        }
        aVar.f3977a |= 1;
    }

    /* access modifiers changed from: package-private */
    public final void d(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar != null) {
            aVar.f3977a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar == null || (aVar.f3977a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void e(RecyclerView.ViewHolder viewHolder) {
        int b2 = this.f3975b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (viewHolder == this.f3975b.c(b2)) {
                this.f3975b.a(b2);
                break;
            } else {
                b2--;
            }
        }
        a remove = this.f3974a.remove(viewHolder);
        if (remove != null) {
            a.a(remove);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        for (int size = this.f3974a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder b2 = this.f3974a.b(size);
            a d2 = this.f3974a.d(size);
            if ((d2.f3977a & 3) == 3) {
                bVar.a(b2);
            } else if ((d2.f3977a & 1) != 0) {
                if (d2.f3978b == null) {
                    bVar.a(b2);
                } else {
                    bVar.a(b2, d2.f3978b, d2.f3979c);
                }
            } else if ((d2.f3977a & 14) == 14) {
                bVar.b(b2, d2.f3978b, d2.f3979c);
            } else if ((d2.f3977a & 12) == 12) {
                bVar.c(b2, d2.f3978b, d2.f3979c);
            } else if ((d2.f3977a & 4) != 0) {
                bVar.a(b2, d2.f3978b, null);
            } else if ((d2.f3977a & 8) != 0) {
                bVar.b(b2, d2.f3978b, d2.f3979c);
            }
            a.a(d2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar == null || (aVar.f3977a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, RecyclerView.ViewHolder viewHolder) {
        this.f3975b.b(j2, viewHolder);
    }

    /* access modifiers changed from: package-private */
    public final void b(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f3974a.put(viewHolder, aVar);
        }
        aVar.f3977a |= 2;
        aVar.f3978b = cVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f3974a.put(viewHolder, aVar);
        }
        aVar.f3978b = cVar;
        aVar.f3977a |= 4;
    }

    /* access modifiers changed from: package-private */
    public final void c(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar) {
        a aVar = this.f3974a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.f3974a.put(viewHolder, aVar);
        }
        aVar.f3979c = cVar;
        aVar.f3977a |= 8;
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.f.c a(RecyclerView.ViewHolder viewHolder, int i2) {
        a c2;
        RecyclerView.f.c cVar;
        int a2 = this.f3974a.a(viewHolder);
        if (a2 < 0 || (c2 = this.f3974a.c(a2)) == null || (c2.f3977a & i2) == 0) {
            return null;
        }
        c2.f3977a &= i2 ^ -1;
        if (i2 == 4) {
            cVar = c2.f3978b;
        } else if (i2 == 8) {
            cVar = c2.f3979c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((c2.f3977a & 12) == 0) {
            this.f3974a.d(a2);
            a.a(c2);
        }
        return cVar;
    }
}

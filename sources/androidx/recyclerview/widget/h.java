package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ad;
import androidx.recyclerview.widget.ag;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.v;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

final class h implements v.a {

    /* renamed from: a  reason: collision with root package name */
    final ag f4032a;

    /* renamed from: b  reason: collision with root package name */
    List<WeakReference<RecyclerView>> f4033b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final IdentityHashMap<RecyclerView.ViewHolder, v> f4034c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    List<v> f4035d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final g f4036e;

    /* renamed from: f  reason: collision with root package name */
    private a f4037f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final g.a.b f4038g;

    /* renamed from: h  reason: collision with root package name */
    private final ad f4039h;

    static {
        Covode.recordClassIndex(1570);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        v f4040a;

        /* renamed from: b  reason: collision with root package name */
        int f4041b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4042c;

        static {
            Covode.recordClassIndex(1571);
        }

        a() {
        }
    }

    @Override // androidx.recyclerview.widget.v.a
    public final void b() {
        d();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        return a(this.f4035d.size(), aVar);
    }

    private void d() {
        RecyclerView.a.EnumC0056a e2 = e();
        if (e2 != this.f4036e.mStateRestorationPolicy) {
            this.f4036e.a(e2);
        }
    }

    @Override // androidx.recyclerview.widget.v.a
    public final void a() {
        this.f4036e.notifyDataSetChanged();
        d();
    }

    public final boolean c() {
        if (this.f4038g != g.a.b.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    private RecyclerView.a.EnumC0056a e() {
        for (v vVar : this.f4035d) {
            RecyclerView.a.EnumC0056a aVar = vVar.f4212c.mStateRestorationPolicy;
            if (aVar == RecyclerView.a.EnumC0056a.PREVENT) {
                return RecyclerView.a.EnumC0056a.PREVENT;
            }
            if (aVar == RecyclerView.a.EnumC0056a.PREVENT_WHEN_EMPTY && vVar.f4214e == 0) {
                return RecyclerView.a.EnumC0056a.PREVENT;
            }
        }
        return RecyclerView.a.EnumC0056a.ALLOW;
    }

    /* access modifiers changed from: package-private */
    public final int a(v vVar) {
        v next;
        Iterator<v> it = this.f4035d.iterator();
        int i2 = 0;
        while (it.hasNext() && (next = it.next()) != vVar) {
            i2 += next.f4214e;
        }
        return i2;
    }

    private v b(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        int size = this.f4035d.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f4035d.get(i2).f4212c == aVar) {
                if (i2 == -1) {
                    return null;
                } else {
                    return this.f4035d.get(i2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final v a(RecyclerView.ViewHolder viewHolder) {
        v vVar = this.f4034c.get(viewHolder);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    /* access modifiers changed from: package-private */
    public final a a(int i2) {
        a aVar;
        if (this.f4037f.f4042c) {
            aVar = new a();
        } else {
            this.f4037f.f4042c = true;
            aVar = this.f4037f;
        }
        Iterator<v> it = this.f4035d.iterator();
        int i3 = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v next = it.next();
            if (next.f4214e > i3) {
                aVar.f4040a = next;
                aVar.f4041b = i3;
                break;
            }
            i3 -= next.f4214e;
        }
        if (aVar.f4040a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for ".concat(String.valueOf(i2)));
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        aVar.f4042c = false;
        aVar.f4040a = null;
        aVar.f4041b = -1;
        this.f4037f = aVar;
    }

    h(g gVar, g.a aVar) {
        this.f4036e = gVar;
        if (aVar.f4027a) {
            this.f4032a = new ag.a();
        } else {
            this.f4032a = new ag.b();
        }
        this.f4038g = aVar.f4028b;
        if (aVar.f4028b == g.a.b.NO_STABLE_IDS) {
            this.f4039h = new ad.b();
        } else if (aVar.f4028b == g.a.b.ISOLATED_STABLE_IDS) {
            this.f4039h = new ad.a();
        } else if (aVar.f4028b == g.a.b.SHARED_STABLE_IDS) {
            this.f4039h = new ad.c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    private boolean a(int i2, RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        if (i2 < 0 || i2 > this.f4035d.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f4035d.size() + ". Given:" + i2);
        }
        if (c()) {
            androidx.core.g.g.a(aVar.mHasStableIds, (Object) "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        if (b(aVar) != null) {
            return false;
        }
        v vVar = new v(aVar, this, this.f4032a, this.f4039h.a());
        this.f4035d.add(i2, vVar);
        for (WeakReference<RecyclerView> weakReference : this.f4033b) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                aVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (vVar.f4214e > 0) {
            this.f4036e.notifyItemRangeInserted(a(vVar), vVar.f4214e);
        }
        d();
        return true;
    }

    @Override // androidx.recyclerview.widget.v.a
    public final void b(v vVar, int i2, int i3) {
        this.f4036e.notifyItemRangeRemoved(i2 + a(vVar), i3);
    }

    @Override // androidx.recyclerview.widget.v.a
    public final void c(v vVar, int i2, int i3) {
        int a2 = a(vVar);
        this.f4036e.notifyItemMoved(i2 + a2, i3 + a2);
    }

    @Override // androidx.recyclerview.widget.v.a
    public final void a(v vVar, int i2, int i3) {
        this.f4036e.notifyItemRangeInserted(i2 + a(vVar), i3);
    }

    @Override // androidx.recyclerview.widget.v.a
    public final void a(v vVar, int i2, int i3, Object obj) {
        this.f4036e.notifyItemRangeChanged(i2 + a(vVar), i3, obj);
    }
}

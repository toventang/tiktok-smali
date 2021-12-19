package com.ss.android.ugc.aweme.compliance.privacy.b.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.a;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.c;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.d;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

final class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    final a f77336a;

    /* renamed from: b  reason: collision with root package name */
    final e f77337b;

    /* renamed from: c  reason: collision with root package name */
    List<WeakReference<RecyclerView>> f77338c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    final IdentityHashMap<RecyclerView.ViewHolder, c> f77339d = new IdentityHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    List<c> f77340e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    final d f77341f;

    /* renamed from: g  reason: collision with root package name */
    private a f77342g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final a.C1781a.EnumC1782a f77343h;

    static {
        Covode.recordClassIndex(47835);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        c f77344a;

        /* renamed from: b  reason: collision with root package name */
        int f77345b;

        /* renamed from: c  reason: collision with root package name */
        boolean f77346c;

        static {
            Covode.recordClassIndex(47836);
        }

        a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.c.a
    public final void a() {
        this.f77336a.notifyDataSetChanged();
    }

    public final boolean b() {
        if (this.f77343h != a.C1781a.EnumC1782a.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        aVar.f77346c = false;
        aVar.f77344a = null;
        aVar.f77345b = -1;
        this.f77342g = aVar;
    }

    /* access modifiers changed from: package-private */
    public final int a(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        int size = this.f77340e.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f77340e.get(i2).f77349c == aVar) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int a(c cVar) {
        c next;
        Iterator<c> it = this.f77340e.iterator();
        int i2 = 0;
        while (it.hasNext() && (next = it.next()) != cVar) {
            i2 += next.f77351e;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final a a(int i2) {
        a aVar;
        if (this.f77342g.f77346c) {
            aVar = new a();
        } else {
            this.f77342g.f77346c = true;
            aVar = this.f77342g;
        }
        Iterator<c> it = this.f77340e.iterator();
        int i3 = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c next = it.next();
            if (next.f77351e > i3) {
                aVar.f77344a = next;
                aVar.f77345b = i3;
                break;
            }
            i3 -= next.f77351e;
        }
        if (aVar.f77344a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for ".concat(String.valueOf(i2)));
    }

    /* access modifiers changed from: package-private */
    public final c a(RecyclerView.ViewHolder viewHolder) {
        c cVar = this.f77339d.get(viewHolder);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    b(a aVar, a.C1781a aVar2) {
        this.f77336a = aVar;
        if (aVar2.f77333a) {
            this.f77337b = new e.a();
        } else {
            this.f77337b = new e.b();
        }
        this.f77343h = aVar2.f77334b;
        if (aVar2.f77334b == a.C1781a.EnumC1782a.NO_STABLE_IDS) {
            this.f77341f = new d.b();
        } else if (aVar2.f77334b == a.C1781a.EnumC1782a.ISOLATED_STABLE_IDS) {
            this.f77341f = new d.a();
        } else if (aVar2.f77334b == a.C1781a.EnumC1782a.SHARED_STABLE_IDS) {
            this.f77341f = new d.c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.c.a
    public final void b(c cVar, int i2, int i3) {
        this.f77336a.notifyItemRangeRemoved(i2 + a(cVar), i3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.c.a
    public final void c(c cVar, int i2, int i3) {
        int a2 = a(cVar);
        this.f77336a.notifyItemMoved(i2 + a2, i3 + a2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.c.a
    public final void a(c cVar, int i2, int i3) {
        this.f77336a.notifyItemRangeInserted(i2 + a(cVar), i3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.b.a.c.a
    public final void a(c cVar, int i2, int i3, Object obj) {
        this.f77336a.notifyItemRangeChanged(i2 + a(cVar), i3, obj);
    }
}

package com.ss.android.ugc.aweme.discover.ui.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.k.m;
import androidx.k.n;
import androidx.k.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class a extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f82370a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f82371b;

    /* renamed from: c  reason: collision with root package name */
    private final b f82372c;

    static {
        Covode.recordClassIndex(51273);
    }

    private final void a() {
        this.f82372c.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b.a$a  reason: collision with other inner class name */
    public static final class C1931a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82373a;

        static {
            Covode.recordClassIndex(51274);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1931a(a aVar) {
            this.f82373a = aVar;
        }

        @Override // androidx.k.n, androidx.k.m.c
        public final void a(m mVar) {
            l.d(mVar, "");
            this.f82373a.f82370a = false;
        }

        @Override // androidx.k.n, androidx.k.m.c
        public final void d(m mVar) {
            l.d(mVar, "");
            this.f82373a.f82370a = true;
        }
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f82372c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        boolean z;
        l.d(recyclerView, "");
        super.a(recyclerView, i2, i3);
        if (this.f82371b && i3 != 0) {
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof com.ss.android.ugc.aweme.discover.c.a)) {
                adapter = null;
            }
            com.ss.android.ugc.aweme.discover.c.a aVar = (com.ss.android.ugc.aweme.discover.c.a) adapter;
            if (aVar != null) {
                List<View> a2 = aVar.a();
                int size = a2.size();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    } else if (a2.get(i5) instanceof b) {
                        Objects.requireNonNull(a2.get(i5), "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.guide.GuideSearchHeadView");
                        break;
                    } else {
                        i5++;
                    }
                }
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).k();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    staggeredGridLayoutManager.a(new int[staggeredGridLayoutManager.f3896a]);
                }
                if (i3 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.f82370a) {
                    androidx.k.l lVar = new androidx.k.l();
                    lVar.a(new C1931a(this));
                    lVar.a(48);
                    lVar.a(300L);
                    ViewParent parent = this.f82372c.getParent();
                    Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    o.a((ViewGroup) parent, lVar);
                    b bVar = this.f82372c;
                    if (z) {
                        i4 = 8;
                    }
                    bVar.setVisibility(i4);
                }
            }
        }
    }

    public final void a(List<GuideSearchWord> list, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        boolean z = !b.a((Collection) list);
        this.f82371b = z;
        if (!z) {
            a();
            return;
        }
        b bVar = this.f82372c;
        if (list == null) {
            l.b();
        }
        bVar.a(list, str, str2, str3);
    }
}

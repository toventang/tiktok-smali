package com.ss.android.ugc.aweme.notification.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    LinearLayoutManager f113898a;

    /* renamed from: b  reason: collision with root package name */
    int f113899b;

    /* renamed from: c  reason: collision with root package name */
    int f113900c = 6;

    /* renamed from: d  reason: collision with root package name */
    final Rect f113901d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f113902e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    a f113903f;

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f113904g;

    public interface a {
        static {
            Covode.recordClassIndex(73244);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(73243);
    }

    private final void a() {
        RecyclerView recyclerView = this.f113904g;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.a(new b(this));
    }

    public static final class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f113905a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f113906b;

        static {
            Covode.recordClassIndex(73245);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(p pVar) {
            this.f113906b = pVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            boolean z;
            l.d(recyclerView, "");
            if (i3 < 0) {
                z = true;
            } else {
                z = false;
            }
            this.f113905a = z;
            p pVar = this.f113906b;
            LinearLayoutManager linearLayoutManager = pVar.f113898a;
            if (linearLayoutManager == null) {
                l.a("mLinearLayoutManager");
            }
            int k2 = linearLayoutManager.k();
            LinearLayoutManager linearLayoutManager2 = pVar.f113898a;
            if (linearLayoutManager2 == null) {
                l.a("mLinearLayoutManager");
            }
            int m2 = linearLayoutManager2.m();
            if (!(k2 == -1 || m2 == -1)) {
                LinearLayoutManager linearLayoutManager3 = pVar.f113898a;
                if (linearLayoutManager3 == null) {
                    l.a("mLinearLayoutManager");
                }
                View c2 = linearLayoutManager3.c(k2);
                LinearLayoutManager linearLayoutManager4 = pVar.f113898a;
                if (linearLayoutManager4 == null) {
                    l.a("mLinearLayoutManager");
                }
                View c3 = linearLayoutManager4.c(m2);
                if (!(c2 == null || c3 == null)) {
                    c2.getLocalVisibleRect(pVar.f113901d);
                    c3.getGlobalVisibleRect(pVar.f113902e);
                    if (z) {
                        if (pVar.f113899b > k2) {
                            int i4 = pVar.f113899b;
                            for (int i5 = k2; i5 < i4; i5++) {
                                a aVar = pVar.f113903f;
                                if (aVar != null) {
                                    aVar.a(i5);
                                }
                            }
                            pVar.f113899b = k2;
                        }
                        if (pVar.f113900c != m2) {
                            pVar.f113900c = m2;
                            return;
                        }
                    } else {
                        if (pVar.f113900c < m2) {
                            int i6 = m2 + 1;
                            for (int i7 = pVar.f113900c + 1; i7 < i6; i7++) {
                                a aVar2 = pVar.f113903f;
                                if (aVar2 != null) {
                                    aVar2.a(i7);
                                }
                            }
                            pVar.f113900c = m2;
                        }
                        if (pVar.f113899b == k2) {
                            pVar.f113900c = m2;
                            return;
                        }
                    }
                    pVar.f113899b = k2;
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, a aVar) {
        l.d(recyclerView, "");
        l.d(linearLayoutManager, "");
        l.d(aVar, "");
        this.f113904g = recyclerView;
        this.f113898a = linearLayoutManager;
        this.f113903f = aVar;
        a();
    }
}

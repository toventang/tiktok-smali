package com.ss.android.ugc.aweme.shortvideo.z.c;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.tux.status.TuxStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final DmtStatusView f133044a;

    /* renamed from: b  reason: collision with root package name */
    final e f133045b;

    /* renamed from: c  reason: collision with root package name */
    final m f133046c;

    /* renamed from: d  reason: collision with root package name */
    final com.ss.android.ugc.aweme.shortvideo.z.d.a f133047d;

    /* renamed from: e  reason: collision with root package name */
    private final RecyclerView f133048e;

    /* renamed from: f  reason: collision with root package name */
    private final View f133049f;

    /* renamed from: g  reason: collision with root package name */
    private final View f133050g;

    static {
        Covode.recordClassIndex(86996);
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133051a;

        static {
            Covode.recordClassIndex(86997);
        }

        a(b bVar) {
            this.f133051a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                if (list.isEmpty()) {
                    this.f133051a.a(false, false);
                } else {
                    this.f133051a.a(true, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.b$b  reason: collision with other inner class name */
    static final class C3445b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133052a;

        static {
            Covode.recordClassIndex(86998);
        }

        C3445b(b bVar) {
            this.f133052a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                if (list.isEmpty()) {
                    this.f133052a.a(false, true);
                } else {
                    this.f133052a.a(true, true);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: com.bytedance.ies.dmt.ui.widget.e */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        TuxStatusView tuxStatusView;
        RecyclerView recyclerView = this.f133048e;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
        View view = this.f133049f;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view.setVisibility(i3);
        View view2 = this.f133050g;
        if (z || z2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view2.setVisibility(i4);
        if (z) {
            this.f133044a.setVisibility(8);
            return;
        }
        if (z2) {
            d dVar = new d.a(this.f133045b).b(R.string.h36).c(R.string.h37).a(2131232887).f33648a;
            com.bytedance.ies.dmt.ui.widget.e eVar = new com.bytedance.ies.dmt.ui.widget.e(this.f133045b);
            eVar.setStatus(dVar);
            tuxStatusView = eVar;
        } else {
            TuxStatusView tuxStatusView2 = new TuxStatusView(this.f133045b, null, 0, 6);
            TuxStatusView.c a2 = new TuxStatusView.c().a(0, 2131230977);
            String string = this.f133045b.getResources().getString(R.string.fuo);
            l.b(string, "");
            TuxStatusView.c a3 = a2.a(string);
            String string2 = this.f133045b.getResources().getString(R.string.fup);
            l.b(string2, "");
            TuxStatusView.c a4 = a3.a((CharSequence) string2);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a5 = h.g.a.a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            tuxStatusView2.setStatus(a4.b(a5, h.g.a.a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics()))));
            tuxStatusView = tuxStatusView2;
        }
        this.f133044a.setBuilder(new DmtStatusView.a(this.f133045b).b(tuxStatusView));
        this.f133044a.d();
        this.f133044a.g();
        this.f133044a.setVisibility(0);
    }

    public b(DmtStatusView dmtStatusView, RecyclerView recyclerView, View view, View view2, e eVar, m mVar, com.ss.android.ugc.aweme.shortvideo.z.d.a aVar) {
        l.d(dmtStatusView, "");
        l.d(recyclerView, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(eVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        this.f133044a = dmtStatusView;
        this.f133048e = recyclerView;
        this.f133049f = view;
        this.f133050g = view2;
        this.f133045b = eVar;
        this.f133046c = mVar;
        this.f133047d = aVar;
    }
}

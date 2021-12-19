package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.choosemusic.d.a;
import com.ss.android.ugc.aweme.choosemusic.view.ab;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Collection;
import java.util.List;

public abstract class m<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public NormalTitleBar f70840a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f70841b;

    /* renamed from: c  reason: collision with root package name */
    public TuxStatusView f70842c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f70843d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f70844e;

    /* renamed from: f  reason: collision with root package name */
    protected f f70845f;

    /* renamed from: g  reason: collision with root package name */
    protected a f70846g;

    /* renamed from: h  reason: collision with root package name */
    k<com.ss.android.ugc.aweme.choosemusic.b.c> f70847h;

    /* renamed from: i  reason: collision with root package name */
    protected int f70848i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f70849j;

    /* renamed from: k  reason: collision with root package name */
    public TuxStatusView.c f70850k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f70851l;

    /* renamed from: m  reason: collision with root package name */
    private h.a f70852m;
    private int n;
    private int o;

    static {
        Covode.recordClassIndex(43649);
    }

    /* access modifiers changed from: protected */
    public abstract f d();

    @Override // com.ss.android.ugc.aweme.arch.c
    public final f c() {
        return this.f70845f;
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public final void a() {
        f fVar = this.f70845f;
        if (fVar != null) {
            fVar.ag_();
        }
    }

    private void h() {
        i();
        if (this.o == 1) {
            f();
        }
        j();
    }

    public final void f() {
        TuxStatusView tuxStatusView = this.f70842c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f70842c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z g() {
        f();
        a aVar = this.f70846g;
        if (aVar == null) {
            return null;
        }
        aVar.u();
        return null;
    }

    private void i() {
        this.f70840a.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.view.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43650);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                if (m.this.f70846g != null) {
                    m.this.f70846g.v();
                }
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
                if (m.this.f70846g != null) {
                    m.this.f70846g.t();
                }
            }
        });
        this.f70840a.setColorMode(0);
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public final void b() {
        TuxStatusView tuxStatusView = this.f70842c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f70842c.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new n(this)));
        }
        f fVar = this.f70845f;
        if (fVar != null) {
            fVar.b_(null);
        }
    }

    private void j() {
        f d2 = d();
        this.f70845f = d2;
        d2.g(this.f70841b.getResources().getColor(R.color.c5));
        this.f70845f.a(this.f70852m);
        this.f70841b.setAdapter(this.f70845f);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        wrapLinearLayoutManager.r = bl.a();
        this.f70841b.setLayoutManager(wrapLinearLayoutManager);
        this.f70841b.setRecycledViewPool(MusicRecyclerViewPoolViewModel.a.a(this.f70844e));
    }

    public void e() {
        if (this.f70845f.v) {
            this.f70845f.d(false);
            this.f70845f.b_(null);
            this.f70845f.ah_();
        }
        RecyclerView recyclerView = this.f70841b;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        TuxStatusView tuxStatusView = this.f70842c;
        if (tuxStatusView != null) {
            TuxStatusView.c cVar = this.f70850k;
            if (cVar != null) {
                tuxStatusView.setStatus(cVar);
                this.f70842c.setVisibility(0);
            } else if (this.n != 0) {
                String string = tuxStatusView.getContext().getString(this.n);
                com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
                aVar.f44749a = R.raw.icon_large_error_robot;
                aVar.f44753e = Integer.valueOf((int) R.attr.bd);
                this.f70842c.setStatus(new TuxStatusView.c().a(aVar).a(this.f70844e.getString(R.string.aj7)).a((CharSequence) string));
                this.f70842c.setVisibility(0);
            }
        }
    }

    public final void a(ab.a aVar) {
        new ab(aVar, 10).a(this.f70841b);
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public final void b(List<T> list, boolean z) {
        f fVar = this.f70845f;
        if (fVar != null) {
            this.f70849j = z;
            if (!z) {
                com.ss.android.ugc.aweme.choosemusic.a.a(fVar);
            } else {
                fVar.ai_();
            }
            if (!b.a((Collection) list)) {
                this.f70845f.b(list);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public void a(List<T> list, boolean z) {
        TuxStatusView tuxStatusView = this.f70842c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
        if (this.f70845f != null) {
            if (b.a((Collection) list)) {
                e();
                return;
            }
            this.f70845f.d(true);
            this.f70849j = z;
            if (!z) {
                com.ss.android.ugc.aweme.choosemusic.a.a(this.f70845f);
            } else {
                this.f70845f.ai_();
            }
            this.f70845f.b_(list);
            RecyclerView recyclerView = this.f70841b;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
        }
    }

    m(Context context, View view, a aVar, h.a aVar2, int i2) {
        this.o = 1;
        this.f70851l = true;
        a(context, view, aVar, R.string.dhl, aVar2, null, i2);
    }

    m(Context context, View view, a aVar, h.a aVar2, k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar, int i2) {
        this.o = 1;
        this.o = 0;
        a(context, view, aVar, R.string.dcj, aVar2, kVar, i2);
    }

    m(Context context, View view, a aVar, int i2, h.a aVar2, k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar, int i3) {
        this.o = 1;
        a(context, view, aVar, i2, aVar2, kVar, i3);
    }

    private void a(Context context, View view, a aVar, int i2, h.a aVar2, k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar, int i3) {
        this.f70840a = (NormalTitleBar) view.findViewById(R.id.em8);
        this.f70841b = (RecyclerView) view.findViewById(R.id.cql);
        this.f70842c = (TuxStatusView) view.findViewById(R.id.cr5);
        this.f70843d = (LinearLayout) view.findViewById(R.id.cqm);
        this.f70844e = context;
        this.f70846g = aVar;
        this.f70852m = aVar2;
        this.f70847h = kVar;
        this.n = i2;
        this.f70848i = i3;
        h();
    }
}

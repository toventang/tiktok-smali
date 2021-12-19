package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.choosemusic.b.b;
import com.ss.android.ugc.aweme.kids.choosemusic.d.a;
import com.ss.android.ugc.aweme.kids.choosemusic.h.q;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Collection;
import java.util.List;

public abstract class e<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public TextTitleBar f105691a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f105692b;

    /* renamed from: c  reason: collision with root package name */
    public TuxStatusView f105693c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f105694d;

    /* renamed from: e  reason: collision with root package name */
    protected f f105695e;

    /* renamed from: f  reason: collision with root package name */
    protected a f105696f;

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.kids.a.a.c<b> f105697g;

    /* renamed from: h  reason: collision with root package name */
    protected int f105698h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f105699i;

    /* renamed from: j  reason: collision with root package name */
    private Context f105700j;

    /* renamed from: k  reason: collision with root package name */
    private h.a f105701k;

    /* renamed from: l  reason: collision with root package name */
    private int f105702l;

    /* renamed from: m  reason: collision with root package name */
    private int f105703m;

    static {
        Covode.recordClassIndex(67684);
    }

    /* access modifiers changed from: protected */
    public abstract f d();

    @Override // com.ss.android.ugc.aweme.arch.c
    public final f c() {
        return this.f105695e;
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public final void a() {
        f fVar = this.f105695e;
        if (fVar != null) {
            fVar.ag_();
        }
    }

    private void g() {
        h();
        if (this.f105703m == 1) {
            j();
        }
        i();
    }

    private void j() {
        TuxStatusView tuxStatusView = this.f105693c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f105693c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z f() {
        j();
        a aVar = this.f105696f;
        if (aVar == null) {
            return null;
        }
        aVar.q();
        return null;
    }

    private void h() {
        this.f105691a.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.h.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67685);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                if (e.this.f105696f != null) {
                    e.this.f105696f.r();
                }
            }
        });
        this.f105691a.setColorMode(0);
    }

    private void i() {
        f d2 = d();
        this.f105695e = d2;
        d2.g(this.f105692b.getResources().getColor(R.color.c5));
        this.f105695e.a(this.f105701k);
        this.f105692b.setAdapter(this.f105695e);
        this.f105692b.setLayoutManager(new WrapLinearLayoutManager(1));
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public final void b() {
        TuxStatusView tuxStatusView = this.f105693c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
            this.f105693c.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c(), new f(this)));
        }
        f fVar = this.f105695e;
        if (fVar != null) {
            fVar.b_(null);
        }
    }

    public void e() {
        if (this.f105695e.v) {
            this.f105695e.d(false);
            this.f105695e.b_(null);
            this.f105695e.ah_();
        }
        TuxStatusView tuxStatusView = this.f105693c;
        if (tuxStatusView != null && this.f105702l != 0) {
            this.f105693c.setStatus(new TuxStatusView.c().a((CharSequence) tuxStatusView.getContext().getString(this.f105702l)));
            this.f105693c.setVisibility(0);
        }
    }

    public final void a(q.a aVar) {
        new q(aVar, 10).a(this.f105692b);
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public final void b(List<T> list, boolean z) {
        f fVar = this.f105695e;
        if (fVar != null) {
            this.f105699i = z;
            if (!z) {
                fVar.d(false);
            } else {
                fVar.ai_();
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                this.f105695e.b(list);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.c
    public void a(List<T> list, boolean z) {
        TuxStatusView tuxStatusView = this.f105693c;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
        if (this.f105695e != null) {
            if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                e();
                return;
            }
            this.f105695e.d(true);
            this.f105699i = z;
            if (!z) {
                this.f105695e.d(false);
            } else {
                this.f105695e.ai_();
            }
            this.f105695e.b_(list);
        }
    }

    e(Context context, View view, a aVar, h.a aVar2, com.ss.android.ugc.aweme.kids.a.a.c<b> cVar, int i2) {
        this.f105703m = 1;
        this.f105703m = 0;
        a(context, view, aVar, R.string.cn4, aVar2, cVar, i2);
    }

    e(Context context, View view, a aVar, int i2, h.a aVar2, com.ss.android.ugc.aweme.kids.a.a.c<b> cVar, int i3) {
        this.f105703m = 1;
        a(context, view, aVar, i2, aVar2, cVar, i3);
    }

    private void a(Context context, View view, a aVar, int i2, h.a aVar2, com.ss.android.ugc.aweme.kids.a.a.c<b> cVar, int i3) {
        this.f105691a = (TextTitleBar) view.findViewById(R.id.em8);
        this.f105692b = (RecyclerView) view.findViewById(R.id.cql);
        this.f105693c = (TuxStatusView) view.findViewById(R.id.cr5);
        this.f105694d = (LinearLayout) view.findViewById(R.id.cqm);
        this.f105700j = context;
        this.f105696f = aVar;
        this.f105701k = aVar2;
        this.f105697g = cVar;
        this.f105702l = i2;
        this.f105698h = i3;
        g();
    }
}

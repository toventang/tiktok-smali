package com.ss.android.ugc.aweme.inbox.g;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.x;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;
import java.util.Objects;

public final class c extends g<x> {

    /* renamed from: g  reason: collision with root package name */
    private int f104256g;

    static {
        Covode.recordClassIndex(66758);
    }

    private final TuxStatusView f() {
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return (TuxStatusView) view;
    }

    private final void g() {
        TuxStatusView f2 = f();
        View view = this.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        f2.setLayoutParams(layoutParams);
        f().setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void a() {
        if (((x) c()).f104498a == x.a.SHOW) {
            RecommendUserVM e2 = e();
            if (!e2.d()) {
                return;
            }
            if (!e2.f103996g) {
                e2.f103993d.setValue(e2.a(x.a.HIDE));
            } else {
                i.b(new RecommendUserVM.c(e2), i.f4824a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(TuxStatusView tuxStatusView) {
        super(tuxStatusView);
        l.d(tuxStatusView, "");
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f104256g = a.a(TypedValue.applyDimension(1, 46.0f, system.getDisplayMetrics()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final /* synthetic */ void a(x xVar) {
        x xVar2 = xVar;
        l.d(xVar2, "");
        int i2 = d.f104257a[xVar2.f104498a.ordinal()];
        if (i2 == 1) {
            g();
        } else if (i2 == 2) {
            TuxStatusView f2 = f();
            View view = this.itemView;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f104256g;
            f2.setLayoutParams(layoutParams);
            f().setVisibility(0);
            f().a();
        } else if (i2 == 3) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.cys).b();
            g();
        }
    }
}

package com.ss.android.ugc.aweme.tux.business.powerlist;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LoadingFooterCell extends PowerLoadingCell {

    /* renamed from: a  reason: collision with root package name */
    public static final int f141589a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f141590b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(92525);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void a() {
        b();
    }

    static {
        Covode.recordClassIndex(92524);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f141589a = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void b() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        l.b(layoutParams, "");
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
        ((TuxDualBallView) view.findViewById(R.id.aq4)).c();
        view.setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void c() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        l.b(layoutParams, "");
        layoutParams.height = f141589a;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        ((TuxDualBallView) view.findViewById(R.id.aq4)).b();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bhv, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}

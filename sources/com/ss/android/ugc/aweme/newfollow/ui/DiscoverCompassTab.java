package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.experiment.az;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.lego.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class DiscoverCompassTab extends TabFragmentNode {

    /* renamed from: b  reason: collision with root package name */
    public final Context f112593b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f112594c;

    /* renamed from: d  reason: collision with root package name */
    private final h f112595d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(72358);
    }

    private final ar b() {
        return (ar) this.f112595d.getValue();
    }

    @Override // com.bytedance.hox.d
    public final String e() {
        return "discovery";
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        return null;
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return c.class;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return b().f82873i;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return b().f82872h;
    }

    static final class a extends m implements h.f.a.a<ar> {
        final /* synthetic */ DiscoverCompassTab this$0;

        static {
            Covode.recordClassIndex(72359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DiscoverCompassTab discoverCompassTab) {
            super(0);
            this.this$0 = discoverCompassTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ar invoke() {
            return b.b(this.this$0.f112593b);
        }
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void h() {
        if (this.f112594c == null) {
            this.f112594c = new a(this.f112593b);
        }
        View.OnClickListener onClickListener = this.f112594c;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    public DiscoverCompassTab(Context context) {
        l.d(context, "");
        this.f112593b = context;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        if (!az.a()) {
            return bzVar.a(b());
        }
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) f.a(new X2CFragmentMainPageIcon());
        if (x2CFragmentMainPageIcon.f99517c != null) {
            X2CFragmentMainPageIcon.a(x2CFragmentMainPageIcon.f99517c);
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m mVar = x2CFragmentMainPageIcon.f99517c;
            x2CFragmentMainPageIcon.f99517c = null;
            if (mVar != null) {
                return mVar;
            }
        }
        return bzVar.a(b());
    }
}

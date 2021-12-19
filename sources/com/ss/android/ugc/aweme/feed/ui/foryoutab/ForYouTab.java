package com.ss.android.ugc.aweme.feed.ui.foryoutab;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.main.experiment.d;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ForYouTab extends TabFragmentNode {

    /* renamed from: b  reason: collision with root package name */
    public final Context f94765b;

    /* renamed from: c  reason: collision with root package name */
    private final h f94766c = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(60124);
    }

    private final dj b() {
        return (dj) this.f94766c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final int a() {
        return 0;
    }

    @Override // com.bytedance.hox.d
    public final String e() {
        return "homepage_hot";
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void i() {
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return af.class;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return b().f82873i;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return b().f82872h;
    }

    static final class a extends m implements h.f.a.a<dj> {
        final /* synthetic */ ForYouTab this$0;

        static {
            Covode.recordClassIndex(60125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ForYouTab forYouTab) {
            super(0);
            this.this$0 = forYouTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dj invoke() {
            return a.a(this.this$0.f94765b);
        }
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void h() {
        SpecActServiceImpl.i().a("ForYou");
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
        return bundle;
    }

    public ForYouTab(Context context) {
        l.d(context, "");
        this.f94765b = context;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        if (!ax.b() && !ax.a()) {
            return bzVar.a(b());
        }
        View d2 = d.f109248a.d();
        if (d2 == null) {
            return bzVar.a(b());
        }
        return d2;
    }
}

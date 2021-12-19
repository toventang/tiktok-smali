package com.ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.foundation.activity.d;
import com.ss.android.ugc.aweme.activity.TikTokActivityViewModel;
import com.ss.android.ugc.aweme.activity.processor.j;
import com.ss.android.ugc.aweme.fragment.TikTokFragmentViewModel;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class InitFoundationTask implements w {
    static {
        Covode.recordClassIndex(38393);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    static final class a extends m implements h.f.a.a<List<? extends d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62408a = new a();

        static {
            Covode.recordClassIndex(38394);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ List<? extends d> invoke() {
            return z.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(TikTokActivityViewModel.class, "");
        com.bytedance.ies.foundation.activity.a.viewModelClass = TikTokActivityViewModel.class;
        l.d(TikTokFragmentViewModel.class, "");
        com.bytedance.ies.foundation.fragment.a.f33895b = TikTokFragmentViewModel.class;
        com.bytedance.ies.foundation.activity.a.processGenerator = a.f62408a;
        a.C0737a.a(com.ss.android.ugc.aweme.activity.a.a.f65526a);
        a.C0737a.a(j.f65544d);
    }
}

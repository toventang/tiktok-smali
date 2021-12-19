package com.ss.android.ugc.aweme.favorites.ui;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.d.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.favorites.e.c;
import com.ss.android.ugc.aweme.favorites.e.e;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class f extends a implements i, j {
    static {
        Covode.recordClassIndex(57119);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new g(f.class, "onAntiCrawlerEvent", a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.profile.ui.cs
    public final void s() {
        o();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void l() {
        if (this.f90813j != null) {
            this.f90813j.a((b) new e());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void p() {
        super.p();
        if (this.f90808a != null) {
            this.f90808a.setBackground(null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void c() {
        if (this.f90813j != null) {
            this.f90813j.a(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void k() {
        if (this.f90813j != null) {
            this.f90813j.a(4);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final com.ss.android.ugc.aweme.common.a.f n() {
        if (getActivity() != null) {
            return new com.ss.android.ugc.aweme.favorites.a.b(getActivity(), this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void q() {
        com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
        aVar.f44749a = R.raw.icon_large_comment;
        aVar.f44753e = Integer.valueOf((int) R.attr.bd);
        this.f90809b.setStatus(new TuxStatusView.c().a(aVar).a(getString(R.string.bsn)).a((CharSequence) getString(R.string.bsm)));
        this.f90809b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void a(View view) {
        super.a(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f90808a.getLayoutParams();
        marginLayoutParams.topMargin = (int) n.b(getContext(), 8.0f);
        this.f90808a.setLayoutParams(marginLayoutParams);
    }

    @r
    public void onAntiCrawlerEvent(a aVar) {
        String str = aVar.f68097a;
        if (str != null && str.contains("/tiktok/comment/listcollection/v1/?")) {
            EventBus.a().d(aVar);
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.common.e.c
    public final void a(List list, boolean z) {
        int i2;
        super.a(list, z);
        if (this.f90813j.f76396h instanceof e) {
            e eVar = (e) this.f90813j.f76396h;
            if (eVar.mData == null) {
                i2 = 0;
            } else {
                i2 = ((c) eVar.mData).f90605d;
            }
            androidx.fragment.app.e activity = getActivity();
            if (i2 != 0 && activity != null) {
                new com.bytedance.tux.g.b(this).a(activity.getString(R.string.djj, Integer.valueOf(i2))).b();
            }
        }
    }
}

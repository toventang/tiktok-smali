package com.ss.android.ugc.aweme.favorites.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.challenge.d.a;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.utils.da;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class c extends a implements i, j {
    static {
        Covode.recordClassIndex(57114);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(149, new g(c.class, "onChallengeCollectEvent", a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new g(c.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
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
            this.f90813j.a((b) new com.ss.android.ugc.aweme.favorites.e.a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final f n() {
        return new com.ss.android.ugc.aweme.favorites.a.a(getActivity());
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
            com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_native_list_first_screen");
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
    public final void q() {
        com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
        aVar.f44749a = R.raw.icon_large_bookmark;
        aVar.f44753e = Integer.valueOf((int) R.attr.bd);
        this.f90809b.setStatus(new TuxStatusView.c().a(aVar).a(getString(R.string.bsr)).a((CharSequence) getString(R.string.bsq)));
        this.f90809b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void a(View view) {
        super.a(view);
        da.a.a("discovery_collect_hashtag_recycler_list").a(this.f90808a);
    }

    @r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str = aVar.f68097a;
        if (str != null && str.contains("/aweme/v1/challenge/listcollection/?")) {
            EventBus.a().d(aVar);
            c();
        }
    }

    @r
    public void onChallengeCollectEvent(a aVar) {
        List items;
        if (ab_()) {
            Challenge challenge = aVar.f69918a;
            boolean z = false;
            if (challenge.getCollectStatus() == 0 && this.f90813j != null && this.f90813j.f76396h != null && (items = ((com.ss.android.ugc.aweme.common.e.a) this.f90813j.f76396h).getItems()) != null && items.size() > 0) {
                Iterator it = items.iterator();
                while (it.hasNext()) {
                    Challenge challenge2 = (Challenge) it.next();
                    if (challenge2 != null && !TextUtils.isEmpty(challenge2.getCid()) && challenge2.getCid().equals(challenge.getCid())) {
                        it.remove();
                        z = true;
                    }
                }
                if (z) {
                    this.f90810c.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.common.e.c
    public final void a(List list, boolean z) {
        com.bytedance.ies.watcher.c.a("discovery_collect_hashtag_native_list_render");
        super.a(list, z);
        if (ab_() && this.f90808a != null) {
            this.f90808a.post(d.f90862a);
        }
    }
}

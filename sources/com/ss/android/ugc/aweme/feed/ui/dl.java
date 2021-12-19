package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.friends.service.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dg f94602a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94603b;

    static {
        Covode.recordClassIndex(60044);
    }

    dl(dg dgVar, int i2) {
        this.f94602a = dgVar;
        this.f94603b = i2;
    }

    public final void run() {
        String aid;
        dg dgVar = this.f94602a;
        int i2 = this.f94603b;
        if (dgVar.T == null) {
            return;
        }
        if (dgVar.L == null || dgVar.L.getExposeSharer() == null || dg.a(dgVar.f94583j)) {
            dgVar.T.setVisibility(8);
            return;
        }
        dgVar.f94583j = dgVar.L.getExposeSharer();
        if (dgVar.f94582i == null) {
            dgVar.f94582i = a.f97047a.i();
            dgVar.f94582i.a(dgVar);
        }
        dgVar.a(false);
        dgVar.f94577d.setText(dgVar.f94583j.getNickname());
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        if (dgVar.L == null) {
            aid = "no_aid";
        } else {
            aid = dgVar.L.getAid();
        }
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(dgVar.f94583j.getAvatar())).a(sb.append(aid).toString());
        a2.K = true;
        a2.E = dgVar.f94576c;
        a2.c();
        if (dgVar.T.getVisibility() != 8) {
            return;
        }
        if (dgVar.f94583j.isShowed()) {
            dgVar.T.setVisibility(0);
        } else if (i2 == 3) {
            dgVar.T.post(new dm(dgVar));
        }
    }
}

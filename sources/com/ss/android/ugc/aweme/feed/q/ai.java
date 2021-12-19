package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.d.a.c;
import f.a.d.f;

final /* synthetic */ class ai implements f {

    /* renamed from: a  reason: collision with root package name */
    private final w f93758a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f93759b;

    /* renamed from: c  reason: collision with root package name */
    private final int f93760c;

    /* renamed from: d  reason: collision with root package name */
    private final User f93761d;

    static {
        Covode.recordClassIndex(59649);
    }

    ai(w wVar, Aweme aweme, int i2, User user) {
        this.f93758a = wVar;
        this.f93759b = aweme;
        this.f93760c = i2;
        this.f93761d = user;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        w wVar = this.f93758a;
        Aweme aweme = this.f93759b;
        int i2 = this.f93760c;
        User user = this.f93761d;
        Long l2 = (Long) obj;
        if ((wVar.aD() == null || !wVar.aD().equals(aweme)) && wVar.aE() < i2) {
            if (l2 == null) {
                l2 = 0L;
            }
            if (!aweme.isLive()) {
                user.roomId = l2.longValue();
            }
            if (aweme.isLive() && 0 == l2.longValue()) {
                c.a(new e(aweme, wVar.aJ.getEventType()));
            }
        }
    }
}

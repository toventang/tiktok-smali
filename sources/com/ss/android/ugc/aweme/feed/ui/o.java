package com.ss.android.ugc.aweme.feed.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.HashMap;

final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final m f94965a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowStatus f94966b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f94967c;

    static {
        Covode.recordClassIndex(60231);
    }

    o(m mVar, FollowStatus followStatus, Aweme aweme) {
        this.f94965a = mVar;
        this.f94966b = followStatus;
        this.f94967c = aweme;
    }

    public final void run() {
        m mVar = this.f94965a;
        FollowStatus followStatus = this.f94966b;
        Aweme aweme = this.f94967c;
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(ac.a(aweme), followStatus.userId)) {
            if (aweme.getAuthor() != null) {
                aweme.getAuthor().setFollowStatus(followStatus.followStatus);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("aweme_state", mVar.L);
            hashMap.put("event_type_state", mVar.M);
            if (followStatus.followFrom == 13 || followStatus.followFrom == 18) {
                mVar.b();
            } else {
                mVar.a(followStatus.followStatus, hashMap);
            }
        }
    }
}

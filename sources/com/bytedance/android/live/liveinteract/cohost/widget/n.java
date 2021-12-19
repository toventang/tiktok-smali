package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements b.AbstractC0253b {

    /* renamed from: a  reason: collision with root package name */
    static final b.AbstractC0253b f10488a = new n();

    static {
        Covode.recordClassIndex(5575);
    }

    private n() {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
    public final void a(View view, Object obj) {
        ((ImageView) view).setVisibility(((User) obj).isFollowing() ? 8 : 0);
    }
}

package com.ss.android.ugc.aweme.notificationlive.ui.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f114446a = new a();

    static {
        Covode.recordClassIndex(73639);
    }

    a() {
        super(NotificationChoiceState.class, "pushSwitchState", "getPushSwitchState()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((NotificationChoiceState) obj).getPushSwitchState());
    }
}

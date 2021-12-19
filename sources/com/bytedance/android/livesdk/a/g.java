package com.bytedance.android.livesdk.a;

import android.view.View;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileEvent f13275a;

    static {
        Covode.recordClassIndex(7388);
    }

    g(UserProfileEvent userProfileEvent) {
        this.f13275a = userProfileEvent;
    }

    public final void onClick(View view) {
        a.a().a(this.f13275a);
    }
}

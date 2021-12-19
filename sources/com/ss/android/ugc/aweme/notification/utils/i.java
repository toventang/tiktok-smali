package com.ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f113881a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(73233);
    }

    public static String a(Context context, User user) {
        String entranceButtonText;
        if (user == null) {
            return null;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return "following";
            }
            if (followStatus != 2) {
                return null;
            }
            if (IMUnder16ProxyImpl.n().d() || context == null) {
                return "friend";
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin == null || (entranceButtonText = createIIMServicebyMonsterPlugin.getEntranceButtonText(context, user.getUid())) == null || l.a((Object) entranceButtonText, (Object) context.getResources().getString(R.string.d3z))) {
                return "message";
            }
            return "sayhi";
        } else if (user.getFollowerStatus() == 1) {
            return "follow_back";
        } else {
            return "follow";
        }
    }
}

package com.bytedance.android.livesdk.ac;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.at.b;
import com.bytedance.android.livesdk.at.c;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final c f13630a = new b();

    static {
        Covode.recordClassIndex(7545);
    }

    public static String b(User user) {
        if (user == null) {
            return "";
        }
        return user.displayId;
    }

    public static String a(User user) {
        CharSequence a2 = f13630a.a((Room) DataChannelGlobal.f34575d.b(ac.class), user);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        return a2.toString();
    }
}

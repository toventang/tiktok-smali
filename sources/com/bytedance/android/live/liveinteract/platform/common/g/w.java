package com.bytedance.android.live.liveinteract.platform.common.g;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class w {
    static {
        Covode.recordClassIndex(6559);
    }

    public static final void b() {
        Integer num;
        b a2 = b.a.a("livesdk_connection_banned").a().a("invitee_list", a.q.getType()).a("connection_type", "anchor");
        RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (value != null) {
            num = Integer.valueOf(value.banTime);
        } else {
            num = null;
        }
        a2.a("banned_time", num.intValue()).b();
    }

    public static final void a() {
        b.a.a("livesdk_connection_overtime").a().a("invitee_list", a.q.getType()).a("connection_type", "anchor").b();
    }

    public static final String a(m mVar) {
        l.d(mVar, "");
        int i2 = x.f12034a[mVar.ordinal()];
        if (i2 == 1) {
            return "mutual_follow";
        }
        if (i2 == 2) {
            return "recommend";
        }
        if (i2 == 3) {
            return "weekly_rank";
        }
        if (i2 == 4) {
            return "hourly_rank";
        }
        if (i2 != 5) {
            return "";
        }
        return a.q.getType();
    }

    public static final void a(Map<String, String> map) {
        l.d(map, "");
        try {
            if (!b.a.a().q) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!TextUtils.isEmpty(a.p)) {
                map.put("match_id", a.p);
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void a(Map<String, String> map, m mVar, boolean z) {
        String str;
        l.d(map, "");
        l.d(mVar, "");
        int i2 = x.f12036c[mVar.ordinal()];
        if (i2 == 1) {
            map.put("invitee_list", "mutual_follow");
        } else if (i2 == 2) {
            map.put("invitee_list", "recommend");
        } else if (i2 == 3) {
            map.put("invitee_list", "weekly_rank");
        } else if (i2 == 4) {
            map.put("invitee_list", "hourly_rank");
        } else if (i2 == 5) {
            map.put("invitee_list", "random_match");
            map.put("is_change_pairing", "0");
            map.put("is_system_rematching", "0");
            int i3 = x.f12035b[a.q.ordinal()];
            if (i3 == 1) {
                map.put("is_change_pairing", "1");
            } else if (i3 == 2) {
                map.put("is_system_rematching", "1");
            }
        }
        map.put("event_type", String.valueOf(mVar.getType()));
        if (z && (str = b.a.a().V) != null) {
            map.put("enter_from", str);
        }
    }
}

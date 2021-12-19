package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.liveinteract.api.aw;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveHideAudienceFollowingSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f21832a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(12859);
    }

    public static final boolean a(long j2, long j3, long j4, String str, long j5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (j2 == j4) {
            z = true;
        } else {
            z = false;
        }
        if (j3 == j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        aw userRole = ((b) a.a(b.class)).getUserRole(j3);
        if (userRole == aw.GUEST_AUDIENCE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (userRole == aw.GUEST_ANCHOR) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (j3 == j5) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z || z2 || z5 || z4 || l.a((Object) str, (Object) "hourly_rank") || l.a((Object) str, (Object) "mic_room") || ((z3 && l.a((Object) str, (Object) "guest_connection")) || !LiveHideAudienceFollowingSetting.INSTANCE.getValue())) {
            return false;
        }
        return true;
    }
}

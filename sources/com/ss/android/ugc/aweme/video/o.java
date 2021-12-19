package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.player.ab.a;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.b.t;
import com.ss.android.ugc.playerkit.model.m;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f143498a;

    static {
        Covode.recordClassIndex(93892);
    }

    public static boolean c() {
        if (f143498a) {
            return true;
        }
        return false;
    }

    private static int d() {
        return b.a().a(true, "player_type", 0);
    }

    public static m.e b() {
        if (a() == null && d() == 6) {
            return m.e.TT_HARDWARE;
        }
        return m.e.TT;
    }

    public static a a() {
        com.ss.android.ugc.aweme.simkit.model.a.a decodeType;
        int i2;
        int i3;
        try {
            int i4 = 0;
            a aVar = (a) b.a().a(false, "player_type_v2", a.class, t.f143327a);
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.f143220a.f143222b;
            if (rateSettingsResponse == null || (decodeType = rateSettingsResponse.getDecodeType()) == null) {
                return aVar;
            }
            a aVar2 = new a();
            if (decodeType.f133580a != -1) {
                i2 = decodeType.f133580a;
            } else if (aVar != null) {
                i2 = aVar.f115009a;
            } else {
                i2 = 0;
            }
            aVar2.f115009a = i2;
            if (decodeType.f133582c != -1) {
                i3 = decodeType.f133582c;
            } else if (aVar != null) {
                i3 = aVar.f115011c;
            } else {
                i3 = 0;
            }
            aVar2.f115011c = i3;
            if (decodeType.f133581b != -1) {
                aVar2.f115010b = decodeType.f133581b;
            } else {
                if (aVar != null) {
                    i4 = aVar.f115010b;
                }
                aVar2.f115010b = i4;
            }
            return aVar2;
        } catch (Throwable unused) {
            return null;
        }
    }
}

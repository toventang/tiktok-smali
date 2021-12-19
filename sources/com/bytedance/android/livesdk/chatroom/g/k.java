package com.bytedance.android.livesdk.chatroom.g;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.d;
import com.bytedance.android.livesdk.j.bv;
import com.bytedance.android.livesdk.j.by;
import com.bytedance.android.livesdk.j.bz;
import com.bytedance.android.livesdk.j.ca;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class k {
    static {
        Covode.recordClassIndex(8595);
    }

    public static boolean a(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && enterRoomConfig.f23298b.w > 0) {
            return true;
        }
        return false;
    }

    public static String b(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null || !enterRoomConfig.f23299c.O) {
            return "";
        }
        String str = enterRoomConfig.f23299c.A;
        if (!m.a(str)) {
            return str;
        }
        return "";
    }

    public static boolean a(DataChannel dataChannel) {
        if (dataChannel == null || !((Boolean) dataChannel.b(by.class)).booleanValue() || !((Boolean) dataChannel.b(cp.class)).booleanValue() || !TextUtils.equals("message", (CharSequence) dataChannel.b(bz.class))) {
            return false;
        }
        return true;
    }

    public static boolean b(DataChannel dataChannel) {
        if (dataChannel == null || !((Boolean) dataChannel.b(by.class)).booleanValue() || !((Boolean) dataChannel.b(cp.class)).booleanValue() || !TextUtils.equals("homepage_hot", (CharSequence) dataChannel.b(bz.class))) {
            return false;
        }
        return true;
    }

    public static boolean c(DataChannel dataChannel) {
        if (dataChannel == null || !((Boolean) dataChannel.b(by.class)).booleanValue() || !((Boolean) dataChannel.b(cp.class)).booleanValue() || !TextUtils.equals("referral_task", (CharSequence) dataChannel.b(bz.class))) {
            return false;
        }
        return true;
    }

    public static EnterRoomConfig a(EnterRoomConfig enterRoomConfig, DataChannel dataChannel) {
        if (dataChannel != null && ((Boolean) dataChannel.b(by.class)).booleanValue()) {
            enterRoomConfig.f23299c.O = ((Boolean) dataChannel.b(by.class)).booleanValue();
            enterRoomConfig.f23299c.P = (String) dataChannel.b(bz.class);
            enterRoomConfig.f23299c.X = (String) dataChannel.b(bv.class);
            enterRoomConfig.f23299c.W = "full_screen";
            enterRoomConfig.f23299c.A = (String) dataChannel.b(ca.class);
        }
        return enterRoomConfig;
    }

    public static void a(boolean z, EnterRoomConfig enterRoomConfig) {
        String str;
        c cVar;
        if (f.a.f23366a.a().f23354b.f23299c.O) {
            if (!z || m.a(enterRoomConfig.f23299c.W)) {
                str = "full_screen";
            } else {
                str = enterRoomConfig.f23299c.W;
            }
            d.c(str);
            if (enterRoomConfig.f23299c.ae != -1) {
                Long valueOf = Long.valueOf(enterRoomConfig.f23299c.ae);
                h b2 = d.b();
                if (b2 != null && (cVar = b2.f13529d) != null) {
                    cVar.f13486g = valueOf;
                }
            }
        }
    }
}

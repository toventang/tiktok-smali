package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    public static final aw f22760a = new aw();

    private aw() {
    }

    static {
        Covode.recordClassIndex(13413);
    }

    public static void a(DataChannel dataChannel, long j2) {
        String str;
        b a2 = b.a.a("livesdk_balance_exchange_window_show").a(dataChannel).a("gift_id", j2);
        f b2 = u.a().b();
        l.b(b2, "");
        b a3 = a2.a("user_id", b2.c()).a("enter_from", "anchor_income");
        if (p.f()) {
            str = "1";
        } else {
            str = "0";
        }
        a3.a("is_anchor", str).b();
    }

    public static void b(DataChannel dataChannel, long j2) {
        String str;
        b a2 = b.a.a("livesdk_balance_exchange_confirm").a(dataChannel).a("enter_from", "anchor_income");
        if (p.f()) {
            str = "1";
        } else {
            str = "0";
        }
        b a3 = a2.a("is_anchor", str).a("gift_id", j2);
        f b2 = u.a().b();
        l.b(b2, "");
        a3.a("user_id", b2.c()).b();
    }

    public static void c(DataChannel dataChannel, long j2) {
        String str;
        b a2 = b.a.a("livesdk_balance_exchange_cancel").a(dataChannel).a("enter_from", "anchor_income");
        if (p.f()) {
            str = "1";
        } else {
            str = "0";
        }
        b a3 = a2.a("is_anchor", str).a("gift_id", j2);
        f b2 = u.a().b();
        l.b(b2, "");
        a3.a("user_id", b2.c()).b();
    }

    public static void a(DataChannel dataChannel, String str, long j2) {
        String str2;
        l.d(str, "");
        b a2 = b.a.a("livesdk_balance_exchange_window_show").a(dataChannel).a("show_reason", str).a("gift_id", j2);
        f b2 = u.a().b();
        l.b(b2, "");
        b a3 = a2.a("user_id", b2.c()).a("enter_from", "ug_exchange");
        if (p.f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        a3.a("is_anchor", str2).b();
    }

    public static void b(DataChannel dataChannel, String str, long j2) {
        String str2;
        l.d(str, "");
        b a2 = b.a.a("livesdk_balance_exchange_confirm").a(dataChannel).a("request_from", str).a("enter_from", "ug_exchange");
        if (p.f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        b a3 = a2.a("is_anchor", str2).a("gift_id", j2);
        f b2 = u.a().b();
        l.b(b2, "");
        a3.a("user_id", b2.c()).b();
    }

    public static void c(DataChannel dataChannel, String str, long j2) {
        String str2;
        l.d(str, "");
        b a2 = b.a.a("livesdk_balance_exchange_cancel").a(dataChannel).a("request_from", str).a("enter_from", "ug_exchange");
        if (p.f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        b a3 = a2.a("is_anchor", str2).a("gift_id", j2);
        f b2 = u.a().b();
        l.b(b2, "");
        a3.a("user_id", b2.c()).b();
    }
}

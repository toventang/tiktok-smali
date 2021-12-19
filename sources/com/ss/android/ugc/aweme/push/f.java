package com.ss.android.ugc.aweme.push;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ew;
import h.f.b.l;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118908a = new a((byte) 0);

    static {
        Covode.recordClassIndex(77242);
    }

    public static final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map) {
        a.a(str, str2, str3, str4, str5, str6, str7, str8, map);
    }

    public static final void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        a.a(z, str, str2, str3, str4, str5, str6);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77243);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str, String str2, String str3, boolean z) {
            l.d(str3, "");
            d a2 = new d().a("enter_from", str3).a("action_type", str2).a("is_free_event", !z ? 1 : 0);
            l.b(a2, "");
            ew.a(str, a2);
            r.a("livesdk_live_event_go_live", a2.f66730a);
        }

        public static void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            if (z) {
                d a2 = new d().a("room_id", str).a("inner_push_type", str4).a("enter_method", "inner_push").a("enter_from_merge", "inner_push").a(StringSet.type, str3).a("anchor_id", str2).a("gd_label", str5);
                l.b(a2, "");
                ew.a(str6, a2);
                r.a("livesdk_inner_push_disappear", a2.f66730a);
            }
        }

        public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map) {
            r.a("inner_push_disappear", new d().a("rule_id", str6).a("push_label", str3).a("push_channel", str4).a("room_id", str).a("anchor_id", str2).a("o_url", str5).a("user_id", str7).a("duration", str8).a(map).f66730a);
        }
    }
}

package com.bytedance.android.livesdk.service.c.b;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21352a = new a();

    /* renamed from: com.bytedance.android.livesdk.service.c.b.a$a  reason: collision with other inner class name */
    public enum EnumC0459a {
        TIME_UP("times_up"),
        USER_CLOSE("user_close"),
        SEND("send_click"),
        OTHER("other");
        
        private final String reason;

        public final String getDesc() {
            return this.reason;
        }

        static {
            Covode.recordClassIndex(12583);
        }

        private EnumC0459a(String str) {
            this.reason = str;
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(12582);
    }

    public static final void a(EnumC0459a aVar) {
        l.d(aVar, "");
        b.a.a("gift_guide_bubble_close").a("close_reason", aVar.getDesc()).a().b();
    }

    public static final void b(EnumC0459a aVar) {
        l.d(aVar, "");
        b.a.a("gift_guide_popup_close").a("close_reason", aVar.getDesc()).a().b();
    }
}

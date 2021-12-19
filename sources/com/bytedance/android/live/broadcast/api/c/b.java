package com.bytedance.android.live.broadcast.api.c;

import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7525a = new a((byte) 0);

    static {
        Covode.recordClassIndex(3703);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3704);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static com.bytedance.android.livesdk.ab.a a(String str, Throwable th) {
            l.d(str, "");
            l.d(th, "");
            return c.a.c(str).a(th);
        }

        public static com.bytedance.android.livesdk.ab.a b(String str, Throwable th) {
            l.d(str, "");
            l.d(th, "");
            com.bytedance.android.livesdk.ab.a c2 = c.a.c(str);
            l.d(th, "");
            if (th instanceof com.bytedance.android.live.network.model.b) {
                com.bytedance.android.live.network.model.b bVar = (com.bytedance.android.live.network.model.b) th;
                return c2.a("url", bVar.getUrl()).b("error_code", Integer.valueOf(bVar.getErrorCode())).b("error_msg", bVar.getErrorMsg()).a("error_alert", bVar.getAlert()).a("error_prompt", bVar.getPrompt());
            } else if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                return c2.b("error_code", Integer.valueOf(aVar.getErrorCode())).b("error_msg", aVar.getErrorMsg()).a("error_alert", aVar.getAlert()).a("error_prompt", aVar.getPrompt());
            } else if (th instanceof com.bytedance.android.live.a.a.a.c) {
                return c2.b("error_code", (Integer) 1).b("error_msg", th.getMessage());
            } else {
                com.bytedance.android.live.core.c.a.a("LiveBroadcastBusinessLog", th);
                return c2.b("error_code", (Integer) 1).b("error_msg", th.getMessage());
            }
        }
    }
}

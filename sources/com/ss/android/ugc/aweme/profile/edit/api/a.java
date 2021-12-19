package com.ss.android.ugc.aweme.profile.edit.api;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a$a  reason: collision with other inner class name */
    public interface AbstractC2964a {
        static {
            Covode.recordClassIndex(74895);
        }

        String a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(74893);
    }

    public static void a(final AbstractC2964a aVar) {
        com.ss.android.b.a.a.a.a(new Runnable() {
            /* class com.ss.android.ugc.aweme.profile.edit.api.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74894);
            }

            public final void run() {
                try {
                    String a2 = aVar.a();
                    if (a2 != null && a2.length() > 0 && new JSONObject(a2).getString("status_code").equals("0")) {
                        aVar.b();
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                aVar.c();
            }
        });
    }
}

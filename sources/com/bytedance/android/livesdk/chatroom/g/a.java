package com.bytedance.android.livesdk.chatroom.g;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.m;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(8564);
    }

    public static void a(final Activity activity, final String str, final m mVar) {
        b.a aVar = new b.a(activity);
        aVar.a(R.string.gpb).b(R.string.gp_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.bytedance.android.livesdk.chatroom.g.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(8566);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }, false).a(R.string.gpa, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.bytedance.android.livesdk.chatroom.g.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8565);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                Activity activity = activity;
                String str = str;
                ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).startBindMobileFullFragment(activity, "live_detail", "live_detail", mVar);
                HashMap hashMap = new HashMap();
                hashMap.put("bind_page_source", str);
                b.a.a("livesdk_phone_bind_page_show").a((Map<String, String>) hashMap).a().b();
            }
        }, false).f18296m = false;
        aVar.a().show();
    }
}

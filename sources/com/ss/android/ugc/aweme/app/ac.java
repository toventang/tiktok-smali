package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import h.f.b.l;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66538a = new a((byte) 0);

    static {
        Covode.recordClassIndex(40892);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40893);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        public static Intent a(Activity activity, Intent intent, String str) {
            l.d(activity, "");
            if (!f.f34638m) {
                Intent intent2 = new Intent();
                m.a(intent2, activity, d.f34605l);
                a(activity, intent2);
            }
            Intent intent3 = new Intent(activity, PushLoginActivity.class);
            if (intent != null) {
                intent3.putExtra("next_step", intent);
            }
            intent3.putExtra("multi_account_push_uid", str);
            return intent3;
        }
    }
}

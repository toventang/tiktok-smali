package com.ss.android.ugc.aweme.friends.i;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f96898a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(61486);
    }

    private static void a(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    private static void a(Context context, int i2) {
        if (!(context instanceof e)) {
            context = null;
        }
        e eVar = (e) context;
        if (eVar != null) {
            new b(eVar).e(i2).b();
        }
    }

    private static Intent b(Context context, String str, String str2) {
        int i2 = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(String.valueOf(str))));
        intent.putExtra("sms_body", str2);
        intent.setPackage(Telephony.Sms.getDefaultSmsPackage(context));
        return intent;
    }

    public static final boolean a(Context context, String str, String str2, int i2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        if (str.length() > 0 && str2.length() > 0) {
            Intent b2 = b(context, str, str2);
            if (com.ss.android.ugc.aweme.ao.b.a(context, b2)) {
                a(context, b2);
                com.ss.android.ugc.aweme.friends.d.a.a(str);
                return true;
            }
        }
        a(context, i2);
        return false;
    }
}

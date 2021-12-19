package com.ss.android.ugc.aweme.profile;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.profile.experiment.l;
import com.ss.android.ugc.aweme.s.e;
import com.zhiliaoapp.musically.R;

public final class af {
    static {
        Covode.recordClassIndex(74783);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return " ";
        }
        return str;
    }

    public static void a(Context context) {
        long g2 = e.g();
        if (g2 != -1) {
            p.f107614a.postDelayed(new ag(context), g2);
            return;
        }
        c.a(context, "profile_fragment_user_mt");
        c.a(context, "profile_fragment_aweme_list_mus");
    }

    public static void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText(R.string.g0r);
            return;
        }
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        textView.setText(str);
    }

    public static void a(g gVar, Integer num, int i2) {
        if (l.f116366a && num != null && num.intValue() == 1000 && i2 == 0) {
            gVar.a("filter_private", 1);
        }
    }
}

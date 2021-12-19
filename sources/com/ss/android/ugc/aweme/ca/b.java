package com.ss.android.ugc.aweme.ca;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.a.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.experiment.bg;
import com.ss.android.ugc.aweme.logger.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f69592a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(42932);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f69593a;

        static {
            Covode.recordClassIndex(42933);
        }

        public a(Context context) {
            this.f69593a = context;
        }

        public final void run() {
            String str;
            a.b.f109011a.a("method_class_preload_duration", false);
            try {
                com.bytedance.common.a.b.a.a(this.f69593a, false);
                a.C0573a a2 = com.bytedance.common.a.b.a.a();
                a2.f26702a = "creative_launch";
                a2.f26703b = new StringBuilder().append(d.d()).toString();
                int a3 = bg.a();
                if (a3 == 1) {
                    str = "snapboost_list_coldboot_top200.txt";
                } else if (a3 == 2) {
                    str = "snapboost_list_coldboot_top400.txt";
                } else if (a3 == 3) {
                    str = "snapboost_list_coldboot_top600.txt";
                } else if (a3 != 4) {
                    str = "";
                } else {
                    str = "snapboost_list_coldboot_top800.txt";
                }
                if (!TextUtils.isEmpty(str)) {
                    a2.f26708g.add(str);
                }
                a2.f26704c = false;
                a2.f26706e = true;
                a2.a().a();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            a.b.f109011a.b("method_class_preload_duration", false);
        }
    }
}

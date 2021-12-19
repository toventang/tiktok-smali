package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.util.bj;

public final class bk {

    public interface a {
        static {
            Covode.recordClassIndex(84710);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(84709);
    }

    private static boolean a(Context context) {
        if (c.D.c().a(context) == 0) {
            return true;
        }
        return false;
    }

    public static void a(Context context, a aVar) {
        if (!(context instanceof e)) {
            bj.b("reuse mv is not fragment activity:".concat(String.valueOf(context)));
            aVar.a();
        } else if (a(context)) {
            bj.a("reuse mv get permission succ");
            aVar.a();
        } else if (!c.D.c().a()) {
            aVar.a();
        } else {
            bj.a("reuse mv support runtime permission");
            c.C.b().a((e) context, new bl(aVar, context), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}

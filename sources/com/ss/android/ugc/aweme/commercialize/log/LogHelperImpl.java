package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.metrics.ap;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.story.live.d;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.HashMap;

public final class LogHelperImpl implements LogHelper {
    static {
        Covode.recordClassIndex(46068);
    }

    public static LogHelper a() {
        MethodCollector.i(9908);
        Object a2 = b.a(LogHelper.class, false);
        if (a2 != null) {
            LogHelper logHelper = (LogHelper) a2;
            MethodCollector.o(9908);
            return logHelper;
        }
        if (b.ar == null) {
            synchronized (LogHelper.class) {
                try {
                    if (b.ar == null) {
                        b.ar = new LogHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9908);
                    throw th;
                }
            }
        }
        LogHelperImpl logHelperImpl = (LogHelperImpl) b.ar;
        MethodCollector.o(9908);
        return logHelperImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("ui_type", "normal_type");
        r.a("live_merge_show", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(String str, RecyclerView recyclerView) {
        l.d(str, "");
        l.d(recyclerView, "");
        da.a.a(str).a(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("ui_type", str2);
        r.a("enter_live_merge", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        ab.a("follow_approve").b("enter_from", str).b("to_user_id", str2).f();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        ab.a("follow_refuse").b("enter_from", str).b("to_user_id", str2).f();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        ap apVar = new ap(str);
        apVar.aa = str2;
        apVar.f();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        q qVar = (q) new q().o(str).a(str3);
        qVar.q = str2;
        qVar.ab = -2;
        qVar.f();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(Context context, String str, String str2, long j2) {
        l.d(context, "");
        l.d(str2, "");
        d.a(1, str2, j2, d.a("message", "head", str));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        v a2 = new v(str).a(str2);
        a2.f109608e = str3;
        a2.f109605b = str4;
        a2.f109606c = str5;
        a2.u = str6;
        a2.f();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void a(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        v a2 = new v().a(str);
        a2.f109605b = str2;
        a2.f109606c = str3;
        a2.s = str4;
        a2.f109608e = str5;
        a2.v = str6;
        a2.aa = i2;
        a2.f();
    }
}

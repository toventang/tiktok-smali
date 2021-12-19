package com.ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import android.util.Log;
import beancopy.ConvertHelp;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f91940a = ("pb_convert_flag" + d.h());

    static {
        Covode.recordClassIndex(57892);
    }

    static String a() {
        if (t.a()) {
            return t.b();
        }
        return null;
    }

    public static FeedItemList a(com.ss.android.ugc.aweme.app.api.c.c<aweme_v2_feed_response, FeedItemList> cVar, o oVar) {
        return cVar.a(new d(oVar));
    }

    static final /* synthetic */ FeedItemList a(o oVar, aweme_v2_feed_response aweme_v2_feed_response) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelp.com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(aweme_v2_feed_response, null);
            if (oVar.f91959g.intValue() == 8) {
                com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = aweme_v2_feed_response;
            }
            e.f91942a = SystemClock.elapsedRealtime() - elapsedRealtime;
            return com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            n.a("service_monitor", "log_bean_copy_convert_error", new com.ss.android.ugc.aweme.app.f.c().a("errMsg", Log.getStackTraceString(th)).a());
            a aVar = new a(th);
            a.a((Throwable) aVar);
            b.a(aVar);
            String stackTraceString = Log.getStackTraceString(new com.ss.android.ugc.aweme.u.d("NOT A CRASH !!!", aVar));
            l.b(stackTraceString, "");
            com.ss.android.ugc.aweme.u.b.a(stackTraceString);
            com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.framework.d.a.f96678a, "pb_convert_flag", 0).edit().clear().putBoolean(f91940a, true).commit();
            return FeedApi.a(oVar, false);
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.utils;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.o;

public final class ReportFeedAdAction {

    /* renamed from: a  reason: collision with root package name */
    public static final ReportFeedAdAction f75507a = new ReportFeedAdAction();

    /* renamed from: b  reason: collision with root package name */
    private static final RetrofitApi f75508b = ((RetrofitApi) RetrofitFactory.a().b(b.f59141e).d().a(RetrofitApi.class));

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(46592);
        }

        @o(a = "/api/ad/v1/ack_action/")
        @e
        i<Object> reportAction(@c(a = "item_id") String str, @c(a = "ad_id") long j2, @c(a = "creative_id") long j3, @c(a = "log_extra") String str2, @c(a = "action_extra") String str3, @c(a = "action_type") int i2);
    }

    private ReportFeedAdAction() {
    }

    static {
        Covode.recordClassIndex(46591);
    }

    public static void a(String str) {
        if (str == null) {
            str = "";
        }
        l.d(str, "");
    }
}

package com.ss.android.ugc.aweme.push;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import l.b.c;
import l.b.e;
import l.b.o;

public interface LivePushApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118849a = a.f118850a;

    static {
        Covode.recordClassIndex(77203);
    }

    @o(a = "/cloudpush/callback/in_app_notification/")
    @e
    i<BaseResponse> reportLiveInnerPush(@c(a = "client_time") Long l2, @c(a = "rule_id") Long l3, @c(a = "group_id") Long l4, @c(a = "sender") String str, @c(a = "gd_label") String str2, @c(a = "o_url") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f118850a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(77204);
        }
    }
}

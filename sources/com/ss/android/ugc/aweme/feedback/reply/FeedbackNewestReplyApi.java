package com.ss.android.ugc.aweme.feedback.reply;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b;
import l.b.f;

public final class FeedbackNewestReplyApi {

    /* renamed from: a  reason: collision with root package name */
    public static Api f95387a = ((Api) RetrofitFactory.a().b(com.ss.android.ugc.aweme.app.api.Api.f66569d).d().a(Api.class));

    /* renamed from: b  reason: collision with root package name */
    public static final a f95388b = new a((byte) 0);

    interface Api {
        static {
            Covode.recordClassIndex(60406);
        }

        @f(a = "/api/feedback/v1/newest_reply/")
        b<e> getNewestReply();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60407);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60405);
    }
}

package com.ss.android.ugc.aweme.feedback.reply;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi;
import h.f.b.l;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final FeedbackNewestReplyApi.a f95392a;

    static {
        Covode.recordClassIndex(60410);
    }

    c(FeedbackNewestReplyApi.a aVar) {
        this.f95392a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        T t = FeedbackNewestReplyApi.f95387a.getNewestReply().execute().f42630b;
        l.b(t, "");
        return t;
    }
}

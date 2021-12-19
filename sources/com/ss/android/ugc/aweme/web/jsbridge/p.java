package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    private final FeedbackUploadALog f145046a;

    static {
        Covode.recordClassIndex(94838);
    }

    p(FeedbackUploadALog feedbackUploadALog) {
        this.f145046a = feedbackUploadALog;
    }

    @Override // b.g
    public final Object then(i iVar) {
        if (!iVar.a() || TextUtils.isEmpty((CharSequence) iVar.d())) {
            return FeedbackUploadALog.a("null");
        }
        return FeedbackUploadALog.a((String) iVar.d());
    }
}

package com.ss.android.ugc.aweme.shortvideo.view;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final HashTagMentionEditText f132662a;

    static {
        Covode.recordClassIndex(86797);
    }

    l(HashTagMentionEditText hashTagMentionEditText) {
        this.f132662a = hashTagMentionEditText;
    }

    public final void run() {
        this.f132662a.setCursorVisible(true);
    }
}

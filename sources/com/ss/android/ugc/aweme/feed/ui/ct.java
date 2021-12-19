package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.cc;
import com.ss.android.ugc.aweme.views.MentionTextView;

final /* synthetic */ class ct implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cc.AnonymousClass2 f94508a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94509b;

    static {
        Covode.recordClassIndex(60008);
    }

    ct(cc.AnonymousClass2 r1, int i2) {
        this.f94508a = r1;
        this.f94509b = i2;
    }

    public final void run() {
        cc.AnonymousClass2 r4 = this.f94508a;
        int i2 = this.f94509b;
        MentionTextView mentionTextView = cc.this.f94465d;
        boolean z = cc.f94462a;
        int lineCount = cc.this.f94465d.getLineCount();
        if (z) {
            lineCount = Math.min(i2, lineCount);
        }
        mentionTextView.setLines(lineCount);
    }
}

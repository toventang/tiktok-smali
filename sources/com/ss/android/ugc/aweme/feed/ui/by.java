package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.MentionTextView;

/* access modifiers changed from: package-private */
public final /* synthetic */ class by implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MentionTextView f94455a;

    static {
        Covode.recordClassIndex(59982);
    }

    by(MentionTextView mentionTextView) {
        this.f94455a = mentionTextView;
    }

    public final void run() {
        MentionTextView mentionTextView = this.f94455a;
        if (mentionTextView.getLineCount() != 0) {
            mentionTextView.setLines(mentionTextView.getLineCount());
        }
    }
}

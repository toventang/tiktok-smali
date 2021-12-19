package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.x.af;
import com.ss.android.ugc.aweme.views.MentionTextView;

final /* synthetic */ class bx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bv f94452a;

    /* renamed from: b  reason: collision with root package name */
    private final MentionTextView f94453b;

    /* renamed from: c  reason: collision with root package name */
    private final int f94454c;

    static {
        Covode.recordClassIndex(59981);
    }

    bx(bv bvVar, MentionTextView mentionTextView, int i2) {
        this.f94452a = bvVar;
        this.f94453b = mentionTextView;
        this.f94454c = i2;
    }

    public final void run() {
        bv bvVar = this.f94452a;
        MentionTextView mentionTextView = this.f94453b;
        int i2 = this.f94454c;
        bvVar.n = mentionTextView.getHeight();
        bvVar.f94436m = (bvVar.n * i2) / af.b();
        if (bv.f94424a) {
            bvVar.f94430f.setTruncatedTransTextHeight(bvVar.n);
            bvVar.f94430f.setFullTransTextHeight(bvVar.f94436m);
        }
    }
}

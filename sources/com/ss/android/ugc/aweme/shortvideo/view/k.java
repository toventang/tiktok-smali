package com.ss.android.ugc.aweme.shortvideo.view;

import android.text.Editable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final HashTagMentionEditText f132659a;

    /* renamed from: b  reason: collision with root package name */
    private final int f132660b;

    /* renamed from: c  reason: collision with root package name */
    private final Editable f132661c;

    static {
        Covode.recordClassIndex(86796);
    }

    k(HashTagMentionEditText hashTagMentionEditText, int i2, Editable editable) {
        this.f132659a = hashTagMentionEditText;
        this.f132660b = i2;
        this.f132661c = editable;
    }

    public final void run() {
        this.f132659a.setSelection(Math.min(this.f132660b, this.f132661c.length()));
    }
}

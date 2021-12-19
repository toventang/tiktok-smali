package com.google.android.play.core.a;

import android.app.Activity;
import android.content.IntentSender;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.a;

final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f52703a;

    static {
        Covode.recordClassIndex(32641);
    }

    g(Activity activity) {
        this.f52703a = activity;
    }

    @Override // com.google.android.play.core.common.a
    public final void a(IntentSender intentSender, int i2) {
        this.f52703a.startIntentSenderForResult(intentSender, i2, null, 0, 0, 0, null);
    }
}

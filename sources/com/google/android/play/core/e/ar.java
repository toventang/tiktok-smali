package com.google.android.play.core.e;

import android.app.Activity;
import android.content.IntentSender;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.a;

final class ar implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f53252a;

    static {
        Covode.recordClassIndex(32912);
    }

    ar(Activity activity) {
        this.f53252a = activity;
    }

    @Override // com.google.android.play.core.common.a
    public final void a(IntentSender intentSender, int i2) {
        this.f53252a.startIntentSenderForResult(intentSender, i2, null, 0, 0, 0);
    }
}

package com.bytedance.android.livesdk.chatroom.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class dr implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    private final dq f16177a;

    static {
        Covode.recordClassIndex(8947);
    }

    dr(dq dqVar) {
        this.f16177a = dqVar;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        return this.f16177a.a(i2);
    }
}

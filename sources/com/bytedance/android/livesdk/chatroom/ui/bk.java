package com.bytedance.android.livesdk.chatroom.ui;

import android.view.KeyEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bk implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15970a;

    static {
        Covode.recordClassIndex(8835);
    }

    bk(bg bgVar) {
        this.f15970a = bgVar;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        bg bgVar = this.f15970a;
        if (66 != i2 || 1 != keyEvent.getAction()) {
            return false;
        }
        bgVar.e();
        return true;
    }
}

package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bi implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15968a;

    static {
        Covode.recordClassIndex(8833);
    }

    bi(bg bgVar) {
        this.f15968a = bgVar;
    }

    public final void onClick(View view) {
        bg bgVar = this.f15968a;
        if (bgVar.q != null) {
            bgVar.q.e();
        } else {
            bgVar.e();
        }
    }
}

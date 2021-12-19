package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bp implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15980a;

    static {
        Covode.recordClassIndex(8840);
    }

    bp(bg bgVar) {
        this.f15980a = bgVar;
    }

    public final void onClick(View view) {
        bg bgVar = this.f15980a;
        if (bgVar.q != null) {
            bgVar.q.e();
        }
    }
}

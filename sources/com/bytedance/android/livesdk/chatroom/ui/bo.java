package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15978a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15979b;

    static {
        Covode.recordClassIndex(8839);
    }

    bo(bg bgVar, int i2) {
        this.f15978a = bgVar;
        this.f15979b = i2;
    }

    public final void onClick(View view) {
        bg bgVar = this.f15978a;
        int i2 = this.f15979b;
        bgVar.a(i2);
        bgVar.n.setCurrentItem(i2);
    }
}

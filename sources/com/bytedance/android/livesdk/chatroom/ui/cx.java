package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.b;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class cx implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final br.AnonymousClass17 f16082a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16083b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16084c;

    static {
        Covode.recordClassIndex(8903);
    }

    cx(br.AnonymousClass17 r1, int i2, String str) {
        this.f16082a = r1;
        this.f16083b = i2;
        this.f16084c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        br.AnonymousClass17 r2 = this.f16082a;
        int i3 = this.f16083b;
        String str = this.f16084c;
        dialogInterface.dismiss();
        br.this.a("user cancel, frame_fail", 208, (long) i3);
        Event event = new Event("live_play_enter_room_fail", 33807, b.ServerApiCall);
        event.a("enter room api return fail.You are live broadcasting dialog click cancel. error_code: " + i3 + ", error_prompt: " + str);
        f.a.f23366a.a().a(event);
        br.this.a(br.a.ENTER_FAILED);
    }
}

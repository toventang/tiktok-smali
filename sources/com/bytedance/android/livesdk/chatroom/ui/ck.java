package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdk.event.e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ck implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16068a;

    /* renamed from: b  reason: collision with root package name */
    private final e f16069b;

    static {
        Covode.recordClassIndex(8890);
    }

    ck(br brVar, e eVar) {
        this.f16068a = brVar;
        this.f16069b = eVar;
    }

    public final void run() {
        br brVar = this.f16068a;
        e eVar = this.f16069b;
        brVar.a(br.a.JUMP_TO_OTHER);
        if (brVar.at != null) {
            brVar.at.a(eVar.f17189c, eVar.f17190d, eVar.f17187a);
        }
    }
}

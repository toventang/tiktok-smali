package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdk.chatroom.detail.j;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class cw implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final br.AnonymousClass17 f16081a;

    static {
        Covode.recordClassIndex(8902);
    }

    cw(br.AnonymousClass17 r1) {
        this.f16081a = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        br.AnonymousClass17 r1 = this.f16081a;
        if (br.this.u != null) {
            f.a(br.this.u.f15235b);
        }
        if (br.this.s != null) {
            j jVar = br.this.s;
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "live_detail");
            hashMap.put("event_module", "popup");
            hashMap.put("live_type", jVar.x);
            hashMap.put("request_id", jVar.f15274e);
            hashMap.put("log_pb", jVar.f15275f);
            b.a.a("crash_popup_click_over").a((Map<String, String>) hashMap).b();
        }
    }
}

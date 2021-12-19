package com.bytedance.android.livesdk.a;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f13278a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f13279b;

    static {
        Covode.recordClassIndex(7390);
    }

    i(f fVar, Map map) {
        this.f13278a = fVar;
        this.f13279b = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        f fVar = this.f13278a;
        Map<String, String> map = this.f13279b;
        String str = "activity_banned_talk".equals(fVar.f13270j) ? "livesdk_anchor_mute_cancel_toast_click" : "livesdk_anchor_blocklist_cancel_toast_click";
        map.put("action_type", "no");
        b.a.a(str).a(map).b();
        dialogInterface.dismiss();
    }
}

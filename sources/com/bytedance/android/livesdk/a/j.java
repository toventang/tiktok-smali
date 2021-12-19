package com.bytedance.android.livesdk.a;

import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.s.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f13280a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f13281b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13282c;

    /* renamed from: d  reason: collision with root package name */
    private final User f13283d;

    static {
        Covode.recordClassIndex(7391);
    }

    j(f fVar, Map map, String str, User user) {
        this.f13280a = fVar;
        this.f13281b = map;
        this.f13282c = str;
        this.f13283d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        f fVar = this.f13280a;
        Map<String, String> map = this.f13281b;
        String str = this.f13282c;
        User user = this.f13283d;
        String str2 = "activity_banned_talk".equals(fVar.f13270j) ? "livesdk_anchor_mute_cancel_toast_click" : "livesdk_anchor_blocklist_cancel_toast_click";
        map.put("action_type", "yes");
        b.a.a(str2).a(map).b();
        fVar.f13264d.setVisibility(0);
        fVar.f13262b.setVisibility(8);
        if (str.equals("activity_kick_out")) {
            ((e) a.a(e.class)).kickOut(fVar, false, fVar.f13272l, user.getId());
        } else {
            ((e) a.a(e.class)).unmuteUser(user, fVar.f13272l, fVar);
        }
        dialogInterface.dismiss();
    }
}

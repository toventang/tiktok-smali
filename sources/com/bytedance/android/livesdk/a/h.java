package com.bytedance.android.livesdk.a;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.s.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import java.util.Map;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f13276a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13277b;

    static {
        Covode.recordClassIndex(7389);
    }

    h(f fVar, int i2) {
        this.f13276a = fVar;
        this.f13277b = i2;
    }

    public final void onClick(View view) {
        String str;
        int i2;
        String str2;
        String str3;
        f fVar = this.f13276a;
        int i3 = this.f13277b;
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = f.e();
        }
        if (!j.f107226e) {
            ao.a(fVar.f13268h, (int) R.string.efp);
        } else {
            User user = fVar.f13269i.get(i3);
            String str4 = fVar.f13270j;
            if (user != null) {
                fVar.f13271k = user;
                String a2 = TextUtils.isEmpty(f.a(user)) ? "" : f.a(user);
                if (str4.equals("activity_banned_talk")) {
                    str = fVar.f13268h.getString(R.string.e5u, a2);
                    i2 = R.string.dyy;
                } else {
                    str = fVar.f13268h.getString(R.string.glf) + " " + a2 + " " + fVar.f13268h.getString(R.string.glh);
                    i2 = R.string.ebj;
                }
                Map<String, String> f2 = fVar.f();
                f2.put("user_id", user.getIdStr());
                b.a aVar = new b.a(fVar.f13268h);
                aVar.f18285b = str;
                aVar.b(R.string.ebi, (DialogInterface.OnClickListener) new i(fVar, f2), false).a(i2, (DialogInterface.OnClickListener) new j(fVar, f2, str4, user), false).a().show();
                if ("activity_banned_talk".equals(fVar.f13270j)) {
                    str2 = "livesdk_anchor_mute_cancel_toast_show";
                } else {
                    str2 = "livesdk_anchor_blocklist_cancel_toast_show";
                }
                b.a.a(str2).a(f2).b();
                ((e) a.a(e.class)).getMuteDuration().d(new k(fVar, user, u.a().b().c() == fVar.f13273m ? "anchor" : "admin"));
            }
        }
        Map<String, String> f3 = fVar.f();
        f3.put("user_id", fVar.f13269i.get(i3).getIdStr());
        if ("activity_banned_talk".equals(fVar.f13270j)) {
            str3 = "livesdk_anchor_mute_cancel_click";
        } else {
            str3 = "livesdk_anchor_blocklist_cancel_click";
        }
        b.a.a(str3).a(f3).b();
    }
}

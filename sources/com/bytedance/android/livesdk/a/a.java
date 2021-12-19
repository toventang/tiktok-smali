package com.bytedance.android.livesdk.a;

import android.view.View;
import com.bytedance.android.live.adminsetting.b;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public class a implements b {
    static {
        Covode.recordClassIndex(7380);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public v getAdminSettingDialog() {
        return new l();
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public t getMuteConfirmDialog(h.f.a.b<? super j, z> bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
        t tVar = new t();
        tVar.f13368a = bVar;
        return tVar;
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public q getMuteDurationSettingFragment(View.OnClickListener onClickListener, h.f.a.b<? super j, z> bVar) {
        l.d(onClickListener, "");
        l.d(bVar, "");
        l.d(onClickListener, "");
        l.d(bVar, "");
        q qVar = new q();
        qVar.f13348b = onClickListener;
        qVar.f13349c = bVar;
        return qVar;
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public void reportDefaultMuteDurationChange(String str, j jVar, String str2, long j2, Long l2) {
        l.d(str, "");
        l.d(jVar, "");
        l.d(str2, "");
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_mute_default_select").a("admin_type", str).a("default_mute_set", jVar.f7925a).a("event_page", str2).a("anchor_id", j2);
        if (l2 != null) {
            a2.a("room_id", (Number) l2);
        }
        a2.b();
    }
}

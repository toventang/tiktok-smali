package com.bytedance.android.live.adminsetting;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public class a implements b {
    static {
        Covode.recordClassIndex(3522);
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public v getAdminSettingDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public d getMuteConfirmDialog(b<? super j, z> bVar) {
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public Fragment getMuteDurationSettingFragment(View.OnClickListener onClickListener, b<? super j, z> bVar) {
        l.d(onClickListener, "");
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.adminsetting.b
    public void reportDefaultMuteDurationChange(String str, j jVar, String str2, long j2, Long l2) {
        l.d(str, "");
        l.d(jVar, "");
        l.d(str2, "");
    }
}

package com.bytedance.android.live.adminsetting;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import h.z;

public interface b extends a {
    static {
        Covode.recordClassIndex(3523);
    }

    v getAdminSettingDialog();

    d getMuteConfirmDialog(h.f.a.b<? super j, z> bVar);

    Fragment getMuteDurationSettingFragment(View.OnClickListener onClickListener, h.f.a.b<? super j, z> bVar);

    void reportDefaultMuteDurationChange(String str, j jVar, String str2, long j2, Long l2);
}

package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PermissionSettingItem f131373a;

    static {
        Covode.recordClassIndex(86074);
    }

    ab(PermissionSettingItem permissionSettingItem) {
        this.f131373a = permissionSettingItem;
    }

    public final void run() {
        this.f131373a.f99003g.setText(R.string.f0f);
    }
}

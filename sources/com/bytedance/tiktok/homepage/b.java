package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final MainActivity f44121a;

    static {
        Covode.recordClassIndex(27036);
    }

    public b(MainActivity mainActivity) {
        this.f44121a = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        MainActivity mainActivity = this.f44121a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_to_ba", true);
        ProfileEditActivity.a(mainActivity, bundle);
    }
}

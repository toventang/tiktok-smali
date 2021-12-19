package com.bytedance.android.livesdk.lynx;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class f implements c {
    static {
        Covode.recordClassIndex(11110);
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public b create(Activity activity, Integer num, String str, d dVar, String str2) {
        l.d(activity, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public b createAndLoad(Activity activity, String str, Integer num, String str2, String str3, d dVar) {
        l.d(activity, "");
        l.d(str, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public Fragment createLynxFragment(Context context, Bundle bundle) {
        l.d(context, "");
        l.d(bundle, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public void tryInitEnvIfNeeded() {
    }
}

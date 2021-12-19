package com.ss.android.ugc.aweme.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import h.f.b.l;

public final class d extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(93827);
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Activity j2 = f.j();
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "android.media.AUDIO_BECOMING_NOISY") && (j2 instanceof e)) {
            HomePageDataViewModel.a.a((e) j2).f99126i.postValue("on_ear_phone_unplug");
            a.b("EarPhoneUnplugReceiver", "Received BECOMING_NOISY Broadcast");
        }
    }
}

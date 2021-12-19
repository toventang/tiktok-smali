package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.ttep.ac;
import h.f.b.l;

public final class e {
    static {
        Covode.recordClassIndex(86398);
    }

    public static final String[] a(Intent intent) {
        l.d(intent, "");
        boolean a2 = gs.a();
        boolean a3 = ac.a(intent);
        if (a2 || a3) {
            return new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        }
        return new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }
}

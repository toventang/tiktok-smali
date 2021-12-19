package com.ss.android.ugc.aweme.launcher.service.mob;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public interface IMobLaunchApi {
    static {
        Covode.recordClassIndex(68650);
    }

    void a(String str);

    void a(String str, Uri uri, boolean z);

    void a(boolean z);

    void b(String str);
}

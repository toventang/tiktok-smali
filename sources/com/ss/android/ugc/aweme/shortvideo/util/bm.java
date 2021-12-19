package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    public static final bm f132269a = new bm();

    private bm() {
    }

    static {
        Covode.recordClassIndex(86629);
    }

    public static String a(int i2) {
        Resources resources = d.a().getResources();
        String uri = Uri.parse("android.resource://" + resources.getResourcePackageName(i2) + "/" + resources.getResourceTypeName(i2) + "/" + resources.getResourceEntryName(i2)).toString();
        l.b(uri, "");
        return uri;
    }
}

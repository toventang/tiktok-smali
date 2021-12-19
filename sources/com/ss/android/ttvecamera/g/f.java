package com.ss.android.ttvecamera.g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.e.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f extends e {

    /* renamed from: d  reason: collision with root package name */
    private static String f61550d = ((String) c.a("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"}));

    /* renamed from: e  reason: collision with root package name */
    private static List<String> f61551e = new ArrayList();

    static {
        Covode.recordClassIndex(37884);
        Collections.addAll(f61551e, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public f(Context context) {
        super(context);
    }
}

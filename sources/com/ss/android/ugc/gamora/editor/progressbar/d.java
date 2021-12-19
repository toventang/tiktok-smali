package com.ss.android.ugc.gamora.editor.progressbar;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.ad;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f146358a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f146359b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(96212);
    }

    public static final boolean a() {
        if (ad.a() || f146358a) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if ((ad.d() || ad.e()) && !f146358a) {
            return true;
        }
        return false;
    }
}

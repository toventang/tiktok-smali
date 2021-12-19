package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.i;
import java.util.List;

public final class fh {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f118546a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final fh f118547b = new fh();

    private fh() {
    }

    static {
        Covode.recordClassIndex(76992);
    }

    public static final List<String> a() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("video_size_category", String[].class, f118546a);
            if (strArr != null) {
                return i.j(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

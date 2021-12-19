package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.i;
import java.util.List;

public final class ce {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f118401a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final ce f118402b = new ce();

    private ce() {
    }

    static {
        Covode.recordClassIndex(76902);
    }

    public static final List<String> a() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("upload_video_size_category", String[].class, f118401a);
            if (strArr != null) {
                return i.j(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

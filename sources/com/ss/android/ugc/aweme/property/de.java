package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.i;
import java.util.List;

public final class de {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f118441a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final de f118442b = new de();

    private de() {
    }

    static {
        Covode.recordClassIndex(76932);
    }

    public static final List<String> a() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("qa_sticker_regular", String[].class, f118441a);
            if (strArr != null) {
                return i.j(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

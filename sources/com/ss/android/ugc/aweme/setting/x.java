package com.ss.android.ugc.aweme.setting;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.z;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final EoyHighlightConfig f123066a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final EoyHighlightConfig f123067b = ((EoyHighlightConfig) SettingsManager.a().a("eoy_highlight_config", EoyHighlightConfig.class, f123066a));

    /* renamed from: c  reason: collision with root package name */
    public static final x f123068c = new x();

    private x() {
    }

    public static boolean a() {
        EoyHighlightConfig eoyHighlightConfig = f123067b;
        if (eoyHighlightConfig != null) {
            return eoyHighlightConfig.isEoyCampaign();
        }
        return false;
    }

    public static List<String> c() {
        List<String> text;
        EoyHighlightConfig eoyHighlightConfig = f123067b;
        if (eoyHighlightConfig == null || (text = eoyHighlightConfig.getText()) == null) {
            return z.INSTANCE;
        }
        return text;
    }

    public static String d() {
        EoyHighlightConfig eoyHighlightConfig = f123067b;
        if (eoyHighlightConfig != null) {
            return eoyHighlightConfig.getHubUrl();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(80829);
    }

    public static Integer b() {
        String str;
        boolean z;
        EoyHighlightConfig eoyHighlightConfig = f123067b;
        if (eoyHighlightConfig != null) {
            str = eoyHighlightConfig.getColor();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }
}

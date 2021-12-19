package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.m.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f122677a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final t f122678b = new t();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f122679c = SettingsManager.a().a("enable_eoy_prop", true);

    private t() {
    }

    static {
        Covode.recordClassIndex(80523);
    }

    public static boolean a(String str) {
        EoyHighlightConfig eoyHighlightConfig;
        List<String> text;
        if (!f122679c || str == null || str.length() == 0 || (eoyHighlightConfig = x.f123067b) == null || (text = eoyHighlightConfig.getText()) == null || ((text instanceof Collection) && text.isEmpty())) {
            return false;
        }
        Iterator<T> it = text.iterator();
        while (it.hasNext()) {
            if (p.a((CharSequence) str, (CharSequence) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}

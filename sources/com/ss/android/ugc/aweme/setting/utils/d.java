package com.ss.android.ugc.aweme.setting.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dc.a;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.setting.serverpush.ui.g;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f123036a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(80793);
    }

    public static final void a(dm dmVar, List<String> list) {
        l.d(dmVar, "");
        l.d(list, "");
        List<a<?>> a2 = dmVar.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            a<?> aVar = a2.get(i2);
            if (aVar instanceof com.ss.android.ugc.aweme.setting.unit.a.a) {
                Object obj = ((com.ss.android.ugc.aweme.setting.ui.b.a) aVar.l()).f122836f;
                if (obj == null) {
                    aVar.a(false);
                } else if (obj instanceof String) {
                    if (!TextUtils.isEmpty((CharSequence) obj) && !list.contains(obj)) {
                        aVar.a(false);
                    }
                } else if (obj instanceof g.a) {
                    String str = ((g.a) obj).f122630a;
                    if (!TextUtils.isEmpty(str) && !list.contains(str)) {
                        aVar.a(false);
                    }
                }
            }
        }
    }
}

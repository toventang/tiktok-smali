package com.ss.android.ugc.aweme.share.silent.b;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b {
    static {
        Covode.recordClassIndex(81633);
    }

    private static final String a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static final String a(String str, List<? extends Object> list) {
        String str2;
        l.d(list, "");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            String a2 = a(t);
            sb.append(a2);
            if (a2.length() > 0 && i2 != list.size() - 1) {
                if (str == null) {
                    str2 = ",";
                } else {
                    str2 = str;
                }
                sb.append(str2);
            }
            i2 = i3;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}

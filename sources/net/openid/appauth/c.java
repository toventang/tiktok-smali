package net.openid.appauth;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;

/* access modifiers changed from: package-private */
public final class c {
    static {
        Covode.recordClassIndex(106069);
    }

    public static String a(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : iterable) {
            p.a(!TextUtils.isEmpty(str), "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }
}

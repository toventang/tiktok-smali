package com.bytedance.android.live.core.f.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class h {
    static {
        Covode.recordClassIndex(4605);
    }

    /* access modifiers changed from: package-private */
    public static class a extends HashMap<String, Object> {
        static {
            Covode.recordClassIndex(4606);
        }

        private a(String str, Object obj) {
            put(str, obj);
        }

        /* synthetic */ a(String str, Object obj, byte b2) {
            this(str, obj);
        }
    }

    public static void a(View view, Object obj) {
        a(view, "DraweeHolder", obj);
    }

    public static Object a(View view, String str) {
        Object obj;
        if (view == null) {
            return null;
        }
        Object tag = view.getTag();
        if (!(tag instanceof a) || (obj = ((a) tag).get(str)) == null) {
            return null;
        }
        return obj;
    }

    public static boolean a(View view, String str, Object obj) {
        if (view == null) {
            return false;
        }
        Object tag = view.getTag();
        if (tag instanceof a) {
            ((a) tag).put(str, obj);
            return true;
        }
        view.setTag(new a(str, obj, (byte) 0));
        return true;
    }
}

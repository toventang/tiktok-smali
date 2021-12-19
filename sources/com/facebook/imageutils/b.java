package com.facebook.imageutils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.soloader.SoLoader;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f48470a;

    public interface a {
        static {
            Covode.recordClassIndex(29231);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(29230);
    }

    public static void a(Context context) {
        if (f48470a == null) {
            SoLoader.a(context);
        }
    }

    public static void a(String str) {
        a aVar = f48470a;
        if (aVar != null) {
            aVar.a(str);
        } else {
            SoLoader.a(str);
        }
    }
}

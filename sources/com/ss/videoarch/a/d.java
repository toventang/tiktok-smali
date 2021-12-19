package com.ss.videoarch.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f154256a = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static a f154257b;

    public interface a {
        static {
            Covode.recordClassIndex(102853);
        }
    }

    static {
        Covode.recordClassIndex(102852);
    }

    public static void a(String str) {
        a aVar = f154257b;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("Invalid library name.");
        } else if (aVar == null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a(str, false, (Context) null);
            m.a(uptimeMillis, str);
        }
    }
}

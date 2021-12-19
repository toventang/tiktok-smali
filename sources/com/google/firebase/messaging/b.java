package com.google.firebase.messaging;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f54602a = TimeUnit.MINUTES.toMillis(3);

    static {
        Covode.recordClassIndex(33877);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(33878);
        }

        public static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }
}

package com.linecorp.linesdk.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.linecorp.a.a.a.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final b f54970a = new b("com.linecorp.linesdk.sharedpreference.encryptionsalt");

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f54971b = false;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Context f54972a;

        static {
            Covode.recordClassIndex(34525);
        }

        public final void run() {
            c.f54970a.a(this.f54972a);
        }

        public a(Context context) {
            this.f54972a = context;
        }
    }

    static {
        Covode.recordClassIndex(34524);
    }
}

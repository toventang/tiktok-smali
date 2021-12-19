package com.bytedance.common.utility.b;

import android.os.AsyncTask;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0577a f26887a = new b((byte) 0);

    /* renamed from: com.bytedance.common.utility.b.a$a  reason: collision with other inner class name */
    public static class C0577a {
        static {
            Covode.recordClassIndex(15874);
        }

        private C0577a() {
        }

        /* synthetic */ C0577a(byte b2) {
            this();
        }

        public <T> void a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static class b extends C0577a {
        static {
            Covode.recordClassIndex(15875);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.common.utility.b.a.C0577a
        public final <T> void a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(c.f26891a, tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(15873);
        int i2 = Build.VERSION.SDK_INT;
    }
}

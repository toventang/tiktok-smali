package androidx.i.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public interface c {

    /* renamed from: androidx.i.a.c$c  reason: collision with other inner class name */
    public interface AbstractC0047c {
        static {
            Covode.recordClassIndex(1155);
        }

        c a(b bVar);
    }

    static {
        Covode.recordClassIndex(1151);
    }

    b a();

    void a(boolean z);

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f3209a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3210b;

        /* renamed from: c  reason: collision with root package name */
        public final a f3211c;

        static {
            Covode.recordClassIndex(1153);
        }

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f3212a;

            /* renamed from: b  reason: collision with root package name */
            public String f3213b;

            /* renamed from: c  reason: collision with root package name */
            public a f3214c;

            static {
                Covode.recordClassIndex(1154);
            }

            public final b a() {
                if (this.f3214c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f3212a != null) {
                    return new b(this.f3212a, this.f3213b, this.f3214c);
                } else {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
            }

            a(Context context) {
                this.f3212a = context;
            }
        }

        public static a a(Context context) {
            return new a(context);
        }

        b(Context context, String str, a aVar) {
            this.f3209a = context;
            this.f3210b = str;
            this.f3211c = aVar;
        }
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3208a;

        static {
            Covode.recordClassIndex(1152);
        }

        public abstract void a(b bVar);

        public abstract void a(b bVar, int i2, int i3);

        public void b(b bVar) {
        }

        public a(int i2) {
            this.f3208a = i2;
        }

        public static void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        private static boolean a(File file) {
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    return false;
                }
            } catch (Throwable unused) {
            }
            return file.delete();
        }

        public void b(b bVar, int i2, int i3) {
            throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3);
        }
    }
}

package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.a.c;
import androidx.core.e.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, c.b> f2472a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    public interface a<T> {
        static {
            Covode.recordClassIndex(805);
        }

        boolean a(T t);

        int b(T t);
    }

    static {
        Covode.recordClassIndex(802);
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = l.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!l.a(a2, inputStream)) {
                return null;
            }
            Typeface a3 = a(a2.getPath());
            a(a2);
            return a3;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a(a2);
        }
    }

    k() {
    }

    private static long a(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    private static Typeface a(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (TypeFaceLancet.cache.contains(str)) {
                return (Typeface) TypeFaceLancet.cache.get(str);
            }
            Typeface createFromFile = Typeface.createFromFile(str);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(str, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(str);
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

    /* access modifiers changed from: protected */
    public b.C0030b a(b.C0030b[] bVarArr, int i2) {
        return (b.C0030b) a(bVarArr, i2, new a<b.C0030b>() {
            /* class androidx.core.graphics.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(803);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.k.a
            public final /* bridge */ /* synthetic */ boolean a(b.C0030b bVar) {
                return bVar.f2324d;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.k.a
            public final /* bridge */ /* synthetic */ int b(b.C0030b bVar) {
                return bVar.f2323c;
            }
        });
    }

    private static <T> T a(T[] tArr, int i2, a<T> aVar) {
        int i3;
        boolean z;
        int i4;
        if ((i2 & 1) == 0) {
            i3 = 400;
        } else {
            i3 = 700;
        }
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i5 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.b(t2) - i3) * 2;
            if (aVar.a(t2) == z) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i6 = abs + i4;
            if (t == null || i5 > i6) {
                t = t2;
                i5 = i6;
            }
        }
        return t;
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.C0030b[] bVarArr, int i2) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(bVarArr, i2).f2321a);
            try {
                Typeface a2 = a(context, inputStream);
                l.a(inputStream);
                return a2;
            } catch (IOException unused) {
                l.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                l.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            l.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            l.a(inputStream2);
            throw th;
        }
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        c.C0028c cVar = (c.C0028c) a(bVar.f2272a, i2, new a<c.C0028c>() {
            /* class androidx.core.graphics.k.AnonymousClass2 */

            static {
                Covode.recordClassIndex(804);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.k.a
            public final /* bridge */ /* synthetic */ boolean a(c.C0028c cVar) {
                return cVar.f2275c;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.k.a
            public final /* bridge */ /* synthetic */ int b(c.C0028c cVar) {
                return cVar.f2274b;
            }
        });
        if (cVar == null) {
            return null;
        }
        Typeface a2 = e.a(context, resources, cVar.f2278f, cVar.f2273a, i2);
        long a3 = a(a2);
        if (a3 != 0) {
            this.f2472a.put(Long.valueOf(a3), bVar);
        }
        return a2;
    }

    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        File a2 = l.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!l.a(a2, resources, i2)) {
                return null;
            }
            Typeface a3 = a(a2.getPath());
            a(a2);
            return a3;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a(a2);
        }
    }
}

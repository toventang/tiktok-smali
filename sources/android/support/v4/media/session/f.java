package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.e;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;

final class f {

    public interface a extends e.a {
        static {
            Covode.recordClassIndex(187);
        }
    }

    static {
        Covode.recordClassIndex(186);
    }

    /* access modifiers changed from: package-private */
    public static class b<T extends a> extends e.b<T> {
        static {
            Covode.recordClassIndex(188);
        }

        public final void onPrepare() {
        }

        public b(T t) {
            super(t);
        }

        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }

        public final void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }

        public final void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }
    }

    public static String a(Object obj) {
        try {
            return (String) obj.getClass().getMethod("getCallingPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}

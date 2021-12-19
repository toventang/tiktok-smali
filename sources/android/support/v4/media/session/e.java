package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.d;
import com.bytedance.covode.number.Covode;

final class e {

    public interface a extends d.a {
        static {
            Covode.recordClassIndex(184);
        }
    }

    static {
        Covode.recordClassIndex(183);
    }

    /* access modifiers changed from: package-private */
    public static class b<T extends a> extends d.b<T> {
        static {
            Covode.recordClassIndex(185);
        }

        public b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }
    }
}

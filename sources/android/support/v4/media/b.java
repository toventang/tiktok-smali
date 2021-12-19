package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.a;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;
import java.util.List;

final class b {

    interface a extends a.c {
        static {
            Covode.recordClassIndex(122);
        }

        void b(List<?> list);
    }

    static {
        Covode.recordClassIndex(121);
    }

    /* renamed from: android.support.v4.media.b$b  reason: collision with other inner class name */
    static class C0008b<T extends a> extends a.d<T> {
        static {
            Covode.recordClassIndex(123);
        }

        C0008b(T t) {
            super(t);
        }

        public final void onError(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f662a).b(list);
        }
    }
}

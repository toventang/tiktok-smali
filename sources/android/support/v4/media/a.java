package android.support.v4.media;

import android.media.browse.MediaBrowser;
import com.bytedance.covode.number.Covode;
import java.util.List;

final class a {

    /* renamed from: android.support.v4.media.a$a  reason: collision with other inner class name */
    interface AbstractC0007a {
        static {
            Covode.recordClassIndex(117);
        }

        void a();

        void b();

        void c();
    }

    interface c {
        static {
            Covode.recordClassIndex(119);
        }

        void a(List<?> list);
    }

    static {
        Covode.recordClassIndex(116);
    }

    static class b<T extends AbstractC0007a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a  reason: collision with root package name */
        protected final T f661a;

        static {
            Covode.recordClassIndex(118);
        }

        public final void onConnected() {
            this.f661a.a();
        }

        public final void onConnectionFailed() {
            this.f661a.c();
        }

        public final void onConnectionSuspended() {
            this.f661a.b();
        }

        public b(T t) {
            this.f661a = t;
        }
    }

    static class d<T extends c> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a  reason: collision with root package name */
        protected final T f662a;

        static {
            Covode.recordClassIndex(120);
        }

        public void onError(String str) {
        }

        public d(T t) {
            this.f662a = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            this.f662a.a(list);
        }
    }
}

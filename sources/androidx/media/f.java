package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;
import java.util.List;

final class f {

    static class a {
        static {
            Covode.recordClassIndex(1425);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(1428);
        }

        a a(String str, int i2, Bundle bundle);

        void a(String str, c<List<Parcel>> cVar);
    }

    static {
        Covode.recordClassIndex(1424);
    }

    static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        MediaBrowserService.Result f3745a;

        static {
            Covode.recordClassIndex(1427);
        }

        c(MediaBrowserService.Result result) {
            this.f3745a = result;
        }

        public final void a(T t) {
            this.f3745a.sendResult(null);
        }
    }

    static class b extends MediaBrowserService {

        /* renamed from: a  reason: collision with root package name */
        final d f3744a;

        static {
            Covode.recordClassIndex(1426);
        }

        b(Context context, d dVar) {
            attachBaseContext(context);
            this.f3744a = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f3744a.a(str, new c<>(result));
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.a(bundle);
            d dVar = this.f3744a;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            dVar.a(str, i2, bundle2);
            return null;
        }
    }
}

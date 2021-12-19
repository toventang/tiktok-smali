package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.media.f;
import com.bytedance.covode.number.Covode;

final class g {

    public interface b extends f.d {
        static {
            Covode.recordClassIndex(1431);
        }

        void b(String str, f.c<Parcel> cVar);
    }

    static {
        Covode.recordClassIndex(1429);
    }

    static class a extends f.b {
        static {
            Covode.recordClassIndex(1430);
        }

        a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.f3744a).b(str, new f.c<>(result));
        }
    }
}

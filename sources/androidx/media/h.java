package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.g;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.List;

final class h {

    /* renamed from: a  reason: collision with root package name */
    static Field f3746a;

    public interface c extends g.b {
        static {
            Covode.recordClassIndex(1435);
        }

        void a(String str, b bVar);
    }

    static {
        Covode.recordClassIndex(1432);
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f3746a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        MediaBrowserService.Result f3747a;

        static {
            Covode.recordClassIndex(1434);
        }

        b(MediaBrowserService.Result result) {
            this.f3747a = result;
        }
    }

    static class a extends g.a {
        static {
            Covode.recordClassIndex(1433);
        }

        a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((c) this.f3744a).a(str, new b(result));
        }
    }
}

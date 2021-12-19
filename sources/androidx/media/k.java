package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.core.g.d;
import androidx.media.i;
import com.bytedance.covode.number.Covode;

final class k extends j {
    static {
        Covode.recordClassIndex(1440);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final MediaSessionManager.RemoteUserInfo f3751a;

        static {
            Covode.recordClassIndex(1441);
        }

        public final int hashCode() {
            return d.a(this.f3751a);
        }

        a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f3751a = remoteUserInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f3751a.equals(((a) obj).f3751a);
        }

        a(String str, int i2, int i3) {
            this.f3751a = new MediaSessionManager.RemoteUserInfo(str, i2, i3);
        }
    }
}

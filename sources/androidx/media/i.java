package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.media.k;
import androidx.media.l;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f3748a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3749b = new Object();

    interface b {
        static {
            Covode.recordClassIndex(1438);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        b f3750a;

        static {
            Covode.recordClassIndex(1437);
        }

        public final int hashCode() {
            return this.f3750a.hashCode();
        }

        public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f3750a = new k.a(remoteUserInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f3750a.equals(((a) obj).f3750a);
        }

        public a(String str, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f3750a = new k.a(str, i2, i3);
            } else {
                this.f3750a = new l.a(str, i2, i3);
            }
        }
    }

    static {
        Covode.recordClassIndex(1436);
    }
}

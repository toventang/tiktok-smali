package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    static {
        Covode.recordClassIndex(76);
    }

    public static RemoteActionCompat read(a aVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(aVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, aVar);
    }
}

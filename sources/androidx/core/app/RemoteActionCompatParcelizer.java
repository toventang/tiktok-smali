package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;

public class RemoteActionCompatParcelizer {
    static {
        Covode.recordClassIndex(646);
    }

    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2120a = (IconCompat) aVar.c(remoteActionCompat.f2120a);
        remoteActionCompat.f2121b = aVar.b(remoteActionCompat.f2121b, 2);
        remoteActionCompat.f2122c = aVar.b(remoteActionCompat.f2122c, 3);
        remoteActionCompat.f2123d = (PendingIntent) aVar.b(remoteActionCompat.f2123d, 4);
        remoteActionCompat.f2124e = aVar.b(remoteActionCompat.f2124e, 5);
        remoteActionCompat.f2125f = aVar.b(remoteActionCompat.f2125f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.a(remoteActionCompat.f2120a);
        aVar.a(remoteActionCompat.f2121b, 2);
        aVar.a(remoteActionCompat.f2122c, 3);
        aVar.a(remoteActionCompat.f2123d, 4);
        aVar.a(remoteActionCompat.f2124e, 5);
        aVar.a(remoteActionCompat.f2125f, 6);
    }
}

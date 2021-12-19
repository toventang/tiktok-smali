package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesImplApi21Parcelizer {
    static {
        Covode.recordClassIndex(1381);
    }

    public static b read(a aVar) {
        b bVar = new b();
        bVar.f3638a = (AudioAttributes) aVar.b(bVar.f3638a, 1);
        bVar.f3639b = aVar.b(bVar.f3639b, 2);
        return bVar;
    }

    public static void write(b bVar, a aVar) {
        aVar.a(bVar.f3638a, 1);
        aVar.a(bVar.f3639b, 2);
    }
}

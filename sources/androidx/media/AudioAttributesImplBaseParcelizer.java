package androidx.media;

import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;

public final class AudioAttributesImplBaseParcelizer {
    static {
        Covode.recordClassIndex(1382);
    }

    public static c read(a aVar) {
        c cVar = new c();
        cVar.f3644a = aVar.b(cVar.f3644a, 1);
        cVar.f3645b = aVar.b(cVar.f3645b, 2);
        cVar.f3646c = aVar.b(cVar.f3646c, 3);
        cVar.f3647d = aVar.b(cVar.f3647d, 4);
        return cVar;
    }

    public static void write(c cVar, a aVar) {
        aVar.a(cVar.f3644a, 1);
        aVar.a(cVar.f3645b, 2);
        aVar.a(cVar.f3646c, 3);
        aVar.a(cVar.f3647d, 4);
    }
}

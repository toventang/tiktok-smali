package android.support.v4.graphics.drawable;

import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;
import com.bytedance.covode.number.Covode;

public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    static {
        Covode.recordClassIndex(80);
    }

    public static IconCompat read(a aVar) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(aVar);
    }

    public static void write(IconCompat iconCompat, a aVar) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, aVar);
    }
}

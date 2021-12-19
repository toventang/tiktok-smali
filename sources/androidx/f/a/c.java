package androidx.f.a;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(1013);
    }

    public static abstract class a {
        static {
            Covode.recordClassIndex(1014);
        }

        static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }
}

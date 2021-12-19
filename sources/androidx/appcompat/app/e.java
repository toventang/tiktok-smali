package androidx.appcompat.app;

import androidx.appcompat.view.b;
import com.bytedance.covode.number.Covode;

public interface e {
    static {
        Covode.recordClassIndex(253);
    }

    void onSupportActionModeFinished(b bVar);

    void onSupportActionModeStarted(b bVar);

    b onWindowStartingSupportActionMode(b.a aVar);
}

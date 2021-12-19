package androidx.core.h;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

public final class i {
    static {
        Covode.recordClassIndex(860);
    }

    public static boolean a(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 8194) == 8194) {
            return true;
        }
        return false;
    }
}

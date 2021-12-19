package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

final class j {

    /* renamed from: a  reason: collision with root package name */
    static AtomicBoolean f3529a = new AtomicBoolean(false);

    static class a extends c {
        static {
            Covode.recordClassIndex(1325);
        }

        @Override // androidx.lifecycle.c
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.c
        public final void onActivityStopped(Activity activity) {
        }

        a() {
        }

        @Override // androidx.lifecycle.c
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            x.a(activity);
        }
    }

    static {
        Covode.recordClassIndex(1324);
    }
}

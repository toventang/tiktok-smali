package com.ss.android.ugc.aweme.homepage.msadapt.core.manager;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.msadapt.core.a;
import com.ss.android.ugc.aweme.homepage.msadapt.core.b;
import h.f.b.l;

public final class SurfaceDuoScreenManager extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f99208b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f99209a;

    public final class ScreenModeListenerWrapper implements b {
        static {
            Covode.recordClassIndex(63208);
        }
    }

    static {
        Covode.recordClassIndex(63207);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63209);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.msadapt.core.manager.a
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "");
        if (a.C2425a.d(activity)) {
            if (this.f99209a != b.DUAL_SCREEN) {
                this.f99209a = b.DUAL_SCREEN;
            }
        } else if (this.f99209a != b.SINGLE_SCREEN) {
            this.f99209a = b.SINGLE_SCREEN;
        }
    }
}

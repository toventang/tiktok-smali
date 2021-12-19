package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Activity;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import com.ss.android.ugc.aweme.utils.permission.a;
import h.f.b.l;

public final class i implements IHostPermissionDepend {
    static {
        Covode.recordClassIndex(63717);
    }

    public static final class a implements a.AbstractC3816a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnPermissionGrantCallback f99971a;

        static {
            Covode.recordClassIndex(63718);
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.a.AbstractC3816a
        public final void a() {
            this.f99971a.onAllGranted();
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.a.AbstractC3816a
        public final void b() {
            this.f99971a.onNotGranted();
        }

        a(OnPermissionGrantCallback onPermissionGrantCallback) {
            this.f99971a = onPermissionGrantCallback;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
    public final boolean hasPermission(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        if (b.a(activity, str) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
    public final void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str) {
        l.d(activity, "");
        l.d(onPermissionGrantCallback, "");
        l.d(str, "");
        String[] strArr = {str};
        com.ss.android.ugc.aweme.utils.permission.a.a(activity, strArr, new a(onPermissionGrantCallback));
    }
}

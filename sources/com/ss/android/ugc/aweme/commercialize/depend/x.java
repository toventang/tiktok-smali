package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IPermissionDepend;
import com.bytedance.ies.android.base.runtime.depend.IPermissionRequestCallback;
import com.ss.android.ugc.aweme.ce.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

public final class x implements IPermissionDepend {
    static {
        Covode.recordClassIndex(45441);
    }

    static final class a implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPermissionRequestCallback f73804a;

        static {
            Covode.recordClassIndex(45442);
        }

        a(IPermissionRequestCallback iPermissionRequestCallback) {
            this.f73804a = iPermissionRequestCallback;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            ArrayList arrayList = new ArrayList();
            l.b(strArr, "");
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                int i4 = i3 + 1;
                if (i3 >= 0 && i3 < iArr.length && iArr[i3] == 0) {
                    arrayList.add(str);
                }
                i2++;
                i3 = i4;
            }
            IPermissionRequestCallback iPermissionRequestCallback = this.f73804a;
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            iPermissionRequestCallback.onPermissionsGrant((String[]) array);
        }
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IPermissionDepend
    public final boolean requestPermission(Activity activity, IPermissionRequestCallback iPermissionRequestCallback, String... strArr) {
        l.d(activity, "");
        l.d(iPermissionRequestCallback, "");
        l.d(strArr, "");
        b.a(activity, strArr, new a(iPermissionRequestCallback));
        return true;
    }
}

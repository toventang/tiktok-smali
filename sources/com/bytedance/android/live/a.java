package com.bytedance.android.live;

import androidx.fragment.app.d;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public class a extends d {
    static {
        Covode.recordClassIndex(3513);
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        if (getFragmentManager() == null) {
            com.bytedance.android.live.core.c.a.a(3, "BaseDialogFragmentV2", "dismiss:${this} not associate with a fragment manager");
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            com.bytedance.android.live.core.c.a.a(3, "BaseDialogFragmentV2", "dismissAllowingStateLoss:${this} not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    private void a(String str, Object obj) {
        try {
            Field declaredField = a.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.d
    public void show(i iVar, String str) {
        a("mDismissed", false);
        a("mShownByMe", true);
        n a2 = iVar.a();
        a2.a(this, str);
        a2.c();
    }

    @Override // androidx.fragment.app.d
    public int show(n nVar, String str) {
        a("mDismissed", false);
        a("mShownByMe", true);
        nVar.a(this, str);
        a("mViewDestroyed", false);
        int c2 = nVar.c();
        a("mBackStackId", Integer.valueOf(c2));
        return c2;
    }

    @Override // androidx.fragment.app.d
    public void showNow(i iVar, String str) {
        a("mDismissed", false);
        a("mShownByMe", true);
        n a2 = iVar.a();
        a2.a(this, str);
        try {
            a2.e();
        } catch (Throwable unused) {
            a2.c();
        }
    }
}

package com.bytedance.android.livesdk.ak;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.e;
import com.bytedance.android.livesdk.ak.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;

public abstract class a<T extends a> implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public PopupWindow f13934a;

    /* renamed from: b  reason: collision with root package name */
    public PopupWindow.OnDismissListener f13935b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13936c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f13937d;

    static {
        Covode.recordClassIndex(7726);
    }

    private View a() {
        PopupWindow popupWindow = this.f13934a;
        if (popupWindow != null) {
            return popupWindow.getContentView();
        }
        return null;
    }

    public void onDismiss() {
        e a2;
        PopupWindow.OnDismissListener onDismissListener = this.f13935b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (this.f13936c) {
            ViewGroup viewGroup = this.f13937d;
            if (viewGroup != null) {
                viewGroup.getOverlay().clear();
            } else if (!(a() == null || (a2 = p.a(a().getContext())) == null)) {
                ((ViewGroup) a2.getWindow().getDecorView().getRootView()).getOverlay().clear();
            }
        }
        PopupWindow popupWindow = this.f13934a;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f13934a.dismiss();
        }
    }
}

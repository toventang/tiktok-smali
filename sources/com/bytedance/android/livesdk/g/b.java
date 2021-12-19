package com.bytedance.android.livesdk.g;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.bytedance.covode.number.Covode;

public class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private DialogInterface.OnShowListener f17816a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnDismissListener f17817b;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f17818f;

    /* renamed from: g  reason: collision with root package name */
    DialogInterface.OnShowListener f17819g;

    /* renamed from: h  reason: collision with root package name */
    DialogInterface.OnDismissListener f17820h;

    static {
        Covode.recordClassIndex(9892);
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f17818f) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-2, -1);
            }
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener == this.f17817b) {
            super.setOnDismissListener(onDismissListener);
        } else {
            this.f17820h = onDismissListener;
        }
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        if (onShowListener == this.f17816a) {
            super.setOnShowListener(onShowListener);
        } else {
            this.f17819g = onShowListener;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x003f
            r0 = 2131887151(0x7f12042f, float:1.94089E38)
        L_0x0005:
            r3.<init>(r4, r0)
            com.bytedance.android.livesdk.g.c r0 = new com.bytedance.android.livesdk.g.c
            r0.<init>(r3)
            r3.f17816a = r0
            com.bytedance.android.livesdk.g.d r0 = new com.bytedance.android.livesdk.g.d
            r0.<init>(r3)
            r3.f17817b = r0
            android.view.Window r2 = r3.getWindow()
            if (r2 == 0) goto L_0x002b
            android.view.Window r1 = r3.getWindow()
            r0 = 1
            r1.requestFeature(r0)
            if (r5 == 0) goto L_0x0038
            r0 = 80
            r2.setGravity(r0)
        L_0x002b:
            r3.f17818f = r5
            android.content.DialogInterface$OnShowListener r0 = r3.f17816a
            r3.setOnShowListener(r0)
            android.content.DialogInterface$OnDismissListener r0 = r3.f17817b
            r3.setOnDismissListener(r0)
            return
        L_0x0038:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r2.setGravity(r0)
            goto L_0x002b
        L_0x003f:
            r0 = 2131887152(0x7f120430, float:1.9408903E38)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.g.b.<init>(android.content.Context, boolean):void");
    }
}

package com.lynx.tasm.behavior;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

public class i extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55892a = i.class.getSimpleName();

    static {
        Covode.recordClassIndex(34943);
    }

    public final View a() {
        return getWindow().getDecorView();
    }

    public final void b() {
        if (!isShowing()) {
            try {
                if (!a(getContext()).isFinishing()) {
                    show();
                }
            } catch (WindowManager.BadTokenException e2) {
                LLog.a(5, f55892a, e2.toString());
            } catch (RuntimeException e3) {
                LLog.a(5, f55892a, e3.toString());
            }
        }
    }

    public final void c() {
        if (isShowing()) {
            try {
                dismiss();
            } catch (WindowManager.BadTokenException e2) {
                LLog.a(5, f55892a, e2.toString());
            } catch (RuntimeException e3) {
                LLog.a(5, f55892a, e3.toString());
            }
        }
    }

    public i(Context context) {
        super(context);
    }

    public final void b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    private static Activity a(Context context) {
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                throw new IllegalArgumentException();
            }
        }
        return (Activity) context;
    }

    public final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(2, -1);
        getWindow().setSoftInputMode(16);
        getWindow().addFlags(32);
        getWindow().addFlags(8);
        getWindow().addFlags(131072);
        getWindow().clearFlags(2);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setOutlineProvider(null);
            getWindow().getDecorView().setElevation(0.0f);
            getWindow().getDecorView().setTranslationZ(0.0f);
        }
    }
}

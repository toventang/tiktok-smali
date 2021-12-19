package com.bytedance.tux.dialog.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.e.a;
import h.f.b.l;

public final class e extends h {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.tux.dialog.c.a f44916a;

    /* renamed from: b  reason: collision with root package name */
    public final View f44917b;

    /* renamed from: c  reason: collision with root package name */
    private final View f44918c;

    static {
        Covode.recordClassIndex(27414);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44919a;

        static {
            Covode.recordClassIndex(27415);
        }

        a(e eVar) {
            this.f44919a = eVar;
        }

        public final void run() {
            this.f44919a.f44916a.a(this.f44919a.f44917b);
        }
    }

    public final void show() {
        try {
            super.show();
            this.f44918c.post(new a(this));
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.bytedance.tux.dialog.a aVar, View view, com.bytedance.tux.dialog.c.a aVar2, View view2) {
        super(aVar.f44880f);
        androidx.fragment.app.e eVar;
        Activity activity;
        l.c(aVar, "");
        l.c(view, "");
        l.c(aVar2, "");
        l.c(view2, "");
        this.f44918c = view;
        this.f44916a = aVar2;
        this.f44917b = view2;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(view);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(aVar.f44879e.r);
            window2.setBackgroundDrawableResource(17170445);
            window2.addFlags(2);
            Context context = aVar.f44880f;
            while (true) {
                eVar = null;
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            activity = null;
            androidx.fragment.app.e eVar2 = activity instanceof androidx.fragment.app.e ? activity : eVar;
            if (eVar2 == null) {
                window2.getAttributes().height = -2;
            } else {
                a.C1099a.a(eVar2, this).c().f44923a.d();
                window2.getAttributes().height = -1;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.dimAmount = 0.5f;
            attributes.gravity = 1;
            attributes.width = -1;
        }
    }
}

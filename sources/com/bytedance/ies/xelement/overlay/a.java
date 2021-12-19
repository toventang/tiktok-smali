package com.bytedance.ies.xelement.overlay;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.overlay.b;
import com.lynx.tasm.behavior.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public final LynxOverlayView f37195a;

    /* renamed from: b  reason: collision with root package name */
    private final h f37196b = i.a((h.f.a.a) new C0917a(this));

    static {
        Covode.recordClassIndex(22371);
    }

    public final void dismiss() {
        Context context = getContext();
        l.a((Object) context, "");
        if (!a(context)) {
            super.dismiss();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.a$a  reason: collision with other inner class name */
    static final class C0917a extends m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0917a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            j jVar = this.this$0.f37195a.mContext;
            l.a((Object) jVar, "");
            int identifier = jVar.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = jVar.getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
    }

    public final void show() {
        Window window;
        View decorView;
        View decorView2;
        Context context = getContext();
        l.a((Object) context, "");
        if (!a(context)) {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.clearFlags(131072);
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setFlags(8, 8);
            }
            super.show();
            Activity ownerActivity = getOwnerActivity();
            if (!(ownerActivity == null || (window = ownerActivity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                int systemUiVisibility = decorView.getSystemUiVisibility();
                Window window4 = getWindow();
                if (!(window4 == null || (decorView2 = window4.getDecorView()) == null)) {
                    decorView2.setSystemUiVisibility(systemUiVisibility);
                }
            }
            Window window5 = getWindow();
            if (window5 != null) {
                window5.clearFlags(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    private static boolean a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return true;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Activity activity;
        l.c(motionEvent, "");
        if (a(motionEvent.getX(), motionEvent.getY())) {
            j jVar = this.f37195a.mContext;
            l.a((Object) jVar, "");
            jVar.f55898f.a(motionEvent, this.f37195a);
        }
        l.c(motionEvent, "");
        for (T t : b.f37197a) {
            if (t.f37201b.a(motionEvent.getX(), motionEvent.getY())) {
                a aVar = t.f37201b;
                l.c(motionEvent, "");
                float left = (float) aVar.f37195a.getLeft();
                float top = (float) aVar.f37195a.getTop();
                motionEvent.offsetLocation(-left, -top);
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(left, top);
                return dispatchTouchEvent;
            }
        }
        List<b.a> list = b.f37197a;
        if (!(!list.isEmpty())) {
            list = null;
        }
        int i2 = 0;
        if (list != null) {
            a aVar2 = list.get(0).f37201b;
            l.c(motionEvent, "");
            j jVar2 = aVar2.f37195a.mContext;
            l.a((Object) jVar2, "");
            Context baseContext = jVar2.getBaseContext();
            if (!(baseContext == null || !(baseContext instanceof Activity) || (activity = (Activity) baseContext) == null)) {
                if (!aVar2.f37195a.a()) {
                    i2 = -((Number) aVar2.f37196b.getValue()).intValue();
                }
                float f2 = (float) i2;
                motionEvent.offsetLocation(-0.0f, -f2);
                boolean dispatchTouchEvent2 = activity.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, f2);
                return dispatchTouchEvent2;
            }
        }
        return false;
    }

    private boolean a(float f2, float f3) {
        return this.f37195a.a(f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, LynxOverlayView lynxOverlayView) {
        super(context, R.style.gi);
        l.c(context, "");
        l.c(lynxOverlayView, "");
        this.f37195a = lynxOverlayView;
    }
}

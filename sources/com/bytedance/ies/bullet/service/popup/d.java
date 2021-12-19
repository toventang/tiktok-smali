package com.bytedance.ies.bullet.service.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class d extends h {
    static {
        Covode.recordClassIndex(19660);
    }

    public void show() {
        Window window;
        View decorView;
        View decorView2;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setFlags(8, 8);
        }
        super.show();
        Activity ownerActivity = getOwnerActivity();
        if (!(ownerActivity == null || (window = ownerActivity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window3 = getWindow();
            if (!(window3 == null || (decorView2 = window3.getDecorView()) == null)) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.clearFlags(8);
        }
    }

    private final void b() {
        Activity ownerActivity;
        Window window;
        View decorView;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
            window2.setSoftInputMode(16);
            window2.setBackgroundDrawable(new ColorDrawable(0));
            a(getWindow());
            View decorView2 = window2.getDecorView();
            decorView2.setPadding(0, 0, 0, 0);
            Activity ownerActivity2 = getOwnerActivity();
            if (!(ownerActivity2 == null || (window = ownerActivity2.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                l.a((Object) decorView, "");
                decorView2.setSystemUiVisibility(decorView.getSystemUiVisibility());
            }
            if (Build.VERSION.SDK_INT >= 21 && (ownerActivity = getOwnerActivity()) != null) {
                l.a((Object) ownerActivity, "");
                Window window3 = ownerActivity.getWindow();
                l.a((Object) window3, "");
                window2.setNavigationBarColor(window3.getNavigationBarColor());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, R.style.fh);
        l.c(context, "");
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i2) {
        cg_();
        super.setContentView(i2);
        b();
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        l.c(view, "");
        cg_();
        super.setContentView(view);
        view.setFitsSystemWindows(false);
        b();
    }

    private static void a(Window window) {
        View findViewById;
        if (Build.VERSION.SDK_INT >= 23) {
            if (window != null) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                if (window != null && (findViewById = window.findViewById(16908290)) != null) {
                    findViewById.setForeground(null);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 21 && window != null) {
            window.setStatusBarColor(0);
        }
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }

    @Override // androidx.appcompat.app.h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l.c(view, "");
        cg_();
        super.setContentView(view, layoutParams);
        b();
    }
}

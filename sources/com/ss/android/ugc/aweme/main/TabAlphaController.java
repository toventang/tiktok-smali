package com.ss.android.ugc.aweme.main;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class TabAlphaController extends Handler implements au {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f109098c = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};

    /* renamed from: d  reason: collision with root package name */
    private static TabAlphaController f109099d;

    /* renamed from: a  reason: collision with root package name */
    View f109100a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f109101b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f109102e;

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume(mVar);
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        a(false);
    }

    public static TabAlphaController a() {
        if (f109099d == null) {
            f109099d = new TabAlphaController();
        }
        return f109099d;
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.f109100a = null;
    }

    static {
        Covode.recordClassIndex(69870);
    }

    private TabAlphaController() {
        if (TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            for (String str : f109098c) {
                if (TextUtils.equals(str, Build.MODEL)) {
                    this.f109102e = true;
                    return;
                }
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public void onResume(m mVar) {
        a(true);
    }

    public void handleMessage(Message message) {
        View view;
        if (message.what == 1 && (view = this.f109100a) != null && !this.f109101b) {
            view.getAlpha();
            View view2 = this.f109100a;
            view2.setAlpha(view2.getAlpha() / 2.0f);
            this.f109101b = true;
        }
    }

    public final void a(boolean z) {
        if (this.f109100a != null && this.f109102e) {
            if (!z || this.f109101b) {
                if (hasMessages(1)) {
                    removeMessages(1);
                }
            } else if (!hasMessages(1)) {
                sendEmptyMessageDelayed(1, 1200000);
            }
        }
    }
}

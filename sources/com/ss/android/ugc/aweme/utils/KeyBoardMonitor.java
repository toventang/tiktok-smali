package com.ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class KeyBoardMonitor implements ViewTreeObserver.OnGlobalLayoutListener, au {

    /* renamed from: a  reason: collision with root package name */
    public View f142567a;

    /* renamed from: b  reason: collision with root package name */
    public a f142568b;

    public interface a {
        static {
            Covode.recordClassIndex(93249);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(93248);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        View view = this.f142567a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f142567a.getWindowVisibleDisplayFrame(rect);
        if (((float) (this.f142567a.getBottom() - rect.bottom)) > this.f142567a.getResources().getDisplayMetrics().density * 100.0f) {
            this.f142568b.a();
        } else {
            this.f142568b.b();
        }
    }

    public KeyBoardMonitor(m mVar) {
        if (mVar != null) {
            mVar.getLifecycle().a(this);
        }
    }
}

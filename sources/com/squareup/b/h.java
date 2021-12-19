package com.squareup.b;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    final x f58026a;

    /* renamed from: b  reason: collision with root package name */
    final WeakReference<ImageView> f58027b;

    /* renamed from: c  reason: collision with root package name */
    e f58028c;

    static {
        Covode.recordClassIndex(36056);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f58028c = null;
        ImageView imageView = this.f58027b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = this.f58027b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            x xVar = this.f58026a;
            xVar.f58140b = false;
            xVar.f58139a.a(width, height);
            xVar.a(imageView, this.f58028c);
        }
        return true;
    }

    h(x xVar, ImageView imageView, e eVar) {
        this.f58026a = xVar;
        this.f58027b = new WeakReference<>(imageView);
        this.f58028c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}

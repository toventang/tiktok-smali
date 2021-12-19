package com.bytedance.android.livesdk.util.rxutils.autodispose.a;

import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.util.rxutils.autodispose.aa;
import com.bytedance.covode.number.Covode;
import f.a.d;
import f.a.f;

final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final View f22138a;

    static {
        Covode.recordClassIndex(13042);
    }

    static final class a extends f.a.a.a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f22139a;

        /* renamed from: b  reason: collision with root package name */
        private final d f22140b;

        static {
            Covode.recordClassIndex(13043);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        @Override // f.a.a.a
        public final void a() {
            this.f22139a.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!isDisposed()) {
                this.f22140b.onComplete();
            }
        }

        a(View view, d dVar) {
            this.f22139a = view;
            this.f22140b = dVar;
        }
    }

    b(View view) {
        this.f22138a = view;
    }

    @Override // f.a.f
    public final void a(d dVar) {
        a aVar = new a(this.f22138a, dVar);
        dVar.onSubscribe(aVar);
        if (!a.a(com.bytedance.android.livesdk.util.rxutils.autodispose.a.a.a.f22136a)) {
            dVar.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (this.f22138a.isAttachedToWindow() || this.f22138a.getWindowToken() != null) {
            this.f22138a.addOnAttachStateChangeListener(aVar);
            if (aVar.isDisposed()) {
                this.f22138a.removeOnAttachStateChangeListener(aVar);
                return;
            }
            return;
        }
        dVar.onError(new aa("View is not attached!"));
    }
}

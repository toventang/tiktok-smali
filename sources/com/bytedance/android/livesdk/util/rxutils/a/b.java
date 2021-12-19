package com.bytedance.android.livesdk.util.rxutils.a;

import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.z;

/* access modifiers changed from: package-private */
public final class b extends t<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final View f22121a;

    static {
        Covode.recordClassIndex(13031);
    }

    static final class a extends f.a.a.a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f22122a;

        /* renamed from: b  reason: collision with root package name */
        private final z<? super Object> f22123b;

        static {
            Covode.recordClassIndex(13032);
        }

        @Override // f.a.a.a
        public final void a() {
            this.f22122a.setOnClickListener(null);
        }

        public final void onClick(View view) {
            if (!isDisposed()) {
                this.f22123b.onNext(a.f22120a);
            }
        }

        a(View view, z<? super Object> zVar) {
            this.f22122a = view;
            this.f22123b = zVar;
        }
    }

    b(View view) {
        this.f22121a = view;
    }

    @Override // f.a.t
    public final void a(z<? super Object> zVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            zVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
            return;
        }
        a aVar = new a(this.f22121a, zVar);
        zVar.onSubscribe(aVar);
        this.f22121a.setOnClickListener(aVar);
    }
}

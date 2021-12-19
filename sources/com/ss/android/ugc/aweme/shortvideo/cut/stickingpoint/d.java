package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.c;
import h.f.b.l;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f125919a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private c f125920b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f125921c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f125922d = new Handler();

    static {
        Covode.recordClassIndex(82738);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82739);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void c() {
        this.f125922d.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f125923a;

        static {
            Covode.recordClassIndex(82740);
        }

        b(c cVar) {
            this.f125923a = cVar;
        }

        public final void run() {
            try {
                this.f125923a.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b() {
        c cVar = this.f125920b;
        if (cVar != null && cVar.isShowing()) {
            c cVar2 = this.f125920b;
            if (cVar2 == null) {
                l.b();
            }
            cVar2.dismiss();
        }
        c();
    }

    public final void a() {
        Activity activity = this.f125921c;
        if (activity != null && !activity.isFinishing()) {
            if (this.f125920b == null) {
                Activity activity2 = this.f125921c;
                if (activity2 == null) {
                    l.b();
                }
                this.f125920b = new c(activity2);
            }
            c cVar = this.f125920b;
            if (cVar != null && (!cVar.isShowing())) {
                this.f125922d.postDelayed(new b(cVar), 350);
            }
        }
    }

    public final void a(Context context) {
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        this.f125921c = activity;
        if (activity != null) {
            Activity activity2 = this.f125921c;
            if (activity2 == null) {
                l.b();
            }
            this.f125920b = new c(activity2);
        }
    }
}

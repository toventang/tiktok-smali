package com.ss.android.ugc.aweme.dsp.widget.a;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C2005a f84044f = new C2005a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f84045a;

    /* renamed from: b  reason: collision with root package name */
    int f84046b;

    /* renamed from: c  reason: collision with root package name */
    public int f84047c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f84048d;

    /* renamed from: e  reason: collision with root package name */
    View f84049e;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f84050g = new b(this);

    static {
        Covode.recordClassIndex(52403);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.widget.a.a$a  reason: collision with other inner class name */
    public static final class C2005a {
        static {
            Covode.recordClassIndex(52404);
        }

        private C2005a() {
        }

        public /* synthetic */ C2005a(byte b2) {
            this();
        }
    }

    public final void a() {
        View view = this.f84049e;
        if (view != null) {
            view.removeCallbacks(this.f84050g);
            View view2 = this.f84049e;
            if (view2 != null) {
                view2.postOnAnimation(this.f84050g);
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84051a;

        static {
            Covode.recordClassIndex(52405);
        }

        b(a aVar) {
            this.f84051a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
            if (r7 >= r1) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
            if (r7 >= r1) goto L_0x004a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.widget.a.a.b.run():void");
        }
    }

    public final void a(int i2, int i3) {
        this.f84045a = i2;
        this.f84046b = i3;
        a();
    }
}

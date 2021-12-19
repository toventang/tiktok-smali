package com.bytedance.android.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ArrayBlockingQueue;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f24316a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f24317b;

    /* renamed from: c  reason: collision with root package name */
    public C0520c f24318c;

    /* renamed from: d  reason: collision with root package name */
    private Handler.Callback f24319d = new Handler.Callback() {
        /* class com.bytedance.android.widget.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14282);
        }

        public final boolean handleMessage(Message message) {
            b bVar = (b) message.obj;
            if (bVar.f24325d == null) {
                bVar.f24325d = com.a.a(c.this.f24316a, bVar.f24324c, bVar.f24323b, false);
            }
            bVar.f24326e.onInflateFinished(bVar.f24325d, bVar.f24324c, bVar.f24323b);
            C0520c cVar = c.this.f24318c;
            bVar.f24326e = null;
            bVar.f24322a = null;
            bVar.f24323b = null;
            bVar.f24324c = 0;
            bVar.f24325d = null;
            cVar.f24328b.release(bVar);
            return true;
        }
    };

    public interface d {
        static {
            Covode.recordClassIndex(14286);
        }

        void onInflateFinished(View view, int i2, ViewGroup viewGroup);
    }

    static {
        Covode.recordClassIndex(14281);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        c f24322a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f24323b;

        /* renamed from: c  reason: collision with root package name */
        int f24324c;

        /* renamed from: d  reason: collision with root package name */
        View f24325d;

        /* renamed from: e  reason: collision with root package name */
        d f24326e;

        static {
            Covode.recordClassIndex(14284);
        }

        b() {
        }
    }

    static class a extends LayoutInflater {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f24321a = {"android.widget.", "android.webkit.", "android.app."};

        static {
            Covode.recordClassIndex(14283);
        }

        a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new a(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            for (String str2 : f24321a) {
                try {
                    View createView = createView(str, str2, attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.widget.c$c  reason: collision with other inner class name */
    public static class C0520c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final ArrayBlockingQueue<b> f24327a;

        /* renamed from: b  reason: collision with root package name */
        final f.c<b> f24328b;

        static {
            Covode.recordClassIndex(14285);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|8|6) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.ArrayBlockingQueue<com.bytedance.android.widget.c$b> r0 = r5.f24327a     // Catch:{ InterruptedException -> 0x0000 }
                java.lang.Object r4 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
                com.bytedance.android.widget.c$b r4 = (com.bytedance.android.widget.c.b) r4     // Catch:{ InterruptedException -> 0x0000 }
                r3 = 0
                com.bytedance.android.widget.c r0 = r4.f24322a     // Catch:{ RuntimeException -> 0x0017 }
                android.view.LayoutInflater r2 = r0.f24316a     // Catch:{ RuntimeException -> 0x0017 }
                int r1 = r4.f24324c     // Catch:{ RuntimeException -> 0x0017 }
                android.view.ViewGroup r0 = r4.f24323b     // Catch:{ RuntimeException -> 0x0017 }
                android.view.View r0 = com.a.a(r2, r1, r0, r3)     // Catch:{ RuntimeException -> 0x0017 }
                r4.f24325d = r0     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                com.bytedance.android.widget.c r0 = r4.f24322a
                android.os.Handler r0 = r0.f24317b
                android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
                r0.sendToTarget()
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.c.C0520c.run():void");
        }

        private C0520c(int i2) {
            this.f24327a = new ArrayBlockingQueue<>(i2);
            this.f24328b = new f.c<>(10);
            start();
        }

        /* synthetic */ C0520c(int i2, byte b2) {
            this(i2);
        }
    }

    public c(Context context, int i2) {
        this.f24316a = new a(context);
        this.f24317b = new Handler(this.f24319d);
        this.f24318c = new C0520c(i2, (byte) 0);
    }

    public final void a(int i2, ViewGroup viewGroup, d dVar) {
        b acquire = this.f24318c.f24328b.acquire();
        if (acquire == null) {
            acquire = new b();
        }
        acquire.f24322a = this;
        acquire.f24324c = i2;
        acquire.f24323b = viewGroup;
        acquire.f24326e = dVar;
        try {
            this.f24318c.f24327a.put(acquire);
        } catch (InterruptedException e2) {
            throw new RuntimeException("Failed to enqueue async inflate request", e2);
        }
    }
}

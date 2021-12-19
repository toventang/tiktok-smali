package androidx.b.a;

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

public final class a {

    /* renamed from: a  reason: collision with root package name */
    LayoutInflater f1740a;

    /* renamed from: b  reason: collision with root package name */
    Handler f1741b;

    /* renamed from: c  reason: collision with root package name */
    c f1742c;

    /* renamed from: d  reason: collision with root package name */
    private Handler.Callback f1743d = new Handler.Callback() {
        /* class androidx.b.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(530);
        }

        public final boolean handleMessage(Message message) {
            b bVar = (b) message.obj;
            if (bVar.f1749d == null) {
                bVar.f1749d = com.a.a(a.this.f1740a, bVar.f1748c, bVar.f1747b, false);
            }
            bVar.f1750e.onInflateFinished(bVar.f1749d, bVar.f1748c, bVar.f1747b);
            c cVar = a.this.f1742c;
            bVar.f1750e = null;
            bVar.f1746a = null;
            bVar.f1747b = null;
            bVar.f1748c = 0;
            bVar.f1749d = null;
            cVar.f1753c.release(bVar);
            return true;
        }
    };

    public interface d {
        static {
            Covode.recordClassIndex(534);
        }

        void onInflateFinished(View view, int i2, ViewGroup viewGroup);
    }

    static {
        Covode.recordClassIndex(529);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        a f1746a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f1747b;

        /* renamed from: c  reason: collision with root package name */
        int f1748c;

        /* renamed from: d  reason: collision with root package name */
        View f1749d;

        /* renamed from: e  reason: collision with root package name */
        d f1750e;

        static {
            Covode.recordClassIndex(532);
        }

        b() {
        }
    }

    static class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        static final c f1751a;

        /* renamed from: b  reason: collision with root package name */
        ArrayBlockingQueue<b> f1752b = new ArrayBlockingQueue<>(10);

        /* renamed from: c  reason: collision with root package name */
        f.c<b> f1753c = new f.c<>(10);

        static {
            Covode.recordClassIndex(533);
            c cVar = new c();
            f1751a = cVar;
            cVar.start();
        }

        private c() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|8|6) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.ArrayBlockingQueue<androidx.b.a.a$b> r0 = r5.f1752b     // Catch:{ InterruptedException -> 0x0000 }
                java.lang.Object r4 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
                androidx.b.a.a$b r4 = (androidx.b.a.a.b) r4     // Catch:{ InterruptedException -> 0x0000 }
                r3 = 0
                androidx.b.a.a r0 = r4.f1746a     // Catch:{ RuntimeException -> 0x0017 }
                android.view.LayoutInflater r2 = r0.f1740a     // Catch:{ RuntimeException -> 0x0017 }
                int r1 = r4.f1748c     // Catch:{ RuntimeException -> 0x0017 }
                android.view.ViewGroup r0 = r4.f1747b     // Catch:{ RuntimeException -> 0x0017 }
                android.view.View r0 = com.a.a(r2, r1, r0, r3)     // Catch:{ RuntimeException -> 0x0017 }
                r4.f1749d = r0     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                androidx.b.a.a r0 = r4.f1746a
                android.os.Handler r0 = r0.f1741b
                android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
                r0.sendToTarget()
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.b.a.a.c.run():void");
        }
    }

    /* renamed from: androidx.b.a.a$a  reason: collision with other inner class name */
    static class C0024a extends LayoutInflater {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f1745a = {"android.widget.", "android.webkit.", "android.app."};

        static {
            Covode.recordClassIndex(531);
        }

        C0024a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new C0024a(context);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            for (String str2 : f1745a) {
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

    public a(Context context) {
        this.f1740a = new C0024a(context);
        this.f1741b = new Handler(this.f1743d);
        this.f1742c = c.f1751a;
    }

    public final void a(int i2, ViewGroup viewGroup, d dVar) {
        b acquire = this.f1742c.f1753c.acquire();
        if (acquire == null) {
            acquire = new b();
        }
        acquire.f1746a = this;
        acquire.f1748c = i2;
        acquire.f1747b = viewGroup;
        acquire.f1750e = dVar;
        try {
            this.f1742c.f1752b.put(acquire);
        } catch (InterruptedException e2) {
            throw new RuntimeException("Failed to enqueue async inflate request", e2);
        }
    }
}

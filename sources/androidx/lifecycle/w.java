package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.x;
import com.bytedance.covode.number.Covode;

public final class w implements m {

    /* renamed from: i  reason: collision with root package name */
    public static final w f3548i = new w();

    /* renamed from: a  reason: collision with root package name */
    int f3549a;

    /* renamed from: b  reason: collision with root package name */
    int f3550b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3551c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f3552d = true;

    /* renamed from: e  reason: collision with root package name */
    Handler f3553e;

    /* renamed from: f  reason: collision with root package name */
    final n f3554f = new n(this);

    /* renamed from: g  reason: collision with root package name */
    Runnable f3555g = new Runnable() {
        /* class androidx.lifecycle.w.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1341);
        }

        public final void run() {
            w wVar = w.this;
            if (wVar.f3550b == 0) {
                wVar.f3551c = true;
                wVar.f3554f.a(i.a.ON_PAUSE);
            }
            w.this.a();
        }
    };

    /* renamed from: h  reason: collision with root package name */
    x.a f3556h = new x.a() {
        /* class androidx.lifecycle.w.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1342);
        }

        @Override // androidx.lifecycle.x.a
        public final void a() {
            w wVar = w.this;
            wVar.f3549a++;
            if (wVar.f3549a == 1 && wVar.f3552d) {
                wVar.f3554f.a(i.a.ON_START);
                wVar.f3552d = false;
            }
        }

        @Override // androidx.lifecycle.x.a
        public final void b() {
            w wVar = w.this;
            wVar.f3550b++;
            if (wVar.f3550b != 1) {
                return;
            }
            if (wVar.f3551c) {
                wVar.f3554f.a(i.a.ON_RESUME);
                wVar.f3551c = false;
                return;
            }
            wVar.f3553e.removeCallbacks(wVar.f3555g);
        }
    };

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f3554f;
    }

    static {
        Covode.recordClassIndex(1340);
    }

    private w() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f3549a == 0 && this.f3551c) {
            this.f3554f.a(i.a.ON_STOP);
            this.f3552d = true;
        }
    }
}

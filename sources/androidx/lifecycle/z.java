package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final n f3567a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3568b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f3569c;

    static {
        Covode.recordClassIndex(1351);
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final i.a f3570a;

        /* renamed from: b  reason: collision with root package name */
        private final n f3571b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3572c;

        static {
            Covode.recordClassIndex(1352);
        }

        public final void run() {
            if (!this.f3572c) {
                this.f3571b.a(this.f3570a);
                this.f3572c = true;
            }
        }

        a(n nVar, i.a aVar) {
            this.f3571b = nVar;
            this.f3570a = aVar;
        }
    }

    public z(m mVar) {
        this.f3567a = new n(mVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(i.a aVar) {
        a aVar2 = this.f3569c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f3567a, aVar);
        this.f3569c = aVar3;
        this.f3568b.postAtFrontOfQueue(aVar3);
    }
}

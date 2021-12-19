package androidx.activity;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    final Runnable f815a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<c> f816b;

    static {
        Covode.recordClassIndex(217);
    }

    class a implements a {

        /* renamed from: b  reason: collision with root package name */
        private final c f822b;

        static {
            Covode.recordClassIndex(219);
        }

        @Override // androidx.activity.a
        public final void a() {
            OnBackPressedDispatcher.this.f816b.remove(this.f822b);
            this.f822b.a(this);
        }

        a(c cVar) {
            this.f822b = cVar;
        }
    }

    class LifecycleOnBackPressedCancellable implements a, k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f817a;

        /* renamed from: b  reason: collision with root package name */
        private final i f818b;

        /* renamed from: c  reason: collision with root package name */
        private final c f819c;

        /* renamed from: d  reason: collision with root package name */
        private a f820d;

        static {
            Covode.recordClassIndex(218);
        }

        @Override // androidx.activity.a
        public final void a() {
            this.f818b.b(this);
            this.f819c.a(this);
            a aVar = this.f820d;
            if (aVar != null) {
                aVar.a();
                this.f820d = null;
            }
        }

        @Override // androidx.lifecycle.k
        public void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = this.f817a;
                c cVar = this.f819c;
                onBackPressedDispatcher.f816b.add(cVar);
                a aVar2 = new a(cVar);
                cVar.f831b.add(aVar2);
                this.f820d = aVar2;
            } else if (aVar == i.a.ON_STOP) {
                a aVar3 = this.f820d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            } else if (aVar == i.a.ON_DESTROY) {
                a();
            }
        }
    }
}

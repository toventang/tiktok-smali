package dagger.hilt.b;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.k.c;

public final class b<VM extends ac> implements h<VM> {

    /* renamed from: a  reason: collision with root package name */
    private VM f156686a;

    /* renamed from: b  reason: collision with root package name */
    private final c<VM> f156687b;

    /* renamed from: c  reason: collision with root package name */
    private final a<af> f156688c;

    /* renamed from: d  reason: collision with root package name */
    private final a<ad.b> f156689d;

    static {
        Covode.recordClassIndex(104068);
    }

    @Override // h.h
    public final boolean isInitialized() {
        if (this.f156686a != null) {
            return true;
        }
        return false;
    }

    @Override // h.h
    public final /* synthetic */ Object getValue() {
        VM vm = this.f156686a;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ad(this.f156688c.invoke(), this.f156689d.invoke()).a(h.f.a.a(this.f156687b));
        this.f156686a = vm2;
        l.a((Object) vm2, "");
        return vm2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends androidx.lifecycle.af> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends androidx.lifecycle.ad$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(c<VM> cVar, a<? extends af> aVar, a<? extends ad.b> aVar2) {
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        this.f156687b = cVar;
        this.f156688c = aVar;
        this.f156689d = aVar2;
    }
}

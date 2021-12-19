package androidx.activity;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f830a;

    /* renamed from: b  reason: collision with root package name */
    CopyOnWriteArrayList<a> f831b;

    static {
        Covode.recordClassIndex(223);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        this.f831b.remove(aVar);
    }
}

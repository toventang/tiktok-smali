package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3483a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0049a f3484b;

    static {
        Covode.recordClassIndex(1283);
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3483a = obj;
        this.f3484b = a.f3497a.b(obj.getClass());
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        a.C0049a aVar2 = this.f3484b;
        Object obj = this.f3483a;
        a.C0049a.a(aVar2.f3500a.get(aVar), mVar, aVar, obj);
        a.C0049a.a(aVar2.f3500a.get(i.a.ON_ANY), mVar, aVar, obj);
    }
}

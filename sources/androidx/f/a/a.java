package androidx.f.a;

import android.app.Application;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class a extends ad.a {

    /* renamed from: b  reason: collision with root package name */
    private final ad.a f2848b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, javax.a.a<b<? extends ac>>> f2849c;

    static {
        Covode.recordClassIndex(1011);
    }

    @Override // androidx.lifecycle.ad.d, androidx.lifecycle.ad.a, androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        javax.a.a<b<? extends ac>> aVar = this.f2849c.get(cls.getName());
        return aVar == null ? (T) this.f2848b.a(cls) : (T) aVar.get().a();
    }

    a(Application application, ad.a aVar, Map<String, javax.a.a<b<? extends ac>>> map) {
        super(application);
        this.f2848b = aVar;
        this.f2849c = map;
    }
}

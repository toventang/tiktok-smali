package dagger.hilt.android.internal.c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;

public final class d implements c<Application> {

    /* renamed from: a  reason: collision with root package name */
    private final c f156659a;

    static {
        Covode.recordClassIndex(104048);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f156659a);
    }

    public static Application a(c cVar) {
        return (Application) f.a(cVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

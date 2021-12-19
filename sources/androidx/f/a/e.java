package androidx.f.a;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import java.util.Map;
import javax.a.a;

public final class e implements c<ad.b> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Activity> f2853a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Application> f2854b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Map<String, a<b<? extends ac>>>> f2855c;

    static {
        Covode.recordClassIndex(1016);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        this.f2853a.get();
        return a(this.f2854b.get(), this.f2855c.get());
    }

    public static ad.b a(Application application, Map<String, a<b<? extends ac>>> map) {
        return (ad.b) f.a(new a(application, new ad.a(application), map), "Cannot return null from a non-@Nullable @Provides method");
    }
}

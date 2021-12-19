package androidx.f.a;

import android.app.Activity;
import android.app.Application;
import androidx.f.a.c;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import java.util.Map;
import javax.a.a;

public final class d implements c<ad.b> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Activity> f2850a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Application> f2851b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Map<String, a<b<? extends ac>>>> f2852c;

    static {
        Covode.recordClassIndex(1015);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f2850a.get(), this.f2851b.get(), this.f2852c.get());
    }

    public static ad.b a(Activity activity, Application application, Map<String, a<b<? extends ac>>> map) {
        if (activity.getIntent() != null) {
            c.a.a(activity.getIntent());
        }
        return (ad.b) f.a(new a(application, new ad.a(application), map), "Cannot return null from a non-@Nullable @Provides method");
    }
}

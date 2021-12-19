package dagger.hilt.android.internal.c;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class b implements c<e> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Activity> f156657a;

    static {
        Covode.recordClassIndex(104046);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f156657a.get());
    }

    public static e a(Activity activity) {
        return (e) f.a(a.a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }
}

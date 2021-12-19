package ms.bd.o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class a1 extends b.a {
    static {
        Covode.recordClassIndex(105886);
    }

    a1() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Context context = a.f159493a.f159494b;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        TextUtils.equals(packageName, d.a().getPackageName());
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
        String str2 = applicationInfo.sourceDir;
        if (str2 == null) {
            return applicationInfo.publicSourceDir;
        }
        return str2;
    }
}

package androidx.browser.a;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.a.a;
import android.support.a.b;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final a f1784a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f1785b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f1786c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final b f1787d;

    static {
        Covode.recordClassIndex(548);
    }

    public final boolean a(Uri uri, List<Bundle> list) {
        try {
            return this.f1787d.a(this.f1784a, uri, (Bundle) null, (List<Bundle>) null);
        } catch (RemoteException unused) {
            return false;
        }
    }

    e(b bVar, a aVar, ComponentName componentName) {
        this.f1787d = bVar;
        this.f1784a = aVar;
        this.f1785b = componentName;
    }
}

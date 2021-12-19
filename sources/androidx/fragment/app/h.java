package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.g.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;
import java.io.PrintWriter;

public abstract class h<E> extends f {

    /* renamed from: a  reason: collision with root package name */
    private final int f2928a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f2929b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2930c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2931d;

    /* renamed from: e  reason: collision with root package name */
    public final j f2932e;

    static {
        Covode.recordClassIndex(1044);
    }

    @Override // androidx.fragment.app.f
    public View a(int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
    }

    public void a(Fragment fragment, String[] strArr, int i2) {
    }

    public void a(String str, PrintWriter printWriter, String[] strArr) {
    }

    @Override // androidx.fragment.app.f
    public boolean a() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void d() {
    }

    public boolean e() {
        return true;
    }

    public abstract E g();

    public int f() {
        return this.f2928a;
    }

    public LayoutInflater c() {
        return LayoutInflater.from(this.f2930c);
    }

    h(e eVar) {
        this(eVar, eVar, eVar.mHandler);
    }

    private h(Activity activity, Context context, Handler handler) {
        this.f2932e = new j();
        this.f2929b = activity;
        this.f2930c = (Context) g.a(context, "context == null");
        this.f2931d = (Handler) g.a(handler, "handler == null");
        this.f2928a = 0;
    }

    public void a(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            Context context = this.f2930c;
            a.a(intent, context);
            context.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void a(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 == -1) {
            androidx.core.app.a.a(this.f2929b, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }
}

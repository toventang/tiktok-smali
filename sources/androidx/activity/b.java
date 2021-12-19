package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.d;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import androidx.savedstate.a;
import androidx.savedstate.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.Iterator;
import java.util.Map;

public final class b extends d implements d, ag, c {

    /* renamed from: a  reason: collision with root package name */
    private final n f823a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.b f824b;

    /* renamed from: c  reason: collision with root package name */
    private af f825c;

    /* renamed from: d  reason: collision with root package name */
    private final OnBackPressedDispatcher f826d;

    /* renamed from: e  reason: collision with root package name */
    private int f827e;

    static {
        Covode.recordClassIndex(221);
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        Object f828a;

        /* renamed from: b  reason: collision with root package name */
        af f829b;

        static {
            Covode.recordClassIndex(222);
        }

        a() {
        }
    }

    @Override // androidx.core.app.d, androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f823a;
    }

    @Override // androidx.savedstate.c
    public final androidx.savedstate.a a() {
        return this.f824b.f4375b;
    }

    public final Object onRetainNonConfigurationInstance() {
        a aVar;
        af afVar = this.f825c;
        if (afVar == null && (aVar = (a) getLastNonConfigurationInstance()) != null) {
            afVar = aVar.f829b;
        }
        if (afVar == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.f828a = null;
        aVar2.f829b = afVar;
        return aVar2;
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        if (getApplication() != null) {
            if (this.f825c == null) {
                a aVar = (a) getLastNonConfigurationInstance();
                if (aVar != null) {
                    this.f825c = aVar.f829b;
                }
                if (this.f825c == null) {
                    this.f825c = new af();
                }
            }
            return this.f825c;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void onBackPressed() {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f826d;
        Iterator<c> descendingIterator = onBackPressedDispatcher.f816b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().f830a) {
                return;
            }
        }
        if (onBackPressedDispatcher.f815a != null) {
            onBackPressedDispatcher.f815a.run();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.core.app.d
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.savedstate.b bVar = this.f824b;
        i lifecycle = bVar.f4374a.getLifecycle();
        if (lifecycle.a() == i.b.INITIALIZED) {
            lifecycle.a(new Recreator(bVar.f4374a));
            androidx.savedstate.a aVar = bVar.f4375b;
            if (!aVar.f4372c) {
                if (bundle != null) {
                    aVar.f4371b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.a(new SavedStateRegistry$1(aVar));
                aVar.f4372c = true;
                x.a(this);
                int i2 = this.f827e;
                if (i2 != 0) {
                    setContentView(i2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    @Override // androidx.core.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        i lifecycle = getLifecycle();
        if (lifecycle instanceof n) {
            ((n) lifecycle).b(i.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        androidx.savedstate.a aVar = this.f824b.f4375b;
        Bundle bundle2 = new Bundle();
        if (aVar.f4371b != null) {
            bundle2.putAll(aVar.f4371b);
        }
        androidx.a.a.b.b<K, V>.d a2 = aVar.f4370a.a();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

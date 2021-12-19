package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.c.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.e.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class cz extends Fragment implements j {

    /* renamed from: c  reason: collision with root package name */
    private static WeakHashMap<e, WeakReference<cz>> f50216c = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    int f50217a = 0;

    /* renamed from: b  reason: collision with root package name */
    Bundle f50218b;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, LifecycleCallback> f50219d = new a();

    @Override // com.google.android.gms.common.api.internal.j
    public final /* synthetic */ Activity a() {
        return getActivity();
    }

    static {
        Covode.recordClassIndex(31298);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f50217a = 5;
        Iterator<LifecycleCallback> it = this.f50219d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f50217a = 3;
        for (LifecycleCallback lifecycleCallback : this.f50219d.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f50217a = 2;
        for (LifecycleCallback lifecycleCallback : this.f50219d.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f50217a = 4;
        for (LifecycleCallback lifecycleCallback : this.f50219d.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f50217a = 1;
        this.f50218b = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f50219d.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.a(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f50219d.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    public static cz a(e eVar) {
        cz czVar;
        WeakReference<cz> weakReference = f50216c.get(eVar);
        if (weakReference != null && (czVar = weakReference.get()) != null) {
            return czVar;
        }
        try {
            cz czVar2 = (cz) eVar.getSupportFragmentManager().a("SupportLifecycleFragmentImpl");
            if (czVar2 == null || czVar2.isRemoving()) {
                czVar2 = new cz();
                eVar.getSupportFragmentManager().a().a(czVar2, "SupportLifecycleFragmentImpl").c();
            }
            f50216c.put(eVar, new WeakReference<>(czVar2));
            return czVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.f50219d.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f50219d.containsKey(str)) {
            this.f50219d.put(str, lifecycleCallback);
            if (this.f50217a > 0) {
                new g(Looper.getMainLooper()).post(new cy(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.f50219d.values()) {
            lifecycleCallback.a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f50219d.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}

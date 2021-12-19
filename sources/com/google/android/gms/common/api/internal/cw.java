package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.e.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class cw extends Fragment implements j {

    /* renamed from: c  reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<cw>> f50206c = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    int f50207a = 0;

    /* renamed from: b  reason: collision with root package name */
    Bundle f50208b;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, LifecycleCallback> f50209d = new a();

    @Override // com.google.android.gms.common.api.internal.j
    public final Activity a() {
        return getActivity();
    }

    static {
        Covode.recordClassIndex(31295);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f50207a = 5;
        Iterator<LifecycleCallback> it = this.f50209d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f50207a = 3;
        for (LifecycleCallback lifecycleCallback : this.f50209d.values()) {
            lifecycleCallback.c();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f50207a = 2;
        for (LifecycleCallback lifecycleCallback : this.f50209d.values()) {
            lifecycleCallback.b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f50207a = 4;
        for (LifecycleCallback lifecycleCallback : this.f50209d.values()) {
            lifecycleCallback.d();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f50207a = 1;
        this.f50208b = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f50209d.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.a(bundle2);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f50209d.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    public static cw a(Activity activity) {
        cw cwVar;
        WeakReference<cw> weakReference = f50206c.get(activity);
        if (weakReference != null && (cwVar = weakReference.get()) != null) {
            return cwVar;
        }
        try {
            cw cwVar2 = (cw) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (cwVar2 == null || cwVar2.isRemoving()) {
                cwVar2 = new cw();
                activity.getFragmentManager().beginTransaction().add(cwVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f50206c.put(activity, new WeakReference<>(cwVar2));
            return cwVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.f50209d.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f50209d.containsKey(str)) {
            this.f50209d.put(str, lifecycleCallback);
            if (this.f50207a > 0) {
                new g(Looper.getMainLooper()).post(new cx(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.f50209d.values()) {
            lifecycleCallback.a(i2, i3, intent);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f50209d.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}

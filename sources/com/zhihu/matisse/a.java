package com.zhihu.matisse;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f156395a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Fragment> f156396b;

    static {
        Covode.recordClassIndex(103867);
    }

    /* access modifiers changed from: package-private */
    public final Fragment b() {
        WeakReference<Fragment> weakReference = this.f156396b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Activity a() {
        return this.f156395a.get();
    }

    private a(Activity activity) {
        this(activity, null);
    }

    public static a a(Activity activity) {
        return new a(activity);
    }

    private a(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public static a a(Fragment fragment) {
        return new a(fragment);
    }

    public final c a(Set<b> set) {
        return new c(this, set);
    }

    private a(Activity activity, Fragment fragment) {
        this.f156395a = new WeakReference<>(activity);
        this.f156396b = new WeakReference<>(fragment);
    }
}

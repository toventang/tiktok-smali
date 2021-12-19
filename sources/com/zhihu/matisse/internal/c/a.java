package com.zhihu.matisse.internal.c;

import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f156411a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Fragment> f156412b = null;

    /* renamed from: c  reason: collision with root package name */
    public com.zhihu.matisse.internal.entity.a f156413c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f156414d;

    static {
        Covode.recordClassIndex(103881);
    }

    public a(Activity activity) {
        this.f156411a = new WeakReference<>(activity);
    }
}

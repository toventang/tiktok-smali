package com.facebook.drawee.g;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1174a f47485a;

    /* renamed from: b  reason: collision with root package name */
    public final float f47486b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47487c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47488d;

    /* renamed from: e  reason: collision with root package name */
    public long f47489e;

    /* renamed from: f  reason: collision with root package name */
    public float f47490f;

    /* renamed from: g  reason: collision with root package name */
    public float f47491g;

    /* renamed from: com.facebook.drawee.g.a$a  reason: collision with other inner class name */
    public interface AbstractC1174a {
        static {
            Covode.recordClassIndex(28805);
        }

        boolean h();
    }

    static {
        Covode.recordClassIndex(28804);
    }

    public final void a() {
        this.f47485a = null;
        b();
    }

    public final void b() {
        this.f47487c = false;
        this.f47488d = false;
    }

    public a(Context context) {
        this.f47486b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }
}

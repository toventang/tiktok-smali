package com.ss.android.ugc.aweme.feed.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f93475a;

    /* renamed from: b  reason: collision with root package name */
    public final int f93476b;

    /* renamed from: c  reason: collision with root package name */
    public final float f93477c;

    /* renamed from: d  reason: collision with root package name */
    public final float f93478d;

    /* renamed from: e  reason: collision with root package name */
    public final int f93479e;

    /* renamed from: f  reason: collision with root package name */
    public final int f93480f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f93481g;

    static {
        Covode.recordClassIndex(59219);
    }

    public final boolean a() {
        if (this.f93480f == 0) {
            return true;
        }
        return false;
    }

    public f(int i2) {
        this(false, 1, 0.0f, 0.0f, i2, 0);
    }

    public f(int i2, byte b2) {
        this(false, 2, 0.0f, 0.0f, i2, 1);
    }

    public f(int i2, float f2, float f3, int i3) {
        this(true, i2, f2, f3, i3, 0);
    }

    private f(boolean z, int i2, float f2, float f3, int i3, int i4) {
        this.f93475a = z;
        this.f93476b = i2;
        this.f93477c = f2;
        this.f93478d = f3;
        this.f93479e = i3;
        this.f93480f = i4;
    }
}

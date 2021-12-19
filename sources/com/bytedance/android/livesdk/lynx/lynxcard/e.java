package com.bytedance.android.livesdk.lynx.lynxcard;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f18795a;

    /* renamed from: b  reason: collision with root package name */
    public final View f18796b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18797c;

    /* renamed from: d  reason: collision with root package name */
    public final a f18798d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18799e;

    public interface a {
        static {
            Covode.recordClassIndex(11129);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(11128);
    }

    public /* synthetic */ e(Uri uri, int i2, a aVar) {
        this(uri, null, i2, aVar, false);
    }

    public e(Uri uri, View view, int i2, a aVar, boolean z) {
        l.d(uri, "");
        this.f18795a = uri;
        this.f18796b = view;
        this.f18797c = i2;
        this.f18798d = aVar;
        this.f18799e = z;
    }
}

package com.bytedance.sdk.bdlynx.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.a.c.a;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f43653a = new a();

    /* renamed from: b  reason: collision with root package name */
    public Activity f43654b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f43655c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f43656d;

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f43657e;

    static {
        Covode.recordClassIndex(26715);
    }

    public b(Context context) {
        l.c(context, "");
        this.f43655c = context;
        this.f43654b = (Activity) (!(context instanceof Activity) ? null : context);
        this.f43656d = new ConcurrentHashMap<>();
        this.f43657e = new ConcurrentHashMap<>();
    }
}

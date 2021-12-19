package com.ss.ugc.live.a.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.c;
import java.io.File;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f153996a;

    /* renamed from: b  reason: collision with root package name */
    private String f153997b;

    static {
        Covode.recordClassIndex(102694);
    }

    @Override // com.ss.ugc.live.a.a.a.b
    public final String a() {
        return this.f153997b;
    }

    public a(Context context) {
        this.f153996a = context;
        this.f153997b = context.getDir("gift_resource", 0).getAbsolutePath();
    }

    @Override // com.ss.ugc.live.a.a.a.b
    public final String a(c cVar) {
        return this.f153997b + File.separator + cVar.f154005b + File.separator + cVar.f154008e + File.separator;
    }
}

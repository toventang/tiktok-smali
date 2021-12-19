package com.bytedance.ies.bullet.service.base.d.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.e;
import com.bytedance.ies.bullet.service.base.ac;
import com.bytedance.ies.bullet.service.base.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Bundle f32588a = new Bundle();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f32589b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f32590c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<? extends g> f32591d;

    /* renamed from: e  reason: collision with root package name */
    public ac f32592e = new ac.a();

    /* renamed from: f  reason: collision with root package name */
    public e f32593f = new e.a();

    static {
        Covode.recordClassIndex(19346);
    }

    public final void a(Bundle bundle) {
        l.c(bundle, "");
        this.f32588a = bundle;
    }

    public final void a(e eVar) {
        l.c(eVar, "");
        this.f32593f = eVar;
    }

    public final void a(List<String> list) {
        l.c(list, "");
        this.f32590c = list;
    }
}

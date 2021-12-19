package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<e> f32611a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<? extends Class<? extends IXResourceLoader>> f32612b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends Class<? extends IXResourceLoader>> f32613c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends Class<? extends IXResourceLoader>> f32614d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f32615e;

    static {
        Covode.recordClassIndex(19374);
    }

    public final void a(List<e> list) {
        l.c(list, "");
        this.f32611a = list;
    }

    public a(boolean z) {
        this.f32615e = z;
    }
}

package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import h.f.b.l;
import java.util.List;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f37001a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f37002b;

    /* renamed from: c  reason: collision with root package name */
    private int f37003c;

    static {
        Covode.recordClassIndex(22253);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final String a() {
        return this.f37001a;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final List<f> b() {
        return this.f37002b;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final int c() {
        return this.f37003c;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h
    public final void a(int i2) {
        this.f37003c = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, List<? extends f> list, int i2) {
        l.c(str, "");
        l.c(list, "");
        this.f37001a = str;
        this.f37002b = list;
        this.f37003c = i2;
    }
}

package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public String f55782b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55783c;

    static {
        Covode.recordClassIndex(34887);
    }

    public ShadowNode a() {
        return null;
    }

    public com.lynx.tasm.a b() {
        return null;
    }

    public LynxFlattenUI b(j jVar) {
        return null;
    }

    public String toString() {
        return "[" + getClass().getSimpleName() + " - " + this.f55782b + "]";
    }

    public a(String str) {
        this(str, false);
    }

    public LynxUI a(j jVar) {
        throw new RuntimeException(this.f55782b + " is a virtual node, do not have real ui!");
    }

    public a(String str, boolean z) {
        this.f55782b = str;
        this.f55783c = z;
    }
}

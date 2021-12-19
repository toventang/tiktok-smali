package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.b.a.a.f;
import com.lynx.b.a.a.h;
import com.lynx.b.a.a.i;
import com.lynx.b.a.b.b;
import com.lynx.b.a.b.c;
import h.f.b.l;

public final class k extends RelativeLayout implements f {
    static {
        Covode.recordClassIndex(22351);
    }

    @Override // com.lynx.b.a.a.g
    public final int a(i iVar, boolean z) {
        l.c(iVar, "");
        return 0;
    }

    @Override // com.lynx.b.a.a.g
    public final void a(float f2, int i2, int i3) {
    }

    @Override // com.lynx.b.a.a.g
    public final void a(h hVar, int i2, int i3) {
        l.c(hVar, "");
    }

    @Override // com.lynx.b.a.a.g
    public final void a(i iVar, int i2, int i3) {
        l.c(iVar, "");
    }

    @Override // com.lynx.b.a.g.f
    public final void a(i iVar, b bVar, b bVar2) {
        l.c(iVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
    }

    @Override // com.lynx.b.a.a.g
    public final void a(boolean z, float f2, int i2, int i3, int i4) {
    }

    @Override // com.lynx.b.a.a.g
    public final boolean a() {
        return false;
    }

    @Override // com.lynx.b.a.a.g
    public final void b(i iVar, int i2, int i3) {
        l.c(iVar, "");
    }

    @Override // com.lynx.b.a.a.g
    public final void setPrimaryColors(int... iArr) {
        l.c(iArr, "");
    }

    @Override // com.lynx.b.a.a.g
    public final View getView() {
        return this;
    }

    @Override // com.lynx.b.a.a.g
    public final c getSpinnerStyle() {
        c cVar = c.f55144a;
        l.a((Object) cVar, "");
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private k(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(3063);
        MethodCollector.o(3063);
    }

    public /* synthetic */ k(Context context, byte b2) {
        this(context);
    }
}

package com.lynx.tasm;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.f;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.c;
import com.lynx.tasm.component.a;
import com.lynx.tasm.provider.b;
import com.lynx.tasm.provider.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class n {

    /* renamed from: j  reason: collision with root package name */
    static Float f56754j;

    /* renamed from: a  reason: collision with root package name */
    b f56755a;

    /* renamed from: b  reason: collision with root package name */
    c f56756b;

    /* renamed from: c  reason: collision with root package name */
    List<f> f56757c;

    /* renamed from: d  reason: collision with root package name */
    l f56758d;

    /* renamed from: e  reason: collision with root package name */
    boolean f56759e;

    /* renamed from: f  reason: collision with root package name */
    boolean f56760f;

    /* renamed from: g  reason: collision with root package name */
    Float f56761g;

    /* renamed from: h  reason: collision with root package name */
    a f56762h;

    /* renamed from: i  reason: collision with root package name */
    final Map<String, h> f56763i = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    boolean f56764k = true;

    /* renamed from: l  reason: collision with root package name */
    boolean f56765l = LynxEnv.b().f55539i;

    /* renamed from: m  reason: collision with root package name */
    boolean f56766m = false;
    boolean n = false;
    boolean o;
    r p = r.ALL_ON_UI;
    int q;
    int r;
    int s = -1;
    int t = -1;
    float u = 1.0f;

    static {
        Covode.recordClassIndex(35355);
    }

    public n() {
        LynxEnv.b().a();
        this.f56756b = new c(LynxEnv.b().c());
        this.f56755a = LynxEnv.b().f55532b;
        this.f56757c = new ArrayList();
        this.f56761g = null;
        Float f2 = f56754j;
        if (f2 != null) {
            this.f56761g = f2;
        }
    }

    public final n a(float f2) {
        this.u = f2;
        return this;
    }

    public final n b(boolean z) {
        this.f56766m = z;
        return this;
    }

    public final n a(a aVar) {
        this.f56762h = aVar;
        return this;
    }

    public n a(l lVar) {
        this.f56758d = lVar;
        return this;
    }

    public final LynxView a(Context context) {
        boolean z;
        TraceEvent.a(0, "CreateLynxView");
        com.lynx.tasm.e.b bVar = com.lynx.tasm.e.a.a().f56601a;
        if (bVar == null || !bVar.b()) {
            z = false;
        } else {
            z = true;
        }
        this.f56760f = z;
        LynxView lynxView = new LynxView(context, this);
        TraceEvent.b(0, "CreateLynxView");
        return lynxView;
    }

    public n a(r rVar) {
        if (rVar != null) {
            this.p = rVar;
        }
        return this;
    }

    public n a(List<com.lynx.tasm.behavior.a> list) {
        this.f56756b.a(list);
        return this;
    }

    public n a(boolean z) {
        this.f56759e = z;
        return this;
    }

    public n a(int i2, int i3) {
        this.r = i3;
        this.q = i2;
        return this;
    }

    public final n a(String str, h hVar) {
        this.f56763i.put(str, hVar);
        return this;
    }

    public void a(String str, Class<? extends LynxModule> cls, Object obj) {
        f fVar = new f();
        fVar.f55517b = cls;
        fVar.f55518c = obj;
        fVar.f55516a = str;
        this.f56757c.add(fVar);
    }
}

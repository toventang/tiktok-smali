package com.bytedance.android.monitor.i;

import com.bytedance.android.monitor.lynx.b;
import com.bytedance.android.monitor.lynx.c.a.f;
import com.bytedance.android.monitor.lynx.c.a.g;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.j;
import com.lynx.tasm.o;
import h.f.b.l;

public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public final LynxView f23520a;

    static {
        Covode.recordClassIndex(13967);
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        super.a();
        b.f23580f.f23587e.b(this.f23520a);
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        super.b();
        b.f23580f.f23587e.c(this.f23520a);
    }

    @Override // com.lynx.tasm.o
    public final void c() {
        super.c();
        b.f23580f.f23587e.d(this.f23520a);
    }

    @Override // com.lynx.tasm.o
    public final void d() {
        super.d();
        b.f23580f.f23587e.a(this.f23520a);
    }

    @Override // com.lynx.tasm.o
    public final void e() {
        b.f23580f.f23587e.e(this.f23520a);
        super.e();
    }

    public a(LynxView lynxView) {
        l.c(lynxView, "");
        this.f23520a = lynxView;
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        super.a(str);
        b.f23580f.f23587e.a(str, this.f23520a);
    }

    @Override // com.lynx.tasm.o
    public final void a(j jVar) {
        super.a(jVar);
        if (jVar != null) {
            l.c(jVar, "");
            f fVar = new f();
            l.c(jVar, "");
            l.c(fVar, "");
            fVar.f23646b = "lynx_error";
            fVar.f23647c = jVar.f56744a;
            fVar.f23648d = jVar.a();
            b.f23580f.f23587e.a(fVar, this.f23520a);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        super.a(lynxPerfMetric);
        if (lynxPerfMetric != null) {
            l.c(lynxPerfMetric, "");
            g gVar = new g();
            l.c(lynxPerfMetric, "");
            l.c(gVar, "");
            gVar.f23649b = lynxPerfMetric.getFirsPageLayout();
            gVar.f23650c = lynxPerfMetric.getFirsPageLayout();
            gVar.f23651d = lynxPerfMetric.getTti();
            gVar.f23652e = lynxPerfMetric.getLayout();
            gVar.f23653f = lynxPerfMetric.getDiffRootCreate();
            gVar.f23654g = lynxPerfMetric.getDiffSameRoot();
            gVar.f23655h = lynxPerfMetric.getTasmEndDecodeFinishLoadTemplate();
            gVar.f23656i = lynxPerfMetric.getTasmBinaryDecode();
            gVar.f23657j = lynxPerfMetric.getTasmFinishLoadTemplate();
            gVar.f23658k = lynxPerfMetric.getRenderPage();
            gVar.f23660m = lynxPerfMetric.toJSONObject();
            b.f23580f.f23587e.a(gVar, this.f23520a);
        }
    }
}

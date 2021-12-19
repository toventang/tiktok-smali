package com.bytedance.android.monitorV2.j;

import com.bytedance.android.monitorV2.lynx.a;
import com.bytedance.android.monitorV2.lynx.c.b.e;
import com.bytedance.android.monitorV2.lynx.c.b.f;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.j;
import com.lynx.tasm.o;
import h.f.b.l;

public final class b extends o {

    /* renamed from: a  reason: collision with root package name */
    public final LynxView f24003a;

    /* renamed from: b  reason: collision with root package name */
    private final a f24004b = new com.bytedance.android.monitorV2.lynx.b();

    static {
        Covode.recordClassIndex(14149);
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        super.a();
        this.f24004b.b(this.f24003a);
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        super.b();
        this.f24004b.c(this.f24003a);
    }

    @Override // com.lynx.tasm.o
    public final void c() {
        super.c();
        this.f24004b.d(this.f24003a);
    }

    @Override // com.lynx.tasm.o
    public final void d() {
        super.d();
        this.f24004b.a(this.f24003a);
    }

    @Override // com.lynx.tasm.o
    public final void e() {
        this.f24004b.e(this.f24003a);
        super.e();
    }

    public b(LynxView lynxView) {
        l.c(lynxView, "");
        this.f24003a = lynxView;
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        super.a(str);
        this.f24004b.a(str, this.f24003a);
    }

    @Override // com.lynx.tasm.o
    public final void a(j jVar) {
        super.a(jVar);
        if (jVar != null) {
            l.c(jVar, "");
            e eVar = new e();
            l.c(jVar, "");
            l.c(eVar, "");
            eVar.f24119b = "lynx_error";
            eVar.f24120c = jVar.f56744a;
            eVar.f24121d = jVar.a();
            this.f24004b.a(eVar, this.f24003a);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        super.a(lynxPerfMetric);
        if (lynxPerfMetric != null) {
            l.c(lynxPerfMetric, "");
            f fVar = new f();
            l.c(lynxPerfMetric, "");
            l.c(fVar, "");
            fVar.f24122b = lynxPerfMetric.getFirsPageLayout();
            fVar.f24123c = lynxPerfMetric.getFirsPageLayout();
            fVar.f24124d = lynxPerfMetric.getTti();
            fVar.f24125e = lynxPerfMetric.getLayout();
            fVar.f24126f = lynxPerfMetric.getDiffRootCreate();
            fVar.f24127g = lynxPerfMetric.getDiffSameRoot();
            fVar.f24128h = lynxPerfMetric.getTasmEndDecodeFinishLoadTemplate();
            fVar.f24129i = lynxPerfMetric.getTasmBinaryDecode();
            fVar.f24130j = lynxPerfMetric.getTasmFinishLoadTemplate();
            fVar.f24131k = lynxPerfMetric.getRenderPage();
            fVar.f24133m = lynxPerfMetric.toJSONObject();
            this.f24004b.a(fVar, this.f24003a);
        }
    }
}

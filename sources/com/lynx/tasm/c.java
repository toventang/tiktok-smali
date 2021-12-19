package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.c.b;
import com.lynx.tasm.c.d;
import com.lynx.tasm.c.f;
import com.lynx.tasm.c.i;
import java.util.ArrayList;
import java.util.Iterator;

public class c {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<b> f56482a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f56483b;

    /* renamed from: c  reason: collision with root package name */
    private TemplateAssembler f56484c;

    public interface a {
        static {
            Covode.recordClassIndex(35242);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(35243);
        }

        void a(EnumC1267c cVar, d dVar);
    }

    static {
        Covode.recordClassIndex(35241);
    }

    /* renamed from: com.lynx.tasm.c$c  reason: collision with other inner class name */
    public enum EnumC1267c {
        kLynxEventTypeTouchEvent,
        kLynxEventTypeCustomEvent,
        kLynxEventTypeLayoutEvent;

        static {
            Covode.recordClassIndex(35244);
        }
    }

    public final void b(b bVar) {
        TemplateAssembler templateAssembler = this.f56484c;
        if (templateAssembler != null) {
            templateAssembler.a(bVar);
        }
    }

    public c(TemplateAssembler templateAssembler) {
        this.f56484c = templateAssembler;
    }

    public final void a(b bVar) {
        TemplateAssembler templateAssembler = this.f56484c;
        if (templateAssembler != null) {
            templateAssembler.a(bVar);
        }
        a(EnumC1267c.kLynxEventTypeCustomEvent, bVar);
    }

    public final void a(f fVar) {
        MethodCollector.i(13243);
        TemplateAssembler templateAssembler = this.f56484c;
        if (templateAssembler != null) {
            if (templateAssembler.f55577g) {
                LLog.a(6, "TemplateAssembler", "SendInternalEvent: id " + fVar.f56496b + " tag: " + fVar.f56495a);
                MethodCollector.o(13243);
                return;
            }
            templateAssembler.nativeSendInternalEvent(templateAssembler.f55571a, fVar.f56495a, fVar.f56496b, null, 0);
        }
        MethodCollector.o(13243);
    }

    public final void a(i iVar) {
        MethodCollector.i(13163);
        if (this.f56484c != null) {
            if (this.f56483b != null) {
                "tap".equals(iVar.f56492e);
            }
            TemplateAssembler templateAssembler = this.f56484c;
            String str = iVar.f56492e;
            if (templateAssembler.f55577g) {
                LLog.a(6, "TemplateAssembler", "SendTouchEvent: " + str + " error: TemplateAssemble is destroyed.");
                MethodCollector.o(13163);
                return;
            }
            templateAssembler.nativeSendTouchEvent(templateAssembler.f55571a, str, iVar.f56491d, iVar.f56497a.f56500a, iVar.f56497a.f56501b, iVar.f56498b.f56500a, iVar.f56498b.f56501b, iVar.f56499c.f56500a, iVar.f56499c.f56501b);
        }
        MethodCollector.o(13163);
    }

    /* access modifiers changed from: package-private */
    public final void a(EnumC1267c cVar, d dVar) {
        Iterator<b> it = this.f56482a.iterator();
        while (it.hasNext()) {
            it.next().a(cVar, dVar);
        }
    }
}

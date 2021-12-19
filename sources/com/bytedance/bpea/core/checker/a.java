package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.h;
import com.bytedance.bpea.basics.l;
import com.bytedance.bpea.core.c.b;
import com.bytedance.bpea.core.c.d;
import com.bytedance.bpea.core.c.f;
import com.bytedance.covode.number.Covode;

public abstract class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private ThreadLocal<l> f26647a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private ThreadLocal<d> f26648b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    private final f f26649c;

    /* renamed from: d  reason: collision with root package name */
    private final f f26650d;

    static {
        Covode.recordClassIndex(15690);
    }

    /* access modifiers changed from: protected */
    public final void a(d dVar) {
        h.f.b.l.c(dVar, "");
        this.f26648b.set(dVar);
    }

    public a(f fVar, f fVar2) {
        h.f.b.l.c(fVar, "");
        h.f.b.l.c(fVar2, "");
        this.f26649c = fVar;
        this.f26650d = fVar2;
    }

    @Override // com.bytedance.bpea.basics.e
    public h a(com.bytedance.bpea.basics.d dVar, com.bytedance.bpea.basics.f fVar) {
        String str = "";
        h.f.b.l.c(fVar, str);
        try {
            h.f.b.l.c(fVar, str);
            l lVar = new l();
            this.f26647a.set(lVar);
            com.bytedance.bpea.core.c.a aVar = new com.bytedance.bpea.core.c.a(dVar, fVar, this.f26649c, 0, null);
            aVar.a(lVar);
            b.a(aVar);
            a(d.INFO);
            h b2 = b(dVar, fVar);
            a(dVar, fVar, b2, null);
            return b2;
        } catch (com.bytedance.bpea.basics.a e2) {
            a(dVar, fVar, null, e2);
            throw e2;
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = str;
            }
            h hVar = new h(-1, localizedMessage);
            a(d.WARN);
            String localizedMessage2 = th.getLocalizedMessage();
            if (localizedMessage2 != null) {
                str = localizedMessage2;
            }
            System.currentTimeMillis();
            b.a(str);
            a(dVar, fVar, hVar, null);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.bytedance.bpea.basics.d r9, com.bytedance.bpea.basics.f r10, com.bytedance.bpea.basics.h r11, com.bytedance.bpea.basics.a r12) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.core.checker.a.a(com.bytedance.bpea.basics.d, com.bytedance.bpea.basics.f, com.bytedance.bpea.basics.h, com.bytedance.bpea.basics.a):void");
    }
}

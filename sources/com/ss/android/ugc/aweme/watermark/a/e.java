package com.ss.android.ugc.aweme.watermark.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.q;
import java.util.ArrayList;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final d f144755a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f144756b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144757c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f144758d;

    static {
        Covode.recordClassIndex(94677);
    }

    e(d dVar, boolean z, boolean z2, boolean z3) {
        this.f144755a = dVar;
        this.f144756b = z;
        this.f144757c = z2;
        this.f144758d = z3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        d dVar = this.f144755a;
        boolean z = this.f144756b;
        boolean z2 = this.f144757c;
        boolean z3 = this.f144758d;
        if (dVar.f144746a == null) {
            q.a("WaterMarkComposer", new Throwable("context is null"));
            if (dVar.f144747b.f144824g != null) {
                dVar.f144747b.f144824g.b(-1);
            }
            return null;
        }
        dVar.f144748c = System.currentTimeMillis();
        int width = dVar.f144747b.f144821d.getWidth();
        int height = dVar.f144747b.f144821d.getHeight();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(width));
        arrayList.add(Integer.valueOf(height));
        g.a().p().a(arrayList, dVar.f144747b.f144818a, dVar.f144747b.f144820c, new f(dVar, z, z2, z3, width, height, arrayList), new g(dVar));
        return null;
    }
}

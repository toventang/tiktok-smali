package com.ss.android.ugc.aweme.effect.c.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import dmt.av.video.w;
import h.f.a.a;
import h.f.a.b;
import h.f.b.l;
import java.util.List;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final a<g> f88911a;

    /* renamed from: b  reason: collision with root package name */
    private final a<List<EffectPointModel>> f88912b;

    /* renamed from: c  reason: collision with root package name */
    private final b<Integer, Integer> f88913c;

    /* renamed from: d  reason: collision with root package name */
    private final b<Integer, Integer> f88914d;

    static {
        Covode.recordClassIndex(55922);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final void a(w wVar) {
        List<EffectPointModel> invoke = this.f88912b.invoke();
        a<g> aVar = this.f88911a;
        b<Integer, Integer> bVar = this.f88913c;
        l.d(aVar, "");
        l.d(bVar, "");
        if (!(wVar == null || invoke == null)) {
            for (EffectPointModel effectPointModel : invoke) {
                if (w.a(wVar)) {
                    int G = aVar.invoke().G();
                    effectPointModel.setStartPoint(G - effectPointModel.getEndPoint());
                    effectPointModel.setEndPoint(G - effectPointModel.getStartPoint());
                } else if (w.b(wVar) || w.c(wVar)) {
                    int intValue = bVar.invoke(Integer.valueOf(effectPointModel.getStartPoint())).intValue();
                    int intValue2 = bVar.invoke(Integer.valueOf(effectPointModel.getEndPoint())).intValue();
                    effectPointModel.setStartPoint(intValue);
                    effectPointModel.setEndPoint(intValue2);
                } else if (!w.d(wVar)) {
                    throw new UnsupportedOperationException("remove time effect: " + wVar + " is not supported yet.");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final void b(w wVar) {
        List<EffectPointModel> invoke = this.f88912b.invoke();
        a<g> aVar = this.f88911a;
        b<Integer, Integer> bVar = this.f88914d;
        l.d(aVar, "");
        l.d(bVar, "");
        if (!(wVar == null || invoke == null)) {
            for (EffectPointModel effectPointModel : invoke) {
                if (w.a(wVar)) {
                    int G = aVar.invoke().G();
                    effectPointModel.setStartPoint(G - effectPointModel.getEndPoint());
                    effectPointModel.setEndPoint(G - effectPointModel.getStartPoint());
                } else if (w.b(wVar) || w.c(wVar)) {
                    int intValue = bVar.invoke(Integer.valueOf(effectPointModel.getStartPoint())).intValue();
                    int intValue2 = bVar.invoke(Integer.valueOf(effectPointModel.getEndPoint())).intValue();
                    effectPointModel.setStartPoint(intValue);
                    effectPointModel.setEndPoint(intValue2);
                } else if (!w.d(wVar)) {
                    throw new UnsupportedOperationException("apply time effect: " + wVar + " is not supported yet.");
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.asve.editor.g> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectPointModel>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a<? extends g> aVar, a<? extends List<? extends EffectPointModel>> aVar2, b<? super Integer, Integer> bVar, b<? super Integer, Integer> bVar2) {
        super(aVar);
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f88911a = aVar;
        this.f88912b = aVar2;
        this.f88913c = bVar;
        this.f88914d = bVar2;
    }
}

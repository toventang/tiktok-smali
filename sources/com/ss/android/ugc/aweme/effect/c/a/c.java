package com.ss.android.ugc.aweme.effect.c.a;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.asve.editor.g;
import dmt.av.video.w;
import h.f.a.a;
import h.f.b.l;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final a<t<IAudioEffectParam>> f88910a;

    static {
        Covode.recordClassIndex(55921);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final void a(w wVar) {
        IAudioEffectParam value;
        t<IAudioEffectParam> invoke = this.f88910a.invoke();
        if (invoke != null && (value = invoke.getValue()) != null) {
            l.b(value, "");
            int seqIn = value.getSeqIn();
            int seqOut = value.getSeqOut();
            int a2 = a(wVar, seqIn);
            int a3 = a(wVar, seqOut);
            value.setSeqIn(a2);
            value.setSeqOut(a3);
            invoke.setValue(value);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final void b(w wVar) {
        IAudioEffectParam value;
        t<IAudioEffectParam> invoke = this.f88910a.invoke();
        if (invoke != null && (value = invoke.getValue()) != null) {
            l.b(value, "");
            int seqIn = value.getSeqIn();
            int seqOut = value.getSeqOut();
            int b2 = b(wVar, seqIn);
            int b3 = b(wVar, seqOut);
            value.setSeqIn(b2);
            value.setSeqOut(b3);
            invoke.setValue(value);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends androidx.lifecycle.t<com.bytedance.creativex.editor.preview.IAudioEffectParam>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a<? extends g> aVar, a<? extends t<IAudioEffectParam>> aVar2) {
        super(aVar);
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f88910a = aVar2;
    }
}

package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.a.a;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f125250a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectTextModel f125251b;

    /* renamed from: c  reason: collision with root package name */
    private final b f125252c;

    static {
        Covode.recordClassIndex(82250);
    }

    f(b bVar, EffectTextModel effectTextModel, b bVar2) {
        this.f125250a = bVar;
        this.f125251b = effectTextModel;
        this.f125252c = bVar2;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        b bVar = this.f125250a;
        EffectTextModel effectTextModel = this.f125251b;
        b bVar2 = this.f125252c;
        boolean z = false;
        if (effectTextModel.getTextSticker() == null || !effectTextModel.getHasCoverText()) {
            bVar.p.put(0, new EffectTextModel());
        } else {
            bVar.p.put(0, effectTextModel);
        }
        bVar.o.put(0, Float.valueOf(bVar.f125230a.getVideoCoverViewX()));
        if (!bVar.b()) {
            int i2 = 0;
            while (true) {
                if (!b.a(bVar.f125241l.c().getCoverPublishModel().getEffectTextModel(), bVar.p.get(0))) {
                    i2++;
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            bVar.b();
            g.a().K().b(valueOf.booleanValue(), new e(bVar, bVar2));
            return z.f158842a;
        }
        z = true;
        Boolean valueOf2 = Boolean.valueOf(z);
        bVar.b();
        g.a().K().b(valueOf2.booleanValue(), new e(bVar, bVar2));
        return z.f158842a;
    }
}

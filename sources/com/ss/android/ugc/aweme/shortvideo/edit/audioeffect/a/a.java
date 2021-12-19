package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.guide.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private f f126755a;

    /* renamed from: b  reason: collision with root package name */
    private Effect f126756b;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f126757c;

    /* renamed from: d  reason: collision with root package name */
    private final c f126758d;

    static {
        Covode.recordClassIndex(83168);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d
    public final void a() {
        f fVar = this.f126755a;
        if (fVar != null) {
            fVar.a();
        }
    }

    public a(FrameLayout frameLayout) {
        this(frameLayout, new b((byte) 0));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d
    public final void a(Effect effect) {
        f fVar = this.f126755a;
        if (fVar != null) {
            fVar.a();
        }
        if (effect != null && !l.a(effect, this.f126756b)) {
            this.f126756b = effect;
            f a2 = this.f126758d.a(effect);
            this.f126755a = a2;
            if (a2 != null) {
                a2.a(this.f126757c);
            }
        }
    }

    private a(FrameLayout frameLayout, c cVar) {
        l.d(cVar, "");
        this.f126757c = frameLayout;
        this.f126758d = cVar;
    }
}

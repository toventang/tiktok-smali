package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class DefaultStickerGuidePresenter implements i {

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f135115a;

    /* renamed from: b  reason: collision with root package name */
    private f f135116b;

    /* renamed from: c  reason: collision with root package name */
    private g f135117c;

    /* renamed from: d  reason: collision with root package name */
    private f f135118d;

    /* renamed from: e  reason: collision with root package name */
    private g f135119e;

    /* renamed from: f  reason: collision with root package name */
    private Effect f135120f;

    static {
        Covode.recordClassIndex(88331);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.i
    public final void a() {
        this.f135120f = null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.i
    @v(a = i.a.ON_DESTROY)
    public void hide() {
        f fVar = this.f135116b;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.i
    @v(a = i.a.ON_DESTROY)
    public void hideNotice() {
        f fVar = this.f135118d;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.i
    public final void a(m mVar) {
        mVar.getLifecycle().a(this);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.i
    public final void b(Effect effect) {
        f fVar = this.f135118d;
        if (fVar != null) {
            fVar.a();
        }
        if (effect != null) {
            this.f135120f = effect;
            f a2 = this.f135119e.a(effect);
            this.f135118d = a2;
            a2.a(this.f135115a);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.i
    public final void a(Effect effect) {
        f fVar;
        if (effect == null || !effect.equals(this.f135120f) || (fVar = this.f135116b) == null || !fVar.b()) {
            f fVar2 = this.f135116b;
            if (fVar2 != null) {
                fVar2.a();
            }
            if (effect == null || (!g.D(effect) && effect.equals(this.f135120f) && !effect.getTypes().contains("Game2DV2"))) {
                this.f135120f = effect;
                return;
            }
            this.f135120f = effect;
            f a2 = this.f135117c.a(effect);
            this.f135116b = a2;
            a2.a(this.f135115a);
        }
    }

    public DefaultStickerGuidePresenter(g gVar, FrameLayout frameLayout) {
        this(gVar, new o(), frameLayout);
    }

    private DefaultStickerGuidePresenter(g gVar, g gVar2, FrameLayout frameLayout) {
        this.f135115a = frameLayout;
        this.f135117c = gVar;
        this.f135119e = gVar2;
    }
}

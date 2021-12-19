package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.f.c;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.f;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.main.k;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.m.p;
import java.util.List;

public class StickerListViewModel extends BaseStickerListViewModel implements au {

    /* renamed from: a  reason: collision with root package name */
    private final u<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> f136644a;
    public final m s;

    static {
        Covode.recordClassIndex(89239);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a<T> implements u<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickerListViewModel f136645a;

        static {
            Covode.recordClassIndex(89240);
        }

        a(StickerListViewModel stickerListViewModel) {
            this.f136645a = stickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel> aVar) {
            com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel> aVar2 = aVar;
            if (aVar2 != null) {
                this.f136645a.a(aVar2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public Effect a(f<Effect> fVar) {
        l.d(fVar, "");
        List<Effect> value = this.f136624l.getValue();
        if (value == null) {
            return null;
        }
        o oVar = this.o;
        l.b(value, "");
        return c.a(oVar, value, fVar.f136650b);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public void a(String str) {
        l.d(str, "");
        if (!p.a((CharSequence) str)) {
            this.o.c().j().a(str, true).observe(this.s, this.f136644a);
        }
    }

    /* access modifiers changed from: protected */
    public void a(com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel> aVar) {
        List<Effect> effects;
        l.d(aVar, "");
        a.EnumC1574a aVar2 = aVar.f69569b;
        if (aVar2 != null) {
            int i2 = d.f136648a[aVar2.ordinal()];
            if (i2 == 1) {
                this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
            } else if (i2 == 2) {
                this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
            } else if (i2 == 3) {
                M m2 = aVar.f69568a;
                if (m2 == null || (effects = m2.getEffects()) == null || effects.isEmpty()) {
                    this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                    return;
                }
                this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                a((List<? extends Effect>) effects);
            }
        }
    }

    public final void a(List<? extends Effect> list) {
        l.d(list, "");
        o().a(list);
        this.f136624l.setValue(list);
    }

    public /* synthetic */ StickerListViewModel(m mVar, o oVar, d dVar, g gVar) {
        this(mVar, oVar, dVar, gVar, new k(oVar.c().e()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerListViewModel(m mVar, o oVar, d dVar, g gVar, f fVar) {
        super(mVar, oVar, dVar, gVar, fVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(fVar, "");
        this.s = mVar;
        this.f136644a = new a(this);
    }
}

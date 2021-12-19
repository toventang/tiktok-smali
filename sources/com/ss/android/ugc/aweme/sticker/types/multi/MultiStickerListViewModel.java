package com.ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.f.c;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.main.k;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.b.a;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class MultiStickerListViewModel extends StickerListViewModel implements au, b {
    static {
        Covode.recordClassIndex(88923);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final Effect a(f<Effect> fVar) {
        l.d(fVar, "");
        List<Effect> value = this.f136624l.getValue();
        if (value != null) {
            o oVar = this.o;
            l.b(value, "");
            int i2 = fVar.f136650b;
            l.d(oVar, "");
            l.d(value, "");
            if (value.size() >= i2) {
                if (i2 < 0) {
                    i2 = 0;
                }
                int size = value.size();
                for (int i3 = i2 + 1; i3 < size; i3++) {
                    if (c.d(oVar, value.get(i3))) {
                        return value.get(i3);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.b
    public final void a(Effect effect) {
        l.d(effect, "");
        List<String> children = effect.getChildren();
        if (children == null || children.isEmpty()) {
            this.f136625m.setValue(a.EMPTY);
            this.f136624l.setValue(z.INSTANCE);
            return;
        }
        this.f136625m.setValue(a.NONE);
        Map<String, Effect> a2 = this.o.c().j().a();
        ArrayList arrayList = new ArrayList();
        for (String str : children) {
            Effect effect2 = a2.get(str);
            if (effect2 != null) {
                arrayList.add(effect2);
            }
        }
        a((List<? extends Effect>) arrayList);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final boolean a(Effect effect, boolean z) {
        l.d(effect, "");
        if (!z) {
            return c.b(this.o, effect);
        }
        return c.c(this.o, effect);
    }

    public /* synthetic */ MultiStickerListViewModel(m mVar, o oVar, d dVar, g gVar) {
        this(mVar, oVar, dVar, gVar, new k(oVar.c().e()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiStickerListViewModel(m mVar, o oVar, d dVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.f fVar) {
        super(mVar, oVar, dVar, gVar, fVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(fVar, "");
    }
}

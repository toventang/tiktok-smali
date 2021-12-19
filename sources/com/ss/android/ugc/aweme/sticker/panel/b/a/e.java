package com.ss.android.ugc.aweme.sticker.panel.b.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.f.b.l;

public abstract class e extends a<Effect> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.panel.a.a f135051a;

    /* renamed from: b  reason: collision with root package name */
    public final b f135052b;

    /* renamed from: c  reason: collision with root package name */
    public final o f135053c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> f135054d;

    static {
        Covode.recordClassIndex(88296);
    }

    public final void a(com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar) {
        l.d(bVar, "");
        this.f135054d = bVar;
    }

    public void b(boolean z) {
        this.f135052b.setCustomSelected(z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
    public final void a(boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new t(1.1f, 100, this.f135052b));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar, Integer num) {
        l.d(cVar, "");
        int i2 = f.f135055a[cVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.f135052b.d();
        } else if (i2 == 3 || i2 == 4) {
            this.f135052b.b();
        } else if (i2 == 5) {
            if (num == null) {
                this.f135052b.c();
            } else {
                this.f135052b.a(num.intValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Effect effect, c cVar, Integer num) {
        String str;
        l.d(effect, "");
        l.d(cVar, "");
        String effectId = effect.getEffectId();
        DATA data = this.f136354f;
        if (data != null) {
            str = data.getEffectId();
        } else {
            str = null;
        }
        if (!(!l.a((Object) effectId, (Object) str))) {
            a(cVar, num);
            if (!com.ss.android.ugc.aweme.sticker.f.c.b(this.f135053c, effect) || g.t(effect)) {
                com.ss.android.ugc.tools.view.widget.c.c.a(this.f135052b, false);
            } else {
                com.ss.android.ugc.tools.view.widget.c.c.a(this.f135052b, true);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, b bVar, o oVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar2) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(bVar2, "");
        this.f135052b = bVar;
        this.f135053c = oVar;
        this.f135054d = bVar2;
        view.setOnClickListener(this);
        bVar.setShowDownloadIcon(true);
    }
}

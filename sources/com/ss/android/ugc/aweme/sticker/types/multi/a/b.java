package com.ss.android.ugc.aweme.sticker.types.multi.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.b.a.e;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.presenter.r;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.c.c;
import h.f.b.l;
import java.util.List;

public final class b extends e {

    /* renamed from: e  reason: collision with root package name */
    private final g f136152e;

    static {
        Covode.recordClassIndex(88926);
    }

    public static final class a implements IIsTagNeedUpdatedListener {
        static {
            Covode.recordClassIndex(88927);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
        }

        a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.b$b  reason: collision with other inner class name */
    static final class RunnableC3551b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f136153a;

        static {
            Covode.recordClassIndex(88928);
        }

        RunnableC3551b(b bVar) {
            this.f136153a = bVar;
        }

        public final void run() {
            View view = this.f136153a.itemView;
            l.b(view, "");
            if (view.getParent() != null) {
                this.f136153a.itemView.performClick();
            }
        }
    }

    public final void onClick(View view) {
        int adapterPosition;
        int i2;
        l.d(view, "");
        DATA data = this.f136354f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            r value = this.f135053c.n().f().getValue();
            if (value != null) {
                i2 = value.f135428a;
            } else {
                i2 = -1;
            }
            this.f135054d.b(new f<>(data, adapterPosition, i2, false, true, true, null, null, null, 960));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
    public final /* synthetic */ void a(Effect effect, int i2) {
        String str;
        Effect effect2 = effect;
        l.d(effect2, "");
        com.ss.android.ugc.tools.view.widget.c.b bVar = this.f135052b;
        List<String> urlList = effect2.getIconUrl().getUrlList();
        if (urlList != null) {
            str = urlList.get(0);
        } else {
            str = null;
        }
        c.a(bVar, str);
        this.f136152e.a(effect2, new a());
        com.ss.android.ugc.aweme.sticker.panel.a.a aVar = this.f135051a;
        if (aVar != null && aVar.a(effect2, this.f136356h, i2)) {
            this.itemView.post(new RunnableC3551b(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.e
    public final void a(Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
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
            if (com.ss.android.ugc.aweme.sticker.f.c.c(this.f135053c, effect)) {
                effect.getName();
                getLayoutPosition();
                b(true);
                return;
            }
            b(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, com.ss.android.ugc.tools.view.widget.c.b bVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar2) {
        super(view, bVar, oVar, bVar2);
        l.d(view, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar2, "");
        this.f136152e = gVar;
    }
}

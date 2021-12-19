package com.ss.android.ugc.aweme.sticker.panel.b.a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.f.c;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.m;
import h.a.n;
import h.f.b.l;
import java.util.List;

public class b extends e {

    /* renamed from: e  reason: collision with root package name */
    private final g f135036e;

    static {
        Covode.recordClassIndex(88289);
    }

    public static final class a implements IIsTagNeedUpdatedListener {
        static {
            Covode.recordClassIndex(88290);
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

    public void onClick(View view) {
        int adapterPosition;
        l.d(view, "");
        DATA data = this.f136354f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar = this.f135054d;
            l.d(data, "");
            bVar.b(new f<>(data, adapterPosition, this.f136356h, false, false, false, null, null, null, 1008));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
    public final /* synthetic */ void a(Effect effect, int i2) {
        List<String> urlList;
        String str;
        Effect effect2 = effect;
        l.d(effect2, "");
        this.f135052b.setText(effect2.getName());
        TextView textView = this.f135052b.getTextView();
        if (!c.b(this.f135053c, effect2) || com.ss.android.ugc.aweme.sticker.p.g.t(effect2)) {
            if (textView instanceof m) {
                ((m) textView).setMarqueeEnable(false);
            }
        } else if (textView instanceof m) {
            ((m) textView).setMarqueeEnable(true);
        }
        UrlModel iconUrl = effect2.getIconUrl();
        if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || (str = (String) n.h((List) urlList)) == null)) {
            com.ss.android.ugc.tools.view.widget.c.c.a(this.f135052b, str);
        }
        this.f135036e.a(effect2, new a());
        View view = this.itemView;
        l.b(view, "");
        view.setContentDescription(effect2.getName());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.e
    public final void a(Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        l.d(effect, "");
        l.d(cVar, "");
        b(false);
        a(cVar, num);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, com.ss.android.ugc.tools.view.widget.c.b bVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar2) {
        super(view, bVar, oVar, bVar2);
        l.d(view, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar2, "");
        this.f135036e = gVar;
    }
}

package com.ss.android.ugc.aweme.sticker.panel.b.a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.a.n;
import h.f.b.l;
import java.util.List;

public class g extends e implements c.b {

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.view.internal.g f135056e;

    static {
        Covode.recordClassIndex(88298);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f135057a;

        static {
            Covode.recordClassIndex(88299);
        }

        a(g gVar) {
            this.f135057a = gVar;
        }

        public final void run() {
            View view = this.f135057a.itemView;
            l.b(view, "");
            if (view.getParent() != null) {
                this.f135057a.itemView.performClick();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.c.b
    public final void a() {
        b bVar = this.f135052b;
        if (bVar.f150410e.hasStarted()) {
            ImageView imageView = bVar.f150409d;
            if (imageView == null) {
                l.a("downloadImg");
            }
            imageView.setImageResource(bVar.f150411f);
            ImageView imageView2 = bVar.f150409d;
            if (imageView2 == null) {
                l.a("downloadImg");
            }
            imageView2.setVisibility(4);
            ImageView imageView3 = bVar.f150409d;
            if (imageView3 == null) {
                l.a("downloadImg");
            }
            imageView3.clearAnimation();
        }
    }

    public void onClick(View view) {
        int adapterPosition;
        l.d(view, "");
        DATA data = this.f136354f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            this.f135054d.b(b(data, adapterPosition));
        }
    }

    /* access modifiers changed from: protected */
    public f<Effect> b(Effect effect, int i2) {
        l.d(effect, "");
        return new f<>(effect, i2, this.f136356h, false, false, true, null, this, null, 856);
    }

    public void a(Effect effect, int i2) {
        List<String> urlList;
        String str;
        l.d(effect, "");
        String name = effect.getName();
        if (name != null) {
            this.f135052b.setText(name);
        }
        UrlModel iconUrl = effect.getIconUrl();
        if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || (str = (String) n.h((List) urlList)) == null)) {
            com.ss.android.ugc.tools.view.widget.c.c.a(this.f135052b, str);
        }
        View view = this.itemView;
        l.b(view, "");
        view.setContentDescription(effect.getName());
        int i3 = this.f136356h;
        com.ss.android.ugc.aweme.sticker.panel.a.a aVar = this.f135051a;
        if (aVar != null && aVar.a(effect, i3, i2)) {
            if (!com.ss.android.ugc.aweme.sticker.p.g.a(effect) || i2 != 1 || !this.f135053c.a()) {
                this.itemView.post(new a(this));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, b bVar, o oVar, com.ss.android.ugc.aweme.sticker.view.internal.g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar2) {
        super(view, bVar, oVar, bVar2);
        l.d(view, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar2, "");
        this.f135056e = gVar;
    }
}

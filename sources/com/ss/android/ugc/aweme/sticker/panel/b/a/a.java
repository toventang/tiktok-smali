package com.ss.android.ugc.aweme.sticker.panel.b.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.c.b;
import com.ss.android.ugc.tools.view.widget.c.c;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.List;

public class a extends g {

    /* renamed from: e  reason: collision with root package name */
    private final g f135035e;

    static {
        Covode.recordClassIndex(88288);
    }

    private final void a(Effect effect) {
        String str = (String) n.h((List) effect.getIconUrl().getUrlList());
        if (str != null) {
            c.a(this.f135052b, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.g
    public void onClick(View view) {
        int adapterPosition;
        l.d(view, "");
        DATA data = this.f136354f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            this.f135054d.b(b(data, adapterPosition));
            String id = data.getId();
            int hashCode = hashCode();
            l.d(id, "");
            if (com.ss.android.ugc.aweme.sticker.j.a.f134934b.containsKey(Integer.valueOf(hashCode))) {
                String id2 = data.getId();
                l.d(id2, "");
                com.ss.android.ugc.aweme.sticker.j.a.f134933a.storeBoolean(id2, true);
                String id3 = data.getId();
                int hashCode2 = hashCode();
                l.d(id3, "");
                com.ss.android.ugc.aweme.sticker.j.a.f134934b.remove(Integer.valueOf(hashCode2));
                a((Effect) data);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.e
    public final void a(Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        String str;
        l.d(effect, "");
        l.d(cVar, "");
        super.a(effect, cVar, num);
        l.d(effect, "");
        String b2 = com.ss.android.ugc.aweme.shortvideo.sticker.c.b(effect.getExtra(), "dynamic_icon");
        if (!(b2 == null || b2.length() == 0)) {
            if (!com.ss.android.ugc.aweme.sticker.j.a.f134933a.getBoolean(effect.getId(), false) && !effect.getFileUrl().getUrlList().isEmpty()) {
                String b3 = p.b(effect.getFileUrl().getUrlList().get(0), '/', "");
                if (b3.length() == 0) {
                    str = "";
                } else {
                    str = b3 + '/' + b2;
                }
                if (!(str == null || str.length() == 0)) {
                    b bVar = this.f135052b;
                    l.d(bVar, "");
                    l.d(str, "");
                    com.ss.android.ugc.tools.c.a.b(bVar.getImageView(), str);
                    String id = effect.getId();
                    int hashCode = hashCode();
                    l.d(id, "");
                    com.ss.android.ugc.aweme.sticker.j.a.f134934b.put(Integer.valueOf(hashCode), id);
                    return;
                }
            }
        }
        a(effect);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, b bVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar2) {
        super(view, bVar, oVar, gVar, bVar2);
        l.d(view, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar2, "");
        this.f135035e = gVar;
    }
}

package com.ss.android.ugc.aweme.sticker.panel.b.a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.f.b.l;

public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f135058e = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private final g f135059i;

    static {
        Covode.recordClassIndex(88300);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88301);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.g
    public final f<Effect> b(Effect effect, int i2) {
        l.d(effect, "");
        int i3 = this.f136356h;
        Bundle bundle = new Bundle();
        bundle.putString("enter_method", "click_personal_board");
        return new f<>(effect, i2, i3, false, false, true, bundle, this, null, 792);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, b bVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar2) {
        super(view, bVar, oVar, gVar, bVar2);
        l.d(view, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar2, "");
        this.f135059i = gVar;
    }
}

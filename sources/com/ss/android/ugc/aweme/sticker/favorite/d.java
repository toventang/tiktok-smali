package com.ss.android.ugc.aweme.sticker.favorite;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.c;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.widget.CheckableImageView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import org.json.JSONObject;

public class d extends com.ss.android.ugc.aweme.sticker.presenter.handler.b implements c, l {

    /* renamed from: a  reason: collision with root package name */
    public e f134883a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f134884b;

    /* renamed from: c  reason: collision with root package name */
    private Effect f134885c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.appcompat.app.d f134886d;

    /* renamed from: e  reason: collision with root package name */
    private final b f134887e;

    /* renamed from: f  reason: collision with root package name */
    private final o f134888f;

    /* renamed from: g  reason: collision with root package name */
    private final h f134889g;

    /* renamed from: h  reason: collision with root package name */
    private final StickerPreferences f134890h;

    /* renamed from: i  reason: collision with root package name */
    private final h.f.a.b<Effect, z> f134891i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.a<j> f134892j;

    static {
        Covode.recordClassIndex(88171);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(aVar, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final boolean b() {
        return this.f134884b;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(88172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e eVar = this.this$0.f134883a;
            if (eVar != null) {
                this.this$0.a(eVar, false);
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(88173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e eVar = this.this$0.f134883a;
            if (eVar != null) {
                this.this$0.a(eVar, false);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f134885c = null;
        e eVar = this.f134883a;
        if (eVar != null) {
            a(eVar, false);
            eVar.a((Effect) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void c() {
        e eVar = this.f134883a;
        if (eVar != null) {
            a(eVar, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void d() {
        e eVar = this.f134883a;
        if (eVar != null) {
            a(eVar, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(view, "");
        androidx.appcompat.app.d dVar = this.f134886d;
        o oVar = this.f134888f;
        h hVar = this.f134889g;
        b bVar = this.f134887e;
        View findViewById = view.findViewById(R.id.c8g);
        h.f.b.l.b(findViewById, "");
        View findViewById2 = view.findViewById(R.id.bng);
        h.f.b.l.b(findViewById2, "");
        this.f134883a = new FavoriteSticker(dVar, oVar, hVar, bVar, (FrameLayout) findViewById, (CheckableImageView) findViewById2, this.f134890h, this.f134892j, this.f134891i);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        if (!a(this.f134885c, new a(this)) && aVar == l.a.AFTER_ANIMATE) {
            if (this.f134885c != null && !this.f134884b && this.f134888f.j()) {
                c();
            }
            e eVar = this.f134883a;
            if (eVar != null) {
                eVar.a(this.f134885c);
            }
        }
    }

    public final void a(e eVar, boolean z) {
        this.f134884b = z;
        eVar.a(z);
    }

    private static boolean a(Effect effect, h.f.a.a<z> aVar) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || extra.length() <= 0 || !new JSONObject(extra).optBoolean("forbid_favorite")) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        e eVar;
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        if (!com.ss.android.ugc.aweme.sticker.f.c.a(this.f134888f, aVar.f135378a)) {
            Effect effect = aVar.f135378a;
            this.f134885c = effect;
            if (!a(effect, new b(this))) {
                if (aVar.f135380c == com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK) {
                    this.f134888f.a(true);
                }
                if (this.f134888f.j() && (eVar = this.f134883a) != null) {
                    a(eVar, true);
                    eVar.a(aVar.f135378a);
                }
            }
        }
    }

    public /* synthetic */ d(androidx.appcompat.app.d dVar, b bVar, o oVar, h hVar, StickerPreferences stickerPreferences, h.f.a.a aVar) {
        this(dVar, bVar, oVar, hVar, stickerPreferences, null, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(androidx.appcompat.app.d dVar, b bVar, o oVar, h hVar, StickerPreferences stickerPreferences, h.f.a.b<? super Effect, z> bVar2, h.f.a.a<j> aVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(stickerPreferences, "");
        h.f.b.l.d(aVar, "");
        this.f134886d = dVar;
        this.f134887e = bVar;
        this.f134888f = oVar;
        this.f134889g = hVar;
        this.f134890h = stickerPreferences;
        this.f134891i = bVar2;
        this.f134892j = aVar;
    }
}

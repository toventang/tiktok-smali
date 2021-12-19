package com.ss.android.ugc.aweme.sticker.types.game;

import android.text.TextUtils;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.df.o;
import com.ss.android.ugc.aweme.df.p;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.au;
import com.ss.android.ugc.aweme.sticker.model.h;
import com.ss.android.ugc.aweme.sticker.types.game.a.a;
import com.ss.android.ugc.aweme.sticker.types.game.k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.a.c;
import java.util.HashMap;
import java.util.Map;

public final class b implements m {

    /* renamed from: a  reason: collision with root package name */
    ASCameraView f136084a;

    /* renamed from: b  reason: collision with root package name */
    public Effect f136085b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f136086c;

    /* renamed from: d  reason: collision with root package name */
    boolean f136087d;

    /* renamed from: e  reason: collision with root package name */
    private d f136088e;

    /* renamed from: f  reason: collision with root package name */
    private a f136089f;

    /* renamed from: g  reason: collision with root package name */
    private o f136090g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.appcompat.app.d f136091h;

    /* renamed from: i  reason: collision with root package name */
    private int f136092i;

    /* renamed from: j  reason: collision with root package name */
    private long f136093j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f136094k;

    /* renamed from: l  reason: collision with root package name */
    private int f136095l;

    /* renamed from: m  reason: collision with root package name */
    private k f136096m;
    private l n;
    private c o;
    private com.ss.android.ugc.tools.view.a.a p = new c(this);
    private Map<String, com.ss.android.ugc.aweme.sticker.model.c> q = new HashMap();

    static {
        Covode.recordClassIndex(88898);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.m
    public final boolean c() {
        return this.f136094k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.m
    public final void d() {
        this.o.c(this.p);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.m
    public final void b() {
        this.f136086c = false;
        this.f136089f.b();
    }

    private void f() {
        if (this.f136093j > 0) {
            e().a(this.f136093j);
            this.f136093j = 0;
        }
    }

    public final ShortVideoContext e() {
        return ((ShortVideoContextViewModel) ae.a(this.f136091h, (ad.b) null).a(ShortVideoContextViewModel.class)).f124769a;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.m
    public final void a() {
        if (!this.f136084a.i()) {
            this.n.b();
            this.f136086c = true;
            if (this.f136093j == 0) {
                this.f136093j = e().f124757b.f124707b;
            }
            this.f136089f.a();
            ShortVideoContext e2 = e();
            if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.e(this.f136085b)) {
                this.f136084a.a(4097, 0, 0, "");
                if (!e2.aP) {
                    e2.a(30000L);
                }
            } else if (!e2.aP) {
                e2.a(2147483647L);
            }
            e2.e(1);
            if (e2.f124757b.v != null) {
                this.f136084a.a(4103, (long) e2.f124757b.v.gameScore, 0, "");
            }
            this.f136090g.c();
            this.f136096m.c();
            this.n.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.m
    public final void a(Effect effect) {
        b(effect);
        int a2 = this.f136096m.a();
        this.f136092i = a2;
        if (a2 != 1) {
            this.f136096m.a(k.a.START);
        }
    }

    private void b(Effect effect) {
        this.f136085b = effect;
        this.f136089f.a(effect);
        this.f136094k = true;
        this.f136087d = false;
        ((GameResultViewModel) ae.a(this.f136091h, (ad.b) null).a(GameResultViewModel.class)).f136075a = true;
        this.f136090g.a();
        a(effect, this.f136090g);
        this.f136084a.b(false);
        this.f136084a.e(true);
        this.f136084a.g(false);
        this.f136084a.a("", 0L, 0L, false);
        this.f136084a.a(false);
        if (!this.f136086c) {
            HashMap hashMap = new HashMap();
            hashMap.put("prop_id", effect.getEffectId());
            hashMap.put("shoot_way", e().r);
            hashMap.put("creation_id", e().q);
            g.a().I().a("enter_prop_game_page", hashMap);
        }
    }

    public final void b(String str) {
        if (this.f136087d) {
            f();
            return;
        }
        this.f136086c = false;
        this.n.f();
        e().e(0);
        if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.e(this.f136085b)) {
            this.f136084a.a(4102, 0, 0, "");
            e().a(this.f136093j);
            this.f136090g.b();
            return;
        }
        int i2 = this.f136095l;
        if (i2 == 0) {
            a(str);
        } else if (i2 == 1) {
            this.f136089f.c(this.f136085b);
        }
    }

    public final void a(String str) {
        f();
        if (!this.f136087d) {
            this.n.d();
            this.f136090g.c();
            this.f136090g.d();
            this.f136094k = false;
            ((GameResultViewModel) ae.a(this.f136091h, (ad.b) null).a(GameResultViewModel.class)).f136075a = false;
            this.f136096m.b();
            e().e(0);
            if (e().f124757b.f124713h.c() != null) {
                this.f136084a.b(true);
                this.f136084a.e(false);
                this.f136084a.g(false);
                this.f136084a.a(e().f124757b.f124713h.c(), e().f124757b.g(), e().aK, false);
            } else {
                this.f136084a.b(false);
                this.f136084a.e(true);
                this.f136084a.g(false);
            }
            this.f136084a.a(true);
            if (e().f124757b.v != null) {
                au.a(str, e());
                this.n.e();
            } else {
                this.f136089f.b(this.f136085b);
                if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.e(this.f136085b) && this.f136092i != this.f136096m.a()) {
                    this.f136096m.a(k.a.END);
                }
            }
            this.f136085b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2) {
        if (!this.f136094k || i2 != 4) {
            return false;
        }
        if (this.f136086c) {
            b("system_back_button");
            return true;
        }
        a("system_back_button");
        return true;
    }

    private void a(Effect effect, o oVar) {
        if (com.ss.android.ugc.aweme.port.in.c.u.a() || effect == null || !effect.isBusiness()) {
            return;
        }
        if (!this.q.containsKey(effect.getEffectId()) || this.q.get(effect.getEffectId()) == null || this.f136086c) {
            String effectId = effect.getEffectId();
            i.b(new f(effectId), i.f4824a).a(new g(this, effect, effectId, oVar), i.f4826c, null);
            return;
        }
        oVar.a(this.q.get(effect.getEffectId()).getScreenDesc());
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.m
    public final void a(Effect effect, String str, int i2) {
        this.f136095l = i2;
        b(effect);
        if (this.f136085b != null) {
            p a2 = o.a(this.f136091h, "VideoRecord");
            int a3 = a2.a(this.f136085b.getEffectId());
            this.f136084a.a(46, 1, (long) a3, str);
            a2.a(this.f136085b.getEffectId(), a3 + 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(Effect effect, String str, o oVar, i iVar) {
        if (TextUtils.equals(effect.getEffectId(), str) && !iVar.b() && !iVar.c()) {
            try {
                com.ss.android.ugc.aweme.sticker.model.c cVar = ((h) iVar.d()).mStickers.get(0).commerceSticker;
                this.q.put(str, cVar);
                if (!this.f136086c) {
                    oVar.a(cVar.getScreenDesc());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public b(androidx.appcompat.app.d dVar, c cVar, d dVar2, o oVar, k kVar, l lVar, a aVar) {
        this.f136088e = dVar2;
        this.f136084a = dVar2.D();
        this.f136089f = aVar;
        this.f136091h = dVar;
        this.f136096m = kVar;
        this.n = lVar;
        this.o = cVar;
        cVar.b(this.p);
        this.f136090g = oVar;
        oVar.a(new com.ss.android.ugc.aweme.sticker.types.game.a.b() {
            /* class com.ss.android.ugc.aweme.sticker.types.game.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(88899);
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.game.a.b
            public final void b() {
                if (b.this.f136086c) {
                    b.this.b("click_cross");
                } else {
                    b.this.a("click_cross");
                }
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.game.a.b
            public final void a() {
                String effectId;
                b.this.a();
                HashMap hashMap = new HashMap();
                if (b.this.f136085b == null) {
                    effectId = "";
                } else {
                    effectId = b.this.f136085b.getEffectId();
                }
                hashMap.put("prop_id", effectId);
                hashMap.put("shoot_way", b.this.e().r);
                hashMap.put("creation_id", b.this.e().q);
                g.a().I().a("click_game_play_button", hashMap);
            }
        });
        ((GameResultViewModel) ae.a(dVar, (ad.b) null).a(GameResultViewModel.class)).a().observe(dVar, new d(this, lVar));
        ((GameResultViewModel) ae.a(dVar, (ad.b) null).a(GameResultViewModel.class)).b().observe(dVar, new e(this, oVar));
    }
}

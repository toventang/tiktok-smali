package com.ss.android.ugc.aweme.sticker.favorite;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.favorite.a;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.widget.CheckableImageView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.style.StyleView;
import com.ss.android.ugc.tools.view.style.g;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.i;
import h.z;
import java.util.List;

public final class FavoriteSticker implements au, e {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.a f134848a;

    /* renamed from: b  reason: collision with root package name */
    public final d f134849b;

    /* renamed from: c  reason: collision with root package name */
    public final o f134850c;

    /* renamed from: d  reason: collision with root package name */
    public final h f134851d;

    /* renamed from: e  reason: collision with root package name */
    public final b f134852e;

    /* renamed from: f  reason: collision with root package name */
    final CheckableImageView f134853f;

    /* renamed from: g  reason: collision with root package name */
    final h.f.a.b<Effect, z> f134854g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.s.a f134855h;

    /* renamed from: i  reason: collision with root package name */
    private final Drawable f134856i;

    /* renamed from: j  reason: collision with root package name */
    private final Drawable f134857j;

    /* renamed from: k  reason: collision with root package name */
    private final StyleView f134858k;

    /* renamed from: l  reason: collision with root package name */
    private final View f134859l;

    /* renamed from: m  reason: collision with root package name */
    private final TextView f134860m;
    private final View n;
    private final float o;
    private final float p;
    private final float q;
    private final h.h r = i.a((h.f.a.a) new a(this));
    private final a s;
    private final FrameLayout t;
    private final StickerPreferences u;

    static {
        Covode.recordClassIndex(88154);
    }

    public final com.ss.android.ugc.aweme.sticker.repository.a.h a() {
        return (com.ss.android.ugc.aweme.sticker.repository.a.h) this.r.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.repository.a.h> {
        final /* synthetic */ FavoriteSticker this$0;

        static {
            Covode.recordClassIndex(88162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FavoriteSticker favoriteSticker) {
            super(0);
            this.this$0 = favoriteSticker;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.h invoke() {
            return this.this$0.f134850c.c().f();
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.s.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FavoriteSticker f134871a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f134872b = true;

        static {
            Covode.recordClassIndex(88163);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.s.a
        public final void b() {
            this.f134872b = false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.s.a
        public final void a() {
            if (!this.f134872b) {
                this.f134871a.b();
                this.f134872b = true;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FavoriteSticker favoriteSticker) {
            this.f134871a = favoriteSticker;
        }
    }

    public final void b() {
        this.f134850c.c().a(new com.ss.android.ugc.aweme.sticker.repository.c.a("sticker_category:favorite", null, false, 62));
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f134853f.setOnStateChangeListener(null);
        this.f134853f.clearAnimation();
        com.ss.android.ugc.aweme.shortvideo.s.a aVar = this.f134855h;
        if (aVar != null) {
            com.ss.android.ugc.aweme.shortvideo.s.b.b(aVar);
            this.f134855h = null;
        }
        f.a.b.a aVar2 = this.f134848a;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.e
    public final void a(Effect effect) {
        b(b(effect));
    }

    @Override // com.ss.android.ugc.aweme.sticker.favorite.e
    public final void a(boolean z) {
        if (z) {
            if (!this.f134849b.isFinishing()) {
                a aVar = this.s;
                View view = this.f134859l;
                d dVar = this.f134849b;
                l.d(view, "");
                l.d(dVar, "");
                if (!aVar.f134873a.getBubbleGuideShown(false) && view.getParent() != null) {
                    view.post(new a.RunnableC3514a(aVar, dVar, view));
                }
            }
            this.t.setVisibility(0);
            return;
        }
        this.t.setVisibility(8);
    }

    public final void b(boolean z) {
        if (z) {
            this.f134853f.setImageDrawable(this.f134856i);
            this.f134860m.setText(this.f134849b.getString(R.string.g70));
            return;
        }
        this.f134853f.setImageDrawable(this.f134857j);
        this.f134860m.setText(this.f134849b.getString(R.string.g6y));
    }

    public final boolean b(Effect effect) {
        if (effect == null) {
            return false;
        }
        return a().a(effect.getEffectId());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSticker(d dVar, o oVar, h hVar, b bVar, FrameLayout frameLayout, CheckableImageView checkableImageView, StickerPreferences stickerPreferences, h.f.a.a<j> aVar, h.f.a.b<? super Effect, z> bVar2) {
        Drawable background;
        l.d(dVar, "");
        l.d(oVar, "");
        l.d(hVar, "");
        l.d(bVar, "");
        l.d(frameLayout, "");
        l.d(checkableImageView, "");
        l.d(stickerPreferences, "");
        l.d(aVar, "");
        this.f134849b = dVar;
        this.f134850c = oVar;
        this.f134851d = hVar;
        this.f134852e = bVar;
        this.t = frameLayout;
        this.f134853f = checkableImageView;
        this.u = stickerPreferences;
        this.f134854g = bVar2;
        this.s = new a(stickerPreferences);
        dVar.getLifecycle().a(this);
        frameLayout.setOnClickListener(new com.ss.android.ugc.aweme.views.d(this) {
            /* class com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FavoriteSticker f134861a;

            static {
                Covode.recordClassIndex(88155);
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$1$a */
            static final class a extends h.f.b.m implements h.f.a.a<z> {
                final /* synthetic */ AnonymousClass1 this$0;

                static {
                    Covode.recordClassIndex(88156);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(AnonymousClass1 r2) {
                    super(0);
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f134861a.b();
                    return z.f158842a;
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f134861a = r1;
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                if (!this.f134861a.f134852e.b()) {
                    this.f134861a.f134852e.a(this.f134861a.f134849b, "favorite_sticker", 242, this.f134861a.f134852e.a(), new a(this));
                    return;
                }
                this.f134861a.f134853f.a();
            }
        });
        View findViewById = frameLayout.findViewById(R.id.ecj);
        l.b(findViewById, "");
        this.f134860m = (TextView) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.c8i);
        l.b(findViewById2, "");
        StyleView styleView = (StyleView) findViewById2;
        this.f134858k = styleView;
        View findViewById3 = frameLayout.findViewById(R.id.c8g);
        l.b(findViewById3, "");
        this.f134859l = findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.c8h);
        l.b(findViewById4, "");
        this.n = findViewById4;
        j invoke = aVar.invoke();
        if (!(invoke == null || (background = styleView.getBackground()) == null || invoke.f135218f == -1)) {
            g.a(background, dVar.getResources().getColor(invoke.f135218f));
            styleView.setBackground(background);
        }
        this.o = dVar.getResources().getDimension(R.dimen.em);
        this.p = dVar.getResources().getDimension(R.dimen.ep);
        this.q = dVar.getResources().getDimension(R.dimen.ek);
        Drawable e2 = androidx.core.graphics.drawable.a.e(dVar.getResources().getDrawable(2131232444));
        l.b(e2, "");
        this.f134856i = e2;
        Drawable e3 = androidx.core.graphics.drawable.a.e(dVar.getResources().getDrawable(2131232446));
        l.b(e3, "");
        this.f134857j = e3;
        checkableImageView.setOnStateChangeListener(new CheckableImageView.a(this) {
            /* class com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FavoriteSticker f134862a;

            /* renamed from: b  reason: collision with root package name */
            private Effect f134863b;

            /* renamed from: c  reason: collision with root package name */
            private Effect f134864c;

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$c */
            static final class c<T> implements f<Throwable> {

                /* renamed from: a  reason: collision with root package name */
                public static final c f134869a = new c();

                static {
                    Covode.recordClassIndex(88160);
                }

                c() {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* bridge */ /* synthetic */ void accept(Throwable th) {
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$d */
            static final class d<T> implements f<Throwable> {

                /* renamed from: a  reason: collision with root package name */
                public static final d f134870a = new d();

                static {
                    Covode.recordClassIndex(88161);
                }

                d() {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* bridge */ /* synthetic */ void accept(Throwable th) {
                }
            }

            static {
                Covode.recordClassIndex(88157);
            }

            @Override // com.ss.android.ugc.aweme.sticker.widget.CheckableImageView.a
            public final void a() {
                f.a.b.b a2;
                Effect effect = this.f134863b;
                if (effect != null) {
                    h.f.a.b<Effect, z> bVar = this.f134862a.f134854g;
                    if (bVar != null) {
                        bVar.invoke(effect);
                    }
                    f.a.b.a aVar = this.f134862a.f134848a;
                    if (aVar == null) {
                        aVar = new f.a.b.a();
                    }
                    if (this.f134862a.b(effect)) {
                        a2 = this.f134862a.a().a(effect, true, com.ss.android.ugc.aweme.sticker.repository.a.c.PANEL).a(new a(effect, this), c.f134869a);
                    } else {
                        this.f134862a.f134851d.a(effect, false, "click_main_panel");
                        if (this.f134864c != null) {
                            this.f134862a.f134851d.a(effect, true, "click_banner");
                        }
                        a2 = this.f134862a.a().a(effect, false, com.ss.android.ugc.aweme.sticker.repository.a.c.PANEL).a(new b(effect, this), d.f134870a);
                    }
                    aVar.a(a2);
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f134862a = r1;
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$a */
            static final class a<T> implements f<List<? extends String>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Effect f134865a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnonymousClass2 f134866b;

                static {
                    Covode.recordClassIndex(88158);
                }

                a(Effect effect, AnonymousClass2 r2) {
                    this.f134865a = effect;
                    this.f134866b = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(List<? extends String> list) {
                    this.f134866b.f134862a.f134852e.a(this.f134865a);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker$2$b */
            static final class b<T> implements f<List<? extends String>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Effect f134867a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnonymousClass2 f134868b;

                static {
                    Covode.recordClassIndex(88159);
                }

                b(Effect effect, AnonymousClass2 r2) {
                    this.f134867a = effect;
                    this.f134868b = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(List<? extends String> list) {
                    this.f134868b.f134862a.f134852e.a(this.f134867a);
                }
            }

            @Override // com.ss.android.ugc.aweme.sticker.widget.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 0) {
                    this.f134863b = this.f134862a.f134850c.f();
                    Effect value = this.f134862a.f134850c.n().b().getValue();
                    if (value != null && !TextUtils.isEmpty(value.getParentId())) {
                        this.f134864c = value;
                    }
                    com.ss.android.ugc.aweme.sticker.repository.a.h a2 = this.f134862a.a();
                    FavoriteSticker favoriteSticker = this.f134862a;
                    a2.b(!favoriteSticker.b(favoriteSticker.f134850c.f()));
                } else if (i2 == 1) {
                    FavoriteSticker favoriteSticker2 = this.f134862a;
                    favoriteSticker2.b(true ^ favoriteSticker2.b(favoriteSticker2.f134850c.f()));
                }
            }
        });
        com.ss.android.ugc.aweme.shortvideo.s.b.a(dVar);
        b bVar3 = new b(this);
        this.f134855h = bVar3;
        com.ss.android.ugc.aweme.shortvideo.s.b.a(bVar3);
    }
}

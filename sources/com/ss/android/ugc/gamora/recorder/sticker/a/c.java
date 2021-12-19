package com.ss.android.ugc.gamora.recorder.sticker.a;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.als.h;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.ss.android.ugc.aweme.beauty.b;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

final class c implements com.ss.android.ugc.aweme.sticker.types.game.a.a {

    /* renamed from: a  reason: collision with root package name */
    public FilterBean f148302a;

    /* renamed from: b  reason: collision with root package name */
    public final e f148303b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.a.a.a f148304c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.filter.a.a f148305d;

    /* renamed from: e  reason: collision with root package name */
    public final ShortVideoContext f148306e;

    /* renamed from: f  reason: collision with root package name */
    public final k<d> f148307f;

    /* renamed from: g  reason: collision with root package name */
    private final SafeHandler f148308g;

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f148309h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.sticker.a.a f148310i;

    static {
        Covode.recordClassIndex(97735);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.a.a
    public final void a() {
        this.f148307f.a(d.e.f134783a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.a.a
    public final void b() {
        this.f148307f.a(d.c.f134781a);
    }

    public final CameraModule c() {
        return this.f148309h.f();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f148312b;

        static {
            Covode.recordClassIndex(97736);
        }

        a(c cVar, Effect effect) {
            this.f148311a = cVar;
            this.f148312b = effect;
        }

        public final void run() {
            T t;
            com.bytedance.creativex.recorder.filter.a.a aVar;
            h<FilterBean> curSelectedFilter;
            this.f148311a.f148307f.a(new d.b(this.f148312b));
            View findViewById = this.f148311a.f148303b.findViewById(R.id.dj9);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
            View findViewById2 = this.f148311a.f148303b.findViewById(R.id.c5v);
            l.b(findViewById2, "");
            findViewById2.setVisibility(0);
            this.f148311a.c().f();
            if (b.a()) {
                this.f148311a.f148304c.a(this.f148311a.f148306e.f124757b.B);
            }
            this.f148311a.c().i();
            c cVar = this.f148311a;
            com.bytedance.creativex.recorder.filter.a.a aVar2 = cVar.f148305d;
            if (aVar2 == null || (curSelectedFilter = aVar2.getCurSelectedFilter()) == null) {
                t = null;
            } else {
                t = curSelectedFilter.f6468a.getValue();
            }
            cVar.f148302a = t;
            if (com.ss.android.ugc.aweme.shortvideo.sticker.c.e(this.f148312b) && this.f148311a.f148302a != null && (aVar = this.f148311a.f148305d) != null) {
                aVar.clearFilterChosen();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.a.a
    public final void a(Effect effect) {
        l.d(effect, "");
        this.f148308g.post(new a(this, effect));
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.a.a
    public final void c(Effect effect) {
        l.d(effect, "");
        this.f148307f.a(new d.C3511d(effect));
        this.f148310i.h().a(effect, true);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.game.a.a
    public final void b(Effect effect) {
        FilterBean filterBean;
        com.bytedance.creativex.recorder.filter.a.a aVar;
        l.d(effect, "");
        this.f148307f.a(new d.a(effect));
        if (com.ss.android.ugc.aweme.sticker.f.e.c(this.f148310i)) {
            this.f148309h.a(new ac(false, false, 6));
        } else {
            this.f148309h.a(new ac(true, false, 6));
        }
        View findViewById = this.f148303b.findViewById(R.id.dj9);
        l.b(findViewById, "");
        findViewById.setVisibility(0);
        View findViewById2 = this.f148303b.findViewById(R.id.c5v);
        l.b(findViewById2, "");
        findViewById2.setVisibility(8);
        if (com.ss.android.ugc.aweme.shortvideo.sticker.c.e(effect) && (filterBean = this.f148302a) != null && (aVar = this.f148305d) != null) {
            aVar.setFilterChosen(filterBean, null, false, false, false);
        }
    }

    public c(e eVar, com.bytedance.creativex.recorder.b.a.d dVar, com.bytedance.creativex.recorder.a.a.a aVar, com.bytedance.creativex.recorder.filter.a.a aVar2, com.bytedance.creativex.recorder.sticker.a.a aVar3, ShortVideoContext shortVideoContext, k<d> kVar) {
        l.d(eVar, "");
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(aVar3, "");
        l.d(shortVideoContext, "");
        l.d(kVar, "");
        this.f148303b = eVar;
        this.f148309h = dVar;
        this.f148304c = aVar;
        this.f148305d = aVar2;
        this.f148310i = aVar3;
        this.f148306e = shortVideoContext;
        this.f148307f = kVar;
        this.f148308g = new SafeHandler(eVar);
    }
}

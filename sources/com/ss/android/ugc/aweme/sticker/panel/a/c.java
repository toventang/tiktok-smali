package com.ss.android.ugc.aweme.sticker.panel.a;

import android.text.format.DateUtils;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.a;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final d<Boolean> f135011a;

    /* renamed from: b  reason: collision with root package name */
    private long f135012b;

    /* renamed from: c  reason: collision with root package name */
    private final o f135013c;

    /* renamed from: d  reason: collision with root package name */
    private final StickerPreferences f135014d;

    /* renamed from: e  reason: collision with root package name */
    private final int f135015e;

    /* renamed from: f  reason: collision with root package name */
    private final a<Boolean> f135016f;

    static {
        Covode.recordClassIndex(88283);
    }

    private final long a() {
        if (this.f135012b == -1) {
            this.f135012b = this.f135014d.getAutoApplyStickerTime(0);
        }
        return this.f135012b;
    }

    public /* synthetic */ c(o oVar, StickerPreferences stickerPreferences, a aVar) {
        this(oVar, stickerPreferences, com.ss.android.ugc.aweme.sticker.f.c.b(oVar), aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.a.a
    public final boolean a(Effect effect, int i2, int i3) {
        l.d(effect, "");
        if (this.f135013c.f() != null) {
            return false;
        }
        Boolean a2 = this.f135011a.a(a());
        if (a2 == null) {
            a2 = Boolean.valueOf(DateUtils.isToday(a()));
            this.f135011a.b(a(), Boolean.valueOf(a2.booleanValue()));
        }
        l.b(a2, "");
        if (a2.booleanValue() || i2 != this.f135015e || !this.f135016f.invoke().booleanValue()) {
            return false;
        }
        this.f135012b = System.currentTimeMillis();
        this.f135014d.setAutoApplyStickerTime(a());
        return true;
    }

    private c(o oVar, StickerPreferences stickerPreferences, int i2, a<Boolean> aVar) {
        l.d(oVar, "");
        l.d(stickerPreferences, "");
        l.d(aVar, "");
        this.f135013c = oVar;
        this.f135014d = stickerPreferences;
        this.f135015e = i2;
        this.f135016f = aVar;
        this.f135011a = new d<>();
        this.f135012b = -1;
    }
}

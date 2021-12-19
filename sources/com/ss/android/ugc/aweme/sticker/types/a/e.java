package com.ss.android.ugc.aweme.sticker.types.a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.c.h;
import com.ss.android.ugc.aweme.sticker.panel.c.i;
import com.ss.android.ugc.aweme.sticker.presenter.handler.b.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private d f135761a;

    /* renamed from: b  reason: collision with root package name */
    private a f135762b;

    /* renamed from: c  reason: collision with root package name */
    private final b f135763c;

    /* renamed from: d  reason: collision with root package name */
    private final String f135764d;

    static {
        Covode.recordClassIndex(88737);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final i a() {
        return i.CommerceStickerInfoHandlerPriority;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final void b() {
        a aVar = this.f135762b;
        if (aVar != null) {
            aVar.a((Effect) null, 0);
        }
        d dVar = this.f135761a;
        if (dVar != null) {
            dVar.a(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final boolean a(a aVar) {
        l.d(aVar, "");
        Effect effect = aVar.f135378a;
        int i2 = aVar.f135379b;
        d dVar = this.f135761a;
        if (dVar != null && dVar.a(effect)) {
            return true;
        }
        a aVar2 = this.f135762b;
        if (aVar2 != null) {
            return aVar2.a(effect, i2);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final void a(View view) {
        l.d(view, "");
        this.f135762b = new a((LinearLayout) view.findViewById(R.id.abn), this.f135763c, view.getContext());
        View findViewById = view.findViewById(R.id.abp);
        l.b(findViewById, "");
        this.f135761a = new d((LinearLayout) findViewById, this.f135763c, this.f135764d);
    }

    public e(b bVar, String str) {
        l.d(bVar, "");
        l.d(str, "");
        this.f135763c = bVar;
        this.f135764d = str;
    }
}

package com.ss.android.ugc.aweme.sticker.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b implements e, m {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f134708a = new ArrayList();

    static {
        Covode.recordClassIndex(88043);
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        this.f134708a.add(aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        return aVar.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        if (i2 == 41) {
            bj.d("EffectChannelListener INTERACTION msg: " + i2 + " , " + i3 + " , " + i4 + " , " + str);
            for (T t : this.f134708a) {
                if (str != null && (t.b() || !g.a().A().a())) {
                    if (l.a((Object) t.a(), (Object) new JSONObject(str).optString("interface"))) {
                        bj.d("Effect interface: " + t.a() + " handle msg: " + i2 + " , " + i3 + " , " + i4 + " , " + str);
                        t.a(i4, str);
                    }
                }
            }
        }
    }
}

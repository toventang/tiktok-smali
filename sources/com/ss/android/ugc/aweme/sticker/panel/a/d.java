package com.ss.android.ugc.aweme.sticker.panel.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f135017a = true;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<? extends a>, a> f135018b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(88284);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.sticker.panel.a.a>, com.ss.android.ugc.aweme.sticker.panel.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.sticker.panel.a.b
    public final void a(a aVar) {
        l.d(aVar, "");
        this.f135018b.put(aVar.getClass(), aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.a.a
    public final boolean a(Effect effect, int i2, int i3) {
        l.d(effect, "");
        if (this.f135017a && !g.b(effect) && !g.t(effect) && TextUtils.isEmpty(c.b(effect, "guide_video_path"))) {
            Map<Class<? extends a>, a> map = this.f135018b;
            if (!map.isEmpty()) {
                for (Map.Entry<Class<? extends a>, a> entry : map.entrySet()) {
                    if (entry.getValue().a(effect, i2, i3)) {
                        this.f135017a = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

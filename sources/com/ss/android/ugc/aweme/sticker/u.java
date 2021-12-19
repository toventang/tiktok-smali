package com.ss.android.ugc.aweme.sticker;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.b;
import com.bytedance.creativex.recorder.sticker.panel.c;
import com.bytedance.creativex.recorder.sticker.panel.d;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.tools.view.a.e;
import h.f.b.l;

public final class u implements c, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final r.b f136182a;

    /* renamed from: b  reason: collision with root package name */
    private final f f136183b;

    static {
        Covode.recordClassIndex(88943);
    }

    public static final class a extends e {
        static {
            Covode.recordClassIndex(88944);
        }

        a() {
        }

        @Override // com.ss.android.ugc.tools.view.a.e
        public final com.ss.android.ugc.tools.view.a.c a(Object obj) {
            l.d(obj, "");
            if (obj instanceof Activity) {
                return bi.a((Activity) obj);
            }
            return super.a(obj);
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f136183b;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.c
    public final b a() {
        return new d(getDiContainer(), new com.ss.android.ugc.gamora.recorder.sticker.b.b(getDiContainer()), this.f136182a, new a());
    }

    public u(f fVar, r.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f136183b = fVar;
        this.f136182a = bVar;
    }
}

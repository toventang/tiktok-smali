package com.ss.android.ugc.gamora.recorder.sticker.b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.b;
import com.bytedance.creativex.recorder.sticker.panel.c;
import com.bytedance.creativex.recorder.sticker.panel.d;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.tools.view.a.e;
import h.f.b.l;

public final class a implements c, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f148314a;

    static {
        Covode.recordClassIndex(97738);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.b.a$a  reason: collision with other inner class name */
    public static final class C4000a extends e {
        static {
            Covode.recordClassIndex(97739);
        }

        C4000a() {
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
        return this.f148314a;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.c
    public final b a() {
        return new d(getDiContainer(), new b(getDiContainer()), new com.ss.android.ugc.gamora.recorder.sticker.c.a.a(getDiContainer()), new C4000a());
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f148314a = fVar;
    }
}

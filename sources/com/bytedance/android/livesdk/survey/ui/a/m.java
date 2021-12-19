package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;

public final class m extends f {
    static {
        Covode.recordClassIndex(12712);
    }

    public m() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.a.f
    public final void a() {
        this.f21561d.a(com.bytedance.android.livesdk.an.a.a().a(g.class).d(new a(this)));
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f21569a;

        static {
            Covode.recordClassIndex(12713);
        }

        a(m mVar) {
            this.f21569a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g gVar = (g) obj;
            l.b(gVar, "");
            this.f21569a.a(gVar.f17192a.get(1));
        }
    }
}

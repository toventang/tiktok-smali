package com.ss.android.ugc.aweme.sticker.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.ugc.aweme.sticker.types.ar.text.e;
import h.f.b.l;
import h.z;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.asve.recorder.effect.a f135440a;

    static {
        Covode.recordClassIndex(88482);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.e
    public final void a() {
        this.f135440a.a(true);
    }

    static final class a implements RecordInvoker.OnARTextCountCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f135441a;

        static {
            Covode.recordClassIndex(88483);
        }

        a(h.f.a.b bVar) {
            this.f135441a = bVar;
        }

        @Override // com.ss.android.medialib.RecordInvoker.OnARTextCountCallback
        public final void onResult(int i2) {
            this.f135441a.invoke(Integer.valueOf(i2));
        }
    }

    public b(com.ss.android.ugc.asve.recorder.effect.a aVar) {
        l.d(aVar, "");
        this.f135440a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.e
    public final void a(h.f.a.b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f135440a.a(new a(bVar));
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.e
    public final void a(String str) {
        l.d(str, "");
        this.f135440a.c(str);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.e
    public final void a(String str, int i2, int i3, String str2) {
        com.ss.android.ugc.asve.recorder.effect.a aVar = this.f135440a;
        if (str2 == null) {
            str2 = "";
        }
        aVar.a(str, i2, i3, str2);
    }
}

package com.bytedance.nita.d;

import android.content.Context;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.c;
import h.f.b.l;

public final class b extends a {
    static {
        Covode.recordClassIndex(25478);
    }

    public final boolean handleMessage(Message message) {
        l.c(message, "");
        return true;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f41638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f41639b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41640c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f41641d;

        static {
            Covode.recordClassIndex(25479);
        }

        a(b bVar, c cVar, int i2, Context context) {
            this.f41638a = bVar;
            this.f41639b = cVar;
            this.f41640c = i2;
            this.f41641d = context;
        }

        public final void run() {
            b.a(this.f41639b, this.f41640c, this.f41641d).invoke();
        }
    }

    @Override // com.bytedance.nita.d.d, com.bytedance.nita.d.a
    public final void a(c cVar, Context context, int i2) {
        l.c(cVar, "");
        l.c(context, "");
        com.bytedance.nita.e.a.a(com.bytedance.nita.e.a.f41650b).postDelayed(new a(this, cVar, i2, context), 5);
    }
}

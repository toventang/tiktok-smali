package com.bytedance.android.live.liveinteract.cohost.ui.b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f10271a = new d();

    public interface a {
        static {
            Covode.recordClassIndex(5414);
        }

        void a();

        void b();
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(5413);
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10272a;

        static {
            Covode.recordClassIndex(5415);
        }

        b(a aVar) {
            this.f10272a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            this.f10272a.a();
            dialogInterface.dismiss();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10273a;

        static {
            Covode.recordClassIndex(5416);
        }

        c(a aVar) {
            this.f10273a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            this.f10273a.b();
            dialogInterface.dismiss();
        }
    }

    public static final Dialog a(Context context, a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        b.a aVar2 = new b.a(context);
        aVar2.f18287d = 2131234076;
        aVar2.f18284a = y.a((int) R.string.dyj);
        aVar2.f18285b = y.a((int) R.string.dyk);
        b.a a2 = aVar2.b(R.string.e7j, (DialogInterface.OnClickListener) new b(aVar), false).a(R.string.e7l, (DialogInterface.OnClickListener) new c(aVar), false);
        a2.f18296m = false;
        com.bytedance.android.livesdk.l.b a3 = a2.a();
        l.b(a3, "");
        return a3;
    }
}

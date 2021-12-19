package com.ss.android.ugc.aweme.share.improve.c;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<String> f123845a = n.d("copy", "qr_code");

    static {
        Covode.recordClassIndex(81288);
    }

    public static final boolean a(h hVar) {
        l.d(hVar, "");
        return f123845a.contains(hVar.c());
    }

    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f123846a = new a();

        static {
            Covode.recordClassIndex(81289);
        }

        a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }
}

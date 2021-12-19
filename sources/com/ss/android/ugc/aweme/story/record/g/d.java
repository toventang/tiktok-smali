package com.ss.android.ugc.aweme.story.record.g;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Dialog f138300a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f138301b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(90467);
    }

    public static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f138305a = new c();

        static {
            Covode.recordClassIndex(90470);
        }

        c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            d.f138300a = null;
        }
    }

    public static boolean a(Context context) {
        l.d(context, "");
        Collection<Integer> values = b(context).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Map<String, Integer> b(Context context) {
        l.d(context, "");
        return ag.a(v.a("camera", Integer.valueOf(com.ss.android.ugc.aweme.port.in.l.f115658a.c().b(context))), v.a(DataType.AUDIO, Integer.valueOf(com.ss.android.ugc.aweme.port.in.l.f115658a.c().c(context))), v.a("storage", Integer.valueOf(com.ss.android.ugc.aweme.port.in.l.f115658a.c().a(context))));
    }

    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f138302a;

        static {
            Covode.recordClassIndex(90468);
        }

        public a(h.f.a.a aVar) {
            this.f138302a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            this.f138302a.invoke();
        }
    }

    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f138303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f138304b;

        static {
            Covode.recordClassIndex(90469);
        }

        public b(Context context, h.f.a.a aVar) {
            this.f138303a = context;
            this.f138304b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            com.ss.android.ugc.aweme.port.in.l.f115658a.c().d(this.f138303a);
            this.f138304b.invoke();
        }
    }
}

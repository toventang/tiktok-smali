package com.ss.android.ugc.aweme.tools.draft.e;

import android.app.ProgressDialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.view.b;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139518a = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.e.a$a  reason: collision with other inner class name */
    public static final class C3681a implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f139519a;

        static {
            Covode.recordClassIndex(91222);
        }

        @Override // com.ss.android.ugc.aweme.view.b.c
        public final void a() {
            this.f139519a.invoke();
        }

        C3681a(h.f.a.a aVar) {
            this.f139519a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(91221);
    }

    public static ProgressDialog a(Context context, h.f.a.a<z> aVar) {
        l.d(context, "");
        l.d(aVar, "");
        return b.C3836b.a(context, b.a.VISIBLE_AFTER_5S, new C3681a(aVar));
    }
}

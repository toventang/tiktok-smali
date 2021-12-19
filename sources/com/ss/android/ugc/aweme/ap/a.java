package com.ss.android.ugc.aweme.ap;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import java.util.Iterator;

public final class a {
    static {
        Covode.recordClassIndex(40818);
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.a$a  reason: collision with other inner class name */
    static final class C1488a extends m implements b<Context, Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1488a f66425a = new C1488a();

        static {
            Covode.recordClassIndex(40819);
        }

        C1488a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Context invoke(Context context) {
            Context context2 = context;
            l.d(context2, "");
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public static final e a(Context context) {
        e eVar;
        Object obj;
        l.d(context, "");
        Iterator a2 = k.a(context, C1488a.f66425a).a();
        while (true) {
            eVar = null;
            if (!a2.hasNext()) {
                obj = null;
                break;
            }
            obj = a2.next();
            if (obj instanceof e) {
                break;
            }
        }
        if (obj instanceof e) {
            eVar = obj;
        }
        return eVar;
    }
}

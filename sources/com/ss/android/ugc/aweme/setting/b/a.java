package com.ss.android.ugc.aweme.setting.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.d;
import com.ss.android.ugc.aweme.dc.c;
import com.ss.android.ugc.aweme.dc.f;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class a {
    static {
        Covode.recordClassIndex(80045);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.b.a$a  reason: collision with other inner class name */
    static final class C3157a extends m implements b<d, d> {
        final /* synthetic */ String $subTitle;
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(80046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3157a(View view, String str) {
            super(1);
            this.$view = view;
            this.$subTitle = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            return d.a(dVar2, null, null, null, null, false, this.$view, null, null, false, null, false, this.$subTitle, false, false, null, false, 0, 128991);
        }
    }

    public static final f a(String str, View.OnClickListener onClickListener) {
        l.d(str, "");
        l.d(onClickListener, "");
        return new f(new com.ss.android.ugc.aweme.be.f("", false, null, str, null, null, false, false, onClickListener, null, 6134));
    }

    public static final void a(c cVar, View view, String str) {
        l.d(cVar, "");
        l.d(view, "");
        cVar.a(new C3157a(view, str));
    }
}

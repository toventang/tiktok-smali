package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.b.k;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class r extends l {
    static {
        Covode.recordClassIndex(43655);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.m, com.ss.android.ugc.aweme.choosemusic.view.l
    public final void e() {
        super.e();
        TuxStatusView tuxStatusView = this.f70842c;
        l.b(tuxStatusView, "");
        Context context = tuxStatusView.getContext();
        TuxStatusView.c cVar = new TuxStatusView.c();
        String string = context.getString(R.string.bst);
        l.b(string, "");
        TuxStatusView.c a2 = cVar.a(string);
        String string2 = context.getString(R.string.bsv);
        l.b(string2, "");
        this.f70842c.setStatus(a2.a((CharSequence) string2).a(c.a(a.f70865a)));
    }

    static final class a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70865a = new a();

        static {
            Covode.recordClassIndex(43656);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_bookmark;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    public r(Context context, View view, com.ss.android.ugc.aweme.choosemusic.d.a<?> aVar, h.a aVar2, k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar, int i2) {
        super(context, view, aVar, aVar2, kVar, i2);
    }
}

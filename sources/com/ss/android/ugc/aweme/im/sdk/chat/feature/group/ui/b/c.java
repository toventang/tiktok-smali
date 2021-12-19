package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(64344);
    }

    static final class a extends m implements b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100590a = new a();

        static {
            Covode.recordClassIndex(64345);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.f159901l);
            eVar2.f44777c = Float.valueOf(com.c.a.a.a(20));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5m, viewGroup, false));
        l.d(viewGroup, "");
    }
}

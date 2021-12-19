package com.ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.k.a;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ag extends b implements com.ss.android.ugc.aweme.discover.h.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80325a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f80326b = i.a((h.f.a.a) b.f80327a);

    static {
        Covode.recordClassIndex(50004);
    }

    private final a.C1895a c() {
        return (a.C1895a) this.f80326b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50005);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ag a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ax8, viewGroup, false);
            l.b(a2, "");
            return new ag(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ah
    public final RecyclerView.ViewHolder b() {
        return this;
    }

    static final class b extends m implements h.f.a.a<a.C1895a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80327a = new b();

        static {
            Covode.recordClassIndex(50006);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a.C1895a invoke() {
            return com.ss.android.ugc.aweme.discover.k.a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.a
    public final void a() {
        new k().a(F().f121274i).f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag(View view) {
        super(view);
        l.d(view, "");
        if (c() == null) {
            view.setVisibility(8);
        } else {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.apz);
            l.b(tuxTextView, "");
            a.C1895a c2 = c();
            if (c2 == null) {
                l.b();
            }
            tuxTextView.setText(c2.getUserNote());
        }
        androidx.core.widget.h.e((TextView) view.findViewById(R.id.apz), (int) n.b(view.getContext(), 17.0f));
    }
}

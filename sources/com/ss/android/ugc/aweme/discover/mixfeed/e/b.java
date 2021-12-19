package com.ss.android.ugc.aweme.discover.mixfeed.e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.discover.adapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81752a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TextView f81753b;

    static {
        Covode.recordClassIndex(50787);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50788);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            return b(viewGroup);
        }

        private static b b(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            return new b(m.a(viewGroup, R.layout.awv));
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    public final void b(String str) {
        l.d(str, "");
        TextView textView = this.f81753b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        this.f81753b = (TextView) view.findViewById(R.id.dvc);
        View findViewById = view.findViewById(R.id.dvf);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.c0o);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }
}

package com.ss.android.ugc.aweme.journey;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104841a = new a((byte) 0);

    static {
        Covode.recordClassIndex(67237);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67238);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(ViewGroup viewGroup, String str, String str2) {
            l.d(viewGroup, "");
            l.d(str, "");
            l.d(str2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abk, viewGroup, false);
            l.b(a2, "");
            ((TuxTextView) a2.findViewById(R.id.bfq)).a(38.0f);
            return new d(a2, str, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, String str, String str2) {
        super(view, str);
        l.d(view, "");
        l.d(str, "");
        l.d(str2, "");
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bfq);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.bfq);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(str);
            TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.bfq);
            l.b(tuxTextView3, "");
            com.ss.android.ugc.aweme.journey.a.a.a(tuxTextView3);
        }
        if (TextUtils.isEmpty(str2)) {
            TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.dwk);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView5 = (TuxTextView) view.findViewById(R.id.dwk);
        l.b(tuxTextView5, "");
        tuxTextView5.setText(str2);
        TuxTextView tuxTextView6 = (TuxTextView) view.findViewById(R.id.dwk);
        l.b(tuxTextView6, "");
        com.ss.android.ugc.aweme.journey.a.a.a(tuxTextView6);
    }
}

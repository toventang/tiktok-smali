package com.ss.android.ugc.aweme.qna.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119617a = new a((byte) 0);

    static {
        Covode.recordClassIndex(77713);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77714);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static i a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar2, viewGroup, false);
            l.b(a2, "");
            return new i(a2);
        }
    }
}

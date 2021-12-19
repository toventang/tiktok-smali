package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80674a = new a((byte) 0);

    static {
        Covode.recordClassIndex(50177);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50178);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw_, viewGroup, false);
            l.b(a2, "");
            return new j(a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        l.d(view, "");
    }
}

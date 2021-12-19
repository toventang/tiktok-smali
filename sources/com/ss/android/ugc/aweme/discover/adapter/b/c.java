package com.ss.android.ugc.aweme.discover.adapter.b;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static final a f80461c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    TextView f80462a;

    /* renamed from: b  reason: collision with root package name */
    public final View f80463b;

    static {
        Covode.recordClassIndex(50077);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50078);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        this.f80463b = view;
        View findViewById = view.findViewById(R.id.dtx);
        l.b(findViewById, "");
        this.f80462a = (TextView) findViewById;
    }
}

package com.ss.android.ugc.aweme.discover.adapter;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.d.a.a;
import com.ss.android.ugc.aweme.discover.m.e;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.discover.widget.d;
import com.zhiliaoapp.musically.R;

public final class z extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public al.b f80686a;

    /* renamed from: b  reason: collision with root package name */
    public a.b f80687b;

    /* renamed from: c  reason: collision with root package name */
    TextView f80688c;

    /* renamed from: d  reason: collision with root package name */
    TextView f80689d;

    static {
        Covode.recordClassIndex(50184);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.z$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f80691a;

        static {
            Covode.recordClassIndex(50186);
            int[] iArr = new int[a.b.values().length];
            f80691a = iArr;
            try {
                iArr[a.b.TYPE_CLEAR_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public z(View view, al.b bVar) {
        super(view);
        this.f80688c = (TextView) view.findViewById(R.id.a72);
        this.f80689d = (TextView) view.findViewById(R.id.di5);
        this.f80686a = bVar;
        this.f80688c.setOnClickListener(new e() {
            /* class com.ss.android.ugc.aweme.discover.adapter.z.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50185);
            }

            @Override // com.ss.android.ugc.aweme.discover.m.e
            public final void a() {
                if (z.this.f80686a != null) {
                    d b2 = new d(z.this.itemView.getContext()).c(z.this.itemView.getContext().getString(R.string.fie)).d(z.this.itemView.getContext().getString(R.string.fif)).a(z.this.itemView.getContext().getString(R.string.fic)).b(z.this.itemView.getContext().getString(R.string.fid));
                    b2.show();
                    TextView textView = b2.f82858a;
                    TextView textView2 = b2.f82859b;
                    if (textView != null) {
                        textView.setOnClickListener(new aa(b2));
                    }
                    if (textView2 != null) {
                        textView2.setOnClickListener(new ab(this, b2));
                    }
                }
            }
        });
        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b);
        if (a2 != null) {
            this.f80689d.setTypeface(a2);
        }
    }
}

package com.ss.android.ugc.aweme.autoplay.player;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.flowfeed.a.b;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.xsearch.f;
import h.f.b.l;

public final class c implements View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f67478e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final g f67479a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.a.a f67480b;

    /* renamed from: c  reason: collision with root package name */
    public final b f67481c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f67482d;

    static {
        Covode.recordClassIndex(41547);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41548);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView = this.f67482d;
        l.d(recyclerView, "");
        if (f.a().containsKey(recyclerView)) {
            f.a().remove(recyclerView);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        com.ss.android.ugc.aweme.xsearch.a aVar = new com.ss.android.ugc.aweme.xsearch.a(this.f67479a, this.f67480b, this.f67481c);
        RecyclerView recyclerView = this.f67482d;
        l.d(recyclerView, "");
        l.d(aVar, "");
        if (!f.a().containsKey(recyclerView)) {
            f.a().put(recyclerView, aVar);
        }
    }

    public c(g gVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, b bVar, RecyclerView recyclerView) {
        l.d(gVar, "");
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(recyclerView, "");
        this.f67479a = gVar;
        this.f67480b = aVar;
        this.f67481c = bVar;
        this.f67482d = recyclerView;
    }
}

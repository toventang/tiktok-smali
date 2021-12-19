package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.h.w;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public final class c extends f<User> implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f113148c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f113149a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notification.utils.c f113150b = new com.ss.android.ugc.aweme.notification.utils.c();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<String> f113151d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.notification.followrequest.a f113152e;

    static {
        Covode.recordClassIndex(72746);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return 15;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72747);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<User> list) {
        super.b_(list);
        w.a.a(w.c.FOLLOW_REQUEST);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        j.b();
    }

    public c(com.ss.android.ugc.aweme.notification.followrequest.a aVar) {
        l.d(aVar, "");
        this.f113152e = aVar;
    }

    @Override // com.ss.android.ugc.aweme.notification.adapter.j
    public final void d(int i2) {
        if (i2 >= 0 && i2 < e().size()) {
            e().remove(i2);
            if (e().isEmpty()) {
                notifyDataSetChanged();
                this.f113152e.a();
                return;
            }
            notifyItemRemoved(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        int c2 = b.c(viewGroup.getContext(), R.color.c5);
        f(c2);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        Context context = viewGroup.getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c2);
        tuxTextView.setText(R.string.cgj);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.c().b(tuxTextView));
        l.b(a_, "");
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        Object obj = e().get(i2);
        l.b(obj, "");
        ((com.ss.android.ugc.aweme.notification.followrequest.b.b) viewHolder).a((User) obj, "follow_request_page");
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder bVar;
        l.d(viewGroup, "");
        if (i2 != 15) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.k9, viewGroup, false);
            com.ss.android.ugc.aweme.notification.followrequest.a aVar = this.f113152e;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type android.app.Activity");
            bVar = new com.ss.android.ugc.aweme.notification.followrequest.b.a(a2, (Activity) aVar, this, this.f113151d);
        } else {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ke, viewGroup, false);
            l.b(a3, "");
            bVar = new com.ss.android.ugc.aweme.notification.followrequest.b.b(a3, this, this.f113150b);
        }
        if (bVar instanceof w) {
            ((w) bVar).a(w.c.FOLLOW_REQUEST);
        }
        return bVar;
    }
}

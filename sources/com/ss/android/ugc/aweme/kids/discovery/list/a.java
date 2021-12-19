package com.ss.android.ugc.aweme.kids.discovery.list;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.common.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.kids.common.ui.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends d implements com.ss.android.ugc.aweme.kids.common.ui.a.d {

    /* renamed from: j  reason: collision with root package name */
    public static final C2717a f106492j = new C2717a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.discovery.c.a f106493d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f106494e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f106495f;

    /* renamed from: g  reason: collision with root package name */
    public String f106496g;

    /* renamed from: h  reason: collision with root package name */
    public String f106497h;

    /* renamed from: i  reason: collision with root package name */
    public int f106498i = -1;

    /* renamed from: k  reason: collision with root package name */
    private final int f106499k;
    private final int w;
    private final Context x;

    static {
        Covode.recordClassIndex(68048);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.a$a  reason: collision with other inner class name */
    public static final class C2717a {
        static {
            Covode.recordClassIndex(68049);
        }

        private C2717a() {
        }

        public /* synthetic */ C2717a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        if (super.c() <= 8 || this.f106498i != 1) {
            return super.c();
        }
        return 9;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.acr, viewGroup, false);
        l.b(a2, "");
        return new d(a2, this);
    }

    public a(Context context) {
        l.d(context, "");
        this.x = context;
        this.f106499k = context.getResources().getDimensionPixelSize(R.dimen.n1);
        this.w = context.getResources().getDimensionPixelSize(R.dimen.n0);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final void a(RecyclerView.ViewHolder viewHolder) {
        float f2;
        List list;
        l.d(viewHolder, "");
        TuxTextView tuxTextView = (TuxTextView) viewHolder.itemView.findViewById(R.id.fj6);
        if (this.f106498i != 1 || (list = this.f76354l) == null || list.size() <= 8) {
            f2 = 14.0f;
        } else {
            Objects.requireNonNull(tuxTextView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            tuxTextView.setText(this.x.getString(R.string.ct4));
            f2 = 104.0f;
        }
        View view = viewHolder.itemView;
        l.b(view, "");
        view.setLayoutParams(new ViewGroup.LayoutParams((int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), f2), (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 133.0f)));
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        return c.a.a(viewGroup, "category", this, false);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final void b(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        c cVar = (c) viewHolder;
        Aweme aweme = (Aweme) this.f76354l.get(i2);
        int i3 = this.f106499k;
        int i4 = this.w;
        if (aweme != null) {
            View view = cVar.itemView;
            l.b(view, "");
            e.a(view.getRootView(), i3, i4);
            cVar.a(aweme);
        }
        cVar.p = this.f106494e;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.a.d
    public final void a(View view, Aweme aweme, String str) {
        com.ss.android.ugc.aweme.kids.discovery.c.c cVar;
        if (view != null) {
            if (TextUtils.equals("view more", str)) {
                f.a("click_view_more_category", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "discovery").a("exit_method", "swipe_for_more").a("category_id", this.f106496g).a());
                com.ss.android.ugc.aweme.kids.discovery.c.a aVar = this.f106493d;
                if (aVar != null && (cVar = aVar.f106428b) != null) {
                    Context context = view.getContext();
                    l.b(context, "");
                    SmartRouter.buildRoute(context, "//kids/discovery/gallery").withParam("title", cVar.f106434b).withParam("challenge_id", cVar.f106433a).withParam("feed_type", cVar.f106435c).withParam("mob_enter_from", "swipe_for_more").open();
                }
            } else if (aweme != null) {
                Bundle bundle = new Bundle();
                bundle.putString("group_id", aweme.getAid());
                bundle.putString("enter_from", "discovery");
                f.a("discover_preview_enter", bundle);
                SmartRouter.buildRoute(view.getContext(), "//kids/discovery/feed").withParam("current_id", aweme.getAid()).withParam("enter_from", "category_details_page").withParam("title", this.f106497h).withParam("challenge_id", this.f106496g).withParam("feed_type", this.f106498i).open();
            }
        }
    }
}

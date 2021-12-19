package com.ss.android.ugc.aweme.story.archive;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;

public final class StoryArchListCell extends PowerCell<g> {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.assem.a.a f136729a;

    public static final class a extends m implements h.f.a.b<h, h> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(89309);
        }

        public a() {
            super(1);
        }

        public final h invoke(h hVar) {
            l.c(hVar, "");
            return hVar;
        }
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f136732a = new c();

        static {
            Covode.recordClassIndex(89311);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_arch_list";
        }
    }

    static {
        Covode.recordClassIndex(89308);
    }

    public StoryArchListCell() {
        c cVar = c.f136732a;
        this.f136729a = new com.bytedance.assem.a.a(ab.a(StoryArchListViewModel.class), cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, a.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        View view = this.itemView;
        l.b(view, "");
        ((SmartImageView) view.findViewById(R.id.bvt)).setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        super.m();
        View view = this.itemView;
        l.b(view, "");
        ((SmartImageView) view.findViewById(R.id.bvt)).setAttached(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2f, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryArchListCell f136730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f136731b;

        static {
            Covode.recordClassIndex(89310);
        }

        b(StoryArchListCell storyArchListCell, g gVar) {
            this.f136730a = storyArchListCell;
            this.f136731b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                String aid = this.f136731b.f136756a.getAid();
                l.b(aid, "");
                l.d(aid, "");
                ((AssemViewModel) this.f136730a.f136729a.getValue()).a(new StoryArchListViewModel.c(aid));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(g gVar) {
        UrlModel cover;
        long j2;
        g gVar2 = gVar;
        l.d(gVar2, "");
        Aweme aweme = gVar2.f136756a;
        View view = this.itemView;
        l.b(view, "");
        ((SimpleDraweeView) view.findViewById(R.id.bvt)).setActualImageResource(0);
        Video video = aweme.getVideo();
        if (video != null) {
            com.ss.android.ugc.aweme.ay.c cVar = com.ss.android.ugc.aweme.ay.c.f67775a;
            View view2 = this.itemView;
            l.b(view2, "");
            SmartImageView smartImageView = (SmartImageView) view2.findViewById(R.id.bvt);
            l.b(smartImageView, "");
            if (!com.ss.android.ugc.aweme.ay.c.a(cVar, smartImageView, video, "StoryArchListCell", false, false, 120) && (cover = video.getCover()) != null) {
                v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(cover));
                int[] a3 = em.a(200);
                if (a3 != null) {
                    a2.b(a3);
                }
                View view3 = this.itemView;
                l.b(view3, "");
                a2.E = (SmartImageView) view3.findViewById(R.id.bvt);
                a2.a("StoryArchListCell").c();
            }
        }
        Aweme aweme2 = gVar2.f136756a;
        boolean z = true;
        if (!(com.ss.android.ugc.aweme.story.c.b.a() == 1 || com.ss.android.ugc.aweme.story.c.b.a() == 2)) {
            z = false;
        }
        if (z) {
            View view4 = this.itemView;
            TuxIconView tuxIconView = (TuxIconView) view4.findViewById(R.id.bhr);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(4);
            TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.exo);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(4);
        } else {
            View view5 = this.itemView;
            TuxIconView tuxIconView2 = (TuxIconView) view5.findViewById(R.id.bhr);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.exo);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            ((TuxIconView) view5.findViewById(R.id.bhr)).setIconRes(R.raw.icon_play);
            TuxTextView tuxTextView3 = (TuxTextView) view5.findViewById(R.id.exo);
            l.b(tuxTextView3, "");
            AwemeStatistics statistics = aweme2.getStatistics();
            if (statistics != null) {
                j2 = statistics.getPlayCount();
            } else {
                j2 = 0;
            }
            tuxTextView3.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
        }
        this.itemView.setOnClickListener(new b(this, gVar2));
        Aweme aweme3 = gVar2.f136756a;
        if (aweme3.isProhibited()) {
            View view6 = this.itemView;
            l.b(view6, "");
            TuxTextView tuxTextView4 = (TuxTextView) view6.findViewById(R.id.dce);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(aweme3.getCoverNotice());
            View view7 = this.itemView;
            l.b(view7, "");
            View findViewById = view7.findViewById(R.id.ckm);
            l.b(findViewById, "");
            findViewById.setVisibility(0);
            View view8 = this.itemView;
            l.b(view8, "");
            TuxTextView tuxTextView5 = (TuxTextView) view8.findViewById(R.id.dce);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(0);
            View view9 = this.itemView;
            l.b(view9, "");
            LinearLayout linearLayout = (LinearLayout) view9.findViewById(R.id.cee);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        View view10 = this.itemView;
        l.b(view10, "");
        View findViewById2 = view10.findViewById(R.id.ckm);
        l.b(findViewById2, "");
        findViewById2.setVisibility(8);
        View view11 = this.itemView;
        l.b(view11, "");
        TuxTextView tuxTextView6 = (TuxTextView) view11.findViewById(R.id.dce);
        l.b(tuxTextView6, "");
        tuxTextView6.setVisibility(8);
        View view12 = this.itemView;
        l.b(view12, "");
        LinearLayout linearLayout2 = (LinearLayout) view12.findViewById(R.id.cee);
        l.b(linearLayout2, "");
        linearLayout2.setVisibility(0);
    }
}

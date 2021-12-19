package com.ss.android.ugc.aweme.mix.pickcandidate;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class MixPickCandidatePowerCell extends PowerCell<a> {

    /* renamed from: a  reason: collision with root package name */
    public Context f110182a;

    static {
        Covode.recordClassIndex(70728);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixPickCandidatePowerCell f110183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110184b;

        static {
            Covode.recordClassIndex(70729);
        }

        a(MixPickCandidatePowerCell mixPickCandidatePowerCell, a aVar) {
            this.f110183a = mixPickCandidatePowerCell;
            this.f110184b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f110183a.f110182a;
            if (context != null) {
                MixFeedService.k().a(context);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixPickCandidatePowerCell f110185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110186b;

        static {
            Covode.recordClassIndex(70730);
        }

        b(MixPickCandidatePowerCell mixPickCandidatePowerCell, a aVar) {
            this.f110185a = mixPickCandidatePowerCell;
            this.f110186b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f110185a.f110182a;
            if (context != null) {
                MixFeedService.k().a(context);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixPickCandidatePowerCell f110187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110188b;

        static {
            Covode.recordClassIndex(70731);
        }

        c(MixPickCandidatePowerCell mixPickCandidatePowerCell, a aVar) {
            this.f110187a = mixPickCandidatePowerCell;
            this.f110188b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f110187a.f110182a;
            if (context != null) {
                MixFeedService.k().a(context);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f110182a = viewGroup.getContext();
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aks, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixPickCandidatePowerCell f110189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110190b;

        static {
            Covode.recordClassIndex(70732);
        }

        d(MixPickCandidatePowerCell mixPickCandidatePowerCell, a aVar) {
            this.f110189a = mixPickCandidatePowerCell;
            this.f110190b = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f110189a.f110182a != null) {
                Context context = this.f110189a.f110182a;
                if (context == null) {
                    l.b();
                }
                Aweme aweme = this.f110190b.f110220e;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (context != null) {
                    Intent intent = new Intent(context, MixVideoDetailActivity.class);
                    intent.putExtra("id", str);
                    com.ss.android.ugc.aweme.mix.e.a aVar = new com.ss.android.ugc.aweme.mix.e.a();
                    aVar.setMEnterCleanMode(true);
                    intent.putExtra("mix_video_list_params", aVar);
                    intent.putExtra("enter_from", "create_playlist");
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                    context.startActivity(intent);
                }
            }
        }
    }

    private final void a(int i2) {
        View view = this.itemView;
        l.b(view, "");
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.a28);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        View view2 = this.itemView;
        l.b(view2, "");
        ((TuxIconView) view2.findViewById(R.id.a28)).setIconRes(i2);
        View view3 = this.itemView;
        l.b(view3, "");
        View view4 = this.itemView;
        l.b(view4, "");
        ((TuxIconView) view3.findViewById(R.id.a28)).setTintColor(view4.getResources().getColor(R.color.f159928l));
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixPickCandidatePowerCell f110191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110192b;

        static {
            Covode.recordClassIndex(70733);
        }

        e(MixPickCandidatePowerCell mixPickCandidatePowerCell, a aVar) {
            this.f110191a = mixPickCandidatePowerCell;
            this.f110192b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) PowerCell.b(this.f110191a, MultiVideoViewModel.class);
            if (multiVideoViewModel != null && multiVideoViewModel.f110202h && !this.f110192b.f110217b) {
                View view2 = this.f110191a.itemView;
                l.b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.a22);
                l.b(appCompatCheckBox, "");
                appCompatCheckBox.setSelected(this.f110192b.f110217b);
            } else if (this.f110192b.f110221f) {
                View view3 = this.f110191a.itemView;
                l.b(view3, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.a22);
                l.b(appCompatCheckBox2, "");
                appCompatCheckBox2.setSelected(this.f110192b.f110217b);
            } else {
                a aVar = this.f110192b;
                aVar.f110217b = true ^ aVar.f110217b;
                View view4 = this.f110191a.itemView;
                l.b(view4, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.a22);
                l.b(appCompatCheckBox3, "");
                appCompatCheckBox3.setSelected(this.f110192b.f110217b);
                if (this.f110192b.f110217b) {
                    MultiVideoViewModel multiVideoViewModel2 = (MultiVideoViewModel) PowerCell.b(this.f110191a, MultiVideoViewModel.class);
                    if (multiVideoViewModel2 != null) {
                        this.f110191a.getAdapterPosition();
                        multiVideoViewModel2.a(this.f110192b.f110220e);
                        return;
                    }
                    return;
                }
                MultiVideoViewModel multiVideoViewModel3 = (MultiVideoViewModel) PowerCell.b(this.f110191a, MultiVideoViewModel.class);
                if (multiVideoViewModel3 != null) {
                    this.f110191a.getAdapterPosition();
                    multiVideoViewModel3.b(this.f110192b.f110220e);
                }
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixPickCandidatePowerCell f110193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110194b;

        static {
            Covode.recordClassIndex(70734);
        }

        f(MixPickCandidatePowerCell mixPickCandidatePowerCell, a aVar) {
            this.f110193a = mixPickCandidatePowerCell;
            this.f110194b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) PowerCell.b(this.f110193a, MultiVideoViewModel.class);
            if (multiVideoViewModel != null && multiVideoViewModel.f110202h && !this.f110194b.f110217b) {
                View view2 = this.f110193a.itemView;
                l.b(view2, "");
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view2.findViewById(R.id.a22);
                l.b(appCompatCheckBox, "");
                appCompatCheckBox.setSelected(this.f110194b.f110217b);
            } else if (this.f110194b.f110221f) {
                View view3 = this.f110193a.itemView;
                l.b(view3, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view3.findViewById(R.id.a22);
                l.b(appCompatCheckBox2, "");
                appCompatCheckBox2.setSelected(this.f110194b.f110217b);
            } else {
                a aVar = this.f110194b;
                aVar.f110217b = true ^ aVar.f110217b;
                View view4 = this.f110193a.itemView;
                l.b(view4, "");
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) view4.findViewById(R.id.a22);
                l.b(appCompatCheckBox3, "");
                appCompatCheckBox3.setSelected(this.f110194b.f110217b);
                if (this.f110194b.f110217b) {
                    MultiVideoViewModel multiVideoViewModel2 = (MultiVideoViewModel) PowerCell.b(this.f110193a, MultiVideoViewModel.class);
                    if (multiVideoViewModel2 != null) {
                        this.f110193a.getAdapterPosition();
                        multiVideoViewModel2.a(this.f110194b.f110220e);
                        return;
                    }
                    return;
                }
                MultiVideoViewModel multiVideoViewModel3 = (MultiVideoViewModel) PowerCell.b(this.f110193a, MultiVideoViewModel.class);
                if (multiVideoViewModel3 != null) {
                    this.f110193a.getAdapterPosition();
                    multiVideoViewModel3.b(this.f110194b.f110220e);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(a aVar) {
        List<String> urlList;
        a aVar2 = aVar;
        l.d(aVar2, "");
        UrlModel urlModel = aVar2.f110216a;
        if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
            if (!urlList.isEmpty()) {
                View view = this.itemView;
                l.b(view, "");
                RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.a24);
                String str = urlList.get(0);
                if (str == null) {
                    str = "";
                }
                com.ss.android.ugc.aweme.base.e.b(remoteImageView, str, -1, -1);
            } else {
                Context context = this.f110182a;
                if (context != null) {
                    View view2 = this.itemView;
                    l.b(view2, "");
                    com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view2.findViewById(R.id.a24), context.getResources().getColor(R.color.f159926j));
                }
            }
        }
        if (aVar2.f110218c || aVar2.f110221f) {
            View view3 = this.itemView;
            l.b(view3, "");
            FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.a25);
            l.b(frameLayout, "");
            frameLayout.setVisibility(0);
        } else {
            View view4 = this.itemView;
            l.b(view4, "");
            FrameLayout frameLayout2 = (FrameLayout) view4.findViewById(R.id.a25);
            l.b(frameLayout2, "");
            frameLayout2.setVisibility(8);
        }
        if (aVar2.f110222g) {
            a(R.raw.icon_exclamation_mark_circle);
            this.itemView.setOnClickListener(new a(this, aVar2));
            View view5 = this.itemView;
            l.b(view5, "");
            ((AppCompatCheckBox) view5.findViewById(R.id.a22)).setOnClickListener(new b(this, aVar2));
            View view6 = this.itemView;
            l.b(view6, "");
            ((RelativeLayout) view6.findViewById(R.id.a23)).setOnClickListener(new c(this, aVar2));
        } else if (aVar2.f110219d) {
            a(R.raw.icon_playlist);
            View view7 = this.itemView;
            l.b(view7, "");
            TuxIconView tuxIconView = (TuxIconView) view7.findViewById(R.id.a28);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
        } else {
            View view8 = this.itemView;
            l.b(view8, "");
            TuxIconView tuxIconView2 = (TuxIconView) view8.findViewById(R.id.a28);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        View view9 = this.itemView;
        l.b(view9, "");
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view9.findViewById(R.id.a22);
        l.b(appCompatCheckBox, "");
        appCompatCheckBox.setSelected(aVar2.f110217b);
        View view10 = this.itemView;
        l.b(view10, "");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) view10.findViewById(R.id.a22);
        l.b(appCompatCheckBox2, "");
        appCompatCheckBox2.setClickable(!aVar2.f110218c);
        if (!aVar2.f110218c && !aVar2.f110221f) {
            this.itemView.setOnClickListener(new d(this, aVar2));
            View view11 = this.itemView;
            l.b(view11, "");
            ((AppCompatCheckBox) view11.findViewById(R.id.a22)).setOnClickListener(new e(this, aVar2));
            View view12 = this.itemView;
            l.b(view12, "");
            ((RelativeLayout) view12.findViewById(R.id.a23)).setOnClickListener(new f(this, aVar2));
        } else if (!aVar2.f110222g) {
            this.itemView.setOnClickListener(null);
            View view13 = this.itemView;
            l.b(view13, "");
            ((AppCompatCheckBox) view13.findViewById(R.id.a22)).setOnClickListener(null);
            View view14 = this.itemView;
            l.b(view14, "");
            ((RelativeLayout) view14.findViewById(R.id.a23)).setOnClickListener(null);
        }
    }
}

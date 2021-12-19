package com.ss.android.ugc.aweme.discover.ui.c;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.d.c;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.discover.a.at;
import com.ss.android.ugc.aweme.discover.adapter.b;
import com.ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.utils.gp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    public SearchLiveStruct f82531a;

    /* renamed from: b  reason: collision with root package name */
    Aweme f82532b;

    /* renamed from: c  reason: collision with root package name */
    public String f82533c;

    /* renamed from: d  reason: collision with root package name */
    SmartImageView f82534d;

    /* renamed from: e  reason: collision with root package name */
    SmartImageView f82535e;

    /* renamed from: f  reason: collision with root package name */
    TextView f82536f;

    /* renamed from: g  reason: collision with root package name */
    TextView f82537g;

    /* renamed from: h  reason: collision with root package name */
    View f82538h;

    /* renamed from: i  reason: collision with root package name */
    public a f82539i;

    /* renamed from: m  reason: collision with root package name */
    private SmartImageView f82540m;
    private TextView n;
    private LinearLayout o;
    private LinearLayout p;

    public interface a {
        static {
            Covode.recordClassIndex(51383);
        }

        void a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(51381);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    public final void a(View view) {
        l.d(view, "");
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new gp((int) c.a(G(), 2.0f)));
            view.setClipToOutline(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view) {
        super(view);
        ViewGroup.LayoutParams layoutParams;
        SmartImageView smartImageView;
        l.d(view, "");
        this.f82534d = (SmartImageView) view.findViewById(R.id.ccc);
        this.f82540m = (SmartImageView) view.findViewById(R.id.ccd);
        this.f82535e = (SmartImageView) view.findViewById(R.id.cd4);
        this.f82536f = (TextView) view.findViewById(R.id.ce3);
        this.f82537g = (TextView) view.findViewById(R.id.cdb);
        this.n = (TextView) view.findViewById(R.id.ce2);
        this.f82538h = view.findViewById(R.id.c47);
        this.o = (LinearLayout) view.findViewById(R.id.aer);
        this.p = (LinearLayout) view.findViewById(R.id.csf);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.ui.c.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f82541a;

            static {
                Covode.recordClassIndex(51382);
            }

            {
                this.f82541a = r1;
            }

            public final void onClick(View view) {
                User author;
                Aweme aweme;
                ClickAgent.onClick(view);
                a aVar = this.f82541a.f82539i;
                Long l2 = null;
                if (aVar != null) {
                    SearchLiveStruct searchLiveStruct = this.f82541a.f82531a;
                    if (searchLiveStruct != null) {
                        aweme = searchLiveStruct.getLiveAweme();
                    } else {
                        aweme = null;
                    }
                    aVar.a(aweme);
                }
                h hVar = this.f82541a;
                SearchLiveStruct searchLiveStruct2 = hVar.f82531a;
                if (searchLiveStruct2 != null) {
                    searchLiveStruct2.getLiveAweme();
                }
                com.ss.android.ugc.aweme.search.k.c w = ((d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(hVar.F()).A("click_info").x("live_card").a(Integer.valueOf(hVar.getAdapterPosition()))).w("0");
                Aweme aweme2 = hVar.f82532b;
                if (!(aweme2 == null || (author = aweme2.getAuthor()) == null)) {
                    l2 = Long.valueOf(author.roomId);
                }
                w.g(String.valueOf(l2)).o("search_result").f();
            }
        });
        if (com.bytedance.ies.abmock.b.a().a(true, "search_optm_mask_layer_on_video", 0) == 0 && (smartImageView = this.f82540m) != null) {
            smartImageView.setVisibility(0);
        }
        if (!at.a()) {
            TextView textView = this.f82536f;
            if (textView != null) {
                Resources system = Resources.getSystem();
                l.b(system, "");
                Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
                Resources system2 = Resources.getSystem();
                l.b(system2, "");
                Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 6.0f, system2.getDisplayMetrics())));
                Resources system3 = Resources.getSystem();
                l.b(system3, "");
                i.b(textView, valueOf, valueOf2, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics()))), 0, false, 16);
            }
            LinearLayout linearLayout = this.o;
            if (linearLayout != null) {
                i.b(linearLayout, 0, 0, 0, 0, false, 16);
            }
            LinearLayout linearLayout2 = this.p;
            if (linearLayout2 != null) {
                Resources system4 = Resources.getSystem();
                l.b(system4, "");
                Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system4.getDisplayMetrics())));
                Resources system5 = Resources.getSystem();
                l.b(system5, "");
                i.b(linearLayout2, 0, valueOf3, 0, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 18.0f, system5.getDisplayMetrics()))), false, 16);
            }
            SmartImageView smartImageView2 = this.f82535e;
            if (smartImageView2 != null) {
                layoutParams = smartImageView2.getLayoutParams();
                if (layoutParams != null) {
                    Resources system6 = Resources.getSystem();
                    l.b(system6, "");
                    layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system6.getDisplayMetrics()));
                    Resources system7 = Resources.getSystem();
                    l.b(system7, "");
                    layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system7.getDisplayMetrics()));
                }
            } else {
                layoutParams = null;
            }
            SmartImageView smartImageView3 = this.f82535e;
            if (smartImageView3 != null) {
                smartImageView3.setLayoutParams(layoutParams);
            }
        }
    }
}

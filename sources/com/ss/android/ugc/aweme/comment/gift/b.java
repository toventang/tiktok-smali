package com.ss.android.ugc.aweme.comment.gift;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.android.live.core.f.y;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.tabs.TabLayout;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResult;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f71811j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f71812a = "Classic";

    /* renamed from: b  reason: collision with root package name */
    public View f71813b;

    /* renamed from: c  reason: collision with root package name */
    public final f f71814c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.fragment.app.e f71815d;

    /* renamed from: e  reason: collision with root package name */
    public final GiftViewModel f71816e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.util.c f71817f;

    /* renamed from: g  reason: collision with root package name */
    public final String f71818g;

    /* renamed from: h  reason: collision with root package name */
    public final String f71819h;

    /* renamed from: i  reason: collision with root package name */
    public final String f71820i;

    /* renamed from: k  reason: collision with root package name */
    private final String f71821k;

    /* renamed from: l  reason: collision with root package name */
    private final String f71822l;

    /* renamed from: m  reason: collision with root package name */
    private final Fragment f71823m;
    private final ViewGroup n;

    static {
        Covode.recordClassIndex(44173);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44175);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$b  reason: collision with other inner class name */
    static final class RunnableC1616b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71825a;

        static {
            Covode.recordClassIndex(44176);
        }

        RunnableC1616b(b bVar) {
            this.f71825a = bVar;
        }

        public final void run() {
            androidx.fragment.app.e eVar = this.f71825a.f71815d;
            l.d(eVar, "");
            d dVar = new d(eVar);
            Window window = dVar.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.flags = attributes.flags | 2 | 32 | 262144;
                window.setAttributes(attributes);
                window.setBackgroundDrawableResource(R.drawable.lw);
            }
            dVar.show();
        }
    }

    public static final class d implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71827a;

        static {
            Covode.recordClassIndex(44178);
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void b(TabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f71827a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void a(TabLayout.f fVar) {
            CharSequence charSequence;
            String str;
            b bVar = this.f71827a;
            if (fVar != null) {
                charSequence = fVar.f52652c;
            } else {
                charSequence = null;
            }
            bVar.f71812a = String.valueOf(charSequence);
            b bVar2 = this.f71827a;
            String str2 = bVar2.f71812a;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (str2 == null || (str = str2.toString()) == null) {
                str = "";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("to_gift_tab", str).a("enter_from", bVar2.f71818g).a("group_id", bVar2.f71819h).a("author_id", bVar2.f71820i);
            l.b(a2, "");
            r.a("change_gift_tab", a2.f66730a);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiftChooseViewPager f71828a;

        static {
            Covode.recordClassIndex(44179);
        }

        e(GiftChooseViewPager giftChooseViewPager) {
            this.f71828a = giftChooseViewPager;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f71828a.setCurrentItem(num.intValue());
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71826a;

        static {
            Covode.recordClassIndex(44177);
        }

        c(b bVar) {
            this.f71826a = bVar;
        }

        public final void onClick(View view) {
            DmtStatusView dmtStatusView;
            ClickAgent.onClick(view);
            View view2 = this.f71826a.f71813b;
            if (!(view2 == null || (dmtStatusView = (DmtStatusView) view2.findViewById(R.id.e_o)) == null)) {
                dmtStatusView.f();
            }
            this.f71826a.f71816e.e();
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71839a;

        static {
            Covode.recordClassIndex(44184);
        }

        j(b bVar) {
            this.f71839a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71839a.a("click_recharge");
            this.f71839a.f71814c.a("video_gift_panel_recharge_clicked");
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", str).a("enter_from", this.f71818g).a("group_id", this.f71819h).a("author_id", this.f71820i).a("current_balance", this.f71816e.d().getValue());
        l.b(a2, "");
        r.a("enter_coin_recharge", a2.f66730a);
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71832a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtButton f71833b;

        static {
            Covode.recordClassIndex(44181);
        }

        g(b bVar, DmtButton dmtButton) {
            this.f71832a = bVar;
            this.f71833b = dmtButton;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            GiftStruct giftStruct = (GiftStruct) obj;
            if (giftStruct != null) {
                long diamondCount = (long) giftStruct.getDiamondCount();
                Long value = this.f71832a.f71816e.d().getValue();
                if (value == null) {
                    value = -1L;
                }
                l.b(value, "");
                if (diamondCount <= value.longValue()) {
                    this.f71833b.setEnabled(true);
                    this.f71833b.setBackgroundResource(R.drawable.n2);
                    this.f71833b.setTextColor(androidx.core.content.b.c(this.f71832a.f71815d, R.color.a9));
                    return;
                }
            }
            this.f71833b.setEnabled(false);
            this.f71833b.setBackgroundResource(R.drawable.n3);
            this.f71833b.setTextColor(androidx.core.content.b.c(this.f71832a.f71815d, R.color.bz));
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71838a;

        static {
            Covode.recordClassIndex(44183);
        }

        i(b bVar) {
            this.f71838a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71838a.f71817f.a();
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "gift_dialog").a("enter_from", this.f71838a.f71818g).a("group_id", this.f71838a.f71819h).a("author_id", this.f71838a.f71820i);
            Long value = this.f71838a.f71816e.d().getValue();
            if (value == null) {
                value = -1L;
            }
            l.b(value, "");
            r.a("video_gift_send_click", a2.a("current_balance", value.longValue()).f66730a);
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftChooseViewPager f71830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DmtLoadingLayout f71831c;

        static {
            Covode.recordClassIndex(44180);
        }

        f(b bVar, GiftChooseViewPager giftChooseViewPager, DmtLoadingLayout dmtLoadingLayout) {
            this.f71829a = bVar;
            this.f71830b = giftChooseViewPager;
            this.f71831c = dmtLoadingLayout;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            GiftResult giftPageList;
            List<GiftPage> giftPageList2;
            LinearLayout linearLayout;
            DmtStatusView dmtStatusView;
            DmtStatusView dmtStatusView2;
            LinearLayout linearLayout2;
            if (obj == null) {
                View view = this.f71829a.f71813b;
                if (!(view == null || (linearLayout2 = (LinearLayout) view.findViewById(R.id.bbg)) == null)) {
                    linearLayout2.setVisibility(8);
                }
                View view2 = this.f71829a.f71813b;
                if (view2 != null && (dmtStatusView2 = (DmtStatusView) view2.findViewById(R.id.e_o)) != null) {
                    dmtStatusView2.h();
                    return;
                }
                return;
            }
            View view3 = this.f71829a.f71813b;
            if (!(view3 == null || (dmtStatusView = (DmtStatusView) view3.findViewById(R.id.e_o)) == null)) {
                dmtStatusView.setVisibility(8);
            }
            View view4 = this.f71829a.f71813b;
            if (!(view4 == null || (linearLayout = (LinearLayout) view4.findViewById(R.id.bbg)) == null)) {
                linearLayout.setVisibility(0);
            }
            GiftResponse value = this.f71829a.f71816e.a().getValue();
            if (value == null || (giftPageList = value.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null || !(!giftPageList2.isEmpty())) {
                this.f71830b.setVisibility(8);
                this.f71831c.setVisibility(0);
                return;
            }
            this.f71830b.setVisibility(0);
            this.f71831c.setVisibility(8);
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtButton f71835b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DmtLoadingLayout f71836c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f71837d;

        static {
            Covode.recordClassIndex(44182);
        }

        h(b bVar, DmtButton dmtButton, DmtLoadingLayout dmtLoadingLayout, TextView textView) {
            this.f71834a = bVar;
            this.f71835b = dmtButton;
            this.f71836c = dmtLoadingLayout;
            this.f71837d = textView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0096  */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.gift.b.h.onChanged(java.lang.Object):void");
        }
    }

    public b(Fragment fragment, ViewGroup viewGroup, androidx.fragment.app.e eVar, GiftViewModel giftViewModel, com.ss.android.ugc.aweme.comment.util.c cVar, String str, String str2, String str3) {
        TabLayout tabLayout;
        GiftChooseViewPager giftChooseViewPager;
        DmtLoadingLayout dmtLoadingLayout;
        DmtLoadingLayout dmtLoadingLayout2;
        TextView textView;
        DmtButton dmtButton;
        TextView textView2;
        DmtStatusView dmtStatusView;
        l.d(fragment, "");
        l.d(viewGroup, "");
        androidx.fragment.app.e eVar2 = eVar;
        l.d(eVar2, "");
        l.d(giftViewModel, "");
        l.d(cVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f71823m = fragment;
        this.n = viewGroup;
        this.f71815d = eVar2;
        this.f71816e = giftViewModel;
        this.f71817f = cVar;
        this.f71818g = str;
        this.f71819h = str2;
        this.f71820i = str3;
        this.f71814c = new f(fragment, eVar2, giftViewModel, str, str2, str3);
        this.f71821k = "GIFT_INFO_REPO";
        this.f71822l = "IS_PRIVACY_PROMOTION_SHOWN";
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ik, viewGroup, false);
        this.f71813b = a2;
        if (a2 != null) {
            tabLayout = (TabLayout) a2.findViewById(R.id.bbu);
        } else {
            tabLayout = null;
        }
        Objects.requireNonNull(tabLayout, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        View view = this.f71813b;
        if (view != null) {
            giftChooseViewPager = (GiftChooseViewPager) view.findViewById(R.id.bbv);
        } else {
            giftChooseViewPager = null;
        }
        Objects.requireNonNull(giftChooseViewPager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.gift.GiftChooseViewPager");
        View view2 = this.f71813b;
        if (view2 != null) {
            dmtLoadingLayout = (DmtLoadingLayout) view2.findViewById(R.id.bbi);
        } else {
            dmtLoadingLayout = null;
        }
        Objects.requireNonNull(dmtLoadingLayout, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout");
        View view3 = this.f71813b;
        if (view3 != null) {
            dmtLoadingLayout2 = (DmtLoadingLayout) view3.findViewById(R.id.a87);
        } else {
            dmtLoadingLayout2 = null;
        }
        Objects.requireNonNull(dmtLoadingLayout2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout");
        View view4 = this.f71813b;
        if (view4 != null) {
            textView = (TextView) view4.findViewById(R.id.a85);
        } else {
            textView = null;
        }
        Objects.requireNonNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        View view5 = this.f71813b;
        if (!(view5 == null || (dmtStatusView = (DmtStatusView) view5.findViewById(R.id.e_o)) == null)) {
            TuxTextView tuxTextView = new TuxTextView(new androidx.appcompat.view.d(dmtStatusView.getContext(), R.style.wa), null, 0, 6);
            String a3 = y.a((int) R.string.haw);
            if (a3 == null) {
                l.b();
            }
            String a4 = y.a((int) R.string.hax);
            if (a4 == null) {
                l.b();
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p.b("\n                  " + a3 + "\n                  " + a4 + "\n                  "));
            int length = a3.length() + 1 + a4.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(eVar2, R.color.c5)), 0, a3.length(), 17);
            eVar2 = eVar2;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(eVar2, R.color.bh)), a3.length(), length, 17);
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView.setOnClickListener(new c(this));
            DmtStatusView.a c2 = DmtStatusView.a.a(dmtStatusView.getContext()).c(tuxTextView);
            c2.f33605g = 0;
            dmtStatusView.setBuilder(c2);
        }
        giftChooseViewPager.setScrollable(true);
        giftChooseViewPager.setAdapter(new c(fragment, eVar2, giftViewModel, str, str2, str3));
        Objects.requireNonNull(giftChooseViewPager, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        tabLayout.setupWithViewPager(giftChooseViewPager);
        tabLayout.addOnTabSelectedListener(new d(this));
        giftViewModel.f71915g.observe(eVar2, new e(giftChooseViewPager));
        giftViewModel.a().observe(eVar2, new f(this, giftChooseViewPager, dmtLoadingLayout));
        View view6 = this.f71813b;
        if (view6 != null) {
            dmtButton = (DmtButton) view6.findViewById(R.id.dyn);
        } else {
            dmtButton = null;
        }
        Objects.requireNonNull(dmtButton, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtButton");
        giftViewModel.b().observe(eVar2, new g(this, dmtButton));
        giftViewModel.d().observe(eVar2, new h(this, dmtButton, dmtLoadingLayout2, textView));
        dmtButton.setOnClickListener(new i(this));
        View view7 = this.f71813b;
        if (view7 != null) {
            textView2 = (TextView) view7.findViewById(R.id.di8);
        } else {
            textView2 = null;
        }
        Objects.requireNonNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setOnClickListener(new j(this));
        giftViewModel.a("", eVar2, 0, 0);
        IVideoGiftService l2 = VideoGiftService.l();
        if (!l2.j() && com.ss.android.ugc.aweme.comment.d.f.a()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1616b(this));
            l2.k();
            r.a("show_gift_list_interstitial", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", "show_gifters_list_gift").a("group_id", str2).a("author_id", str3).f66730a);
        }
        giftViewModel.b().observe(eVar2, new u(this) {
            /* class com.ss.android.ugc.aweme.comment.gift.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f71824a;

            static {
                Covode.recordClassIndex(44174);
            }

            {
                this.f71824a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                GiftStruct giftStruct = (GiftStruct) obj;
                if (giftStruct != null) {
                    Long value = this.f71824a.f71816e.d().getValue();
                    if (value == null) {
                        value = -1L;
                    }
                    if (value.longValue() >= 0) {
                        long diamondCount = (long) giftStruct.getDiamondCount();
                        Long value2 = this.f71824a.f71816e.d().getValue();
                        if (value2 == null) {
                            value2 = -1L;
                        }
                        l.b(value2, "");
                        if (diamondCount > value2.longValue()) {
                            this.f71824a.a("select_gift");
                            this.f71824a.f71814c.a("video_gift_select_insufficient_balance");
                        }
                    }
                }
            }
        });
    }
}

package com.bytedance.android.livesdk.dialogv2.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.be;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.dialogv2.widget.a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.olddialog.widget.u;
import com.bytedance.android.livesdk.service.a.d;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class LiveGiftBottomWidget extends LiveWidget implements a.AbstractC0358a, au {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f17019a;

    /* renamed from: b  reason: collision with root package name */
    public LiveGiftDialogViewModel f17020b;

    /* renamed from: c  reason: collision with root package name */
    String f17021c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends GiftPage> f17022d;

    /* renamed from: e  reason: collision with root package name */
    private a f17023e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f17024f;

    /* renamed from: g  reason: collision with root package name */
    private View f17025g;

    /* renamed from: h  reason: collision with root package name */
    private View f17026h;

    /* renamed from: i  reason: collision with root package name */
    private View f17027i;

    /* renamed from: j  reason: collision with root package name */
    private long f17028j;

    /* renamed from: k  reason: collision with root package name */
    private View f17029k;

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17034a;

        static {
            Covode.recordClassIndex(9460);
        }

        d(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f17034a = liveGiftBottomWidget;
        }

        public final void onClick(View view) {
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17036a;

        static {
            Covode.recordClassIndex(9462);
        }

        f(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f17036a = liveGiftBottomWidget;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(9456);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgx;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17030a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f17031b;

        static {
            Covode.recordClassIndex(9457);
        }

        a(LiveGiftBottomWidget liveGiftBottomWidget, int i2) {
            this.f17030a = liveGiftBottomWidget;
            this.f17031b = i2;
        }

        public final void run() {
            RecyclerView recyclerView = this.f17030a.f17019a;
            if (recyclerView != null) {
                recyclerView.b(this.f17031b);
            }
        }
    }

    public final void b() {
        View view = this.f17029k;
        if (view != null && view.getVisibility() == 0) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cE;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            view.setVisibility(8);
        }
        if (d.a.f21172a.a(d.c.RECHARGE_DIALOG)) {
            this.dataChannel.c(be.class, new bd("click", 0, "normal", a.C0355a.C0356a.f17017a.f17009e));
        }
    }

    public final void a() {
        int a2;
        RecyclerView recyclerView;
        if (this.f17022d != null) {
            ArrayList arrayList = new ArrayList(8);
            List<? extends GiftPage> list = this.f17022d;
            if (list == null) {
                l.b();
            }
            for (GiftPage giftPage : list) {
                if (giftPage.display && giftPage.pageType != 5) {
                    u uVar = new u();
                    uVar.f20174a = giftPage.pageName;
                    uVar.f20175b = giftPage.pageType;
                    uVar.f20176c = giftPage.pagePanelBanner;
                    arrayList.add(uVar);
                }
            }
            a aVar = this.f17023e;
            if (aVar != null) {
                aVar.a(arrayList);
            }
            if (arrayList.size() <= 1) {
                RecyclerView recyclerView2 = this.f17019a;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                    return;
                }
                return;
            }
            RecyclerView recyclerView3 = this.f17019a;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            a aVar2 = this.f17023e;
            if (!(aVar2 == null || (a2 = aVar2.a()) <= 0 || (recyclerView = this.f17019a) == null)) {
                recyclerView.postDelayed(new a(this, a2), 20);
            }
        }
    }

    private final void c() {
        View view;
        t<Integer> tVar;
        Integer value;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17020b;
        if (liveGiftDialogViewModel != null && (tVar = liveGiftDialogViewModel.f17003a) != null && (value = tVar.getValue()) != null && value.intValue() == 5) {
            return;
        }
        if (!GiftManager.inst().hideBottomBar() && !HideChargeIconForUserSetting.INSTANCE.getValue()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cE;
            l.b(bVar, "");
            Boolean a2 = bVar.a();
            l.b(a2, "");
            if (a2.booleanValue()) {
                com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                l.b(walletCenter, "");
                if (walletCenter.e().getValidUser() && (view = this.f17029k) != null) {
                    view.setVisibility(0);
                }
            }
            if (this.f17028j > 0) {
                View view2 = this.f17027i;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f17025g;
                if (view3 != null) {
                    view3.setVisibility(0);
                    return;
                }
                return;
            }
            View view4 = this.f17027i;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f17025g;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        } else if (this.f17028j > 0) {
            View view6 = this.f17027i;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.f17025g;
            if (view7 != null) {
                view7.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        t<Integer> tVar;
        Integer value;
        t<Integer> tVar2;
        super.onCreate();
        this.f17024f = (TextView) findViewById(R.id.r6);
        this.f17027i = findViewById(R.id.cvg);
        this.f17025g = findViewById(R.id.di6);
        this.f17026h = findViewById(R.id.coh);
        this.f17029k = findViewById(R.id.di9);
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17020b;
        Integer num = null;
        if (!(liveGiftDialogViewModel == null || (tVar2 = liveGiftDialogViewModel.f17003a) == null)) {
            num = tVar2.getValue();
        }
        if (num != null) {
            LiveGiftDialogViewModel liveGiftDialogViewModel2 = this.f17020b;
            if (liveGiftDialogViewModel2 == null || (tVar = liveGiftDialogViewModel2.f17003a) == null || (value = tVar.getValue()) == null || value.intValue() != 5) {
                c();
            } else {
                if (this.f17021c != null) {
                    View view = this.f17026h;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                } else {
                    View view2 = this.f17026h;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                View view3 = this.f17025g;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            View view4 = this.f17027i;
            if (view4 != null) {
                view4.setOnClickListener(new b(this));
            }
            View view5 = this.f17025g;
            if (view5 != null) {
                view5.setOnClickListener(new c(this));
            }
            View view6 = this.f17026h;
            if (view6 != null) {
                view6.setOnClickListener(new d(this));
            }
            LiveTextView liveTextView = (LiveTextView) findViewById(R.id.dia);
            LiveTextView liveTextView2 = (LiveTextView) findViewById(R.id.a8j);
            l.b(liveTextView, "");
            liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            l.b(liveTextView2, "");
            liveTextView2.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            ImageView imageView = (ImageView) findViewById(R.id.lv);
            ImageView imageView2 = (ImageView) findViewById(R.id.lw);
            ImageView imageView3 = (ImageView) findViewById(R.id.lx);
            if (y.g()) {
                l.b(imageView, "");
                imageView.setBackground(y.c(2131234700));
                l.b(imageView2, "");
                imageView2.setBackground(y.c(2131234700));
                l.b(imageView3, "");
                imageView3.setBackground(y.c(2131234700));
            }
        }
        com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
        l.b(walletCenter, "");
        a(walletCenter.b());
        ((z) ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a().a(WidgetExtendsKt.autoDispose(this))).a(new e(this), new f(this));
        this.f17019a = (RecyclerView) findViewById(R.id.cut);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        RecyclerView recyclerView = this.f17019a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        a aVar = new a();
        this.f17023e = aVar;
        aVar.f17077a = this.f17020b;
        a aVar2 = this.f17023e;
        if (aVar2 != null) {
            aVar2.f17078b = this;
        }
        a aVar3 = this.f17023e;
        if (aVar3 != null) {
            DataChannel dataChannel = this.dataChannel;
            l.b(dataChannel, "");
            l.d(dataChannel, "");
            aVar3.f17081e = dataChannel;
        }
        RecyclerView recyclerView2 = this.f17019a;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f17023e);
        }
        a();
    }

    public static final class g extends com.facebook.drawee.c.c<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f17038b;

        static {
            Covode.recordClassIndex(9463);
        }

        public static final class a extends com.facebook.fresco.animation.c.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f17039a;

            static {
                Covode.recordClassIndex(9464);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(g gVar) {
                this.f17039a = gVar;
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void b(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
                LiveGiftBottomWidget liveGiftBottomWidget = this.f17039a.f17037a;
                String concat = "+".concat(String.valueOf(this.f17039a.f17038b));
                TextView textView = (TextView) liveGiftBottomWidget.findViewById(R.id.h5);
                l.b(textView, "");
                textView.setText(concat);
                textView.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(400L);
                l.b(duration, "");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(350L);
                l.b(duration2, "");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(duration);
                animatorSet.play(duration2).after(700);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -35.0f).setDuration(300L);
                l.b(duration3, "");
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(textView, "translationY", -35.0f, -40.0f).setDuration(700L);
                l.b(duration4, "");
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(duration3);
                animatorSet2.play(duration4).after(300);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(animatorSet, animatorSet2);
                animatorSet3.start();
            }
        }

        public g(LiveGiftBottomWidget liveGiftBottomWidget, int i2) {
            this.f17037a = liveGiftBottomWidget;
            this.f17038b = i2;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            l.d(str, "");
            if (animatable instanceof com.facebook.fresco.animation.c.a) {
                ((com.facebook.fresco.animation.c.a) animatable).a(new a(this));
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17032a;

        static {
            Covode.recordClassIndex(9458);
        }

        b(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f17032a = liveGiftBottomWidget;
        }

        public final void onClick(View view) {
            this.f17032a.b();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17033a;

        static {
            Covode.recordClassIndex(9459);
        }

        c(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f17033a = liveGiftBottomWidget;
        }

        public final void onClick(View view) {
            this.f17033a.b();
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBottomWidget f17035a;

        static {
            Covode.recordClassIndex(9461);
        }

        e(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f17035a = liveGiftBottomWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            LiveGiftBottomWidget liveGiftBottomWidget = this.f17035a;
            if (liveGiftBottomWidget.isViewValid()) {
                com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                l.b(walletCenter, "");
                liveGiftBottomWidget.a(walletCenter.b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        String str;
        TextView textView = this.f17024f;
        if (textView != null) {
            com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
            l.b(b2, "");
            if (b2.e()) {
                str = b(j2);
            } else {
                str = "0";
            }
            textView.setText(str);
        }
        this.f17028j = j2;
        c();
    }

    private static String b(long j2) {
        if (10000 <= j2 && 999999 >= j2) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            StringBuilder sb = new StringBuilder();
            String a2 = com.a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000.0d)}, 1));
            l.b(a2, "");
            return sb.append(a2).append("K").toString();
        } else if (j2 >= 1000000) {
            double d3 = (double) j2;
            Double.isNaN(d3);
            StringBuilder sb2 = new StringBuilder();
            String a3 = com.a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3 / 1000000.0d)}, 1));
            l.b(a3, "");
            return sb2.append(a3).append("M").toString();
        } else if (j2 < 1000) {
            return String.valueOf(j2);
        } else {
            String stringBuffer = new StringBuffer(String.valueOf(j2)).insert(1, ',').toString();
            l.b(stringBuffer, "");
            return stringBuffer;
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.widget.a.AbstractC0358a
    public final void a(boolean z) {
        View view;
        if (z) {
            View view2 = this.f17026h;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            c();
            return;
        }
        View view3 = this.f17025g;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f17027i;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        if (this.f17021c != null && (view = this.f17026h) != null) {
            view.setVisibility(0);
        }
    }
}

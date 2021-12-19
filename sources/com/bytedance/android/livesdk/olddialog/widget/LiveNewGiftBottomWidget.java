package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.be;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.olddialog.widget.a;
import com.bytedance.android.livesdk.service.a.d;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LiveNewGiftBottomWidget extends LiveWidget implements a.AbstractC0410a, au {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f20104a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.olddialog.viewmodel.a f20105b;

    /* renamed from: c  reason: collision with root package name */
    public View f20106c;

    /* renamed from: d  reason: collision with root package name */
    public String f20107d;

    /* renamed from: e  reason: collision with root package name */
    public String f20108e = "";

    /* renamed from: f  reason: collision with root package name */
    private final String f20109f = "live_new_gift_bottom_widget";

    /* renamed from: g  reason: collision with root package name */
    private a f20110g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f20111h;

    /* renamed from: i  reason: collision with root package name */
    private View f20112i;

    /* renamed from: j  reason: collision with root package name */
    private View f20113j;

    /* renamed from: k  reason: collision with root package name */
    private View f20114k;

    /* renamed from: l  reason: collision with root package name */
    private long f20115l;

    /* renamed from: m  reason: collision with root package name */
    private List<GiftPage> f20116m;

    static {
        Covode.recordClassIndex(11871);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgx;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        View view = this.f20114k;
        if (view != null && view.getVisibility() == 0) {
            c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.cE, (Object) false);
            this.f20114k.setVisibility(8);
        }
        if (d.a.f21172a.a(d.c.RECHARGE_DIALOG)) {
            this.dataChannel.c(be.class, new bd("click", 0, "normal", this.f20108e));
        }
    }

    private void b() {
        if (this.f20116m != null) {
            ArrayList arrayList = new ArrayList(8);
            for (GiftPage giftPage : this.f20116m) {
                if (giftPage.display) {
                    u uVar = new u();
                    uVar.f20174a = giftPage.pageName;
                    uVar.f20175b = giftPage.pageType;
                    uVar.f20176c = giftPage.pagePanelBanner;
                    arrayList.add(uVar);
                }
            }
            this.f20110g.a(arrayList);
            if (arrayList.size() <= 1) {
                this.f20104a.setVisibility(8);
                return;
            }
            this.f20104a.setVisibility(0);
            int a2 = this.f20110g.a();
            if (a2 > 0) {
                this.f20104a.postDelayed(new b(this, a2), 20);
            }
        }
    }

    private void c() {
        com.bytedance.android.livesdk.olddialog.viewmodel.a aVar = this.f20105b;
        if (aVar != null && aVar.f20096b != null && this.f20105b.f20096b.getValue() != null && this.f20105b.f20096b.getValue().intValue() == 5) {
            return;
        }
        if (!GiftManager.inst().hideBottomBar() && !HideChargeIconForUserSetting.INSTANCE.getValue()) {
            if (com.bytedance.android.livesdk.ap.a.cE.a().booleanValue() && ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().e().getValidUser()) {
                this.f20114k.setVisibility(0);
            }
            if (this.f20115l > 0) {
                this.f20113j.setVisibility(8);
                this.f20112i.setVisibility(0);
                return;
            }
            this.f20113j.setVisibility(0);
            this.f20112i.setVisibility(8);
        } else if (this.f20115l > 0) {
            this.f20113j.setVisibility(8);
            this.f20112i.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f20111h = (TextView) findViewById(R.id.r6);
        this.f20113j = findViewById(R.id.cvg);
        this.f20112i = findViewById(R.id.di6);
        this.f20106c = findViewById(R.id.coh);
        this.f20114k = findViewById(R.id.di9);
        com.bytedance.android.livesdk.olddialog.viewmodel.a aVar = this.f20105b;
        if (!(aVar == null || aVar.f20096b == null || this.f20105b.f20096b.getValue() == null)) {
            if (this.f20105b.f20096b.getValue().intValue() == 5) {
                if (this.f20107d != null) {
                    this.f20106c.setVisibility(0);
                } else {
                    this.f20106c.setVisibility(8);
                }
                this.f20112i.setVisibility(8);
            } else {
                c();
            }
            this.f20113j.setOnClickListener(new c(this));
            this.f20112i.setOnClickListener(new d(this));
            this.f20106c.setOnClickListener(new e(this));
            ((LiveTextView) findViewById(R.id.dia)).setTypeface(b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            ((LiveTextView) findViewById(R.id.a8j)).setTypeface(b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            ImageView imageView = (ImageView) findViewById(R.id.lv);
            ImageView imageView2 = (ImageView) findViewById(R.id.lw);
            ImageView imageView3 = (ImageView) findViewById(R.id.lx);
            if (y.g()) {
                imageView.setBackground(y.c(2131234700));
                imageView2.setBackground(y.c(2131234700));
                imageView3.setBackground(y.c(2131234700));
            }
        }
        b();
        a(((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b());
        ((z) ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a().a(WidgetExtendsKt.autoDispose(this))).a(new f(this), new g(this));
        this.f20104a = (RecyclerView) findViewById(R.id.cut);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        this.f20104a.setLayoutManager(linearLayoutManager);
        a aVar2 = new a();
        this.f20110g = aVar2;
        aVar2.f20144b = this.f20105b;
        this.f20110g.f20145c = this;
        this.f20110g.f20148f = this.dataChannel;
        this.f20104a.setAdapter(this.f20110g);
    }

    public final void a(List<GiftPage> list) {
        this.f20116m = list;
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        long j3;
        TextView textView = this.f20111h;
        if (u.a().b().e()) {
            j3 = b(j2);
        } else {
            j3 = 0L;
        }
        textView.setText(String.valueOf(j3));
        this.f20115l = j2;
        c();
    }

    private static String b(long j2) {
        if (j2 >= 10000 && j2 < 1000000) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            return com.a.a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2 / 1000.0d)}) + "K";
        } else if (j2 >= 1000000) {
            double d3 = (double) j2;
            Double.isNaN(d3);
            return com.a.a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d3 / 1000000.0d)}) + "M";
        } else if (j2 >= 1000) {
            return new StringBuffer(String.valueOf(j2)).insert(1, ',').toString();
        } else {
            return String.valueOf(j2);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.widget.a.AbstractC0410a
    public final void a(boolean z) {
        if (z) {
            this.f20106c.setVisibility(8);
            c();
            return;
        }
        this.f20112i.setVisibility(8);
        this.f20113j.setVisibility(8);
        if (this.f20107d != null) {
            this.f20106c.setVisibility(0);
        }
    }
}

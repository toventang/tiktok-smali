package com.bytedance.android.live.wallet.a;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.f.a.c;
import com.bytedance.android.live.wallet.f.b.a;
import com.bytedance.android.live.wallet.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.model.as;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import java.util.HashMap;
import java.util.Map;

public final class b extends d implements a {
    private final View.OnClickListener A = new c(this);

    /* renamed from: a  reason: collision with root package name */
    c f12933a;

    /* renamed from: b  reason: collision with root package name */
    LiveLoadingView f12934b;

    /* renamed from: c  reason: collision with root package name */
    View f12935c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f12936d;

    /* renamed from: e  reason: collision with root package name */
    TextView f12937e;

    /* renamed from: f  reason: collision with root package name */
    TextView f12938f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f12939g;

    /* renamed from: h  reason: collision with root package name */
    Activity f12940h;

    /* renamed from: i  reason: collision with root package name */
    public IWalletService.a f12941i;

    /* renamed from: j  reason: collision with root package name */
    h f12942j;

    /* renamed from: k  reason: collision with root package name */
    public final com.bytedance.android.live.wallet.model.a f12943k = new com.bytedance.android.live.wallet.model.a(y.a((int) R.string.gx2), as.DIAMOND) {
        /* class com.bytedance.android.live.wallet.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7186);
        }

        @Override // com.bytedance.android.live.wallet.model.a
        public final boolean a() {
            if (((long) b.this.u.f18927e) <= ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b()) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.android.live.wallet.model.a
        public final void b() {
            if (a()) {
                this.n = y.a((int) R.string.gn5, Long.valueOf(((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b()));
            } else {
                this.n = y.a((int) R.string.gn4);
            }
            this.f13205e.setText(this.n);
            this.f13205e.setVisibility(0);
        }
    };
    private String y;
    private f.a.b.b z;

    static {
        Covode.recordClassIndex(7185);
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void a(int i2) {
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.wallet.a.d
    public final void b() {
        this.f12943k.a(this.s);
    }

    public final void show() {
        if (this.f12942j != null && this.u != null) {
            super.show();
        }
    }

    public final void dismiss() {
        super.dismiss();
        f.a.b.b bVar = this.z;
        if (bVar != null && !bVar.isDisposed()) {
            this.z.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.a.b$7  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12950a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 7192(0x1c18, float:1.0078E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.model.as[] r0 = com.bytedance.android.livesdk.model.as.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.wallet.a.b.AnonymousClass7.f12950a = r2
                com.bytedance.android.livesdk.model.as r0 = com.bytedance.android.livesdk.model.as.FIRE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.wallet.a.b.AnonymousClass7.f12950a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.model.as r0 = com.bytedance.android.livesdk.model.as.TEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.a.b.AnonymousClass7.<clinit>():void");
        }
    }

    public final void d() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        b(false);
        this.f12939g.setImageResource(2131234530);
        this.f12938f.setText(R.string.gnn);
        this.f12937e.setText(R.string.gwv);
        IWalletService.a aVar = this.f12941i;
        if (aVar != null) {
            aVar.b(this, this.f12942j);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.wallet.a.d
    public final void a() {
        if (this.u != null) {
            this.o.setText(y.a((int) R.string.gx7, Float.valueOf(((float) this.u.f18925c) / 100.0f)));
            if (this.v == null || this.v == as.DIAMOND) {
                this.p.setText(String.valueOf(this.u.f18927e));
                ImageView imageView = this.f12936d;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            this.p.setText(new StringBuilder().append(y.a((int) R.string.gy_)).append(com.bytedance.android.livesdk.utils.h.a("%.2f", Float.valueOf(((float) this.u.f18924b) / 100.0f))));
            ImageView imageView2 = this.f12936d;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (this.v != null) {
            com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.ay, this.v.name());
            String str = "TEST";
            if (AnonymousClass7.f12950a[this.v.ordinal()] == 1) {
                str = "balance";
            }
            new HashMap().put("lable", str);
            HashMap hashMap = new HashMap();
            hashMap.put("lable", String.valueOf(this.u.f18927e));
            b.a.a("recharge_list").a((Map<String, String>) hashMap).a().b();
            if (!TextUtils.equals("balance", str)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("request_page", this.y);
                hashMap2.put("charge_reason", this.f12959m);
                hashMap2.put("pay_method", str);
                hashMap2.put("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
                b.a.a("livesdk_recharge_pay").a((Map<String, String>) hashMap2).a().b();
            }
            if (this.u != null && this.v != null && this.v == as.DIAMOND) {
                a(true);
            }
        }
    }

    private void a(boolean z2) {
        if (z2) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
            b(true);
        } else {
            b(false);
        }
        h hVar = this.f12942j;
        if (hVar != null) {
            hVar.a().a(new f()).a(new f.a.d.f<d<com.bytedance.android.livesdk.wallet.f>>() {
                /* class com.bytedance.android.live.wallet.a.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(7189);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(d<com.bytedance.android.livesdk.wallet.f> dVar) {
                    if (((com.bytedance.android.livesdk.wallet.f) dVar.data).f22420a == 0) {
                        b bVar = b.this;
                        if (bVar.f12941i != null) {
                            bVar.f12941i.a(bVar, bVar.f12942j);
                        }
                        bVar.dismiss();
                        return;
                    }
                    b.this.d();
                }
            }, new f.a.d.f<Throwable>() {
                /* class com.bytedance.android.live.wallet.a.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(7190);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Throwable th) {
                    b.this.d();
                }
            });
        }
    }

    private void b(boolean z2) {
        this.f12935c.setVisibility(0);
        if (z2) {
            this.f12934b.setVisibility(0);
            this.f12937e.setVisibility(8);
            this.f12938f.setVisibility(8);
            this.f12939g.setVisibility(8);
            return;
        }
        this.f12934b.setVisibility(8);
        this.f12938f.setVisibility(0);
        this.f12939g.setVisibility(0);
        this.f12937e.setVisibility(0);
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void b(int i2) {
        u.a().b().i().a_(new ae<com.bytedance.android.live.base.model.user.b>() {
            /* class com.bytedance.android.live.wallet.a.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(7191);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* bridge */ /* synthetic */ void onSuccess(com.bytedance.android.live.base.model.user.b bVar) {
            }
        });
        b(false);
        this.f12939g.setImageResource(2131234531);
        this.f12938f.setText(R.string.glk);
        this.f12937e.setText(R.string.gxr);
        a(false);
    }

    public final void a(h hVar) {
        String str;
        this.f12942j = hVar;
        if (hVar.b() == 10001) {
            str = "card_ticket";
        } else {
            str = "guard";
        }
        this.f12959m = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.wallet.a.d
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12934b = (LiveLoadingView) findViewById(R.id.fik);
        this.f12935c = findViewById(R.id.ad1);
        this.f12937e = (TextView) findViewById(R.id.exd);
        this.f12936d = (ImageView) findViewById(R.id.bwb);
        this.f12938f = (TextView) findViewById(R.id.exe);
        this.f12939g = (ImageView) findViewById(R.id.bvq);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
        marginLayoutParams.topMargin = y.a(34.0f);
        this.p.setLayoutParams(marginLayoutParams);
        this.z = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a().d(new f.a.d.f<Long>() {
            /* class com.bytedance.android.live.wallet.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7187);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Long l2) {
                if (b.this.f12943k != null) {
                    com.bytedance.android.live.wallet.model.a aVar = b.this.f12943k;
                    aVar.a(aVar.a());
                    aVar.b();
                }
            }
        });
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        c cVar = new c(this.f12940h, new com.bytedance.android.live.wallet.api.a() {
            /* class com.bytedance.android.live.wallet.a.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(7188);
            }
        }, this.f12959m);
        this.f12933a = cVar;
        cVar.a((a) this);
        this.o.setVisibility(8);
        this.t.setOnClickListener(this.A);
        this.x.put(Long.valueOf(this.f12943k.f13210j), this.f12943k);
        this.f12943k.r = this.f12958l;
        HashMap hashMap = new HashMap();
        if (this.u != null) {
            hashMap.put("money", String.valueOf(this.u.f18927e + this.u.f18928f));
        }
        hashMap.put("request_page", this.y);
        if (this.f12942j != null) {
            hashMap.put("charge_reason", this.f12959m);
        }
        b.a.a("livesdk_check_out_show").a((Map<String, String>) hashMap).a().b();
    }

    public final boolean a(String str) {
        try {
            a((ChargeDeal) e.a.f9628b.a(str, ChargeDeal.class));
            if (this.u != null) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("ConsumeDialog", e2);
            return false;
        }
    }

    public b(Activity activity, String str) {
        super(activity, "", str);
        this.y = str;
        this.f12940h = activity;
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void a(int i2, int i3, int i4, Exception exc) {
        this.f12935c.setVisibility(8);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        ao.a(y.e(), (int) R.string.ehd);
    }
}

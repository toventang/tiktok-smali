package com.bytedance.android.live.liveinteract.match.ui.c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public View f10831a;

    /* renamed from: b  reason: collision with root package name */
    HSAnimImageView f10832b;

    /* renamed from: c  reason: collision with root package name */
    AppCompatImageView f10833c;

    /* renamed from: d  reason: collision with root package name */
    public a f10834d;

    /* renamed from: e  reason: collision with root package name */
    long f10835e;

    /* renamed from: f  reason: collision with root package name */
    private AppCompatImageView f10836f;

    /* renamed from: g  reason: collision with root package name */
    private LottieAnimationView f10837g;

    /* renamed from: h  reason: collision with root package name */
    private Context f10838h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10839i;

    /* renamed from: j  reason: collision with root package name */
    private LiveAutoRtlTextView f10840j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f10841k;

    static {
        Covode.recordClassIndex(5794);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (j.b(this.f10835e)) {
            j.a(this.f10835e);
        }
        this.f10835e = 0;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        b(true);
        c(false);
        HSAnimImageView hSAnimImageView = this.f10832b;
        if (hSAnimImageView != null) {
            hSAnimImageView.clearAnimation();
        }
        HSAnimImageView hSAnimImageView2 = this.f10832b;
        if (hSAnimImageView2 != null) {
            hSAnimImageView2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = this.f10833c;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.f10839i) {
            AppCompatImageView appCompatImageView = this.f10836f;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(2131234485);
            }
            ImageView imageView = this.f10841k;
            if (imageView != null) {
                imageView.setImageResource(2131234486);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = this.f10836f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(2131234485);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.f10839i) {
            AppCompatImageView appCompatImageView = this.f10836f;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(2131234483);
            }
            ImageView imageView = this.f10841k;
            if (imageView != null) {
                imageView.setImageResource(2131234484);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = this.f10836f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(2131234483);
        }
    }

    public final void onClick(View view) {
        a aVar = this.f10834d;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z) {
        AppCompatImageView appCompatImageView;
        if (this.f10839i && (appCompatImageView = this.f10836f) != null) {
            p.a(appCompatImageView, z);
        }
    }

    public final void a(int i2) {
        View view;
        if (i2 == 0 && ((view = this.f10831a) == null || view.getVisibility() != 0)) {
            com.bytedance.android.live.liveinteract.match.c.a.a();
        }
        View view2 = this.f10831a;
        if (view2 != null) {
            view2.setVisibility(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.f10839i) {
            ImageView imageView = this.f10841k;
            if (imageView != null) {
                p.a(imageView, z);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.f10840j;
            if (liveAutoRtlTextView != null) {
                p.a(liveAutoRtlTextView, z);
            }
        }
    }

    static final class a extends m implements h.f.a.b<c, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(5795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            b bVar = this.this$0;
            if (cVar2 == c.INVITED) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bV;
                l.b(bVar2, "");
                if (!bVar2.a().booleanValue()) {
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.bV;
                    l.b(bVar3, "");
                    com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar3, (Object) true);
                    bVar.f10835e = j.a(bVar.f10831a, y.a((int) R.string.ed1));
                }
                bVar.e();
                bVar.b(false);
                bVar.c(true);
                HSAnimImageView hSAnimImageView = bVar.f10832b;
                if (hSAnimImageView != null) {
                    hSAnimImageView.setVisibility(0);
                }
                HSAnimImageView hSAnimImageView2 = bVar.f10832b;
                if (hSAnimImageView2 != null) {
                    hSAnimImageView2.a(HSAnimImageView.f9268i.a("tiktok_live_interaction_resource", "ttlive_lottie_icon_time_countdown.webp"));
                }
                HSAnimImageView hSAnimImageView3 = bVar.f10832b;
                if (hSAnimImageView3 != null) {
                    hSAnimImageView3.a();
                }
                AppCompatImageView appCompatImageView = bVar.f10833c;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
            } else if (c.START.compareTo((Enum) cVar2) > 0 || cVar2.compareTo((Enum) c.END) >= 0) {
                bVar.c();
                bVar.d();
                bVar.e();
            } else {
                bVar.c();
                bVar.d();
                bVar.f();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        l.d(view, "");
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(ea.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f10839i = z;
        this.f10831a = view;
        this.f10836f = (AppCompatImageView) view.findViewById(R.id.by0);
        this.f10837g = (LottieAnimationView) view.findViewById(R.id.by2);
        this.f10832b = (HSAnimImageView) view.findViewById(R.id.by1);
        this.f10833c = (AppCompatImageView) view.findViewById(R.id.by3);
        if (this.f10839i) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.enr);
            this.f10840j = liveAutoRtlTextView;
            if (liveAutoRtlTextView != null) {
                liveAutoRtlTextView.setText(y.a((int) R.string.edj));
            }
            this.f10841k = (ImageView) view.findViewById(R.id.enf);
            c(false);
        }
        this.f10838h = view.getContext();
        f();
        if (dataChannel != null) {
            dataChannel.a(com.bytedance.android.live.liveinteract.match.b.c.l.class, (h.f.a.b) new a(this));
        }
    }
}

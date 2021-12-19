package com.bytedance.android.live.liveinteract.linkroom.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.linkroom.c.a;
import com.bytedance.android.live.liveinteract.platform.common.c.j;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.s;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTestSkipLinkMicBundleCheckSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    boolean f10582a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10583b;

    /* renamed from: c  reason: collision with root package name */
    public View f10584c;

    /* renamed from: d  reason: collision with root package name */
    LiveTextView f10585d;

    /* renamed from: e  reason: collision with root package name */
    private Context f10586e;

    /* renamed from: f  reason: collision with root package name */
    private HSAnimImageView f10587f;

    /* renamed from: g  reason: collision with root package name */
    private View f10588g;

    /* renamed from: h  reason: collision with root package name */
    private LiveAutoRtlTextView f10589h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.android.livesdk.b.a.f<Integer> f10590i = new a(this);

    /* renamed from: j  reason: collision with root package name */
    private boolean f10591j;

    /* renamed from: k  reason: collision with root package name */
    private final a.b f10592k;

    /* renamed from: l  reason: collision with root package name */
    private final m f10593l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.android.live.liveinteract.platform.common.f.a f10594m;

    static {
        Covode.recordClassIndex(5643);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
        HSAnimImageView hSAnimImageView = this.f10587f;
        if (hSAnimImageView != null) {
            hSAnimImageView.setVisibility(0);
        }
        b(f());
    }

    public final boolean c() {
        if (this.f10582a || !this.f10583b) {
            return true;
        }
        return false;
    }

    public final void d() {
        View view = this.f10588g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private final void e() {
        if (this.f10591j) {
            HSAnimImageView hSAnimImageView = this.f10587f;
            if (hSAnimImageView != null) {
                p.a((View) hSAnimImageView, true);
            }
            LiveAutoRtlTextView liveAutoRtlTextView = this.f10589h;
            if (liveAutoRtlTextView != null) {
                p.a((View) liveAutoRtlTextView, true);
            }
        }
    }

    private final int f() {
        if (this.f10583b) {
            if (this.f10591j) {
                return 2131234491;
            }
            return 2131234490;
        } else if (this.f10591j) {
            return 2131234482;
        } else {
            return 2131234481;
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
        HSAnimImageView hSAnimImageView = this.f10587f;
        if (hSAnimImageView != null) {
            hSAnimImageView.setVisibility(0);
        }
        Drawable c2 = y.c(f());
        l.b(c2, "");
        a(s.a(c2));
    }

    static final class a<T> implements com.bytedance.android.livesdk.b.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10595a;

        static {
            Covode.recordClassIndex(5644);
        }

        a(g gVar) {
            this.f10595a = gVar;
        }

        @Override // com.bytedance.android.livesdk.b.a.f
        public final /* synthetic */ void a(Object obj) {
            if (obj != null) {
                this.f10595a.d();
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(5645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.d();
            return z.f158842a;
        }
    }

    public final void onClick(View view) {
        l.d(view, "");
        this.f10592k.n();
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(5646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            g gVar = this.this$0;
            if (!gVar.f10583b || intValue <= 0) {
                LiveTextView liveTextView = gVar.f10585d;
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
            } else {
                LiveTextView liveTextView2 = gVar.f10585d;
                if (liveTextView2 != null) {
                    liveTextView2.setText(String.valueOf(intValue));
                }
                LiveTextView liveTextView3 = gVar.f10585d;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(0);
                }
            }
            return z.f158842a;
        }
    }

    private final void a(Drawable drawable) {
        if (this.f10591j) {
            HSAnimImageView hSAnimImageView = this.f10587f;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.f10587f;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.f10587f;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            e();
            HSAnimImageView hSAnimImageView4 = this.f10587f;
            if (hSAnimImageView4 != null) {
                hSAnimImageView4.setImageDrawable(drawable);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView5 = this.f10587f;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.clearAnimation();
        }
        HSAnimImageView hSAnimImageView6 = this.f10587f;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView7 = this.f10587f;
        if (hSAnimImageView7 != null) {
            hSAnimImageView7.setImageDrawable(drawable);
        }
    }

    private final void b(int i2) {
        if (this.f10591j) {
            HSAnimImageView hSAnimImageView = this.f10587f;
            if (hSAnimImageView != null) {
                hSAnimImageView.clearAnimation();
            }
            HSAnimImageView hSAnimImageView2 = this.f10587f;
            if (hSAnimImageView2 != null) {
                hSAnimImageView2.setBackgroundResource(0);
            }
            HSAnimImageView hSAnimImageView3 = this.f10587f;
            if (hSAnimImageView3 != null) {
                hSAnimImageView3.setImageDrawable(null);
            }
            e();
            HSAnimImageView hSAnimImageView4 = this.f10587f;
            if (hSAnimImageView4 != null) {
                hSAnimImageView4.setImageResource(i2);
                return;
            }
            return;
        }
        HSAnimImageView hSAnimImageView5 = this.f10587f;
        if (hSAnimImageView5 != null) {
            hSAnimImageView5.clearAnimation();
        }
        HSAnimImageView hSAnimImageView6 = this.f10587f;
        if (hSAnimImageView6 != null) {
            hSAnimImageView6.setBackgroundResource(0);
        }
        HSAnimImageView hSAnimImageView7 = this.f10587f;
        if (hSAnimImageView7 != null) {
            hSAnimImageView7.setImageResource(i2);
        }
    }

    public final void a(int i2) {
        View view = this.f10584c;
        if (view != null) {
            if (i2 == 0) {
                if (c()) {
                    boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC);
                    com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkMic_Plugin", "byteResult = " + isPluginAvailable + " byteGate = " + LiveTestSkipLinkMicBundleCheckSetting.INSTANCE.getValue() + ' ');
                    com.bytedance.android.live.liveinteract.api.b bVar = (com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                    if (bVar != null && bVar.isInCoHost()) {
                        return;
                    }
                    if (!isPluginAvailable) {
                        Context context = this.f10586e;
                        if (context == null) {
                            l.b();
                        }
                        LiveAppBundleUtils.ensurePluginAvailable(context, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                        v.a();
                        if (this.f10594m.a()) {
                            v.a(2, (long) this.f10594m.b());
                            return;
                        }
                        return;
                    }
                    d();
                } else {
                    return;
                }
            }
            if (!this.f10594m.f11943c && this.f10594m.a() && i2 == 0) {
                v.b(2, (long) this.f10594m.b());
                this.f10594m.f11943c = true;
            }
            view.setVisibility(i2);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        l.d(view, "");
        l.d(dataChannel, "");
        dataChannel.b(this);
        com.bytedance.android.live.liveinteract.api.a.c.a().b(this.f10590i);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        boolean z;
        String a2;
        l.d(view, "");
        l.d(dataChannel, "");
        this.f10584c = view;
        this.f10586e = view.getContext();
        Object b2 = dataChannel.b(ee.class);
        if (b2 == null) {
            l.b();
        }
        this.f10583b = ((Boolean) b2).booleanValue();
        this.f10587f = (HSAnimImageView) view.findViewById(R.id.btq);
        this.f10588g = view.findViewById(R.id.djx);
        this.f10585d = (LiveTextView) view.findViewById(R.id.fjh);
        d();
        Boolean bool = (Boolean) dataChannel.b(ea.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f10591j = z;
        HSAnimImageView hSAnimImageView = this.f10587f;
        if (hSAnimImageView != null) {
            hSAnimImageView.setImageResource(f());
        }
        if (this.f10591j) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) view.findViewById(R.id.enr);
            if (liveAutoRtlTextView != null) {
                if (this.f10583b) {
                    a2 = y.a((int) R.string.edl);
                    l.b(a2, "");
                } else {
                    a2 = y.a((int) R.string.ede);
                    l.b(a2, "");
                }
                liveAutoRtlTextView.setText(a2);
            } else {
                liveAutoRtlTextView = null;
            }
            this.f10589h = liveAutoRtlTextView;
        }
        com.bytedance.android.live.liveinteract.api.a.c.a().a((com.bytedance.android.livesdk.b.a.f) this.f10590i);
        dataChannel.a(this, com.bytedance.android.live.liveinteract.platform.common.c.l.class, new b(this)).a(j.class, (h.f.a.b) new c(this));
    }

    public g(a.b bVar, m mVar, com.bytedance.android.live.liveinteract.platform.common.f.a aVar) {
        l.d(bVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        this.f10592k = bVar;
        this.f10593l = mVar;
        this.f10594m = aVar;
    }
}

package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.c.g;
import com.bytedance.android.livesdk.chatroom.e.n;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.decoration.DonationH5UrlSetting;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.model.message.q;
import com.bytedance.android.livesdk.utils.ad;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class DonationStickerAnchorWidget extends LiveRecyclableWidget implements n.a, au {

    /* renamed from: a  reason: collision with root package name */
    public av f16302a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.b.a f16303b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    private n f16304c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f16305d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f16306e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f16307f;

    /* renamed from: g  reason: collision with root package name */
    private View f16308g;

    /* renamed from: h  reason: collision with root package name */
    private f.a.b.b f16309h;

    static {
        Covode.recordClassIndex(9023);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.be2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f16302a = null;
        n nVar = this.f16304c;
        if (nVar != null) {
            nVar.b();
        }
        this.f16303b.a();
        f.a.b.b bVar = this.f16309h;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DonationStickerAnchorWidget f16312a;

        static {
            Covode.recordClassIndex(9026);
        }

        c(DonationStickerAnchorWidget donationStickerAnchorWidget) {
            this.f16312a = donationStickerAnchorWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f16312a.onEvent((g) obj);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.n.a
    public final void a(q qVar) {
        l.d(qVar, "");
        a(qVar.f19672g, qVar.f19670a, qVar.f19671f);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16311a = new b();

        static {
            Covode.recordClassIndex(9025);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(3, "DonationInfo", "fetch donation info exception ".concat(String.valueOf(obj)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DonationStickerAnchorWidget f16310a;

        static {
            Covode.recordClassIndex(9024);
        }

        a(DonationStickerAnchorWidget donationStickerAnchorWidget) {
            this.f16310a = donationStickerAnchorWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.chatroom.model.m mVar;
            String str;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null && (mVar = (com.bytedance.android.livesdk.chatroom.model.m) dVar.data) != null && (str = mVar.f15792a) != null && str.length() != 0 && mVar.f15793b > 0) {
                this.f16310a.a(mVar.f15794c, mVar.f15792a, mVar.f15793b);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.f16305d = (TextView) findViewById(R.id.dq1);
        this.f16306e = (TextView) findViewById(R.id.dq2);
        this.f16307f = (TextView) findViewById(R.id.dpz);
        this.f16308g = findViewById(R.id.dq3);
    }

    public final void onEvent(g gVar) {
        Room room;
        String str;
        ar arVar = null;
        if (gVar != null && gVar.f15117a != null) {
            if (gVar.f15118b) {
                show();
                av avVar = this.f16302a;
                if (avVar != null) {
                    long j2 = avVar.f19006h;
                    av avVar2 = gVar.f15117a;
                    l.b(avVar2, "");
                    if (j2 == avVar2.f19006h) {
                        return;
                    }
                }
                av avVar3 = gVar.f15117a;
                this.f16302a = avVar3;
                if (avVar3 != null) {
                    arVar = avVar3.a();
                }
                TextView textView = this.f16305d;
                if (textView != null) {
                    if (arVar == null || (str = arVar.f18987a) == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
                TextView textView2 = this.f16307f;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = this.f16306e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View view = this.f16308g;
                if (view != null) {
                    view.setVisibility(8);
                }
                f.a.b.b bVar = this.f16309h;
                if (bVar != null) {
                    bVar.dispose();
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.b(df.class)) != null) {
                    this.f16309h = ((DecorationApi) e.a().a(DecorationApi.class)).getRoomDonationInfo(ag.a(v.a("room_id", Long.valueOf(room.getId())), v.a("anchor_id", Long.valueOf(room.getOwnerUserId())), v.a("donation_entrance", 1L))).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a(this), b.f16311a);
                    return;
                }
                return;
            }
            f.a.b.b bVar2 = this.f16309h;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        hide();
        boolean a2 = com.bytedance.android.live.uikit.c.a.a(getContext());
        if (a2) {
            i2 = 8388629;
        } else {
            i2 = 8388627;
        }
        TextView textView = this.f16305d;
        if (textView != null) {
            textView.setGravity(i2);
        }
        TextView textView2 = this.f16306e;
        if (textView2 != null) {
            textView2.setGravity(i2);
        }
        View view = getView();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            int a3 = (int) ap.a(getContext(), 4.0f);
            if (a2) {
                i3 = a3;
            } else {
                i3 = 0;
            }
            marginLayoutParams2.leftMargin = i3;
            if (a2) {
                a3 = 0;
            }
            marginLayoutParams2.rightMargin = a3;
            View view2 = getView();
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams2);
            }
        }
        n nVar = new n();
        this.f16304c = nVar;
        nVar.a((n.a) this);
        this.f16303b.a(com.bytedance.android.livesdk.an.a.a().a(g.class).a(getAutoUnbindTransformer()).d(new c(this)));
        View view3 = getView();
        if (view3 != null) {
            view3.setOnClickListener(new d(this));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DonationStickerAnchorWidget f16313a;

        static {
            Covode.recordClassIndex(9027);
        }

        d(DonationStickerAnchorWidget donationStickerAnchorWidget) {
            this.f16313a = donationStickerAnchorWidget;
        }

        public final void onClick(View view) {
            Room room;
            String str;
            com.bytedance.android.live.core.widget.a aVar;
            String str2;
            Boolean bool;
            ar a2;
            com.bytedance.android.livesdk.browser.c.d webViewManager;
            String value = DonationH5UrlSetting.INSTANCE.getValue();
            DataChannel dataChannel = this.f16313a.dataChannel;
            String str3 = null;
            if (dataChannel != null) {
                room = (Room) dataChannel.b(df.class);
            } else {
                room = null;
            }
            if (value != null && value.length() != 0 && room != null && this.f16313a.f16302a != null) {
                Uri.Builder appendQueryParameter = Uri.parse(value).buildUpon().appendQueryParameter("anchor_id", String.valueOf(room.getOwnerUserId())).appendQueryParameter("room_id", String.valueOf(room.getId()));
                av avVar = this.f16313a.f16302a;
                String str4 = "";
                if (avVar == null || (str = String.valueOf(avVar.f19006h)) == null) {
                    str = str4;
                }
                d.b a3 = com.bytedance.android.livesdk.browser.c.e.a(appendQueryParameter.appendQueryParameter("campaignId", str).build().toString()).a(0, 0, 0, 0);
                a3.f14310k = -1;
                double b2 = (double) y.b();
                Double.isNaN(b2);
                a3.f14302c = (int) y.e((int) (b2 * 0.7d));
                a3.f14301b = (int) y.e(y.c());
                a3.f14309j = 80;
                com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
                if (fVar == null || (webViewManager = fVar.webViewManager()) == null) {
                    aVar = null;
                } else {
                    aVar = webViewManager.a(a3, new com.bytedance.android.livesdk.chatroom.a(a3.f14300a, null, null));
                }
                androidx.fragment.app.e a4 = p.a(this.f16313a.getContext());
                if (a4 != null) {
                    com.bytedance.android.live.core.widget.a.a(a4, aVar);
                }
                av avVar2 = this.f16313a.f16302a;
                if (!(avVar2 == null || (a2 = avVar2.a()) == null)) {
                    str3 = a2.f18987a;
                }
                if (!TextUtils.isEmpty(str3)) {
                    str4 = String.valueOf(str3);
                }
                h.p[] pVarArr = new h.p[3];
                DataChannel dataChannel2 = this.f16313a.dataChannel;
                if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null || !bool.booleanValue()) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                pVarArr[0] = v.a("is_anchor", str2);
                pVarArr[1] = v.a("position", "top_left_icon");
                pVarArr[2] = v.a("NGO_name", str4);
                b.a.a("livesdk_donation_icon_click").a(ag.a(pVarArr)).a(this.f16313a.dataChannel).b();
            }
        }
    }

    public final void a(String str, String str2, long j2) {
        if (this.f16302a != null && isShowing()) {
            f.a.b.b bVar = this.f16309h;
            if (bVar != null) {
                bVar.dispose();
            }
            TextView textView = this.f16307f;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f16306e;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            View view = this.f16308g;
            if (view != null) {
                view.setVisibility(0);
            }
            TextView textView3 = this.f16305d;
            if (textView3 != null) {
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    str = "";
                }
                StringBuilder append = sb.append(str);
                if (str2 == null) {
                    str2 = "";
                }
                textView3.setText(append.append(str2));
            }
            TextView textView4 = this.f16306e;
            if (textView4 != null) {
                textView4.setText(ad.a(j2));
            }
        }
    }
}

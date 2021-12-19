package com.bytedance.android.live.broadcast.preview.d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.api.BroadcastSubscribeApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscribeAnchorFaqGBSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscribeAnchorFaqNonGBSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;

public final class d extends com.bytedance.android.live.broadcast.a.b implements com.bytedance.ies.xbridge.e.d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8210b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.api.f f8211a;

    /* renamed from: c  reason: collision with root package name */
    private String f8212c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f8213d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f8214e = com.bytedance.android.livesdkapi.m.d.a(g.f8221a);

    /* renamed from: f  reason: collision with root package name */
    private HashMap f8215f;

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8217a = new c();

        static {
            Covode.recordClassIndex(4165);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(4162);
    }

    @Override // com.bytedance.android.live.broadcast.a.b
    public final View a(int i2) {
        if (this.f8215f == null) {
            this.f8215f = new HashMap();
        }
        View view = (View) this.f8215f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f8215f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.broadcast.a.b
    public final void a() {
        HashMap hashMap = this.f8215f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final LiveSubscribeLynxMap c() {
        return (LiveSubscribeLynxMap) this.f8214e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4163);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(String str) {
            l.d(str, "");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("arg_enter_from", str);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    static final class g extends m implements h.f.a.a<LiveSubscribeLynxMap> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8221a = new g();

        static {
            Covode.recordClassIndex(4169);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveSubscribeLynxMap invoke() {
            return LiveSubscribeLynxUrl.INSTANCE.getValue();
        }
    }

    private final void g() {
        b(c(d(a(b.a.a("livesdk_subscribe_under_review"))))).b();
    }

    public final boolean b() {
        return l.a((Object) this.f8212c, (Object) "live_take_page");
    }

    @Override // com.bytedance.android.live.broadcast.a.b, com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bytedance.ies.xbridge.e.b.b("anchor_subscribe_badge_status_change", this);
        com.bytedance.ies.xbridge.e.b.b("anchor_subscribe_emotes_status_change", this);
        a();
    }

    private final void f() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a2 = b2.a();
        l.b(a2, "");
        String secUid = a2.getSecUid();
        l.b(secUid, "");
        ((BroadcastSubscribeApi) com.bytedance.android.live.network.e.a().a(BroadcastSubscribeApi.class)).getSubscribeInfo(true, secUid).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new b(this), c.f8217a);
    }

    public final void d() {
        com.bytedance.android.livesdk.chatroom.api.f fVar = this.f8211a;
        if (fVar != null) {
            a(fVar);
            if (!this.f8213d) {
                e();
                this.f8213d = true;
            }
        }
    }

    private final void e() {
        com.bytedance.ies.xbridge.e.b.a("anchor_subscribe_badge_status_change", this);
        com.bytedance.ies.xbridge.e.b.a("anchor_subscribe_emotes_status_change", this);
        ((LiveSwitch) a(R.id.eds)).setOnCheckedChangeListener(new C0126d(this));
        if (!b()) {
            p.b(a(R.id.edv));
            ((LinearLayout) a(R.id.edv)).setOnClickListener(new e(this));
        }
        p.b(a(R.id.aen));
        ((LiveAutoRtlImageView) a(R.id.ee2)).setOnClickListener(new f(this));
        g();
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8219a;

        static {
            Covode.recordClassIndex(4167);
        }

        e(d dVar) {
            this.f8219a = dVar;
        }

        public final void onClick(View view) {
            d dVar = this.f8219a;
            dVar.a(dVar.c().getAnchor_describe_management_page());
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8222a;

        static {
            Covode.recordClassIndex(4170);
        }

        h(d dVar) {
            this.f8222a = dVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.e activity = this.f8222a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final k f8226a = new k();

        static {
            Covode.recordClassIndex(4173);
        }

        k() {
        }

        public final void onClick(View view) {
            ao.a(y.e(), (int) R.string.enb);
        }
    }

    public final void a(String str) {
        c.a(getContext(), str, "sub_config", b());
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.android.livesdk.ab.b b(com.bytedance.android.livesdk.ab.b bVar) {
        return bVar.a("click_position", this.f8212c);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8216a;

        static {
            Covode.recordClassIndex(4164);
        }

        b(d dVar) {
            this.f8216a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f8216a.f8211a = (com.bytedance.android.livesdk.chatroom.api.f) ((com.bytedance.android.live.network.response.d) obj).data;
            if (this.f8216a.isViewValid()) {
                this.f8216a.d();
            }
        }
    }

    static com.bytedance.android.livesdk.ab.b a(com.bytedance.android.livesdk.ab.b bVar) {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        return bVar.g(String.valueOf(b2.c()));
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.android.livesdk.ab.b c(com.bytedance.android.livesdk.ab.b bVar) {
        Integer num;
        com.bytedance.android.livesdk.chatroom.api.g gVar;
        com.bytedance.android.livesdk.chatroom.api.f fVar = this.f8211a;
        if (fVar == null || (gVar = fVar.f14936c) == null) {
            num = null;
        } else {
            num = Integer.valueOf(gVar.f14938a);
        }
        return bVar.a("emote_status", a(num));
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.android.livesdk.ab.b d(com.bytedance.android.livesdk.ab.b bVar) {
        Integer num;
        com.bytedance.android.livesdk.chatroom.api.g gVar;
        com.bytedance.android.livesdk.chatroom.api.f fVar = this.f8211a;
        if (fVar == null || (gVar = fVar.f14935b) == null) {
            num = null;
        } else {
            num = Integer.valueOf(gVar.f14938a);
        }
        return bVar.a("badge_status", a(num));
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("arg_enter_from");
            if (string == null) {
                l.b();
            }
            this.f8212c = string;
        }
        f();
    }

    /* access modifiers changed from: package-private */
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8225a;

        static {
            Covode.recordClassIndex(4172);
        }

        j(d dVar) {
            this.f8225a = dVar;
        }

        public final void onClick(View view) {
            String anchor_emotes_setting_page;
            d dVar = this.f8225a;
            if (dVar.b()) {
                anchor_emotes_setting_page = this.f8225a.c().getAnchor_emotes_setting_popup();
            } else {
                anchor_emotes_setting_page = this.f8225a.c().getAnchor_emotes_setting_page();
            }
            dVar.a(anchor_emotes_setting_page);
            d dVar2 = this.f8225a;
            dVar2.c(dVar2.b(d.a(b.a.a("livesdk_emote_edit_click")))).b();
        }
    }

    private static String a(Integer num) {
        if (num == null) {
            return "null";
        }
        if (num.intValue() == 1) {
            return "pass";
        }
        if (num.intValue() == 2) {
            return "failed";
        }
        if (num.intValue() == 3) {
            return "under_review";
        }
        return "null";
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8220a;

        static {
            Covode.recordClassIndex(4168);
        }

        f(d dVar) {
            this.f8220a = dVar;
        }

        public final void onClick(View view) {
            String value;
            String a2 = c.a();
            if (!TextUtils.isEmpty(a2) && h.m.p.a("GB", a2, true)) {
                value = LiveSubscribeAnchorFaqGBSetting.INSTANCE.getValue();
            } else {
                value = LiveSubscribeAnchorFaqNonGBSetting.INSTANCE.getValue();
            }
            if (!TextUtils.isEmpty(value)) {
                com.bytedance.android.livesdk.model.utils.b bVar = new com.bytedance.android.livesdk.model.utils.b(value);
                bVar.a("lang", com.bytedance.android.live.core.b.a.a());
                com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
                Context context = this.f8220a.getContext();
                d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(bVar.a());
                b2.f14292c = true;
                webViewManager.a(context, b2);
                d dVar = this.f8220a;
                dVar.c(dVar.b(d.a(b.a.a("livesdk_subscription_faq_click")))).b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.api.f f8224b;

        static {
            Covode.recordClassIndex(4171);
        }

        i(d dVar, com.bytedance.android.livesdk.chatroom.api.f fVar) {
            this.f8223a = dVar;
            this.f8224b = fVar;
        }

        public final void onClick(View view) {
            String anchor_badge_setting_page;
            String anchor_badge_preview_page;
            if (this.f8224b.f14935b.f14938a == 3) {
                d dVar = this.f8223a;
                if (dVar.b()) {
                    anchor_badge_preview_page = this.f8223a.c().getAnchor_badge_preview_popup();
                } else {
                    anchor_badge_preview_page = this.f8223a.c().getAnchor_badge_preview_page();
                }
                dVar.a(anchor_badge_preview_page);
            } else {
                d dVar2 = this.f8223a;
                if (dVar2.b()) {
                    anchor_badge_setting_page = this.f8223a.c().getAnchor_badge_setting_popup_android();
                } else {
                    anchor_badge_setting_page = this.f8223a.c().getAnchor_badge_setting_page();
                }
                dVar2.a(anchor_badge_setting_page);
            }
            d dVar3 = this.f8223a;
            dVar3.d(dVar3.b(d.a(b.a.a("livesdk_badge_edit_click")))).b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008a, code lost:
        if (r0.booleanValue() != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.bytedance.android.livesdk.chatroom.api.f r7) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.d.d.a(com.bytedance.android.livesdk.chatroom.api.f):void");
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        l.d(cVar, "");
        String str = cVar.f35926a;
        int hashCode = str.hashCode();
        if (hashCode != -1809547272) {
            if (hashCode != 1836714626 || !str.equals("anchor_subscribe_badge_status_change")) {
                return;
            }
        } else if (!str.equals("anchor_subscribe_emotes_status_change")) {
            return;
        }
        f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$d  reason: collision with other inner class name */
    public static final class C0126d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8218a;

        static {
            Covode.recordClassIndex(4166);
        }

        C0126d(d dVar) {
            this.f8218a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bB;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(z));
            com.bytedance.android.livesdk.ab.b b2 = this.f8218a.b(d.a(b.a.a("livesdk_sub_only_chat_button_click")));
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            b2.a("sub_only_chat_status", str).b();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (!b()) {
            p.b(a(R.id.q9));
            ((FrameLayout) a(R.id.q9)).setOnClickListener(new h(this));
        }
        d();
    }

    private final void a(LiveTextView liveTextView, int i2) {
        if (i2 == 1) {
            liveTextView.setText(R.string.enh);
            liveTextView.setTextColor(com.bytedance.android.live.design.b.a(getView(), (int) R.attr.am_));
        } else if (i2 == 2) {
            liveTextView.setText(R.string.eni);
            liveTextView.setTextColor(com.bytedance.android.live.design.b.a(getView(), (int) R.attr.am6));
        } else if (i2 != 3) {
            liveTextView.setText("");
        } else {
            liveTextView.setText(R.string.enj);
            liveTextView.setTextColor(com.bytedance.android.live.design.b.a(getView(), (int) R.attr.amv));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b9w, viewGroup, false);
    }
}

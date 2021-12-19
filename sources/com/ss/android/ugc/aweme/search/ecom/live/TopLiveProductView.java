package com.ss.android.ugc.aweme.search.ecom.live;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.helper.al;
import com.ss.android.ugc.aweme.discover.mixfeed.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.at;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class TopLiveProductView extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final a f121075k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f121076a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.search.ecom.a.a> f121077b;

    /* renamed from: c  reason: collision with root package name */
    public int f121078c;

    /* renamed from: d  reason: collision with root package name */
    public final SmartImageView f121079d;

    /* renamed from: e  reason: collision with root package name */
    public final TuxTextView f121080e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f121081f;

    /* renamed from: g  reason: collision with root package name */
    int f121082g;

    /* renamed from: h  reason: collision with root package name */
    public a f121083h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.ecom.a.a f121084i;

    /* renamed from: j  reason: collision with root package name */
    public List<String> f121085j;

    /* renamed from: l  reason: collision with root package name */
    private final h f121086l;

    /* renamed from: m  reason: collision with root package name */
    private final h f121087m;

    static {
        Covode.recordClassIndex(78875);
    }

    public TopLiveProductView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final Handler getMHandler() {
        return (Handler) this.f121086l.getValue();
    }

    public final Runnable getShowRunnable() {
        return (Runnable) this.f121087m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78877);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getDisplayIndex() {
        return this.f121082g;
    }

    static final class f extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ TopLiveProductView this$0;

        static {
            Covode.recordClassIndex(78882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TopLiveProductView topLiveProductView) {
            super(0);
            this.this$0 = topLiveProductView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f121097a;

                static {
                    Covode.recordClassIndex(78883);
                }

                public final void run() {
                    com.ss.android.ugc.aweme.search.ecom.a.a aVar;
                    String str;
                    String str2;
                    if (this.f121097a.this$0.f121081f) {
                        TopLiveProductView topLiveProductView = this.f121097a.this$0;
                        topLiveProductView.setDisplayIndex(topLiveProductView.f121082g + 1);
                        if (topLiveProductView.f121082g >= topLiveProductView.f121078c) {
                            topLiveProductView.f121085j.clear();
                        }
                        topLiveProductView.setDisplayIndex(topLiveProductView.f121082g % topLiveProductView.f121078c);
                        List<com.ss.android.ugc.aweme.search.ecom.a.a> list = topLiveProductView.f121077b;
                        String str3 = null;
                        if (list != null) {
                            aVar = list.get(topLiveProductView.f121082g);
                        } else {
                            aVar = null;
                        }
                        topLiveProductView.f121084i = aVar;
                        com.ss.android.ugc.aweme.search.ecom.a.a aVar2 = topLiveProductView.f121084i;
                        if (aVar2 != null) {
                            str3 = aVar2.f121035c;
                        }
                        topLiveProductView.setCoverWithAnim(str3);
                        com.ss.android.ugc.aweme.search.ecom.a.a aVar3 = topLiveProductView.f121084i;
                        if (aVar3 == null || (str = aVar3.f121038f) == null) {
                            str = "";
                        }
                        topLiveProductView.setPriceWithAnim(str);
                        com.ss.android.ugc.aweme.search.ecom.a.a aVar4 = topLiveProductView.f121084i;
                        if (!(aVar4 == null || (str2 = aVar4.f121033a) == null || topLiveProductView.f121085j.contains(str2))) {
                            a aVar5 = topLiveProductView.f121083h;
                            if (aVar5 != null) {
                                aVar5.a(topLiveProductView.f121084i);
                            }
                            topLiveProductView.f121085j.add(str2);
                        }
                        this.f121097a.this$0.getMHandler().removeCallbacks(this.f121097a.this$0.getShowRunnable());
                        this.f121097a.this$0.getMHandler().postDelayed(this, 4000);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f121097a = r1;
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f121091a = new c();

        static {
            Covode.recordClassIndex(78879);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void setProductHandler(a aVar) {
        this.f121083h = aVar;
    }

    public final void setShowing(boolean z) {
        this.f121081f = z;
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f121092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Animator f121093b;

        static {
            Covode.recordClassIndex(78880);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            v vVar = this.f121092a;
            if (vVar != null) {
                vVar.c();
            }
            this.f121093b.start();
        }

        d(v vVar, Animator animator) {
            this.f121092a = vVar;
            this.f121093b = animator;
        }
    }

    public final void setDisplayIndex(int i2) {
        this.f121082g = i2;
        b bVar = this.f121076a;
        if (bVar != null) {
            bVar.f121105b = i2;
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopLiveProductView f121094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f121095b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Animator f121096c;

        static {
            Covode.recordClassIndex(78881);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f121094a.f121080e.setText(this.f121095b);
            this.f121096c.start();
        }

        e(TopLiveProductView topLiveProductView, String str, Animator animator) {
            this.f121094a = topLiveProductView;
            this.f121095b = str;
            this.f121096c = animator;
        }
    }

    public final void setCover(String str) {
        l.d(str, "");
        v a2 = r.a(str);
        a2.E = this.f121079d;
        a2.c();
    }

    public final void setPriceWithAnim(String str) {
        l.d(str, "");
        Animator a2 = a(this.f121080e);
        Animator b2 = b(this.f121080e);
        a2.start();
        a2.addListener(new e(this, str, b2));
    }

    private static Animator a(View view) {
        l.d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, LinearLayout.ALPHA, 1.0f, 0.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private static Animator b(View view) {
        l.d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, LinearLayout.ALPHA, 0.0f, 1.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public final void setCoverWithAnim(String str) {
        v vVar;
        Animator a2 = a(this.f121079d);
        Animator b2 = b(this.f121079d);
        a2.start();
        if (str != null) {
            vVar = r.a(str);
            vVar.f39917m = 300;
            vVar.E = this.f121079d;
        } else {
            vVar = null;
        }
        a2.addListener(new d(vVar, b2));
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TopLiveProductView f121090b;

        static {
            Covode.recordClassIndex(78878);
        }

        public b(a aVar, TopLiveProductView topLiveProductView) {
            this.f121089a = aVar;
            this.f121090b = topLiveProductView;
        }

        public final void onClick(View view) {
            Aweme aweme;
            String str;
            String str2;
            ClickAgent.onClick(view);
            a aVar = this.f121089a;
            com.ss.android.ugc.aweme.search.ecom.a.a aVar2 = this.f121090b.f121084i;
            b bVar = aVar.f121098a;
            if (bVar == null || (aweme = bVar.f121104a) == null) {
                aweme = new Aweme();
            }
            com.ss.android.ugc.aweme.autoplay.b.h hVar = aVar.f121099b;
            Uri.Builder builder = null;
            com.ss.android.ugc.aweme.search.k.r rVar = hVar != null ? hVar.f67311b : null;
            com.ss.android.ugc.aweme.autoplay.b.h hVar2 = aVar.f121099b;
            g gVar = hVar2 != null ? hVar2.f67310a : null;
            l.d(aweme, "");
            boolean z = false;
            if (rVar != null) {
                User author = aweme.getAuthor();
                com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(rVar).g(rVar.n);
                if (gVar == null || (str2 = gVar.f81774b) == null || str2.length() == 0) {
                    str = "live_card";
                } else if (gVar != null) {
                    str = gVar.f81774b;
                } else {
                    str = null;
                }
                ((at) ((at) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar.x(str)).s(author != null ? author.getRoomTitle() : null)).d(Integer.valueOf(aVar.f121103f))).r("live")).v(String.valueOf(author != null ? Long.valueOf(author.roomId) : null))).B("click_live").c("anchor_info", "search_live_merge_entrance")).A("ec_entrance").f();
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            com.ss.android.ugc.aweme.autoplay.b.h hVar3 = aVar.f121099b;
            Map<String, String> b2 = com.ss.android.ugc.aweme.search.ecom.b.c.b(aweme, aVar2, hVar3 != null ? hVar3.f67311b : null);
            l.d(b2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(b2);
            linkedHashMap.put("source_page_type", "live");
            linkedHashMap.remove("room_id");
            linkedHashMap.remove("is_self");
            linkedHashMap.remove("product_source");
            linkedHashMap.remove("source_from");
            linkedHashMap.remove("source");
            linkedHashMap.remove("is_ad");
            linkedHashMap.remove("request_id");
            linkedHashMap.remove("page_name");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (!(str3.length() == 0 || str4.length() == 0)) {
                    jSONObject.put(str3, str4);
                }
            }
            if (aVar2 != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                Integer num = aVar2.f121042j;
                if (num != null && (num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 100)) {
                    z = true;
                }
                if (z) {
                    String str5 = aVar2.f121040h;
                    if (str5 != null) {
                        builder = Uri.parse(str5).buildUpon();
                        builder.appendQueryParameter("trackParams", jSONObject.toString());
                    }
                    roomsData.aF = String.valueOf(builder);
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    if (jSONObject.has("enter_from_merge")) {
                        jSONObject2.put("enter_from", jSONObject.get("enter_from_merge"));
                    }
                    String jSONObject3 = jSONObject2.toString();
                    l.b(jSONObject3, "");
                    String str6 = aVar2.f121041i;
                    if (str6 != null) {
                        builder = Uri.parse("aweme://echybrid").buildUpon();
                        builder.appendQueryParameter("url", str6);
                        builder.appendQueryParameter("should_track_duration_time", "1");
                        builder.appendQueryParameter("track_duration_event", "track_duration_event");
                        builder.appendQueryParameter("track_duration_custom_params", jSONObject3);
                        builder.appendQueryParameter("container_color_auto_dark", "1");
                        builder.appendQueryParameter("container_height", "0.73");
                        builder.appendQueryParameter("hide_nav_bar", "1");
                        builder.appendQueryParameter("should_full_screen", "1");
                        builder.appendQueryParameter("trackParams", jSONObject.toString());
                    }
                    roomsData.aF = String.valueOf(builder);
                }
                builder.appendQueryParameter("fullScreen", "false");
                roomsData.aF = String.valueOf(builder);
            }
            com.ss.android.ugc.aweme.discover.ui.c.a.f82491a.a(aweme, aVar.f121099b, aVar.f121100c, enterRoomConfig, aVar.f121102e, aVar.f121101d);
            com.ss.android.ugc.aweme.common.r.a("livesdk_tiktokec_product_entrance_click", b2);
        }
    }

    private /* synthetic */ TopLiveProductView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TopLiveProductView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(795);
        this.f121085j = new ArrayList();
        this.f121086l = i.a((h.f.a.a) c.f121091a);
        this.f121087m = i.a((h.f.a.a) new f(this));
        View inflate = View.inflate(context, R.layout.aw8, this);
        if (inflate != null) {
            al.a((LinearLayout) inflate);
            View findViewById = findViewById(R.id.d9z);
            l.b(findViewById, "");
            this.f121079d = (SmartImageView) findViewById;
            View findViewById2 = findViewById(R.id.d99);
            l.b(findViewById2, "");
            this.f121080e = (TuxTextView) findViewById2;
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
                /* class com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ TopLiveProductView f121088a;

                static {
                    Covode.recordClassIndex(78876);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f121088a = r1;
                }

                public final void onViewDetachedFromWindow(View view) {
                    this.f121088a.getMHandler().removeCallbacks(this.f121088a.getShowRunnable());
                }

                public final void onViewAttachedToWindow(View view) {
                    String str;
                    com.ss.android.ugc.aweme.search.ecom.a.a aVar = this.f121088a.f121084i;
                    if (aVar != null && (str = aVar.f121033a) != null && !this.f121088a.f121085j.contains(str)) {
                        a aVar2 = this.f121088a.f121083h;
                        if (aVar2 != null) {
                            aVar2.a(this.f121088a.f121084i);
                        }
                        this.f121088a.f121085j.add(str);
                    }
                }
            });
            MethodCollector.o(795);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(795);
        throw nullPointerException;
    }
}

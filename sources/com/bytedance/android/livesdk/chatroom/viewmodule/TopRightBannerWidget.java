package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.n.ab;
import com.bytedance.android.live.n.v;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.c.aa;
import com.bytedance.android.livesdk.chatroom.e.p;
import com.bytedance.android.livesdk.event.n;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.eb;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.livesetting.banner.LiveUseBannerAnimationSetting;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.web.jsbridge2.x;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class TopRightBannerWidget extends LiveRecyclableWidget implements p.a, au {
    private static final b o = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    d.f f16321a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f16322b;

    /* renamed from: c  reason: collision with root package name */
    Room f16323c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f16324d;

    /* renamed from: e  reason: collision with root package name */
    AnimatorSet f16325e;

    /* renamed from: f  reason: collision with root package name */
    public c.a f16326f;

    /* renamed from: g  reason: collision with root package name */
    private a f16327g;

    /* renamed from: h  reason: collision with root package name */
    private a f16328h;

    /* renamed from: i  reason: collision with root package name */
    private WebView f16329i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16330j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16331k;

    /* renamed from: l  reason: collision with root package name */
    private p f16332l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f16333m = LiveBannerExperiment.isNewBannerEnable();
    private boolean n;

    enum a {
        NORMAL,
        PK;

        static {
            Covode.recordClassIndex(9032);
        }
    }

    static {
        Covode.recordClassIndex(9031);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhs;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class b {
        static {
            Covode.recordClassIndex(9033);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.f16331k = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f16326f != null) {
            super.show();
        }
    }

    public TopRightBannerWidget() {
        a aVar = a.NORMAL;
        this.f16327g = aVar;
        this.f16328h = aVar;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        try {
            d.f fVar = this.f16321a;
            if (fVar != null) {
                fVar.a("container_disappear", new JSONObject());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", new JSONObject().put("foreground", false));
                fVar.a("H5_appStateChange", jSONObject);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        try {
            d.f fVar = this.f16321a;
            if (fVar != null) {
                fVar.a("container_appear", new JSONObject());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                fVar.a("H5_appStateChange", jSONObject);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        MethodCollector.i(9134);
        b(false);
        p pVar = this.f16332l;
        if (pVar == null) {
            h.f.b.l.a("mPresenter");
        }
        pVar.b();
        LinearLayout linearLayout = this.f16322b;
        if (linearLayout == null) {
            h.f.b.l.a("staticContainer");
        }
        linearLayout.removeView(this.f16329i);
        ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(this.f16321a);
        a(this.f16325e);
        MethodCollector.o(9134);
    }

    public static final class l implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f16343a;

        static {
            Covode.recordClassIndex(9043);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            h.f.b.l.d(imageModel, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(TopRightBannerWidget topRightBannerWidget) {
            this.f16343a = topRightBannerWidget;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            h.f.b.l.d(imageModel, "");
            h.f.b.l.d(exc, "");
            TopRightBannerWidget.a(this.f16343a).setVisibility(0);
            TopRightBannerWidget.b(this.f16343a).setVisibility(8);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            h.f.b.l.d(imageModel, "");
            TopRightBannerWidget topRightBannerWidget = this.f16343a;
            ImageView imageView = topRightBannerWidget.f16324d;
            if (imageView == null) {
                h.f.b.l.a("mAnimateView");
            }
            ViewParent parent = imageView.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            int width = ((View) parent).getWidth();
            ImageView imageView2 = topRightBannerWidget.f16324d;
            if (imageView2 == null) {
                h.f.b.l.a("mAnimateView");
            }
            float width2 = (((float) (width - imageView2.getWidth())) * 0.5f) + ((float) y.a(10.0f));
            ImageView imageView3 = topRightBannerWidget.f16324d;
            if (imageView3 == null) {
                h.f.b.l.a("mAnimateView");
            }
            float height = (((float) imageView3.getHeight()) * 0.8f) + ((float) y.a(10.0f));
            ImageView imageView4 = topRightBannerWidget.f16324d;
            if (imageView4 == null) {
                h.f.b.l.a("mAnimateView");
            }
            ViewParent parent2 = imageView4.getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
            float height2 = height - ((float) ((View) parent2).getHeight());
            TopRightBannerWidget.a(topRightBannerWidget.f16325e);
            ImageView imageView5 = topRightBannerWidget.f16324d;
            if (imageView5 == null) {
                h.f.b.l.a("mAnimateView");
            }
            m mVar = new m(topRightBannerWidget);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 0.0f, 1.1f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "scaleY", 0.0f, 1.1f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "alpha", 0.0f, 1.0f).setDuration(400L));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 1.1f, 1.0f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "scaleY", 1.1f, 1.0f).setDuration(400L));
            animatorSet.playSequentially(animatorSet2, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 0.6f).setDuration(800L), ObjectAnimator.ofFloat(imageView5, "scaleY", 1.0f, 0.6f).setDuration(800L), ObjectAnimator.ofFloat(imageView5, "translationX", 0.0f, width2).setDuration(800L), ObjectAnimator.ofFloat(imageView5, "translationY", 0.0f, height2).setDuration(800L));
            AnimatorSet animatorSet6 = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(imageView5, "rotation", 0.0f, 8.0f).setDuration(120L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView5, "rotation", 8.0f, -8.0f).setDuration(120L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(imageView5, "rotation", -8.0f, 0.0f).setDuration(120L);
            animatorSet6.setStartDelay(1000);
            animatorSet6.playSequentially(duration, duration2, duration3);
            AnimatorSet animatorSet7 = new AnimatorSet();
            animatorSet7.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 0.6f, 0.5f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "scaleY", 0.6f, 0.5f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "alpha", 1.0f, 0.0f).setDuration(400L));
            animatorSet7.setStartDelay(2200);
            animatorSet4.playTogether(animatorSet5, animatorSet6, animatorSet7);
            AnimatorSet animatorSet8 = new AnimatorSet();
            animatorSet8.playSequentially(animatorSet, animatorSet4);
            animatorSet8.addListener(mVar);
            topRightBannerWidget.f16325e = animatorSet8;
            AnimatorSet animatorSet9 = topRightBannerWidget.f16325e;
            if (animatorSet9 != null) {
                animatorSet9.start();
            }
        }
    }

    public static final class m implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f16344a;

        static {
            Covode.recordClassIndex(9044);
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(TopRightBannerWidget topRightBannerWidget) {
            this.f16344a = topRightBannerWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            TopRightBannerWidget.b(this.f16344a).setVisibility(8);
            TopRightBannerWidget.a(this.f16344a).setVisibility(0);
        }
    }

    public static final /* synthetic */ LinearLayout a(TopRightBannerWidget topRightBannerWidget) {
        LinearLayout linearLayout = topRightBannerWidget.f16322b;
        if (linearLayout == null) {
            h.f.b.l.a("staticContainer");
        }
        return linearLayout;
    }

    public static final /* synthetic */ ImageView b(TopRightBannerWidget topRightBannerWidget) {
        ImageView imageView = topRightBannerWidget.f16324d;
        if (imageView == null) {
            h.f.b.l.a("mAnimateView");
        }
        return imageView;
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ TopRightBannerWidget this$0;

        static {
            Covode.recordClassIndex(9037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TopRightBannerWidget topRightBannerWidget) {
            super(1);
            this.this$0 = topRightBannerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean z;
            Boolean bool2 = bool;
            TopRightBannerWidget topRightBannerWidget = this.this$0;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            topRightBannerWidget.a(z);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ TopRightBannerWidget this$0;

        static {
            Covode.recordClassIndex(9038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TopRightBannerWidget topRightBannerWidget) {
            super(1);
            this.this$0 = topRightBannerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean z;
            Boolean bool2 = bool;
            TopRightBannerWidget topRightBannerWidget = this.this$0;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            topRightBannerWidget.a(z);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class i extends h.f.b.j implements h.f.a.b<Boolean, z> {
        static {
            Covode.recordClassIndex(9040);
        }

        i(TopRightBannerWidget topRightBannerWidget) {
            super(1, topRightBannerWidget, TopRightBannerWidget.class, "onMicRoomHostToChange", "onMicRoomHostToChange(Z)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            d.f fVar;
            boolean booleanValue = bool.booleanValue();
            TopRightBannerWidget topRightBannerWidget = (TopRightBannerWidget) this.receiver;
            if (booleanValue && (fVar = topRightBannerWidget.f16321a) != null) {
                fVar.a("H5_micRoomStateChanged", new JSONObject());
            }
            return z.f158842a;
        }
    }

    static final class j<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        public static final j f16341a = new j();

        static {
            Covode.recordClassIndex(9041);
        }

        j() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            n nVar = (n) obj;
            h.f.b.l.d(nVar, "");
            if (nVar.f17206a == b.a.Login) {
                return true;
            }
            return false;
        }
    }

    static void a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.e_7);
        h.f.b.l.b(findViewById, "");
        this.f16322b = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.btr);
        h.f.b.l.b(findViewById2, "");
        this.f16324d = (ImageView) findViewById2;
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.api.b.h, z> {
        final /* synthetic */ TopRightBannerWidget this$0;

        static {
            Covode.recordClassIndex(9039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TopRightBannerWidget topRightBannerWidget) {
            super(1);
            this.this$0 = topRightBannerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.api.b.h hVar) {
            com.bytedance.android.live.liveinteract.api.b.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            TopRightBannerWidget topRightBannerWidget = this.this$0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", hVar2.f9995a);
            d.f fVar = topRightBannerWidget.f16321a;
            if (fVar != null) {
                fVar.a("H5_linkMicStatusChanged", jSONObject);
            }
            return z.f158842a;
        }
    }

    private final void b(boolean z) {
        boolean z2 = this.n;
        if (z2 != z) {
            if (z2) {
                com.bytedance.android.live.broadcast.e.a.a("task_banner");
            } else {
                com.bytedance.android.live.broadcast.e.a.b("activity_banner");
            }
            this.n = z;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.b(eb.class, Boolean.valueOf(this.n));
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.c(ab.class, Boolean.valueOf(this.n));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<com.bytedance.android.livesdk.model.i> a(List<? extends com.bytedance.android.livesdk.model.i> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (this.f16330j || t2.s == null || t2.s.longValue() - 3 != 0) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f16342a;

        static {
            Covode.recordClassIndex(9042);
        }

        k(TopRightBannerWidget topRightBannerWidget) {
            this.f16342a = topRightBannerWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.browser.c.a aVar;
            x a2;
            String str;
            n nVar = (n) obj;
            TopRightBannerWidget topRightBannerWidget = this.f16342a;
            if (nVar != null) {
                try {
                    d.f fVar = topRightBannerWidget.f16321a;
                    if (fVar != null && (aVar = fVar.f14314b) != null && (a2 = aVar.a()) != null) {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        b.a aVar2 = nVar.f17206a;
                        if (aVar2 != null) {
                            int i2 = bu.f16499a[aVar2.ordinal()];
                            if (i2 == 1) {
                                str = "1";
                            } else if (i2 == 2) {
                                str = "2";
                            } else if (i2 == 3) {
                                str = "3";
                            }
                            a2.a("H5_loginStatus", jSONObject.put("args", jSONObject2.put("code", str)));
                        }
                        str = "0";
                        a2.a("H5_loginStatus", jSONObject.put("args", jSONObject2.put("code", str)));
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.model.i f16338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f16339b;

        static {
            Covode.recordClassIndex(9035);
        }

        d(com.bytedance.android.livesdk.model.i iVar, TopRightBannerWidget topRightBannerWidget) {
            this.f16338a = iVar;
            this.f16339b = topRightBannerWidget;
        }

        public final void onClick(View view) {
            Context context = this.f16339b.context;
            com.bytedance.android.livesdk.model.i iVar = this.f16338a;
            int i2 = iVar.f19078h;
            if (i2 == 2) {
                com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
                d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(iVar.f19076f);
                b2.f14291b = iVar.f19072b;
                webViewManager.a(context, b2);
            } else if (i2 != 3) {
                com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(iVar.f19076f);
                gVar.a("title", iVar.f19072b);
                ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(context, Uri.parse(gVar.a()));
            } else {
                com.ss.android.common.util.g gVar2 = new com.ss.android.common.util.g(iVar.f19076f);
                com.bytedance.android.live.base.model.user.b a2 = u.a().b().a();
                int i3 = 0;
                if (a2.getUserHonor() != null && a2.getUserHonor().l() == 0) {
                    i3 = 1;
                }
                gVar2.a("is_first_consume", String.valueOf(i3));
                com.bytedance.android.livesdk.an.a.a().a(new aa(gVar2.a(), "banner"));
            }
            this.f16339b.a(String.valueOf(this.f16338a.f19071a), "live_banner_click");
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f16340a;

        static {
            Covode.recordClassIndex(9036);
        }

        e(TopRightBannerWidget topRightBannerWidget) {
            this.f16340a = topRightBannerWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdkapi.depend.model.live.i iVar;
            MethodCollector.i(5327);
            com.bytedance.android.livesdk.model.message.c cVar = ((InRoomBannerManager.a) obj).f7357b;
            TopRightBannerWidget topRightBannerWidget = this.f16340a;
            c.a aVar = cVar.f19405b;
            topRightBannerWidget.f16326f = aVar;
            if (aVar == null) {
                topRightBannerWidget.hide();
                ImageView imageView = topRightBannerWidget.f16324d;
                if (imageView == null) {
                    h.f.b.l.a("mAnimateView");
                }
                imageView.setVisibility(8);
                LinearLayout linearLayout = topRightBannerWidget.f16322b;
                if (linearLayout == null) {
                    h.f.b.l.a("staticContainer");
                }
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = topRightBannerWidget.f16322b;
                if (linearLayout2 == null) {
                    h.f.b.l.a("staticContainer");
                }
                linearLayout2.removeAllViews();
                MethodCollector.o(5327);
                return;
            }
            if (aVar.f19413c != null && LiveUseBannerAnimationSetting.INSTANCE.enable()) {
                Room room = topRightBannerWidget.f16323c;
                if (room != null) {
                    iVar = room.getStreamType();
                } else {
                    iVar = null;
                }
                if (iVar == com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO) {
                    ImageView imageView2 = topRightBannerWidget.f16324d;
                    if (imageView2 == null) {
                        h.f.b.l.a("mAnimateView");
                    }
                    imageView2.setVisibility(0);
                    LinearLayout linearLayout3 = topRightBannerWidget.f16322b;
                    if (linearLayout3 == null) {
                        h.f.b.l.a("staticContainer");
                    }
                    linearLayout3.setVisibility(8);
                    topRightBannerWidget.a(aVar);
                    ImageView imageView3 = topRightBannerWidget.f16324d;
                    if (imageView3 == null) {
                        h.f.b.l.a("mAnimateView");
                    }
                    com.bytedance.android.live.core.f.p.a(imageView3, aVar.f19413c, 0, new l(topRightBannerWidget));
                    MethodCollector.o(5327);
                    return;
                }
            }
            topRightBannerWidget.a(aVar);
            MethodCollector.o(5327);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.p.a
    public final void a(ag agVar) {
        String str;
        String str2;
        Long l2;
        String str3;
        h.f.b.l.d(agVar, "");
        String a2 = e.a.f9628b.a((com.google.gson.l) agVar.f19130a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "refresh");
        jSONObject.put("data", a2);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject put = jSONObject2.put("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).put("enter_method", com.bytedance.android.livesdk.ab.e.d());
        if (this.f16330j) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        JSONObject put2 = put.put("event_page", str);
        Room room = this.f16323c;
        String str4 = null;
        if (room != null) {
            str2 = String.valueOf(room.getId());
        } else {
            str2 = null;
        }
        JSONObject put3 = put2.put("room_id", str2);
        Room room2 = this.f16323c;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        JSONObject put4 = put3.put("anchor_id", String.valueOf(l2));
        Room room3 = this.f16323c;
        if (room3 != null) {
            str3 = room3.getRequestId();
        } else {
            str3 = null;
        }
        JSONObject put5 = put4.put("request_id", str3);
        Room room4 = this.f16323c;
        if (room4 != null) {
            str4 = room4.getLog_pb();
        }
        put5.put("log_pb", str4);
        jSONObject.put("log", jSONObject2);
        d.f fVar = this.f16321a;
        if (fVar != null) {
            fVar.a("H5_roomStatusChange", jSONObject);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Room room2;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        Long l2 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f16323c = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f16330j = z;
        com.bytedance.android.livesdk.chatroom.e.p pVar = new com.bytedance.android.livesdk.chatroom.e.p(this.f16323c, this.f16330j);
        this.f16332l = pVar;
        pVar.a((p.a) this);
        DataChannel dataChannel3 = this.dataChannel;
        if (!(dataChannel3 == null || (room2 = (Room) dataChannel3.b(df.class)) == null)) {
            l2 = Long.valueOf(room2.getId());
        }
        com.bytedance.android.livesdk.util.rxutils.autodispose.z zVar = (com.bytedance.android.livesdk.util.rxutils.autodispose.z) InRoomBannerManager.a(l2).a(WidgetExtendsKt.autoDispose(this));
        if (zVar != null) {
            zVar.a(new e(this));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.a((androidx.lifecycle.m) this, ba.class, (h.f.a.b) new f(this)).a((androidx.lifecycle.m) this, cq.class, (h.f.a.b) new g(this)).a((androidx.lifecycle.m) this, com.bytedance.android.live.liveinteract.api.b.i.class, (h.f.a.b) new h(this)).a((androidx.lifecycle.m) this, v.class, (h.f.a.b) new i(this));
        }
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.y) u.a().b().h().c().a(j.f16341a).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(this))).a(new k(this));
    }

    public final void a(boolean z) {
        WebView webView;
        d.f fVar = this.f16321a;
        if (fVar != null && (webView = fVar.f14313a) != null) {
            webView.setFocusable(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.model.message.c.a r15) {
        /*
        // Method dump skipped, instructions count: 546
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget.a(com.bytedance.android.livesdk.model.message.c$a):void");
    }

    /* access modifiers changed from: package-private */
    public static final class c implements d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TopRightBannerWidget f16337a;

        static {
            Covode.recordClassIndex(9034);
        }

        c(TopRightBannerWidget topRightBannerWidget) {
            this.f16337a = topRightBannerWidget;
        }

        @Override // com.bytedance.android.livesdk.browser.c.d.e
        public final void a(WebView webView, String str) {
            TopRightBannerWidget topRightBannerWidget = this.f16337a;
            c.a aVar = topRightBannerWidget.f16326f;
            if (topRightBannerWidget.isViewValid() && webView != null) {
                webView.setVisibility(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (aVar != null) {
                        jSONObject.put("data", com.bytedance.android.livesdk.util.a.a(topRightBannerWidget.a(aVar.f19412b)));
                        jSONObject.put(StringSet.type, "init");
                        d.f fVar = topRightBannerWidget.f16321a;
                        if (fVar != null) {
                            fVar.a("H5_roomStatusChange", jSONObject);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void a(String str, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("banner_id", str);
        hashMap.put("request_page", "topright");
        com.bytedance.android.livesdk.ab.b b2 = b.a.a(str2).a((Map<String, String>) hashMap).a(this.dataChannel).b("live_function");
        if (this.f16330j) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        b2.d(str3).b();
    }
}

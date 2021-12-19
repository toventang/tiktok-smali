package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.google.gson.f;
import com.ss.android.ad.splash.f.o;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class SwipeUpType5Mask extends FrameLayout implements com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34942d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f34943a;

    /* renamed from: b  reason: collision with root package name */
    Aweme f34944b;

    /* renamed from: c  reason: collision with root package name */
    public float f34945c;

    /* renamed from: e  reason: collision with root package name */
    private int f34946e;

    /* renamed from: f  reason: collision with root package name */
    private AdHomePageDataVM f34947f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector f34948g;

    /* renamed from: h  reason: collision with root package name */
    private final GestureDetector.OnGestureListener f34949h;

    /* renamed from: i  reason: collision with root package name */
    private final u<Float> f34950i;

    static {
        Covode.recordClassIndex(20970);
    }

    public SwipeUpType5Mask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void b() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20971);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void a() {
        t<Float> tVar;
        AdHomePageDataVM adHomePageDataVM = this.f34947f;
        if (adHomePageDataVM != null && (tVar = adHomePageDataVM.f34659c) != null) {
            tVar.removeObserver(this.f34950i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getContext() instanceof e) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f34947f = AdHomePageDataVM.a.a((e) context);
        }
        this.f34948g = new GestureDetector(getContext(), this.f34949h);
        setOnTouchListener(new d(this));
    }

    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwipeUpType5Mask f34951a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f34952b;

        static {
            Covode.recordClassIndex(20972);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            this.f34951a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            String str;
            AwemeRawAd awemeRawAd;
            l.d(motionEvent, "");
            SwipeUpType5Mask swipeUpType5Mask = this.f34951a;
            com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
            if (a2 != null && a2.c(swipeUpType5Mask.f34944b)) {
                com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a3 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
                if (a3 == null) {
                    l.b();
                }
                if (a3.d(swipeUpType5Mask.f34944b)) {
                    new com.bytedance.tux.g.b(swipeUpType5Mask).e(R.string.of).b();
                } else {
                    Aweme aweme = swipeUpType5Mask.f34944b;
                    if (aweme == null) {
                        l.b();
                    }
                    aweme.getAid();
                    Aweme aweme2 = swipeUpType5Mask.f34944b;
                    if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd.getOpenUrl();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Uri parse = Uri.parse(str);
                        l.b(parse, "");
                        if (TextUtils.equals(parse.getHost(), "challenge")) {
                            Aweme aweme3 = swipeUpType5Mask.f34944b;
                            if (aweme3 == null) {
                                l.b();
                            }
                            AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                            if (awemeRawAd2 == null) {
                                l.b();
                            }
                            l.b(awemeRawAd2, "");
                            g gVar = new g(awemeRawAd2.getOpenUrl());
                            gVar.a("extra_challenge_from", "awesome_splash");
                            Aweme aweme4 = swipeUpType5Mask.f34944b;
                            if (aweme4 == null) {
                                l.b();
                            }
                            AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
                            if (awemeRawAd3 == null) {
                                l.b();
                            }
                            l.b(awemeRawAd3, "");
                            awemeRawAd3.setOpenUrl(gVar.a());
                        }
                    }
                    com.bytedance.ies.ugc.aweme.commercialize.splash.a.b a4 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
                    if (a4 != null) {
                        Context context = swipeUpType5Mask.getContext();
                        l.b(context, "");
                        a4.a(context, swipeUpType5Mask.f34944b, swipeUpType5Mask.f34943a);
                    }
                }
            }
            return true;
        }

        b(SwipeUpType5Mask swipeUpType5Mask, Context context) {
            this.f34951a = swipeUpType5Mask;
            this.f34952b = context;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            if (Math.abs(f2) >= Math.abs(f3) || (motionEvent2.getY() > motionEvent.getY() && this.f34951a.f34945c <= o.a(this.f34952b, 50.0f))) {
                this.f34951a.getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                this.f34951a.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f34948g;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (this.f34946e != 4) {
            return true;
        }
        return false;
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwipeUpType5Mask f34953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f34954b;

        static {
            Covode.recordClassIndex(20973);
        }

        c(SwipeUpType5Mask swipeUpType5Mask, Context context) {
            this.f34953a = swipeUpType5Mask;
            this.f34954b = context;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (this.f34953a.f34945c >= o.a(this.f34954b, 50.0f)) {
                this.f34953a.getParent().requestDisallowInterceptTouchEvent(true);
            }
            SwipeUpType5Mask swipeUpType5Mask = this.f34953a;
            l.b(f2, "");
            swipeUpType5Mask.f34945c = f2.floatValue();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c
    public final void onEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        t<Float> tVar;
        l.d(aVar, "");
        this.f34946e = aVar.f34874a;
        this.f34944b = aVar.f34875b;
        AdHomePageDataVM adHomePageDataVM = this.f34947f;
        if (adHomePageDataVM != null && (tVar = adHomePageDataVM.f34659c) != null) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            tVar.observe((m) context, this.f34950i);
        }
    }

    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwipeUpType5Mask f34955a;

        static {
            Covode.recordClassIndex(20974);
        }

        d(SwipeUpType5Mask swipeUpType5Mask) {
            this.f34955a = swipeUpType5Mask;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (gb.a(this.f34955a.getContext())) {
                hashMap.put("click_x", String.valueOf(((float) i.b(this.f34955a.getContext())) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = this.f34955a.f34943a;
            String b2 = new f().b(hashMap);
            l.b(b2, "");
            map.put("ad_extra_data", b2);
            return false;
        }
    }

    private /* synthetic */ SwipeUpType5Mask(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SwipeUpType5Mask(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5580);
        this.f34946e = 4;
        this.f34943a = new HashMap();
        this.f34949h = new b(this, context);
        this.f34950i = new c(this, context);
        MethodCollector.o(5580);
    }
}

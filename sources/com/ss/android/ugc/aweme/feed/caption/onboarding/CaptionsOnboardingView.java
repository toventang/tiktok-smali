package com.ss.android.ugc.aweme.feed.caption.onboarding;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class CaptionsOnboardingView extends FrameLayout implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f92878a = "cla_crowdsourcing_close_opt_in_half_sheet";

    /* renamed from: b  reason: collision with root package name */
    public static final a f92879b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f92880c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<z> f92881d;

    private final CrossPlatformWebView getCPWebView() {
        return (CrossPlatformWebView) this.f92880c.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(CaptionsOnboardingView.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58916);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final h.f.a.a<z> getOnHalfsheetBroadcastEventReceived() {
        return this.f92881d;
    }

    static final class b extends m implements h.f.a.a<CrossPlatformWebView> {
        final /* synthetic */ CaptionsOnboardingView this$0;

        static {
            Covode.recordClassIndex(58917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CaptionsOnboardingView captionsOnboardingView) {
            super(0);
            this.this$0 = captionsOnboardingView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CrossPlatformWebView invoke() {
            return this.this$0.findViewById(R.id.fm8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.a().b(this);
    }

    static {
        Covode.recordClassIndex(58915);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.a(EventBus.a(), this);
        getCPWebView().a("https://www.tiktok.com/web-inapp/cla/crowdsourcing/opt-in?enter_from=caption_credit&enter_method=caption", false, false);
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (l.a((Object) jVar.f91311b.optString("eventName"), (Object) f92878a)) {
            this.f92881d.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CaptionsOnboardingView(Context context, h.f.a.a<z> aVar) {
        super(context, null, 0);
        l.d(context, "");
        l.d(aVar, "");
        MethodCollector.i(6795);
        this.f92881d = aVar;
        this.f92880c = h.i.a((h.f.a.a) new b(this));
        FrameLayout.inflate(context, R.layout.rw, this);
        MethodCollector.o(6795);
    }

    public /* synthetic */ CaptionsOnboardingView(Context context, h.f.a.a aVar, byte b2) {
        this(context, aVar);
    }
}

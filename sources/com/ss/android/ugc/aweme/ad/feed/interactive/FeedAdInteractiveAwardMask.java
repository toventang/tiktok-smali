package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class FeedAdInteractiveAwardMask extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final h f65885a;

    /* renamed from: b  reason: collision with root package name */
    private a f65886b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f65887c;

    public interface a {
        static {
            Covode.recordClassIndex(40544);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(40543);
    }

    public FeedAdInteractiveAwardMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f65887c == null) {
            this.f65887c = new HashMap();
        }
        View view = (View) this.f65887c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f65887c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.ad.feed.c getFeedAdDepend() {
        return (com.ss.android.ugc.aweme.ad.feed.c) this.f65885a.getValue();
    }

    public final a getCallback() {
        return this.f65886b;
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65892a = new d();

        static {
            Covode.recordClassIndex(40548);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.c invoke() {
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
            if (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c)) {
                return null;
            }
            return a2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bk));
        setOnClickListener(new e(this));
    }

    public final void setCallback(a aVar) {
        this.f65886b = aVar;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveAwardMask f65888a;

        static {
            Covode.recordClassIndex(40545);
        }

        b(FeedAdInteractiveAwardMask feedAdInteractiveAwardMask) {
            this.f65888a = feedAdInteractiveAwardMask;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a callback = this.f65888a.getCallback();
            if (callback != null) {
                callback.a(true);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveAwardMask f65893a;

        static {
            Covode.recordClassIndex(40549);
        }

        e(FeedAdInteractiveAwardMask feedAdInteractiveAwardMask) {
            this.f65893a = feedAdInteractiveAwardMask;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a callback = this.f65893a.getCallback();
            if (callback != null) {
                callback.a(true);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveAwardMask f65889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f65890b;

        static {
            Covode.recordClassIndex(40546);
        }

        c(FeedAdInteractiveAwardMask feedAdInteractiveAwardMask, Aweme aweme) {
            this.f65889a = feedAdInteractiveAwardMask;
            this.f65890b = aweme;
        }

        public final void onClick(View view) {
            AwemeRawAd awemeRawAd;
            ClickAgent.onClick(view);
            a callback = this.f65889a.getCallback();
            if (callback != null) {
                callback.a(false);
            }
            com.ss.android.ugc.aweme.ad.feed.c feedAdDepend = this.f65889a.getFeedAdDepend();
            if (feedAdDepend != null) {
                feedAdDepend.a(this.f65889a.getContext(), this.f65890b, 48, AnonymousClass1.f65891a);
            }
            Aweme aweme = this.f65890b;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click", awemeRawAd).b("refer", "popup_window").b();
        }
    }

    private /* synthetic */ FeedAdInteractiveAwardMask(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveAwardMask(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3581);
        this.f65885a = i.a((h.f.a.a) d.f65892a);
        MethodCollector.o(3581);
    }
}

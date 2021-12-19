package com.ss.android.ugc.aweme.ad.feed.sticker;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.ad.feed.e;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.commercialize.model.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;

public final class a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, e {

    /* renamed from: f  reason: collision with root package name */
    public static final C1476a f66021f = new C1476a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FeedAdLynxSticker f66022a;

    /* renamed from: b  reason: collision with root package name */
    m f66023b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f66024c;

    /* renamed from: d  reason: collision with root package name */
    ao f66025d;

    /* renamed from: e  reason: collision with root package name */
    public String f66026e;

    /* renamed from: g  reason: collision with root package name */
    private Aweme f66027g;

    /* renamed from: h  reason: collision with root package name */
    private DataCenter f66028h;

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout f66029i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f66030j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private ViewStub f66031k;

    static {
        Covode.recordClassIndex(40608);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.a$a  reason: collision with other inner class name */
    public static final class C1476a {
        static {
            Covode.recordClassIndex(40609);
        }

        private C1476a() {
        }

        public /* synthetic */ C1476a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final boolean c() {
        return this.f66024c;
    }

    public final boolean d() {
        m mVar = this.f66023b;
        if (mVar == null || mVar.getShowSeconds() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a() {
        FeedAdLynxSticker feedAdLynxSticker;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.Q(this.f66027g) && !this.f66024c && (feedAdLynxSticker = this.f66022a) != null) {
            feedAdLynxSticker.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void b() {
        FrameLayout frameLayout = this.f66029i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f66024c = false;
        this.f66030j.removeCallbacksAndMessages(null);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f66032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f66033b;

        static {
            Covode.recordClassIndex(40610);
        }

        b(a aVar, FrameLayout frameLayout) {
            this.f66032a = aVar;
            this.f66033b = frameLayout;
        }

        public final void run() {
            FeedAdLynxSticker feedAdLynxSticker;
            FeedAdLynxSticker feedAdLynxSticker2;
            int width;
            int height;
            int i2;
            int i3;
            int i4;
            int i5;
            FeedAdLynxSticker feedAdLynxSticker3 = this.f66032a.f66022a;
            if (feedAdLynxSticker3 == null || !feedAdLynxSticker3.f65929d) {
                this.f66032a.f66026e = "data_load_fail";
                if (this.f66032a.d() && (feedAdLynxSticker = this.f66032a.f66022a) != null) {
                    feedAdLynxSticker.b(this.f66032a.f66026e);
                    return;
                }
                return;
            }
            FeedAdLynxSticker feedAdLynxSticker4 = this.f66032a.f66022a;
            if (feedAdLynxSticker4 == null || !feedAdLynxSticker4.f66017j) {
                this.f66032a.f66026e = "load_timeout";
                if (this.f66032a.d() && (feedAdLynxSticker2 = this.f66032a.f66022a) != null) {
                    feedAdLynxSticker2.b(this.f66032a.f66026e);
                    return;
                }
                return;
            }
            a aVar = this.f66032a;
            FrameLayout frameLayout = this.f66033b;
            ViewParent parent = frameLayout.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            m mVar = aVar.f66023b;
            if (mVar != null) {
                ao aoVar = aVar.f66025d;
                if (aoVar != null) {
                    width = aoVar.f74868a;
                } else {
                    width = viewGroup.getWidth();
                }
                ao aoVar2 = aVar.f66025d;
                if (aoVar2 != null) {
                    height = aoVar2.f74869b;
                } else {
                    height = viewGroup.getHeight();
                }
                if (width < viewGroup.getWidth()) {
                    i2 = (viewGroup.getWidth() - width) / 2;
                } else {
                    i2 = 0;
                }
                if (height < viewGroup.getHeight()) {
                    i3 = (viewGroup.getHeight() - height) / 2;
                } else {
                    i3 = 0;
                }
                float f2 = (float) width;
                float f3 = (float) height;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (mVar.getWidth() * f2), (int) (mVar.getHeight() * f3));
                BulletContainerView bulletContainerView = (BulletContainerView) frameLayout.findViewById(R.id.a0e);
                l.b(bulletContainerView, "");
                bulletContainerView.setLayoutParams(layoutParams);
                if (width > viewGroup.getWidth()) {
                    i4 = (width - viewGroup.getWidth()) / 2;
                } else {
                    i4 = 0;
                }
                if (height > viewGroup.getHeight()) {
                    i5 = (height - viewGroup.getHeight()) / 2;
                } else {
                    i5 = 0;
                }
                float positionX = ((f2 * mVar.getPositionX()) - ((float) i4)) + ((float) i2);
                float positionY = ((f3 * mVar.getPositionY()) - ((float) i5)) + ((float) i3);
                if (gb.a()) {
                    positionX = -positionX;
                }
                frameLayout.setTranslationX(positionX);
                frameLayout.setTranslationY(positionY);
                frameLayout.setRotation(mVar.getAngle());
            }
            this.f66033b.setVisibility(0);
            if (this.f66032a.d()) {
                FeedAdLynxSticker feedAdLynxSticker5 = this.f66032a.f66022a;
                if (feedAdLynxSticker5 != null) {
                    feedAdLynxSticker5.f();
                }
                FeedAdLynxSticker feedAdLynxSticker6 = this.f66032a.f66022a;
                if (feedAdLynxSticker6 != null) {
                    feedAdLynxSticker6.a("event_card_show");
                }
            }
            this.f66032a.f66024c = true;
        }
    }

    public a(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f66031k = viewStub;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a(long j2) {
        FrameLayout frameLayout;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.Q(this.f66027g) && (frameLayout = this.f66029i) != null && !this.f66024c) {
            this.f66030j.postDelayed(new b(this, frameLayout), j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a(DataCenter dataCenter) {
        this.f66028h = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_bind_texture_size", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        MethodCollector.i(150);
        m mVar = null;
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.Q(aweme)) {
            this.f66027g = null;
            FeedAdLynxSticker feedAdLynxSticker = this.f66022a;
            if (feedAdLynxSticker != null) {
                feedAdLynxSticker.a((Aweme) null);
                MethodCollector.o(150);
                return;
            }
            MethodCollector.o(150);
            return;
        }
        this.f66027g = aweme;
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            mVar = awemeRawAd.getStickerData();
        }
        this.f66023b = mVar;
        if (this.f66031k.getParent() != null) {
            this.f66031k.setLayoutResource(R.layout.afd);
            View inflate = this.f66031k.inflate();
            if (inflate != null) {
                this.f66029i = (FrameLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.o(150);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = this.f66029i;
        if (frameLayout == null) {
            MethodCollector.o(150);
            return;
        }
        if (this.f66022a == null) {
            this.f66022a = new FeedAdLynxSticker(frameLayout, this);
        }
        FeedAdLynxSticker feedAdLynxSticker2 = this.f66022a;
        if (feedAdLynxSticker2 != null) {
            feedAdLynxSticker2.a(aweme);
        }
        b();
        MethodCollector.o(150);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.Q(this.f66027g) && bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1304146782) {
                    if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                        FeedAdLynxSticker feedAdLynxSticker = this.f66022a;
                        if (feedAdLynxSticker != null) {
                            EventBus.a(EventBus.a(), feedAdLynxSticker);
                        }
                        m mVar = this.f66023b;
                        if (mVar != null && mVar.getShowSeconds() == 0) {
                            if (this.f66024c) {
                                FeedAdLynxSticker feedAdLynxSticker2 = this.f66022a;
                                if (feedAdLynxSticker2 != null) {
                                    feedAdLynxSticker2.f();
                                    return;
                                }
                                return;
                            }
                            FeedAdLynxSticker feedAdLynxSticker3 = this.f66022a;
                            if (feedAdLynxSticker3 != null) {
                                feedAdLynxSticker3.b(this.f66026e);
                            }
                        }
                    }
                } else if (str.equals("ad_feed_bind_texture_size")) {
                    Object a2 = bVar2.a();
                    l.b(a2, "");
                    this.f66025d = (ao) a2;
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                FeedAdLynxSticker feedAdLynxSticker4 = this.f66022a;
                if (feedAdLynxSticker4 != null) {
                    EventBus.a().b(feedAdLynxSticker4);
                }
                if (d()) {
                    b();
                }
            }
        }
    }
}

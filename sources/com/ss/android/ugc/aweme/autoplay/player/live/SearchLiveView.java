package com.ss.android.ugc.aweme.autoplay.player.live;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class SearchLiveView extends FrameLayout implements b.d, b {

    /* renamed from: a  reason: collision with root package name */
    public final d f67491a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67492b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67493c;

    /* renamed from: d  reason: collision with root package name */
    private final h f67494d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f67495e;

    static {
        Covode.recordClassIndex(41552);
    }

    public SearchLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public final e getDataProvider() {
        return (e) this.f67494d.getValue();
    }

    public final d getLiveCore() {
        return this.f67491a;
    }

    public final ImageView getMCoverView() {
        return this.f67495e;
    }

    public final boolean getOutCorner() {
        return this.f67493c;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return this.f67491a;
    }

    private final b.c getMediaHelper() {
        return getDataProvider().f67521e;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void d() {
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void f() {
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void g() {
        a aVar = getDataProvider().f67529m;
    }

    public final String getLivePlayerTag() {
        return this.f67491a.getLivePlayerTag();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void h() {
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void i() {
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void l() {
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return this.f67491a.getMLiveStarted();
    }

    static final class a extends m implements h.f.a.a<e> {
        final /* synthetic */ SearchLiveView this$0;

        static {
            Covode.recordClassIndex(41555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SearchLiveView searchLiveView) {
            super(0);
            this.this$0 = searchLiveView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return this.this$0.getLiveCore().getDataProvider();
        }
    }

    private final void n() {
        this.f67491a.c();
        this.f67492b = true;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        b.c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void b() {
        n();
        a aVar = getDataProvider().f67529m;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void e() {
        this.f67491a.b();
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void j() {
        n();
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void k() {
        this.f67492b = true;
        a aVar = getDataProvider().f67529m;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        b.c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.a(150);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        b.c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        b.c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a() {
        LiveRoomStruct b2 = getDataProvider().b();
        if ((b2 == null || !b2.liveTypeAudio) && this.f67492b) {
            this.f67492b = false;
            this.f67491a.d();
        }
        a aVar = getDataProvider().f67529m;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void c() {
        if (!this.f67493c && Build.VERSION.SDK_INT >= 21 && getContext() != null) {
            setOutlineProvider(new b(this));
            setClipToOutline(true);
        }
        a aVar = getDataProvider().f67529m;
    }

    public final void setOutCorner(boolean z) {
        this.f67493c = z;
    }

    public static final class b extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchLiveView f67496a;

        static {
            Covode.recordClassIndex(41556);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SearchLiveView searchLiveView) {
            this.f67496a = searchLiveView;
        }

        public final void getOutline(View view, Outline outline) {
            l.d(view, "");
            l.d(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), n.b(this.f67496a.getContext(), 2.0f));
        }
    }

    public final void setMCoverView(ImageView imageView) {
        this.f67495e = imageView;
        this.f67491a.setMCoverView(imageView);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(String str) {
        l.d(str, "");
        if (getDataProvider().f67529m != null) {
            l.d(str, "");
        }
    }

    private /* synthetic */ SearchLiveView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(View view, int i2, int i3) {
        a aVar = getDataProvider().f67529m;
        if (aVar != null) {
            aVar.a(view, i2, i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchLiveView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2769);
        d dVar = new d(context, attributeSet, 0);
        this.f67491a = dVar;
        this.f67494d = i.a((h.f.a.a) new a(this));
        this.f67492b = true;
        dVar.a(new h.f.a.a<b>(this) {
            /* class com.ss.android.ugc.aweme.autoplay.player.live.SearchLiveView.AnonymousClass1 */
            final /* synthetic */ SearchLiveView this$0;

            static {
                Covode.recordClassIndex(41553);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ b invoke() {
                return new f(this.this$0.getDataProvider());
            }
        });
        dVar.a(new h.f.a.a<b>(this) {
            /* class com.ss.android.ugc.aweme.autoplay.player.live.SearchLiveView.AnonymousClass2 */
            final /* synthetic */ SearchLiveView this$0;

            static {
                Covode.recordClassIndex(41554);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ b invoke() {
                return this.this$0;
            }
        });
        addView(dVar);
        MethodCollector.o(2769);
    }
}

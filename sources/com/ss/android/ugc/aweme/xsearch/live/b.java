package com.ss.android.ugc.aweme.xsearch.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.live.f;
import com.ss.android.ugc.aweme.autoplay.player.live.g;
import com.ss.android.ugc.aweme.autoplay.player.live.i;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.v;
import h.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b extends FrameLayout implements b.d, com.ss.android.ugc.aweme.autoplay.player.live.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145241a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f145242b;

    /* renamed from: c  reason: collision with root package name */
    private int f145243c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f145244d;

    /* renamed from: e  reason: collision with root package name */
    private m<? super String, ? super Map<String, ? extends Object>, z> f145245e;

    /* renamed from: f  reason: collision with root package name */
    private String f145246f;

    /* renamed from: g  reason: collision with root package name */
    private SmartImageView f145247g;

    /* renamed from: h  reason: collision with root package name */
    private final h f145248h;

    /* renamed from: i  reason: collision with root package name */
    private final h f145249i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f145250j;

    static {
        Covode.recordClassIndex(94970);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(View view, int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void g() {
    }

    public final com.ss.android.ugc.aweme.autoplay.player.live.e getDataProvider() {
        return (com.ss.android.ugc.aweme.autoplay.player.live.e) this.f145249i.getValue();
    }

    public final com.ss.android.ugc.aweme.autoplay.player.live.d getLiveCore() {
        return (com.ss.android.ugc.aweme.autoplay.player.live.d) this.f145248h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void k() {
        this.f145250j = true;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void l() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94971);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void b() {
        n();
    }

    public final boolean getOutCorner() {
        return this.f145242b;
    }

    private final Aweme getMAweme() {
        return getDataProvider().f67523g;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void e() {
        getLiveCore().b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return getLiveCore();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.live.b$b  reason: collision with other inner class name */
    static final class C3860b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.live.e> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3860b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.live.e invoke() {
            return this.this$0.getLiveCore().getDataProvider();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.live.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.live.b invoke() {
            return new f(this.this$0.getDataProvider());
        }
    }

    private final void n() {
        this.f145250j = true;
        getLiveCore().c();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        b.c cVar = getDataProvider().f67521e;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void j() {
        n();
        a(this, "ended");
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return getLiveCore().getMLiveStarted();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        b.c cVar = getDataProvider().f67521e;
        if (cVar != null) {
            cVar.a(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        b.c cVar = getDataProvider().f67521e;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        b.c cVar = getDataProvider().f67521e;
        if (cVar != null) {
            cVar.f();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.live.d> {
        final /* synthetic */ AttributeSet $attrs = null;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $defStyleAttr = 0;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, Context context, AttributeSet attributeSet, int i2) {
            super(0);
            this.this$0 = bVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.live.d invoke() {
            com.ss.android.ugc.aweme.autoplay.player.live.d dVar = new com.ss.android.ugc.aweme.autoplay.player.live.d(this.$context, this.$attrs, this.$defStyleAttr);
            dVar.a(new h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.live.b>(this) {
                /* class com.ss.android.ugc.aweme.xsearch.live.b.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(94977);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.live.b invoke() {
                    return this.this$0.this$0;
                }
            });
            this.this$0.addView(dVar);
            return dVar;
        }
    }

    private final void o() {
        com.ss.android.ugc.aweme.autoplay.e.a.b(getLiveCore());
        b.c cVar = getDataProvider().f67521e;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a() {
        LiveRoomStruct b2 = getDataProvider().b();
        if ((b2 == null || !b2.liveTypeAudio) && this.f145250j) {
            this.f145250j = false;
            getLiveCore().d();
        }
        a(this, "play");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        if (this.f145244d) {
            A();
            com.ss.android.ugc.aweme.autoplay.e.a.a(getLiveCore());
        }
        ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.put(str, new WeakReference<>(getDataProvider().f67524h));
    }

    public final void setEventChangeListener(m<? super String, ? super Map<String, ? extends Object>, z> mVar) {
        this.f145245e = mVar;
    }

    public final void setOutCorner(boolean z) {
        this.f145242b = z;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().f67523g = aweme;
    }

    public final void setAutoPlay(boolean z) {
        this.f145244d = z;
        if (!z) {
            o();
        }
    }

    public final void setMuted(boolean z) {
        getLiveCore().setMute(z);
    }

    private final boolean b(String str) {
        if (!TextUtils.equals(this.f145246f, str)) {
            return true;
        }
        return false;
    }

    static final class d extends h.f.b.m implements h.f.a.b<i, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(94974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i iVar) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            iVar2.a(new h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.live.d>(this) {
                /* class com.ss.android.ugc.aweme.xsearch.live.b.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(94975);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.live.d invoke() {
                    return this.this$0.this$0.getLiveCore();
                }
            });
            return z.f158842a;
        }
    }

    public final void setObjectFit(String str) {
        int i2;
        l.d(str, "");
        com.ss.android.ugc.aweme.autoplay.player.live.d liveCore = getLiveCore();
        if (str.hashCode() == 3143043 && str.equals("fill")) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        liveCore.setFitType(i2);
    }

    public final void setLogExtra(HashMap<String, Object> hashMap) {
        l.d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    String key = entry.getKey();
                    GsonProvider c2 = GsonHolder.c();
                    l.b(c2, "");
                    String b2 = c2.b().b(entry.getValue());
                    l.b(b2, "");
                    hashMap2.put(key, b2);
                } else {
                    hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        r rVar = getDataProvider().f67524h;
        if (rVar != null) {
            rVar.a(hashMap2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r3 != null) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSessionId(int r5) {
        /*
            r4 = this;
            r4.f145243c = r5
            com.ss.android.ugc.aweme.xsearch.d r1 = com.ss.android.ugc.aweme.xsearch.d.f145151b
            int r0 = r4.f145243c
            com.ss.android.ugc.aweme.xsearch.c r3 = r1.b(r0)
            if (r3 == 0) goto L_0x0013
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f145143d = r0
        L_0x0013:
            com.ss.android.ugc.aweme.autoplay.player.live.e r0 = r4.getDataProvider()
            com.ss.android.ugc.aweme.autoplay.player.b$c r1 = r0.f67521e
            if (r1 == 0) goto L_0x004e
            if (r3 == 0) goto L_0x002f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r3.f145144e = r0
        L_0x0024:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.ss.android.ugc.aweme.autoplay.player.live.d r0 = r4.getLiveCore()
            r1.<init>(r0)
            r3.f145148i = r1
        L_0x002f:
            r2 = 0
            if (r3 == 0) goto L_0x004c
            com.ss.android.ugc.aweme.search.k.r r1 = r3.f145142c
        L_0x0034:
            com.ss.android.ugc.aweme.autoplay.player.live.e r0 = r4.getDataProvider()
            com.ss.android.ugc.aweme.search.k.r r0 = r0.f67524h
            if (r0 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.w
        L_0x003e:
            if (r1 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x0045
            r1.a(r2)
        L_0x0045:
            com.ss.android.ugc.aweme.autoplay.player.live.e r0 = r4.getDataProvider()
            r0.f67524h = r1
        L_0x004b:
            return
        L_0x004c:
            r1 = r2
            goto L_0x0034
        L_0x004e:
            if (r3 == 0) goto L_0x002f
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.xsearch.live.b.setSessionId(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        com.ss.android.ugc.aweme.xsearch.c b2;
        l.d(context, "");
        MethodCollector.i(486);
        this.f145243c = -1;
        this.f145244d = true;
        this.f145248h = h.i.a((h.f.a.a) new e(this, context, null, 0));
        this.f145249i = h.i.a((h.f.a.a) new C3860b(this));
        this.f145250j = true;
        getDataProvider().f67524h = r.a.a();
        com.a.a(LayoutInflater.from(getContext()), R.layout.axo, this, true);
        this.f145247g = (SmartImageView) findViewById(R.id.bs4);
        getLiveCore().setMCoverView(this.f145247g);
        getDataProvider().f67521e = g.a(new d(this));
        b.c cVar = getDataProvider().f67521e;
        if (!(cVar == null || (b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(this.f145243c)) == null)) {
            b2.f145144e = new WeakReference<>(cVar);
        }
        getDataProvider().f67518b = new com.ss.android.ugc.aweme.xsearch.e(getLiveCore());
        getLiveCore().a(new c(this));
        MethodCollector.o(486);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(String str) {
        l.d(str, "");
        a("error", ag.c(v.a("error", str)));
    }

    public final void setAwemeIndex(a aVar) {
        com.ss.android.ugc.aweme.discover.mixfeed.d dVar;
        List<Aweme> awemeList;
        UrlModel urlModel;
        String str = "";
        l.d(aVar, str);
        getDataProvider().f67522f = aVar.f145239a;
        com.ss.android.ugc.aweme.xsearch.c b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(this.f145243c);
        if (b2 != null && (dVar = b2.f145149j) != null && (awemeList = dVar.getAwemeList()) != null) {
            Aweme aweme = awemeList.get(aVar.f145240b);
            l.b(aweme, str);
            Aweme aweme2 = aweme;
            l.d(aweme2, str);
            A();
            this.f145250j = true;
            SmartImageView smartImageView = this.f145247g;
            User author = aweme2.getAuthor();
            r rVar = null;
            if (author != null) {
                urlModel = author.roomCover;
            } else {
                urlModel = null;
            }
            if (smartImageView != null) {
                smartImageView.setPlaceholderImage(R.drawable.b1c);
                if (urlModel != null) {
                    com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
                    a2.E = smartImageView;
                    a2.c();
                }
            }
            getLiveCore().a(aweme2);
            getLiveCore().b();
            ConcurrentHashMap<String, WeakReference<r>> concurrentHashMap = com.ss.android.ugc.aweme.search.r.b.n;
            String aid = aweme2.getAid();
            if (aid != null) {
                str = aid;
            }
            com.ss.android.ugc.aweme.autoplay.player.live.e dataProvider = getDataProvider();
            if (dataProvider != null) {
                rVar = dataProvider.f67524h;
            }
            concurrentHashMap.put(str, new WeakReference<>(rVar));
            setMAweme(aweme2);
        }
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    private static /* synthetic */ void a(b bVar, String str) {
        bVar.a(str, new HashMap());
    }

    private final void a(String str, Map<String, ? extends Object> map) {
        if (b(str)) {
            this.f145246f = str;
            m<? super String, ? super Map<String, ? extends Object>, z> mVar = this.f145245e;
            if (mVar != null) {
                mVar.invoke(str, map);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.flowfeed.a.a aVar, r rVar) {
        String str;
        User author;
        getDataProvider().f67517a = aVar;
        getDataProvider().f67524h = rVar;
        r rVar2 = getDataProvider().f67524h;
        if (rVar2 != null) {
            Aweme mAweme = getMAweme();
            if (mAweme == null || (author = mAweme.getAuthor()) == null) {
                str = null;
            } else {
                str = author.roomIdStr;
            }
            rVar2.b(str);
        }
    }
}

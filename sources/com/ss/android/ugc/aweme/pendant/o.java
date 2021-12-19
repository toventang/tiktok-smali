package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import b.g;
import b.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.pendant.b;
import com.ss.android.ugc.aweme.pendant.i;
import com.ss.android.ugc.aweme.pendant.k;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class o implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final a f114721m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final UgAwemeActivitySetting f114722a;

    /* renamed from: b  reason: collision with root package name */
    public p f114723b;

    /* renamed from: c  reason: collision with root package name */
    public final View f114724c;

    /* renamed from: d  reason: collision with root package name */
    public int f114725d;

    /* renamed from: e  reason: collision with root package name */
    public int f114726e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f114727f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f114728g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f114729h;

    /* renamed from: i  reason: collision with root package name */
    public final String f114730i = "newpendant";

    /* renamed from: j  reason: collision with root package name */
    public final c f114731j = new j();

    /* renamed from: k  reason: collision with root package name */
    public String f114732k = "";

    /* renamed from: l  reason: collision with root package name */
    public final e f114733l;
    private int n = 3;
    private boolean o;
    private boolean p;
    private List<Integer> q;

    static {
        Covode.recordClassIndex(73819);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73820);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void d() {
        p pVar = this.f114723b;
        if (pVar != null) {
            pVar.b();
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f114734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f114735b;

        static {
            Covode.recordClassIndex(73821);
        }

        b(o oVar, Context context) {
            this.f114734a = oVar;
            this.f114735b = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.f114734a.b(this.f114735b));
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f114736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f114737b;

        static {
            Covode.recordClassIndex(73822);
        }

        c(o oVar, Context context) {
            this.f114736a = oVar;
            this.f114737b = context;
        }

        public static final class a implements l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f114738a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k.a f114739b;

            static {
                Covode.recordClassIndex(73823);
            }

            @Override // com.ss.android.ugc.aweme.pendant.l
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.pendant.l
            public final void a() {
                try {
                    this.f114739b.f114712a = this.f114738a.f114736a.f114731j.a(0);
                    this.f114739b.f114713b = this.f114738a.f114736a.f114731j.a(1);
                    this.f114739b.f114714c = this.f114738a.f114736a.f114731j.a();
                    p pVar = this.f114738a.f114736a.f114723b;
                    if (pVar != null) {
                        pVar.a(this.f114739b.a());
                    }
                } catch (Exception unused) {
                }
            }

            a(c cVar, k.a aVar) {
                this.f114738a = cVar;
                this.f114739b = aVar;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(73824);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String str;
                b.C2935b.f114627a.b();
                if (this.this$0.f114736a.f114723b != null) {
                    p pVar = this.this$0.f114736a.f114723b;
                    if (pVar == null) {
                        l.b();
                    }
                    boolean z = !pVar.getCollapsed();
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    if (z) {
                        str = "big";
                    } else {
                        str = "small";
                    }
                    r.a("homepage_decoration_close", dVar.a("decoration_type", str).f66730a);
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.pendant.o$c$c  reason: collision with other inner class name */
        public static final class C2937c extends m implements h.f.a.a<z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(73825);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2937c(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                p pVar = this.this$0.f114736a.f114723b;
                if (pVar == null || !pVar.getCollapsed() || !this.this$0.f114736a.f114727f) {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting = this.this$0.f114736a.f114722a;
                        if (ugAwemeActivitySetting == null) {
                            l.b();
                        }
                        UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                        l.b(newFeedPendant, "");
                        String h5Link = newFeedPendant.getH5Link();
                        if (this.this$0.f114737b != null) {
                            UgAllServiceImpl.c().a(this.this$0.f114737b, h5Link);
                            r.a("enter_activity_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "feed").f66730a);
                        }
                    } catch (com.bytedance.ies.a unused) {
                    }
                } else {
                    p pVar2 = this.this$0.f114736a.f114723b;
                    if (pVar2 != null) {
                        pVar2.a((h.f.a.a<z>) null);
                    }
                    this.this$0.f114736a.f114725d = 0;
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d extends m implements h.f.a.a<z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(73826);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                r.a("homepage_decoration_show", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                if (this.this$0.f114736a.a()) {
                    p pVar = this.this$0.f114736a.f114723b;
                    if (pVar != null) {
                        pVar.a();
                    }
                    if (this.this$0.f114737b != null) {
                        b bVar = b.C2935b.f114627a;
                        l.d(this.this$0.f114737b, "");
                        Calendar instance = Calendar.getInstance();
                        l.b(instance, "");
                        instance.setTimeInMillis(System.currentTimeMillis());
                        instance.set(11, 0);
                        instance.set(12, 0);
                        instance.set(13, 0);
                        instance.set(14, 0);
                        bVar.a().storeString(b.f114615b, String.valueOf(instance.getTimeInMillis()));
                        b.C2935b.f114627a.a(this.this$0.f114737b);
                    }
                }
                AwemeChangeCallBack.a(this.this$0.f114736a.f114733l, this.this$0.f114736a.f114733l, new AwemeChangeCallBack.a(this) {
                    /* class com.ss.android.ugc.aweme.pendant.o.c.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f114740a;

                    static {
                        Covode.recordClassIndex(73827);
                    }

                    {
                        this.f114740a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
                    public final void a(Aweme aweme) {
                        this.f114740a.this$0.f114736a.b(true);
                    }
                });
                com.ss.android.ugc.aweme.share.viewmodel.a a2 = a.C3244a.a(this.this$0.f114736a.f114733l);
                AnonymousClass2 r1 = new a.b(this) {
                    /* class com.ss.android.ugc.aweme.pendant.o.c.d.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f114741a;

                    static {
                        Covode.recordClassIndex(73828);
                    }

                    @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
                    public final void a() {
                        p pVar = this.f114741a.this$0.f114736a.f114723b;
                        if (pVar != null) {
                            pVar.b();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
                    public final void b() {
                        p pVar;
                        if (this.f114741a.this$0.f114736a.a() && (pVar = this.f114741a.this$0.f114736a.f114723b) != null) {
                            pVar.a();
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f114741a = r1;
                    }
                };
                l.d(r1, "");
                a2.a("long_press_layer", r1);
                com.ss.android.ugc.aweme.share.viewmodel.a a3 = a.C3244a.a(this.this$0.f114736a.f114733l);
                AnonymousClass3 r12 = new a.b(this) {
                    /* class com.ss.android.ugc.aweme.pendant.o.c.d.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f114742a;

                    static {
                        Covode.recordClassIndex(73829);
                    }

                    @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
                    public final void a() {
                        p pVar = this.f114742a.this$0.f114736a.f114723b;
                        if (pVar != null) {
                            pVar.b();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
                    public final void b() {
                        p pVar;
                        if (this.f114742a.this$0.f114736a.a() && (pVar = this.f114742a.this$0.f114736a.f114723b) != null) {
                            pVar.a();
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f114742a = r1;
                    }
                };
                l.d(r12, "");
                a3.a("upload_progress_fragment", r12);
                return z.f158842a;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(i<Boolean> iVar) {
            int i2;
            UgNewFeedPendant newFeedPendant;
            List<UrlModel> resourceUrl;
            List<String> list;
            List<String> list2;
            UgNewFeedPendant newFeedPendant2;
            UgNewFeedPendant newFeedPendant3;
            UgNewFeedPendant newFeedPendant4;
            List<UrlModel> resourceUrl2;
            String str;
            List<String> list3;
            UgNewFeedPendant newFeedPendant5;
            UgNewFeedPendant newFeedPendant6;
            MethodCollector.i(6837);
            l.b(iVar, "");
            Boolean d2 = iVar.d();
            l.b(d2, "");
            if (d2.booleanValue()) {
                i.a aVar = new i.a();
                C2937c cVar = new C2937c(this);
                b bVar = new b(this);
                d dVar = new d(this);
                aVar.f114680a = this.f114736a.f114728g;
                aVar.f114681b = this.f114736a.f114729h;
                aVar.f114682c = cVar;
                aVar.f114683d = bVar;
                aVar.f114684e = dVar;
                this.f114736a.f114723b = new p(this.f114736a.f114726e, new i(aVar, (byte) 0), this.f114737b, (byte) 0);
                float e2 = ((float) n.e(this.f114737b)) + 0.0f;
                if (this.f114736a.f114724c instanceof FrameLayout) {
                    ((FrameLayout) this.f114736a.f114724c).addView(this.f114736a.f114723b);
                }
                int c2 = n.c(this.f114736a.f114733l, e2);
                o oVar = this.f114736a;
                int a2 = n.a(oVar.f114733l);
                if (n.b(oVar.f114733l) <= 1280 || a2 <= 720) {
                    i2 = 54;
                } else {
                    i2 = 64;
                }
                int i3 = c2 + i2;
                p pVar = this.f114736a.f114723b;
                if (pVar == null) {
                    l.b();
                }
                ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int i4 = layoutParams2.topMargin;
                    layoutParams2.topMargin = (int) n.b(this.f114736a.f114733l, (float) i3);
                    p pVar2 = this.f114736a.f114723b;
                    if (pVar2 == null) {
                        l.b();
                    }
                    pVar2.setLayoutParams(layoutParams);
                }
                k.a aVar2 = new k.a();
                int i5 = this.f114736a.f114726e;
                if (i5 == 0) {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting = this.f114736a.f114722a;
                        if (ugAwemeActivitySetting == null || (newFeedPendant3 = ugAwemeActivitySetting.getNewFeedPendant()) == null) {
                            list = null;
                        } else {
                            list = newFeedPendant3.getBigPngFragmentsUrls();
                        }
                        aVar2.f114717f = list;
                        UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f114736a.f114722a;
                        if (ugAwemeActivitySetting2 == null || (newFeedPendant2 = ugAwemeActivitySetting2.getNewFeedPendant()) == null) {
                            list2 = null;
                        } else {
                            list2 = newFeedPendant2.getSmallPngFragmentsUrls();
                        }
                        aVar2.f114718g = list2;
                    } catch (com.bytedance.ies.a unused) {
                    }
                    UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f114736a.f114722a;
                    if (!(ugAwemeActivitySetting3 == null || (newFeedPendant = ugAwemeActivitySetting3.getNewFeedPendant()) == null || (resourceUrl = newFeedPendant.getResourceUrl()) == null || resourceUrl.size() != 2)) {
                        aVar2.f114715d = resourceUrl.get(0);
                        aVar2.f114716e = resourceUrl.get(1);
                        p pVar3 = this.f114736a.f114723b;
                        if (pVar3 != null) {
                            pVar3.a(aVar2.a());
                        }
                    }
                } else if (i5 == 1) {
                    UgAwemeActivitySetting ugAwemeActivitySetting4 = this.f114736a.f114722a;
                    if (!(ugAwemeActivitySetting4 == null || (newFeedPendant4 = ugAwemeActivitySetting4.getNewFeedPendant()) == null || (resourceUrl2 = newFeedPendant4.getResourceUrl()) == null || resourceUrl2.size() != 2)) {
                        aVar2.f114715d = resourceUrl2.get(0);
                        aVar2.f114716e = resourceUrl2.get(1);
                        p pVar4 = this.f114736a.f114723b;
                        if (pVar4 != null) {
                            pVar4.a(aVar2.a());
                        }
                    }
                } else if (i5 == 2) {
                    a aVar3 = new a(this, aVar2);
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting5 = this.f114736a.f114722a;
                        if (ugAwemeActivitySetting5 == null || (newFeedPendant6 = ugAwemeActivitySetting5.getNewFeedPendant()) == null) {
                            str = null;
                        } else {
                            str = newFeedPendant6.getLottieFileMd5();
                        }
                        UgAwemeActivitySetting ugAwemeActivitySetting6 = this.f114736a.f114722a;
                        if (ugAwemeActivitySetting6 == null || (newFeedPendant5 = ugAwemeActivitySetting6.getNewFeedPendant()) == null) {
                            list3 = null;
                        } else {
                            list3 = newFeedPendant5.getLottieFileZip();
                        }
                        if (!(str == null || list3 == null)) {
                            this.f114736a.f114731j.a(this.f114736a.f114732k, list3, str);
                        }
                        this.f114736a.f114731j.a(aVar3);
                        this.f114736a.f114731j.a(this.f114737b);
                    } catch (com.bytedance.ies.a unused2) {
                    }
                }
            }
            MethodCollector.o(6837);
            return null;
        }
    }

    public final boolean a() {
        if (c() || !b() || this.o || a.C3244a.a(this.f114733l).a("long_press_layer") || a.C3244a.a(this.f114733l).a("upload_progress_fragment")) {
            return false;
        }
        return true;
    }

    private final boolean b() {
        e eVar = this.f114733l;
        if ((eVar instanceof j) && (((j) eVar).getCurFragment() instanceof com.ss.android.ugc.aweme.main.l)) {
            Fragment curFragment = ((j) this.f114733l).getCurFragment();
            Objects.requireNonNull(curFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
            if (((com.ss.android.ugc.aweme.main.l) curFragment).m()) {
                return true;
            }
        }
        e eVar2 = this.f114733l;
        if ((eVar2 instanceof j) && (((j) eVar2).getCurFragment() instanceof com.ss.android.ugc.aweme.main.l)) {
            Fragment curFragment2 = ((j) this.f114733l).getCurFragment();
            Objects.requireNonNull(curFragment2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
            if (((com.ss.android.ugc.aweme.main.l) curFragment2).n()) {
                return this.p;
            }
        }
        return false;
    }

    private final boolean c() {
        Aweme a2 = AwemeChangeCallBack.a(this.f114733l);
        if (a2 == null) {
            return true;
        }
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = a2.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.isAvoidGlobalPendant()) {
            return true;
        }
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(a2)) {
            return false;
        }
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.X(a2) || com.ss.android.ugc.aweme.commercialize.e.a.b.at(a2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pendant.e
    public final void a(boolean z) {
        this.o = z;
        b(false);
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (a()) {
            c(z);
        } else {
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.e
    public final void a(Context context) {
        if (context != null) {
            b.i.b(new b(this, context), b.i.f4824a).a(new c(this, context), b.i.f4826c, null);
        }
    }

    private final void c(boolean z) {
        p pVar;
        p pVar2 = this.f114723b;
        if (pVar2 != null && !pVar2.getClosed()) {
            pVar2.a();
        }
        p pVar3 = this.f114723b;
        if (pVar3 != null && pVar3.getVisibility() == 0 && z) {
            this.f114725d++;
        }
        if (this.f114725d >= this.n && (pVar = this.f114723b) != null) {
            pVar.c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:41|42|43|44|(1:46)|47|(1:49)|50|(1:52)|53|54|(1:56)|(3:57|58|(1:60)(1:68))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:20|21|22|23|25|26|27|28|29|30|31|32|33|34|37|(15:41|42|43|44|(1:46)|47|(1:49)|50|(1:52)|53|54|(1:56)|57|58|(1:60)(1:68))(1:40)) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r1 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x012d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0187 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102 A[Catch:{ a -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f A[Catch:{ a -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c A[Catch:{ a -> 0x012d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0186 A[Catch:{ a -> 0x0187 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a3 A[Catch:{ a -> 0x01a4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pendant.o.b(android.content.Context):boolean");
    }

    public o(View view, e eVar, UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(view, "");
        l.d(eVar, "");
        this.f114733l = eVar;
        this.f114722a = ugAwemeActivitySetting;
        this.f114724c = view;
    }
}

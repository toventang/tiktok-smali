package com.ss.android.ugc.aweme.ml.impl;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public final class MLCommonServiceImpl extends MLCommonService {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.b f110502a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ml.a.b f110503b;

    /* renamed from: c  reason: collision with root package name */
    boolean f110504c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.d.f<Boolean> f110505d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    private boolean f110506e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentHashMap<String, ArrayList<com.ss.android.ugc.aweme.ml.api.b>> f110507f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private int f110508g;

    static {
        Covode.recordClassIndex(70932);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void runInMainActivityOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final com.ss.android.ugc.aweme.ml.a.b getAwemeAdapter() {
        return this.f110503b;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f110510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MLCommonServiceImpl f110511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f110512c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f110513d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f110514e;

        static {
            Covode.recordClassIndex(70934);
        }

        b(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str, String str2) {
            this.f110510a = arrayList;
            this.f110511b = mLCommonServiceImpl;
            this.f110512c = aweme;
            this.f110513d = str;
            this.f110514e = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.ml.api.a aVar;
            if (this.f110512c != null) {
                aVar = new com.ss.android.ugc.aweme.ml.api.a(this.f110512c, this.f110513d);
            } else {
                aVar = null;
            }
            MLCommonServiceImpl.a(this.f110514e, aVar, this.f110510a);
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f110515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MLCommonServiceImpl f110516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f110517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f110518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f110519e;

        static {
            Covode.recordClassIndex(70935);
        }

        c(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str, boolean z) {
            this.f110515a = arrayList;
            this.f110516b = mLCommonServiceImpl;
            this.f110517c = aweme;
            this.f110518d = str;
            this.f110519e = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.ml.api.a aVar = new com.ss.android.ugc.aweme.ml.api.a(this.f110517c, this.f110518d);
            aVar.f110394b = this.f110519e;
            MLCommonServiceImpl.a("play_pause", aVar, this.f110515a);
            return z.f158842a;
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f110528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MLCommonServiceImpl f110529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f110530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f110531d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f110532e;

        static {
            Covode.recordClassIndex(70938);
        }

        f(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str, long j2) {
            this.f110528a = arrayList;
            this.f110529b = mLCommonServiceImpl;
            this.f110530c = aweme;
            this.f110531d = str;
            this.f110532e = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.ml.api.a aVar = new com.ss.android.ugc.aweme.ml.api.a(this.f110530c, this.f110531d);
            aVar.f110393a = this.f110532e;
            MLCommonServiceImpl.a("play_call_playtime", aVar, this.f110528a);
            return z.f158842a;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f110523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MLCommonServiceImpl f110524b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f110525c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f110526d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Aweme f110527e;

        static {
            Covode.recordClassIndex(70937);
        }

        e(ArrayList arrayList, MLCommonServiceImpl mLCommonServiceImpl, String str, String str2, Aweme aweme) {
            this.f110523a = arrayList;
            this.f110524b = mLCommonServiceImpl;
            this.f110525c = str;
            this.f110526d = str2;
            this.f110527e = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Aweme aweme;
            com.ss.android.ugc.aweme.ml.a.b bVar = this.f110524b.f110503b;
            if (bVar != null) {
                aweme = bVar.a(this.f110525c);
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.ml.api.a aVar = new com.ss.android.ugc.aweme.ml.api.a(aweme, this.f110526d);
            aVar.f110395c = this.f110527e;
            MLCommonServiceImpl.a("play_stop", aVar, this.f110523a);
            return z.f158842a;
        }
    }

    public static IMLCommonService a() {
        MethodCollector.i(6741);
        Object a2 = com.ss.android.ugc.b.a(IMLCommonService.class, false);
        if (a2 != null) {
            IMLCommonService iMLCommonService = (IMLCommonService) a2;
            MethodCollector.o(6741);
            return iMLCommonService;
        }
        if (com.ss.android.ugc.b.cD == null) {
            synchronized (IMLCommonService.class) {
                try {
                    if (com.ss.android.ugc.b.cD == null) {
                        com.ss.android.ugc.b.cD = new MLCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6741);
                    throw th;
                }
            }
        }
        MLCommonService mLCommonService = (MLCommonService) com.ss.android.ugc.b.cD;
        MethodCollector.o(6741);
        return mLCommonService;
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MLCommonServiceImpl f110520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f110521b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f110522c;

        static {
            Covode.recordClassIndex(70936);
        }

        d(MLCommonServiceImpl mLCommonServiceImpl, Aweme aweme, String str) {
            this.f110520a = mLCommonServiceImpl;
            this.f110521b = aweme;
            this.f110522c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            MLCommonServiceImpl mLCommonServiceImpl = this.f110520a;
            if (!mLCommonServiceImpl.f110504c) {
                mLCommonServiceImpl.f110504c = true;
                if (MLCommonService.debug) {
                    System.currentTimeMillis();
                }
                MLDataCenterService.b.f110379a.checkAndInit();
                SmartPlaytimePredictService.b.f110602a.checkAndInit();
                SmartCommonPreloadService.b.f110582a.checkAndInit();
                SmartFeedPreloadService.b.f110387a.checkAndInit();
                SmartFeedLoadMoreService.b.f110385a.checkAndInit();
                SmartFeedAdUIService.b.f110383a.checkAndInit();
                SmartDataTrackerService.b.f110381a.checkAndInit();
                mLCommonServiceImpl.f110502a = com.bytedance.ies.ugc.appcontext.f.g().d(mLCommonServiceImpl.f110505d);
                if (MLCommonService.debug) {
                    System.currentTimeMillis();
                }
            }
            ArrayList<com.ss.android.ugc.aweme.ml.api.b> a2 = this.f110520a.a("play_prepare");
            if (a2 == null) {
                return null;
            }
            MLCommonServiceImpl.a("play_prepare", new com.ss.android.ugc.aweme.ml.api.a(this.f110521b, this.f110522c), a2);
            return z.f158842a;
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MLCommonServiceImpl f110509a;

        static {
            Covode.recordClassIndex(70933);
        }

        a(MLCommonServiceImpl mLCommonServiceImpl) {
            this.f110509a = mLCommonServiceImpl;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f110509a.a("app_background", (Aweme) null, (String) null);
        }
    }

    public final ArrayList<com.ss.android.ugc.aweme.ml.api.b> a(String str) {
        MethodCollector.i(6731);
        ArrayList<com.ss.android.ugc.aweme.ml.api.b> arrayList = this.f110507f.get(str);
        if (arrayList != null) {
            l.b(arrayList, "");
            if (!arrayList.isEmpty()) {
                ArrayList<com.ss.android.ugc.aweme.ml.api.b> arrayList2 = new ArrayList<>();
                synchronized (arrayList) {
                    try {
                        arrayList2.addAll(arrayList);
                    } finally {
                        MethodCollector.o(6731);
                    }
                }
                return arrayList2;
            }
        }
        MethodCollector.o(6731);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        a("play_finish_first", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFirstFrame(Aweme aweme, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        a("play_first_frame", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayResume(Aweme aweme, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        a("play_resume", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void addCommonEventListener(String str, com.ss.android.ugc.aweme.ml.api.b bVar) {
        MethodCollector.i(6681);
        l.d(str, "");
        if (bVar == null) {
            MethodCollector.o(6681);
            return;
        }
        if (this.f110507f.get(str) == null) {
            this.f110507f.put(str, new ArrayList<>());
        }
        ArrayList<com.ss.android.ugc.aweme.ml.api.b> arrayList = this.f110507f.get(str);
        if (arrayList != null) {
            l.b(arrayList, "");
            synchronized (arrayList) {
                try {
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                } finally {
                    MethodCollector.o(6681);
                }
            }
            return;
        }
        MethodCollector.o(6681);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Aweme aweme, String str2) {
        ArrayList<com.ss.android.ugc.aweme.ml.api.b> a2 = a(str);
        if (a2 != null) {
            i.b(new b(a2, this, aweme, str2, str), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPause(Aweme aweme, String str, boolean z) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        ArrayList<com.ss.android.ugc.aweme.ml.api.b> a2 = a("play_pause");
        if (a2 != null) {
            i.b(new c(a2, this, aweme, str, z), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPrepare(Aweme aweme, String str, com.ss.android.ugc.aweme.ml.a.b bVar) {
        this.f110508g++;
        if (!l.a(bVar, this.f110503b)) {
            this.f110503b = bVar;
        }
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        if (!this.f110506e) {
            this.f110506e = true;
            i.b(new d(this, aweme, str), i.f4824a);
            return;
        }
        a("play_prepare", aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStop(String str, Aweme aweme, String str2) {
        Aweme a2;
        User author;
        if (MLCommonService.debug) {
            com.ss.android.ugc.aweme.ml.a.b bVar = this.f110503b;
            if (!(bVar == null || (a2 = bVar.a(str)) == null || (author = a2.getAuthor()) == null)) {
                author.getNickname();
            }
            if (aweme != null) {
                aweme.getAid();
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    author2.getNickname();
                }
            }
        }
        ArrayList<com.ss.android.ugc.aweme.ml.api.b> a3 = a("play_stop");
        if (a3 != null) {
            i.b(new e(a3, this, str, str2, aweme), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(Aweme aweme, long j2, String str) {
        if (MLCommonService.debug && aweme != null) {
            aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                author.getNickname();
            }
        }
        ArrayList<com.ss.android.ugc.aweme.ml.api.b> a2 = a("play_call_playtime");
        if (a2 != null) {
            i.b(new f(a2, this, aweme, str, j2), i.f4824a);
        }
    }

    public static void a(String str, com.ss.android.ugc.aweme.ml.api.a aVar, ArrayList<com.ss.android.ugc.aweme.ml.api.b> arrayList) {
        Aweme aweme;
        User author;
        if (MLCommonService.debug) {
            arrayList.size();
            if (!(aVar == null || (aweme = aVar.f110396d) == null || (author = aweme.getAuthor()) == null)) {
                author.getNickname();
            }
        }
        Iterator<com.ss.android.ugc.aweme.ml.api.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(str, aVar);
        }
    }
}

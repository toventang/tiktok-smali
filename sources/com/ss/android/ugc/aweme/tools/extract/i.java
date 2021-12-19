package com.ss.android.ugc.aweme.tools.extract;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import h.f.a.m;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i implements o {
    public static final int[] s = {360, 640};
    public static final a t = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ExtractFramesModel f140069a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f140070b;

    /* renamed from: c  reason: collision with root package name */
    public String f140071c;

    /* renamed from: d  reason: collision with root package name */
    public n f140072d;

    /* renamed from: e  reason: collision with root package name */
    public p f140073e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f140074f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public long f140075g;

    /* renamed from: h  reason: collision with root package name */
    public String f140076h;

    /* renamed from: i  reason: collision with root package name */
    public m<? super String, ? super String, String> f140077i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f140078j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<String, Boolean> f140079k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    public final Application f140080l;

    /* renamed from: m  reason: collision with root package name */
    public final String f140081m;
    public final com.ss.android.ugc.asve.recorder.c.a n;
    int o;
    int p;
    public final boolean q;
    public final v r;
    private String u;
    private ScheduledExecutorService v;
    private final boolean w;
    private final f x;

    public static final class a {
        static {
            Covode.recordClassIndex(91533);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final ExtractFramesModel e() {
        return this.f140069a;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final String f() {
        return this.u;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void c() {
        this.f140069a.removeLastSegment();
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void d() {
        this.f140069a.removeMultiImages();
    }

    static {
        Covode.recordClassIndex(91532);
    }

    private static ScheduledExecutorService g() {
        return (ScheduledExecutorService) g.a(l.a(o.SCHEDULED).a(1).a());
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void b() {
        this.f140070b = false;
        this.f140069a = new ExtractFramesModel(this.f140081m);
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.b(uuid, "");
        this.f140071c = uuid;
        ScheduledExecutorService scheduledExecutorService = this.v;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final String a() {
        p pVar = this.f140073e;
        if (pVar != null) {
            pVar.a();
        }
        if (!this.w) {
            return null;
        }
        this.f140070b = true;
        this.f140072d.a(this.f140077i.invoke(this.f140081m, this.f140071c), this.f140081m, this.f140071c);
        ExtractFramesModel extractFramesModel = this.f140069a;
        String str = this.f140072d.f140102b;
        String str2 = "";
        h.f.b.l.b(str, str2);
        extractFramesModel.setExtractFramesDir(str);
        this.u = UUID.randomUUID().toString();
        this.f140069a.addFrameSegment(new ArrayList<>(), this.u);
        int size = this.f140069a.getAllFrames().size();
        String str3 = this.u;
        if (str3 != null) {
            str2 = str3;
        }
        a(a(size, str2), 0);
        String str4 = this.u;
        if (str4 != null) {
            this.f140079k.put(str4, true);
        }
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f140082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f140083b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f140084c;

        static {
            Covode.recordClassIndex(91537);
        }

        d(i iVar, String str, int i2) {
            this.f140082a = iVar;
            this.f140083b = str;
            this.f140084c = i2;
        }

        public final void run() {
            boolean z;
            final String a2;
            int i2;
            int[] iArr;
            int i3;
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.f140082a.f140070b && !h.f.b.l.a((Object) this.f140082a.f140079k.get(this.f140083b), (Object) false)) {
                int i4 = this.f140084c;
                if (i4 == 2 || i4 == 4) {
                    this.f140082a.f140074f.set(true);
                }
                if (!this.f140082a.f140074f.get() || !this.f140082a.q || this.f140082a.r.a()) {
                    z = false;
                } else {
                    z = true;
                }
                n nVar = this.f140082a.f140072d;
                if (z) {
                    a2 = nVar.b();
                } else {
                    a2 = nVar.a();
                }
                h.f.b.l.b(a2, "");
                this.f140082a.f140075g = System.currentTimeMillis();
                i iVar = this.f140082a;
                if (z) {
                    if (iVar.p > iVar.o) {
                        i3 = 720;
                    } else {
                        i3 = 1280;
                    }
                    iArr = iVar.o > 720 ? new int[]{i3, (int) ((((float) iVar.p) / ((float) iVar.o)) * ((float) i3))} : new int[]{iVar.o, iVar.p};
                } else {
                    if (iVar.p > iVar.o) {
                        i2 = i.s[0];
                    } else {
                        i2 = i.s[1];
                    }
                    iArr = new int[]{i2, (int) ((((float) iVar.p) / ((float) iVar.o)) * ((float) i2))};
                }
                this.f140082a.f140074f.set(false);
                final long d2 = this.f140082a.n.d();
                this.f140082a.n.a(a2, iArr[0], iArr[1], this.f140082a.r.a(), Bitmap.CompressFormat.JPEG, (h.f.a.b<? super Integer, z>) new h.f.a.b<Integer, z>(this) {
                    /* class com.ss.android.ugc.aweme.tools.extract.i.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(91538);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Integer num) {
                        int i2;
                        final int intValue = num.intValue();
                        long currentTimeMillis = System.currentTimeMillis() - this.this$0.f140082a.f140075g;
                        b.i.a(new Callable<Object>(this) {
                            /* class com.ss.android.ugc.aweme.tools.extract.i.d.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f140085a;

                            static {
                                Covode.recordClassIndex(91539);
                            }

                            {
                                this.f140085a = r1;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                if (intValue == 0) {
                                    this.f140085a.this$0.f140082a.f140078j = true;
                                    ExtractFramesModel extractFramesModel = this.f140085a.this$0.f140082a.f140069a;
                                    FrameItem frameItem = new FrameItem(a2, 0, 0, 6, null);
                                    frameItem.setTimeStamp(d2);
                                    extractFramesModel.addFrameAtLastSegment(frameItem);
                                    return null;
                                }
                                com.ss.android.ugc.tools.c.f149151f.b("Default Frame Extractor Fail : ret " + intValue);
                                return null;
                            }
                        }, b.i.f4826c);
                        p pVar = this.this$0.f140082a.f140073e;
                        if (pVar != null) {
                            pVar.a(System.currentTimeMillis() - currentTimeMillis);
                        }
                        i iVar = this.this$0.f140082a;
                        Runnable a2 = this.this$0.f140082a.a(this.this$0.f140084c + 1, this.this$0.f140083b);
                        if (currentTimeMillis > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                            i2 = 0;
                        } else {
                            i2 = (int) (InteractFirstFrameTimeOutDurationSetting.DEFAULT - currentTimeMillis);
                        }
                        iVar.a(a2, i2);
                        return z.f158842a;
                    }
                }, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f140087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f140088b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f140089c;

        static {
            Covode.recordClassIndex(91540);
        }

        e(i iVar, List list, h.f.a.b bVar) {
            this.f140087a = iVar;
            this.f140088b = list;
            this.f140089c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if (h.m.p.e((java.lang.CharSequence) r1, (java.lang.CharSequence) r10.f140087a.f140081m) == false) goto L_0x0020;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z call() {
            /*
            // Method dump skipped, instructions count: 264
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.extract.i.e.call():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void a(ExtractFramesModel extractFramesModel) {
        if (extractFramesModel != null) {
            this.f140069a = extractFramesModel;
            this.f140072d.f140102b = extractFramesModel.getExtractFramesDir();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<List<? extends String>, z> {
        final /* synthetic */ boolean $afterShoot;
        final /* synthetic */ String $curSegmentId;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(91535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, String str, boolean z) {
            super(1);
            this.this$0 = iVar;
            this.$curSegmentId = str;
            this.$afterShoot = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends String> list) {
            final List<? extends String> list2 = list;
            h.f.b.l.d(list2, "");
            com.ss.android.ugc.asve.f.g.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.tools.extract.i.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(91536);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    i iVar = this.this$0.this$0;
                    List<String> list = list2;
                    String str = this.this$0.$curSegmentId;
                    boolean z = this.this$0.$afterShoot;
                    HashMap<Integer, List<String>> multiStickers = iVar.f140069a.getMultiStickers();
                    if (multiStickers == null || multiStickers.isEmpty()) {
                        iVar.f140069a.initSegmentEffectPhoto();
                    }
                    if (!z || !iVar.f140078j) {
                        iVar.f140069a.addMultiImages(list);
                    } else {
                        iVar.f140069a.addMultiImagesAfterShoot(list);
                    }
                    iVar.f140069a.bindSegmentEffectPhoto(list, str);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void a(p pVar) {
        h.f.b.l.d(pVar, "");
        this.f140073e = pVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void a(m<? super String, ? super String, String> mVar) {
        h.f.b.l.d(mVar, "");
        this.f140077i = mVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void a(String str) {
        p pVar = this.f140073e;
        if (pVar != null) {
            pVar.b();
        }
        this.f140070b = false;
        if (str != null) {
            this.f140079k.put(str, false);
        }
    }

    public final Runnable a(int i2, String str) {
        return new d(this, str, i2);
    }

    static final class b extends h.f.b.m implements m<String, String, String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(91534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            Context applicationContext = this.this$0.f140080l.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.b(applicationContext, "");
            if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107195c = applicationContext.getFilesDir();
            }
            File file = com.ss.android.ugc.aweme.lancet.d.f107195c;
            h.f.b.l.b(file, "");
            String absolutePath = file.getAbsolutePath();
            h.f.b.l.b(absolutePath, "");
            return absolutePath;
        }
    }

    public final void a(Runnable runnable, int i2) {
        ScheduledExecutorService scheduledExecutorService = this.v;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            this.v = g();
        }
        ScheduledExecutorService scheduledExecutorService2 = this.v;
        if (scheduledExecutorService2 == null) {
            h.f.b.l.b();
        }
        scheduledExecutorService2.schedule(runnable, (long) i2, TimeUnit.MILLISECONDS);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void a(List<String> list, h.f.a.b<? super List<String>, z> bVar) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(bVar, "");
        b.i.a((Callable) new e(this, list, bVar));
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.o
    public final void a(List<String> list, boolean z) {
        String str = "";
        h.f.b.l.d(list, str);
        if (!list.isEmpty()) {
            String str2 = this.u;
            if (str2 != null) {
                str = str2;
            }
            a(list, new c(this, str, z));
        }
    }

    public i(Application application, String str, com.ss.android.ugc.asve.recorder.c.a aVar, int i2, int i3, boolean z, boolean z2, v vVar, f fVar) {
        h.f.b.l.d(application, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(vVar, "");
        h.f.b.l.d(fVar, "");
        this.f140080l = application;
        this.f140081m = str;
        this.n = aVar;
        this.o = i2;
        this.p = i3;
        this.w = z;
        this.q = z2;
        this.r = vVar;
        this.x = fVar;
        this.f140069a = new ExtractFramesModel(str);
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.b(uuid, "");
        this.f140071c = uuid;
        this.f140072d = new n(application);
    }
}

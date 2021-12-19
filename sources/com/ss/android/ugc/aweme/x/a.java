package com.ss.android.ugc.aweme.x;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.i;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.setting.bw;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.ab.n;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.x.b;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.af;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class a implements com.ss.android.ugc.aweme.port.internal.b {

    /* renamed from: g  reason: collision with root package name */
    public static final C3855a f145099g = new C3855a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f145100a;

    /* renamed from: b  reason: collision with root package name */
    boolean f145101b;

    /* renamed from: c  reason: collision with root package name */
    boolean f145102c;

    /* renamed from: d  reason: collision with root package name */
    boolean f145103d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.widgetcompat.a f145104e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f145105f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f145106h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<Activity> f145107i;

    /* renamed from: j  reason: collision with root package name */
    private final int f145108j = -1;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.draft.model.c f145109k;

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f145115b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f145116c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f145117d = 4;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f145118e = true;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Activity f145119f;

        static {
            Covode.recordClassIndex(94894);
        }

        e(a aVar, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.draft.model.c cVar, Activity activity) {
            this.f145114a = aVar;
            this.f145115b = videoPublishEditModel;
            this.f145116c = cVar;
            this.f145119f = activity;
        }

        /* renamed from: com.ss.android.ugc.aweme.x.a$e$a  reason: collision with other inner class name */
        public static final class C3856a extends com.ss.android.vesdk.runtime.e {
            static {
                Covode.recordClassIndex(94897);
            }

            @Override // com.ss.android.vesdk.runtime.e
            public final String a() {
                return dj.f126462e;
            }

            C3856a(String str) {
                super(str);
            }
        }

        public final void run() {
            VideoPublishEditModel videoPublishEditModel = this.f145115b;
            l.b(videoPublishEditModel, "");
            if (videoPublishEditModel.isMultiVideoEdit() && TextUtils.isEmpty(this.f145115b.multiEditVideoRecordData.coverImagePath) && bw.f122124d) {
                this.f145115b.multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
                VERecordData a2 = VERecordData.a((com.ss.android.vesdk.runtime.e) new C3856a(""), false);
                l.b(a2, "");
                VEUtils.getVideoFrames(a2.f150790b.get(0).f150794a, new int[]{0}, new ad(this) {
                    /* class com.ss.android.ugc.aweme.x.a.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f145120a;

                    static {
                        Covode.recordClassIndex(94895);
                    }

                    {
                        this.f145120a = r1;
                    }

                    @Override // com.ss.android.vesdk.ad
                    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                        MethodCollector.i(9085);
                        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                        String str = this.f145120a.f145115b.multiEditVideoRecordData.coverImagePath;
                        l.b(str, "");
                        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(createBitmap, str);
                        MethodCollector.o(9085);
                        return false;
                    }
                });
            }
            com.ss.android.ugc.aweme.draft.model.c cVar = this.f145116c;
            int i2 = this.f145117d;
            VideoPublishEditModel videoPublishEditModel2 = this.f145115b;
            l.b(videoPublishEditModel2, "");
            n.a(new m.c(cVar, i2, videoPublishEditModel2, new IDraftService.DraftSaveListener(this) {
                /* class com.ss.android.ugc.aweme.x.a.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f145121a;

                static {
                    Covode.recordClassIndex(94896);
                }

                @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveSuccess() {
                    if (this.f145121a.f145118e) {
                        this.f145121a.f145114a.b(this.f145121a.f145119f);
                    }
                    if (this.f145121a.f145118e) {
                        new com.bytedance.tux.g.b(this.f145121a.f145119f).a(h.b(R.string.ffy)).b();
                        r.a("save_draft_box_show", new com.ss.android.ugc.tools.f.b().a("enter_from", "homepage_hot").f149193a);
                    }
                    com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftUpdate(this.f145121a.f145116c);
                    com.ss.android.ugc.aweme.port.in.c.C.c().a(this.f145121a.f145116c, false);
                    this.f145121a.f145114a.f145105f = false;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145121a = r1;
                }

                @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
                public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                    l.d(draftSaveResult, "");
                    if (this.f145121a.f145118e) {
                        this.f145121a.f145114a.b(this.f145121a.f145119f);
                    }
                    Activity activity = this.f145121a.f145119f;
                    boolean a2 = i.a(draftSaveResult);
                    if (this.f145121a.f145118e) {
                        if (a2) {
                            new com.bytedance.tux.g.b(activity).a(h.b(R.string.bcz)).b();
                        } else {
                            new com.bytedance.tux.g.b(activity).a(h.b(R.string.bd0)).b();
                        }
                    }
                    this.f145121a.f145114a.f145105f = false;
                }
            }));
        }
    }

    static {
        Covode.recordClassIndex(94889);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final void e() {
        this.f145100a = false;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final void i() {
        this.f145103d = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.x.a$a  reason: collision with other inner class name */
    public static final class C3855a {
        static {
            Covode.recordClassIndex(94890);
        }

        private C3855a() {
        }

        public /* synthetic */ C3855a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final boolean d() {
        return this.f145100a;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final boolean h() {
        return this.f145103d;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final void a() {
        com.ss.android.ugc.aweme.shortvideo.f.a.d(3);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final boolean f() {
        boolean z = this.f145101b;
        this.f145101b = false;
        return z;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final boolean g() {
        boolean z = this.f145102c;
        this.f145102c = false;
        return z;
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final com.ss.android.ugc.aweme.draft.model.c b() {
        com.ss.android.ugc.aweme.draft.model.c cVar = this.f145109k;
        if (cVar != null) {
            return cVar;
        }
        com.ss.android.ugc.aweme.draft.model.c e2 = ai.a().e("CHECK_POINT");
        if (e2 == null) {
            return null;
        }
        e2.f83184e = e2.f();
        this.f145109k = e2;
        return e2;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Activity activity) {
            super(0);
            this.this$0 = aVar;
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Activity activity;
            if (this.this$0.f145104e != null) {
                com.ss.android.ugc.aweme.widgetcompat.a aVar = this.this$0.f145104e;
                if (aVar == null) {
                    l.b();
                }
                if (aVar.isShowing() && (activity = this.$activity) != null && !activity.isFinishing()) {
                    com.ss.android.ugc.aweme.widgetcompat.a aVar2 = this.this$0.f145104e;
                    if (aVar2 == null) {
                        l.b();
                    }
                    aVar2.dismiss();
                    this.this$0.f145104e = null;
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, Activity activity) {
            super(0);
            this.this$0 = aVar;
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Activity activity;
            if (this.this$0.f145104e == null && (activity = this.$activity) != null && !activity.isFinishing()) {
                Looper mainLooper = Looper.getMainLooper();
                l.b(mainLooper, "");
                if (l.a(mainLooper.getThread(), Thread.currentThread())) {
                    this.this$0.f145104e = com.ss.android.ugc.aweme.widgetcompat.a.a(this.$activity, h.b(R.string.ewe));
                }
            }
            return z.f158842a;
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f145112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f145113b = 1;

        static {
            Covode.recordClassIndex(94893);
        }

        d(VideoPublishEditModel videoPublishEditModel) {
            this.f145112a = videoPublishEditModel;
        }

        public final void run() {
            try {
                if (this.f145112a != null) {
                    new bn("saveCheckPointForRestore");
                    com.ss.android.ugc.aweme.draft.model.c b2 = bn.b(this.f145112a);
                    if (this.f145112a.isDuet()) {
                        l.b(b2, "");
                        b2.a(DuetExtraInfo.copy$default(this.f145112a.draftDuetExtraInfo, null, null, 0, 0, null, 0, 63, null));
                    }
                    l.b(b2, "");
                    b2.t(50);
                    b2.f83184e = "CHECK_POINT";
                    if (b2.f83185f == null) {
                        b2.f83187h = null;
                    }
                    ai.a().a(b2);
                }
                com.ss.android.ugc.aweme.shortvideo.f.a.d(this.f145113b);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f145111b;

        static {
            Covode.recordClassIndex(94891);
        }

        b(a aVar, Activity activity) {
            this.f145110a = aVar;
            this.f145111b = activity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
            if (r1 != 3) goto L_0x0016;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 243
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.x.a.b.run():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r4 != 3) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    @Override // com.ss.android.ugc.aweme.port.internal.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.x.a.c():boolean");
    }

    public final void b(Activity activity) {
        com.ss.android.ugc.asve.f.g.a(new c(this, activity));
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, String str, Activity activity) {
            super(1);
            this.this$0 = aVar;
            this.$enterFrom = str;
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.asg, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.x.a.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(94899);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
                    if (r1 != 3) goto L_0x0042;
                 */
                @Override // h.f.a.b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a r8) {
                    /*
                    // Method dump skipped, instructions count: 139
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.x.a.f.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            });
            bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.x.a.f.AnonymousClass2 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(94900);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.dj.a.a();
                    AVExternalServiceImpl.a().abnormalExitLogService().logRestoreDialogClick(false);
                    this.this$0.this$0.a(this.this$0.$activity);
                    com.ss.android.ugc.aweme.port.in.l.f115658a.g().a(this.this$0.$activity);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static RecordConfig a(Long l2) {
        RecordConfig.Builder creationId = new RecordConfig.Builder().shootWay("direct_shoot").restoreType(2).creationId(UUID.randomUUID().toString());
        if (l2 != null) {
            creationId.decompressTime(l2.longValue());
        }
        return creationId.build();
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final void a(Activity activity) {
        Activity activity2;
        if (this.f145107i == null && activity != null) {
            this.f145107i = new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference = this.f145107i;
        if (weakReference != null && (activity2 = weakReference.get()) != null) {
            l.b(activity2, "");
            this.f145100a = false;
            com.ss.android.ugc.aweme.tools.b.f138752a.execute(new b(this, activity2));
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final void a(Activity activity, String str) {
        MethodCollector.i(9416);
        l.d(activity, "");
        l.d(str, "");
        this.f145107i = new WeakReference<>(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.xm, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        WeakReference weakReference = new WeakReference(inflate.findViewById(R.id.dm9));
        l.d(weakReference, "");
        ab.a((af) new b.C3857b(weakReference)).b(f.a.h.a.b(f.a.k.a.f158006c)).c(b.c.f145127a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b.d(weakReference), b.e.f145129a);
        com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(activity);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.e.d.a(bVar, inflate, h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()))).a(R.string.fbh).b(R.string.fbg), new f(this, str, activity)).a(false)).a().b().show();
        MethodCollector.o(9416);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.b
    public final void a(VideoPublishEditModel videoPublishEditModel, String str) {
        k.a("saveCheckPoint creationId: ".concat(String.valueOf(str)));
        boolean z = true;
        boolean z2 = !bw.f122122b;
        if (videoPublishEditModel == null || videoPublishEditModel.isDuet() || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isUploadVideo()) {
            z = false;
        }
        if (z2 || z) {
            com.ss.android.ugc.aweme.shortvideo.f.a.d(3);
        } else if (videoPublishEditModel == null || videoPublishEditModel.mDraftToEditFrom == this.f145108j) {
            com.ss.android.ugc.aweme.tools.b.f138752a.execute(new d(videoPublishEditModel));
        }
    }

    public final void a(Activity activity, com.ss.android.ugc.aweme.draft.model.c cVar, VideoPublishEditModel videoPublishEditModel) {
        if (!this.f145105f && cVar != null) {
            cVar.t(0);
            cVar.I = System.currentTimeMillis();
            if (cVar.f83185f == null) {
                cVar.f83187h = null;
            }
            if (videoPublishEditModel == null) {
                new bn("CheckPointServiceImpl");
                videoPublishEditModel = bn.a(cVar);
            }
            l.b(videoPublishEditModel, "");
            if (videoPublishEditModel.isMultiVideoEdit() && TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.coverImagePath) && b.f145122a != null) {
                videoPublishEditModel.multiEditVideoRecordData.coverImagePath = b.f145122a;
            }
            k.a("[saveDraft]: creation id = " + cVar.f());
            this.f145105f = true;
            com.ss.android.ugc.asve.f.g.a(new g(this, activity));
            com.ss.android.ugc.aweme.tools.b.f138752a.execute(new e(this, videoPublishEditModel, cVar, activity));
        }
    }
}

package com.ss.android.ugc.aweme.tools.music.a.b;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.experiment.fx;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.r;
import h.z;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public abstract class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3703a f140309d = new C3703a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f140310a;

    /* renamed from: b  reason: collision with root package name */
    public bz f140311b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.b<String> f140312c;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.b.a f140313e;

    /* renamed from: f  reason: collision with root package name */
    private final h f140314f = i.a((h.f.a.a) b.f140316a);

    static {
        Covode.recordClassIndex(91670);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(h.c.d<? super String> dVar);

    /* access modifiers changed from: protected */
    public final String a() {
        return (String) this.f140314f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b.a$a  reason: collision with other inner class name */
    public static final class C3703a {
        static {
            Covode.recordClassIndex(91672);
        }

        private C3703a() {
        }

        public /* synthetic */ C3703a(byte b2) {
            this();
        }
    }

    public final String c() {
        return this.f140312c.i();
    }

    public final t<String> d() {
        t<String> c2 = this.f140312c.c();
        l.b(c2, "");
        return c2;
    }

    public final void f() {
        bz bzVar = this.f140311b;
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
        }
        this.f140311b = null;
        this.f140313e.dispose();
        com.ss.android.ugc.tools.utils.i.a(new File(a()));
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f140316a = new b();

        static {
            Covode.recordClassIndex(91673);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            File file = new File(com.ss.android.ugc.aweme.tools.music.a.a.e() + File.separator + SystemClock.elapsedRealtime());
            if (!file.exists()) {
                file.mkdir();
            }
            return file.getAbsolutePath();
        }
    }

    public a() {
        f.a.b.a aVar = new f.a.b.a();
        this.f140313e = aVar;
        f.a.l.b<String> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f140312c = bVar;
        aVar.a(d().a(new f.a.d.f(this) {
            /* class com.ss.android.ugc.aweme.tools.music.a.b.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f140315a;

            static {
                Covode.recordClassIndex(91671);
            }

            {
                this.f140315a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.tools.utils.i.a(new c.b.a(this.f140315a.a()));
            }
        }, f.a.e.b.a.f157191d));
    }

    protected static int b() {
        if (com.ss.android.ugc.aweme.tools.music.e.a.f140436a == null) {
            return 5;
        }
        com.ss.android.ugc.aweme.tools.music.e.a aVar = com.ss.android.ugc.aweme.tools.music.e.a.f140436a;
        if (aVar == null) {
            l.b();
        }
        l.b(aVar, "");
        if (aVar.f140437b <= 1) {
            return 5;
        }
        com.ss.android.ugc.aweme.tools.music.e.a aVar2 = com.ss.android.ugc.aweme.tools.music.e.a.f140436a;
        if (aVar2 == null) {
            l.b();
        }
        l.b(aVar2, "");
        return aVar2.f140437b;
    }

    public void e() {
        String str;
        IAVPublishService publishService;
        if (g.a().A().b() && (AVServiceImpl.a().avSettingsService().recommentMusicByAIPolicy() != 0 || fx.a())) {
            IExternalService a2 = AVExternalServiceImpl.a();
            if (a2 == null || (publishService = a2.publishService()) == null) {
                str = null;
            } else {
                str = publishService.getShootWay();
            }
            if (!l.a((Object) str, (Object) "tcm_upload") && !g.a().A().a()) {
                bz unused = kotlinx.coroutines.i.a(bs.f159054a, null, null, new d(this, null), 3);
                return;
            }
        }
        a("");
    }

    public static final class e implements k<com.ss.android.ugc.aweme.publish.f.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f140318a;

        static {
            Covode.recordClassIndex(91678);
        }

        e(h.c.d dVar) {
            this.f140318a = dVar;
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            l.d(th, "");
            this.f140318a.resumeWith(q.m223constructorimpl(null));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.publish.f.h hVar) {
            if (hVar instanceof com.ss.android.ugc.aweme.publish.f.d) {
                this.f140318a.resumeWith(q.m223constructorimpl(com.ss.android.ugc.aweme.tools.music.f.d.f140594a.b(hVar)));
                return;
            }
            this.f140318a.resumeWith(q.m223constructorimpl(null));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(91674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.tools.utils.i.a(this.this$0.a(), AnonymousClass1.f140317a);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        l.d(str, "");
        this.f140312c.onNext(str);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(91676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            d dVar2 = new d(this.this$0, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.f140311b = kotlinx.coroutines.i.a((am) this.L$0, null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.tools.music.a.b.a.d.AnonymousClass1 */
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(91677);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        AnonymousClass1 r1 = 

                        /* access modifiers changed from: protected */
                        public final File a(Bitmap bitmap, int i2) {
                            l.d(bitmap, "");
                            File file = new File(a() + File.separator + i2 + ".jpg");
                            String a2 = a();
                            String name = file.getName();
                            l.b(name, "");
                            com.ss.android.ugc.aweme.tools.music.a.e.a(bitmap, a2, name);
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            return file;
                        }

                        public static final class f implements AbstractImageUploader.a {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AbstractImageUploader f140319a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ h.c.d f140320b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ a f140321c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ String f140322d;

                            /* renamed from: e  reason: collision with root package name */
                            final /* synthetic */ List f140323e = null;

                            /* renamed from: f  reason: collision with root package name */
                            final /* synthetic */ String f140324f;

                            static {
                                Covode.recordClassIndex(91679);
                            }

                            @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader.a
                            public final void a(int i2, long j2, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                                Integer num;
                                Integer num2 = null;
                                if (i2 == this.f140319a.a()) {
                                    int currentTimeMillis = (int) (System.currentTimeMillis() - this.f140321c.f140310a);
                                    List list = this.f140323e;
                                    if (list != null) {
                                        num2 = Integer.valueOf(list.size());
                                    }
                                    ar a2 = new ar().a("time_cost_ms", Integer.valueOf(currentTimeMillis));
                                    if (num2 != null) {
                                        num2.intValue();
                                        a2.a("photo_to_video_assets_count", num2);
                                    }
                                    com.bytedance.apm.b.a("ies_ai_recommend_video_frames_upload_monitor", 0, a2.a());
                                    this.f140319a.d();
                                    this.f140320b.resumeWith(q.m223constructorimpl(imageUploadInfo.getMImageToskey()));
                                    com.ss.android.ugc.aweme.common.r.a("account_info_after_zip_upload", new com.ss.android.ugc.tools.f.b().a("login", String.valueOf(g.a().A().b())).a("zip_upload_res_status", !TextUtils.isEmpty(imageUploadInfo.getMImageToskey()) ? 1 : 0).a("zipuri", imageUploadInfo.getMImageToskey()).f149193a);
                                } else if (i2 == this.f140319a.b()) {
                                    List list2 = this.f140323e;
                                    if (list2 != null) {
                                        num = Integer.valueOf(list2.size());
                                    } else {
                                        num = null;
                                    }
                                    ar arVar = new ar();
                                    if (num != null) {
                                        num.intValue();
                                        arVar.a("photo_to_video_assets_count", num);
                                    }
                                    com.bytedance.apm.b.a("ies_ai_recommend_video_frames_upload_monitor", 1, arVar.a());
                                    this.f140319a.d();
                                    this.f140320b.resumeWith(q.m223constructorimpl(null));
                                }
                            }

                            f(AbstractImageUploader abstractImageUploader, h.c.d dVar, a aVar, String str, List list, String str2) {
                                this.f140319a = abstractImageUploader;
                                this.f140320b = dVar;
                                this.f140321c = aVar;
                                this.f140322d = str;
                                this.f140324f = str2;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public final Object a(String str, String str2, h.c.d<? super String> dVar) {
                            boolean z;
                            com.ss.android.ugc.aweme.publish.f.e eVar;
                            h.c.h hVar = new h.c.h(h.c.a.b.a(dVar));
                            if (str2 == null || str2.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                hVar.resumeWith(q.m223constructorimpl(null));
                            } else {
                                com.ss.android.ugc.aweme.publish.f.d dVar2 = (com.ss.android.ugc.aweme.publish.f.d) new com.google.gson.g().b().a(str2, com.ss.android.ugc.aweme.publish.f.d.class);
                                if (dVar2 != null) {
                                    eVar = dVar2.f118725d;
                                } else {
                                    eVar = null;
                                }
                                if (eVar == null) {
                                    hVar.resumeWith(q.m223constructorimpl(null));
                                } else {
                                    com.ss.android.ugc.aweme.common.r.a("account_info_before_zip_upload", new com.ss.android.ugc.tools.f.b().a("login", String.valueOf(g.a().A().b())).f149193a);
                                    if (!g.a().A().b()) {
                                        hVar.resumeWith(q.m223constructorimpl(null));
                                    } else {
                                        AbstractImageUploader a2 = com.ss.android.ugc.aweme.uploader.factory.a.a(eVar);
                                        a2.a(new f(a2, hVar, this, str2, null, str));
                                        a2.a(new String[]{str});
                                        try {
                                            this.f140310a = System.currentTimeMillis();
                                            a2.c();
                                        } catch (Exception e2) {
                                            a2.d();
                                            e2.printStackTrace();
                                        }
                                    }
                                }
                            }
                            Object a3 = hVar.a();
                            if (a3 == h.c.a.a.COROUTINE_SUSPENDED) {
                                l.d(dVar, "");
                            }
                            return a3;
                        }
                    }

package com.ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.ss.android.ugc.aweme.emoji.utils.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.r;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public class g implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f89434e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f89435a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final am f89436c = an.a(bf.f159041b);

    /* renamed from: d  reason: collision with root package name */
    public boolean f89437d;

    static {
        Covode.recordClassIndex(56198);
    }

    public static final class a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a  reason: collision with other inner class name */
        public static final class C2165a extends h.c.b.a.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(56200);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2165a(a aVar, h.c.d dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a((String) null, this);
            }
        }

        static {
            Covode.recordClassIndex(56199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar) {
            File file = new File(j.a(bVar));
            if (file.exists() && file.isFile()) {
                a(file);
            }
        }

        private static boolean a(File file) {
            MethodCollector.i(894);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(894);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(894);
            return delete;
        }

        public static void a(String str, List<? extends com.ss.android.ugc.aweme.emoji.emojichoose.model.b> list) {
            File[] listFiles;
            String replace;
            HashMap hashMap = new HashMap();
            for (com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar : list) {
                StringBuilder append = new StringBuilder().append(bVar.getId()).append("_");
                if (bVar.getVersion() == null) {
                    replace = null;
                } else {
                    replace = bVar.getVersion().replace(".", "_");
                }
                String sb = append.append(replace).toString();
                l.b(sb, "");
                hashMap.put(sb, true);
            }
            File file = new File(j.a(str));
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        l.b(file2, "");
                        if (hashMap.get(file2.getName()) == null) {
                            try {
                                com.bytedance.common.utility.d.a.a(file2.getAbsolutePath());
                                a(new File(file2.getAbsolutePath()));
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(java.lang.String r6, h.c.d<? super com.ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.ss.android.ugc.aweme.emoji.systembigemoji.g.a.C2165a
                if (r0 == 0) goto L_0x001f
                r4 = r7
                com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a r4 = (com.ss.android.ugc.aweme.emoji.systembigemoji.g.a.C2165a) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x001f
                int r0 = r4.label
                int r0 = r0 - r1
                r4.label = r0
            L_0x0013:
                java.lang.Object r3 = r4.result
                h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L_0x0031
                if (r0 != r1) goto L_0x0029
                goto L_0x0025
            L_0x001f:
                com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a r4 = new com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a
                r4.<init>(r5, r7)
                goto L_0x0013
            L_0x0025:
                h.r.a(r3)     // Catch:{ InterruptedException -> 0x0049, ExecutionException -> 0x0044 }
                goto L_0x0043
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L_0x0031:
                h.r.a(r3)
                com.ss.android.ugc.aweme.emoji.utils.EmojiApi r0 = com.ss.android.ugc.aweme.emoji.utils.b.f89446a
                kotlinx.coroutines.av r0 = r0.getResources(r6)
                r4.label = r1
                java.lang.Object r3 = r0.a(r4)
                if (r3 != r2) goto L_0x0043
                return r2
            L_0x0043:
                return r3
            L_0x0044:
                r0 = move-exception
                r0.printStackTrace()
                goto L_0x004d
            L_0x0049:
                r0 = move-exception
                r0.printStackTrace()
            L_0x004d:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.systembigemoji.g.a.a(java.lang.String, h.c.d):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f89438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.emojichoose.model.b f89439b;

        static {
            Covode.recordClassIndex(56201);
        }

        b(g gVar, com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar) {
            this.f89438a = gVar;
            this.f89439b = bVar;
        }

        public final void run() {
            this.f89438a.a(this.f89439b, false);
        }
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean a2 = a();
        com.ss.android.ugc.aweme.lancet.j.f107226e = a2;
        return a2;
    }

    public static final class c extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f89440a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.emojichoose.model.b f89441b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f89442c = false;

        static {
            Covode.recordClassIndex(56202);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            l.d(downloadInfo, "");
            f.b(this.f89441b.getResourceUrl());
            a.a(this.f89441b);
            this.f89440a.a(this.f89441b, false);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            boolean z;
            String[] list;
            l.d(downloadInfo, "");
            this.f89441b.getResourceUrl();
            f.b(this.f89441b.getResourceUrl());
            a.a(this.f89441b);
            com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar = this.f89441b;
            if (bVar != null) {
                File file = new File(j.b(bVar));
                if (file.exists() && file.isDirectory() && (list = file.list()) != null && list.length != 0) {
                    z = true;
                    this.f89440a.a(this.f89441b, z);
                    IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().a(new i(String.valueOf(this.f89441b.getId())), new h(true, this.f89441b.getId()));
                }
            }
            z = false;
            this.f89440a.a(this.f89441b, z);
            IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().a(new i(String.valueOf(this.f89441b.getId())), new h(true, this.f89441b.getId()));
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            l.d(downloadInfo, "");
            l.d(baseException, "");
            baseException.getMessage();
            this.f89441b.getResourceUrl();
            f.b(this.f89441b.getResourceUrl());
            if (this.f89442c) {
                this.f89440a.b(this.f89441b);
            } else {
                a.a(this.f89441b);
                this.f89440a.a(this.f89441b, false);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().a(new i(String.valueOf(this.f89441b.getId())), new h(false, this.f89441b.getId()));
        }

        c(g gVar, com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, boolean z) {
            this.f89440a = gVar;
            this.f89441b = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ boolean $isSuccess;
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.emojichoose.model.b $resources;
        int label;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(56205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, boolean z, com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = gVar;
            this.$isSuccess = z;
            this.$resources = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.this$0, this.$isSuccess, this.$resources, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.a(this.$isSuccess, this.$resources);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ boolean $preload;
        final /* synthetic */ String $type;
        int label;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(56203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, String str, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = gVar;
            this.$type = str;
            this.$preload = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, this.$type, this.$preload, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                a aVar2 = g.f89434e;
                String str = this.$type;
                this.label = 1;
                obj = aVar2.a(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else if (i2 == 2) {
                try {
                    r.a(obj);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    com.ss.android.ugc.aweme.im.service.m.a.a(e2);
                }
                return z.f158842a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResourcesResponse resourcesResponse = (ResourcesResponse) obj;
            final z.e eVar = new z.e();
            eVar.element = resourcesResponse != null ? (T) resourcesResponse.getResources() : null;
            if (resourcesResponse == null || resourcesResponse.status_code != 0) {
                T t = (T) com.ss.android.ugc.aweme.emoji.utils.f.a("im_resources_".concat(String.valueOf(this.$type)), com.ss.android.ugc.aweme.emoji.emojichoose.model.b.class);
                if (t == null) {
                    t = (T) new ArrayList();
                }
                eVar.element = t;
            } else {
                T t2 = eVar.element;
                if (t2 == null) {
                    t2 = (T) new ArrayList();
                }
                eVar.element = t2;
                for (com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar : eVar.element) {
                    l.b(bVar, "");
                    bVar.setType(this.$type);
                }
                com.ss.android.ugc.aweme.emoji.utils.f.a("im_resources_".concat(String.valueOf(this.$type)), (List) eVar.element);
                if (eVar.element.size() > 0) {
                    a.a(this.$type, (List<? extends com.ss.android.ugc.aweme.emoji.emojichoose.model.b>) eVar.element);
                }
            }
            ci ciVar = o.f159148a;
            AnonymousClass1 r0 = new m<am, h.c.d<? super h.z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.emoji.systembigemoji.g.d.AnonymousClass1 */
                int label;
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(56204);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                    l.d(dVar, "");
                    return 

                    public final boolean b(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar) {
                        l.d(bVar, "");
                        com.bytedance.ies.ugc.appcontext.d.a();
                        if (!b()) {
                            com.ss.android.b.a.a.a.a(new b(this, bVar));
                            return false;
                        } else if (f.a(bVar.getResourceUrl()) != null) {
                            return false;
                        } else {
                            File file = new File(j.a(bVar));
                            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                                return false;
                            }
                            IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().a((com.ss.android.ugc.aweme.im.service.g.b) new i(String.valueOf(bVar.getId())), true);
                            f.a(bVar.getResourceUrl(), bVar);
                            c cVar = new c(this, bVar, false);
                            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(bVar.getResourceUrl());
                            with.f83081f = j.a(bVar.getType());
                            with.f83078c = j.a(bVar.getId(), bVar.getVersion()) + ".zip";
                            with.D = cVar;
                            with.a("emoji_resources_manager").b(j.a(bVar.getType(), bVar.getId(), bVar.getVersion())).a(com.ss.android.ugc.aweme.download.component_api.c.ZIP);
                            return true;
                        }
                    }

                    /* access modifiers changed from: protected */
                    public void a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, boolean z) {
                        l.d(bVar, "");
                        bz unused = i.a(this.f89436c, com.ss.android.ugc.aweme.af.a.f66269a, null, new e(this, z, bVar, null), 2);
                    }

                    @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.e
                    public final void a(String str, List<? extends com.ss.android.ugc.aweme.emoji.emojichoose.model.b> list) {
                        l.d(str, "");
                        l.d(list, "");
                        for (e eVar : this.f89435a) {
                            eVar.a(str, (List<com.ss.android.ugc.aweme.emoji.emojichoose.model.b>) list);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.e
                    public final void a(boolean z, com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar) {
                        l.d(bVar, "");
                        for (e eVar : this.f89435a) {
                            eVar.a(z, bVar);
                        }
                    }

                    /* access modifiers changed from: protected */
                    public void a(String str, List<? extends com.ss.android.ugc.aweme.emoji.emojichoose.model.b> list, boolean z) {
                        l.d(str, "");
                        l.d(list, "");
                        a(str, list);
                        this.f89437d = list.isEmpty();
                    }
                }

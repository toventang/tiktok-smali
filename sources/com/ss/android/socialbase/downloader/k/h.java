package com.ss.android.socialbase.downloader.k;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ab;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.ad;
import com.ss.android.socialbase.downloader.depend.b;
import com.ss.android.socialbase.downloader.depend.c;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.f;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.h;
import com.ss.android.socialbase.downloader.depend.j;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.o;
import com.ss.android.socialbase.downloader.depend.p;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.s;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.v;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f60759a = new Handler(Looper.getMainLooper());

    public static a a(final DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new a.AbstractBinderC1333a() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37486);
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final DownloadInfo a() {
                return downloadTask.getDownloadInfo();
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final c b() {
                j chunkStrategy = downloadTask.getChunkStrategy();
                if (chunkStrategy == null) {
                    return null;
                }
                return new c.a(chunkStrategy) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass5 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f60814a;

                    static {
                        Covode.recordClassIndex(37524);
                    }

                    {
                        this.f60814a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.c
                    public final int a(long j2) {
                        return this.f60814a.a(j2);
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final ab d() {
                return h.a(downloadTask.getNotificationClickCallback());
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final f e() {
                v interceptor = downloadTask.getInterceptor();
                if (interceptor == null) {
                    return null;
                }
                return new f.a(interceptor) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass6 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ v f60815a;

                    static {
                        Covode.recordClassIndex(37525);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.f
                    public final boolean a() {
                        return this.f60815a.a();
                    }

                    {
                        this.f60815a = r1;
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final d f() {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend == null) {
                    return null;
                }
                return new d.a(depend) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ IDownloadDepend f60810a;

                    static {
                        Covode.recordClassIndex(37520);
                    }

                    {
                        this.f60810a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.d
                    public final void a(DownloadInfo downloadInfo, BaseException baseException, int i2) {
                        this.f60810a.monitorLogSend(downloadInfo, baseException, i2);
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final s g() {
                u forbiddenHandler = downloadTask.getForbiddenHandler();
                if (forbiddenHandler == null) {
                    return null;
                }
                return new s.a(forbiddenHandler) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass28 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ u f60808a;

                    static {
                        Covode.recordClassIndex(37518);
                    }

                    {
                        this.f60808a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.s
                    public final boolean a(r rVar) {
                        AnonymousClass30 r0;
                        u uVar = this.f60808a;
                        if (rVar == null) {
                            r0 = null;
                        } else {
                            r0 = new t(rVar) {
                                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass30 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ r f60811a;

                                static {
                                    Covode.recordClassIndex(37521);
                                }

                                @Override // com.ss.android.socialbase.downloader.depend.t
                                public final boolean a() {
                                    try {
                                        return this.f60811a.a();
                                    } catch (RemoteException e2) {
                                        e2.printStackTrace();
                                        return false;
                                    }
                                }

                                {
                                    this.f60811a = r1;
                                }

                                @Override // com.ss.android.socialbase.downloader.depend.t
                                public final void a(List<String> list) {
                                    try {
                                        this.f60811a.a(list);
                                    } catch (RemoteException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            };
                        }
                        return uVar.a(r0);
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final ad h() {
                com.ss.android.socialbase.downloader.downloader.u retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
                if (retryDelayTimeCalculator == null) {
                    return null;
                }
                return new ad.a(retryDelayTimeCalculator) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass27 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.socialbase.downloader.downloader.u f60807a;

                    static {
                        Covode.recordClassIndex(37517);
                    }

                    {
                        this.f60807a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.ad
                    public final long a(int i2, int i3) {
                        return this.f60807a.a(i2, i3);
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final m i() {
                o diskSpaceHandler = downloadTask.getDiskSpaceHandler();
                if (diskSpaceHandler == null) {
                    return null;
                }
                return new m.a(diskSpaceHandler) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass31 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ o f60812a;

                    static {
                        Covode.recordClassIndex(37522);
                    }

                    {
                        this.f60812a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.m
                    public final boolean a(long j2, long j3, l lVar) {
                        AnonymousClass2 r5;
                        o oVar = this.f60812a;
                        if (lVar == null) {
                            r5 = null;
                        } else {
                            r5 = new n(lVar) {
                                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass2 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ l f60799a;

                                static {
                                    Covode.recordClassIndex(37509);
                                }

                                @Override // com.ss.android.socialbase.downloader.depend.n
                                public final void a() {
                                    try {
                                        this.f60799a.a();
                                    } catch (RemoteException e2) {
                                        e2.printStackTrace();
                                    }
                                }

                                {
                                    this.f60799a = r1;
                                }
                            };
                        }
                        return oVar.a(j2, j3, r5);
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final com.ss.android.socialbase.downloader.depend.h j() {
                w monitorDepend = downloadTask.getMonitorDepend();
                if (monitorDepend == null) {
                    return null;
                }
                return new h.a(monitorDepend) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ w f60813a;

                    static {
                        Covode.recordClassIndex(37523);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.h
                    public final String a() {
                        return this.f60813a.getEventPage();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.h
                    public final int[] b() {
                        w wVar = this.f60813a;
                        if (wVar instanceof b) {
                            return ((b) wVar).a();
                        }
                        return null;
                    }

                    {
                        this.f60813a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.h
                    public final void a(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                this.f60813a.monitorLogSend(new JSONObject(str));
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final e k() {
                return h.a(downloadTask.getFileUriProvider());
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final int l() {
                return downloadTask.getDownloadCompleteHandlers().size();
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final x c() {
                return h.a(downloadTask.getNotificationEventListener());
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final int a(int i2) {
                return downloadTask.getDownloadListenerSize(g.c(i2));
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final com.ss.android.socialbase.downloader.depend.j c(int i2) {
                k downloadCompleteHandlerByIndex = downloadTask.getDownloadCompleteHandlerByIndex(i2);
                if (downloadCompleteHandlerByIndex == null) {
                    return null;
                }
                return new j.a(downloadCompleteHandlerByIndex) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass9 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f60818a;

                    static {
                        Covode.recordClassIndex(37528);
                    }

                    {
                        this.f60818a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.j
                    public final boolean b(DownloadInfo downloadInfo) {
                        return this.f60818a.b(downloadInfo);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.j
                    public final void a(DownloadInfo downloadInfo) {
                        try {
                            this.f60818a.a(downloadInfo);
                        } catch (BaseException e2) {
                            throw new IllegalArgumentException(e2);
                        }
                    }
                };
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final g b(int i2) {
                boolean z;
                IDownloadListener singleDownloadListener = downloadTask.getSingleDownloadListener(g.c(i2));
                if (i2 == com.ss.android.socialbase.downloader.b.h.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return h.a(singleDownloadListener, z);
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final g a(int i2, int i3) {
                boolean z;
                IDownloadListener downloadListenerByIndex = downloadTask.getDownloadListenerByIndex(g.c(i2), i3);
                if (i2 == com.ss.android.socialbase.downloader.b.h.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return h.a(downloadListenerByIndex, z);
            }
        };
    }

    public static DownloadTask a(a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(aVar.a());
            final c b2 = aVar.b();
            DownloadTask notificationEventListener = downloadTask.chunkStategy(b2 == null ? null : new com.ss.android.socialbase.downloader.downloader.j() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(37488);
                }

                @Override // com.ss.android.socialbase.downloader.downloader.j
                public final int a(long j2) {
                    try {
                        return b2.a(j2);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return 0;
                    }
                }
            }).notificationEventListener(a(aVar.c()));
            final f e2 = aVar.e();
            DownloadTask interceptor = notificationEventListener.interceptor(e2 == null ? null : new v() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(37512);
                }

                @Override // com.ss.android.socialbase.downloader.depend.v
                public final boolean a() {
                    try {
                        return e2.a();
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return false;
                    }
                }
            });
            final d f2 = aVar.f();
            DownloadTask depend = interceptor.depend(f2 == null ? null : new IDownloadDepend() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(37502);
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadDepend
                public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i2) {
                    if (downloadInfo != null) {
                        try {
                            f2.a(downloadInfo, baseException, i2);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            });
            final com.ss.android.socialbase.downloader.depend.h j2 = aVar.j();
            DownloadTask monitorDepend = depend.monitorDepend(j2 == null ? null : new b() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(37503);
                }

                @Override // com.ss.android.socialbase.downloader.depend.b
                public final int[] a() {
                    try {
                        return j2.b();
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.w
                public final String getEventPage() {
                    try {
                        return j2.a();
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return "";
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.w
                public final void monitorLogSend(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        try {
                            j2.a(jSONObject.toString());
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            });
            final s g2 = aVar.g();
            DownloadTask forbiddenHandler = monitorDepend.forbiddenHandler(g2 == null ? null : new u() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(37504);
                }

                @Override // com.ss.android.socialbase.downloader.depend.u
                public final boolean a(t tVar) {
                    AnonymousClass16 r0;
                    try {
                        s sVar = g2;
                        if (tVar == null) {
                            r0 = null;
                        } else {
                            r0 = new r.a(tVar) {
                                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass16 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ t f60795a;

                                static {
                                    Covode.recordClassIndex(37505);
                                }

                                @Override // com.ss.android.socialbase.downloader.depend.r
                                public final boolean a() {
                                    return this.f60795a.a();
                                }

                                {
                                    this.f60795a = r1;
                                }

                                @Override // com.ss.android.socialbase.downloader.depend.r
                                public final void a(List<String> list) {
                                    this.f60795a.a(list);
                                }
                            };
                        }
                        return sVar.a(r0);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return false;
                    }
                }
            });
            final m i2 = aVar.i();
            DownloadTask notificationClickCallback = forbiddenHandler.diskSpaceHandler(i2 == null ? null : new o() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass19 */

                static {
                    Covode.recordClassIndex(37508);
                }

                @Override // com.ss.android.socialbase.downloader.depend.o
                public final boolean a(long j2, long j3, n nVar) {
                    AnonymousClass20 r5;
                    try {
                        m mVar = i2;
                        if (nVar == null) {
                            r5 = null;
                        } else {
                            r5 = new l.a(nVar) {
                                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass20 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ n f60800a;

                                static {
                                    Covode.recordClassIndex(37510);
                                }

                                @Override // com.ss.android.socialbase.downloader.depend.l
                                public final void a() {
                                    this.f60800a.a();
                                }

                                {
                                    this.f60800a = r1;
                                }
                            };
                        }
                        return mVar.a(j2, j3, r5);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return false;
                    }
                }
            }).fileUriProvider(a(aVar.k())).notificationClickCallback(a(aVar.d()));
            final ad h2 = aVar.h();
            notificationClickCallback.retryDelayTimeCalculator(h2 == null ? null : new com.ss.android.socialbase.downloader.downloader.u() {
                /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass21 */

                static {
                    Covode.recordClassIndex(37511);
                }

                @Override // com.ss.android.socialbase.downloader.downloader.u
                public final long a(int i2, int i3) {
                    try {
                        return h2.a(i2, i3);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                        return 0;
                    }
                }
            });
            g b3 = aVar.b(com.ss.android.socialbase.downloader.b.h.MAIN.ordinal());
            if (b3 != null) {
                downloadTask.mainThreadListenerWithHashCode(b3.hashCode(), a(b3));
            }
            g b4 = aVar.b(com.ss.android.socialbase.downloader.b.h.SUB.ordinal());
            if (b4 != null) {
                downloadTask.subThreadListenerWithHashCode(b4.hashCode(), a(b4));
            }
            g b5 = aVar.b(com.ss.android.socialbase.downloader.b.h.NOTIFICATION.ordinal());
            if (b5 != null) {
                downloadTask.notificationListenerWithHashCode(b5.hashCode(), a(b5));
            }
            a(downloadTask, aVar, com.ss.android.socialbase.downloader.b.h.MAIN);
            a(downloadTask, aVar, com.ss.android.socialbase.downloader.b.h.SUB);
            a(downloadTask, aVar, com.ss.android.socialbase.downloader.b.h.NOTIFICATION);
            for (int i3 = 0; i3 < aVar.l(); i3++) {
                final com.ss.android.socialbase.downloader.depend.j c2 = aVar.c(i3);
                if (c2 != null) {
                    downloadTask.addDownloadCompleteHandler(new k() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(37527);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.k
                        public final void a(DownloadInfo downloadInfo) {
                            try {
                                c2.a(downloadInfo);
                            } catch (RemoteException e2) {
                                throw new BaseException(1008, e2);
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.k
                        public final boolean b(DownloadInfo downloadInfo) {
                            try {
                                return c2.b(downloadInfo);
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                                return false;
                            }
                        }
                    });
                }
            }
            return downloadTask;
        } catch (RemoteException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static void a(DownloadTask downloadTask, a aVar, com.ss.android.socialbase.downloader.b.h hVar) {
        SparseArray<IDownloadListener> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < aVar.a(hVar.ordinal()); i2++) {
            g a2 = aVar.a(hVar.ordinal(), i2);
            if (a2 != null) {
                sparseArray.put(a2.a(), a(a2));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, hVar);
    }

    static {
        Covode.recordClassIndex(37485);
    }

    public static IDownloadListener a(final g gVar) {
        if (gVar == null) {
            return null;
        }
        return new p() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass25 */

            static {
                Covode.recordClassIndex(37515);
            }

            @Override // com.ss.android.socialbase.downloader.depend.p
            public final void a(DownloadInfo downloadInfo) {
                try {
                    gVar.i(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                try {
                    gVar.f(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    gVar.g(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    gVar.h(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                try {
                    gVar.d(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
                try {
                    gVar.a(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                try {
                    gVar.c(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                try {
                    gVar.b(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    gVar.e(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.a(downloadInfo, baseException);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.b(downloadInfo, baseException);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.c(downloadInfo, baseException);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    public static ab a(final ac acVar) {
        if (acVar == null) {
            return null;
        }
        return new ab.a() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass26 */

            static {
                Covode.recordClassIndex(37516);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ab
            public final boolean a(DownloadInfo downloadInfo) {
                return acVar.a(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ab
            public final boolean b(DownloadInfo downloadInfo) {
                return acVar.b(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ab
            public final boolean c(DownloadInfo downloadInfo) {
                return acVar.c(downloadInfo);
            }
        };
    }

    public static ac a(final ab abVar) {
        if (abVar == null) {
            return null;
        }
        return new ac() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass10 */

            static {
                Covode.recordClassIndex(37487);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ac
            public final boolean a(DownloadInfo downloadInfo) {
                try {
                    return abVar.a(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.ac
            public final boolean b(DownloadInfo downloadInfo) {
                try {
                    return abVar.b(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.ac
            public final boolean c(DownloadInfo downloadInfo) {
                try {
                    return abVar.c(downloadInfo);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static e a(final q qVar) {
        if (qVar == null) {
            return null;
        }
        return new e.a() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass29 */

            static {
                Covode.recordClassIndex(37519);
            }

            @Override // com.ss.android.socialbase.downloader.depend.e
            public final Uri a(String str, String str2) {
                return qVar.a(str, str2);
            }
        };
    }

    public static q a(final e eVar) {
        if (eVar == null) {
            return null;
        }
        return new q() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass24 */

            static {
                Covode.recordClassIndex(37514);
            }

            @Override // com.ss.android.socialbase.downloader.depend.q
            public final Uri a(String str, String str2) {
                try {
                    return eVar.a(str, str2);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
        };
    }

    public static x a(final y yVar) {
        if (yVar == null) {
            return null;
        }
        return new x.a() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass23 */

            static {
                Covode.recordClassIndex(37513);
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public final String a() {
                return yVar.a();
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public final boolean a(boolean z) {
                return yVar.a(z);
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public final void a(int i2, DownloadInfo downloadInfo, String str, String str2) {
                yVar.a(i2, downloadInfo, str, str2);
            }
        };
    }

    public static y a(final x xVar) {
        if (xVar == null) {
            return null;
        }
        return new y() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass7 */

            static {
                Covode.recordClassIndex(37526);
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public final String a() {
                try {
                    return xVar.a();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return null;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public final boolean a(boolean z) {
                try {
                    return xVar.a(z);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.y
            public final void a(int i2, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    xVar.a(i2, downloadInfo, str, str2);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    public static g a(final IDownloadListener iDownloadListener, final boolean z) {
        if (iDownloadListener == null) {
            return null;
        }
        return new g.a() {
            /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12 */

            static {
                Covode.recordClassIndex(37489);
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final int a() {
                return iDownloadListener.hashCode();
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void a(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37490);
                        }

                        public final void run() {
                            iDownloadListener.onPrepare(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPrepare(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void b(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(37497);
                        }

                        public final void run() {
                            iDownloadListener.onStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onStart(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void c(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(37498);
                        }

                        public final void run() {
                            iDownloadListener.onProgress(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onProgress(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void d(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(37499);
                        }

                        public final void run() {
                            iDownloadListener.onPause(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPause(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void e(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(37500);
                        }

                        public final void run() {
                            iDownloadListener.onSuccessed(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onSuccessed(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void f(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass10 */

                        static {
                            Covode.recordClassIndex(37491);
                        }

                        public final void run() {
                            iDownloadListener.onCanceled(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onCanceled(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void g(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass11 */

                        static {
                            Covode.recordClassIndex(37492);
                        }

                        public final void run() {
                            iDownloadListener.onFirstStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstStart(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void h(final DownloadInfo downloadInfo) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass12 */

                        static {
                            Covode.recordClassIndex(37493);
                        }

                        public final void run() {
                            iDownloadListener.onFirstSuccess(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstSuccess(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void i(final DownloadInfo downloadInfo) {
                IDownloadListener iDownloadListener = iDownloadListener;
                if (!(iDownloadListener instanceof p)) {
                    return;
                }
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(37496);
                        }

                        public final void run() {
                            ((p) iDownloadListener).a(downloadInfo);
                        }
                    });
                } else {
                    ((p) iDownloadListener).a(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void a(final DownloadInfo downloadInfo, final BaseException baseException) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(37501);
                        }

                        public final void run() {
                            iDownloadListener.onFailed(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onFailed(downloadInfo, baseException);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void b(final DownloadInfo downloadInfo, final BaseException baseException) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(37494);
                        }

                        public final void run() {
                            iDownloadListener.onRetry(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetry(downloadInfo, baseException);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void c(final DownloadInfo downloadInfo, final BaseException baseException) {
                if (z) {
                    h.f60759a.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass12.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(37495);
                        }

                        public final void run() {
                            iDownloadListener.onRetryDelay(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                }
            }
        };
    }
}

package com.ss.android.socialbase.downloader.model;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.b.g;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.o;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.v;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.downloader.r;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class DownloadTask {
    private boolean autoSetHashCodeForSameTask;
    private i chunkAdjustCalculator;
    private j chunkStrategy;
    private IDownloadDepend depend;
    private o diskSpaceHandler;
    private final List<k> downloadCompleteHandlers;
    private DownloadInfo downloadInfo;
    private DownloadInfo.a downloadInfoBuilder;
    private q fileUriProvider;
    private u forbiddenHandler;
    private int hashCodeForSameTask;
    private v interceptor;
    private final SparseArray<IDownloadListener> mainThreadListeners;
    private w monitorDepend;
    private boolean needDelayForCacheSync;
    private ac notificationClickCallback;
    private y notificationEventListener;
    private final SparseArray<IDownloadListener> notificationListeners;
    private com.ss.android.socialbase.downloader.downloader.u retryDelayTimeCalculator;
    private final SparseArray<h> singleListenerHashCodeMap;
    private final Map<h, IDownloadListener> singleListenerMap;
    private final SparseArray<IDownloadListener> subThreadListeners;

    static {
        Covode.recordClassIndex(37537);
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        return this;
    }

    public i getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public j getChunkStrategy() {
        return this.chunkStrategy;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public o getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public List<k> getDownloadCompleteHandlers() {
        return this.downloadCompleteHandlers;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public q getFileUriProvider() {
        return this.fileUriProvider;
    }

    public u getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public int getHashCodeForSameTask() {
        return this.hashCodeForSameTask;
    }

    public v getInterceptor() {
        return this.interceptor;
    }

    public w getMonitorDepend() {
        return this.monitorDepend;
    }

    public ac getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public y getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public com.ss.android.socialbase.downloader.downloader.u getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isAutoSetHashCodeForSameTask() {
        return this.autoSetHashCodeForSameTask;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public boolean canShowNotification() {
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 != null) {
            return downloadInfo2.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 == null) {
            return 0;
        }
        return downloadInfo2.getId();
    }

    private void setChunkCalculator() {
        if (this.downloadInfo.getThrottleNetSpeed() > 0) {
            chunkStategy(new j() {
                /* class com.ss.android.socialbase.downloader.model.DownloadTask.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37539);
                }

                @Override // com.ss.android.socialbase.downloader.downloader.j
                public final int a(long j2) {
                    return 1;
                }
            });
        }
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadCompleteHandlers = new ArrayList();
        this.autoSetHashCodeForSameTask = true;
        this.downloadInfoBuilder = new DownloadInfo.a();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public synchronized int autoCalAndGetHashCodeForSameTask() {
        int i2;
        MethodCollector.i(10249);
        IDownloadListener singleDownloadListener = getSingleDownloadListener(h.MAIN);
        if (!(singleDownloadListener == null && (singleDownloadListener = getSingleDownloadListener(h.SUB)) == null)) {
            this.hashCodeForSameTask = singleDownloadListener.hashCode();
        }
        i2 = this.hashCodeForSameTask;
        MethodCollector.o(10249);
        return i2;
    }

    public void addListenerToDownloadingSameTask() {
        a.b("DownloadTask", "same task just tryDownloading, so add listener in last task instead of tryDownload");
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (downloadInfo2 != null && !downloadInfo2.isAddListenerToSameTask()) {
            this.downloadInfo.setAddListenerToSameTask(true);
        }
        addListenerToDownloadingSameTask(h.MAIN);
        addListenerToDownloadingSameTask(h.SUB);
        com.ss.android.socialbase.downloader.f.a.a(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public int download() {
        int i2;
        this.downloadInfo = this.downloadInfoBuilder.a();
        DownloadInfo b2 = c.q().b(this.downloadInfo.getId());
        if (b2 == null) {
            this.downloadInfo.generateTaskId();
            com.ss.android.socialbase.downloader.f.a.a(this, (BaseException) null, 0);
        } else {
            this.downloadInfo.copyTaskIdFromCacheData(b2);
        }
        setChunkCalculator();
        d a2 = d.a();
        com.ss.android.socialbase.downloader.downloader.o a3 = a2.a(this);
        if (a3 == null) {
            w monitorDepend2 = getMonitorDepend();
            DownloadInfo downloadInfo2 = getDownloadInfo();
            BaseException baseException = new BaseException(1003, "tryDownload but getDownloadHandler failed");
            if (getDownloadInfo() != null) {
                i2 = getDownloadInfo().getStatus();
            } else {
                i2 = 0;
            }
            com.ss.android.socialbase.downloader.f.a.a(monitorDepend2, downloadInfo2, baseException, i2);
        } else if (isNeedDelayForCacheSync()) {
            a2.f60440a.postDelayed(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE  
                  (wrap: android.os.Handler : 0x005e: IGET  (r3v0 android.os.Handler) = (r5v0 'a2' com.ss.android.socialbase.downloader.downloader.d) com.ss.android.socialbase.downloader.downloader.d.a android.os.Handler)
                  (wrap: com.ss.android.socialbase.downloader.downloader.d$1 : 0x0062: CONSTRUCTOR  (r2v0 com.ss.android.socialbase.downloader.downloader.d$1) = 
                  (r5v0 'a2' com.ss.android.socialbase.downloader.downloader.d)
                  (r1v2 'a3' com.ss.android.socialbase.downloader.downloader.o)
                  (r6v0 'this' com.ss.android.socialbase.downloader.model.DownloadTask A[IMMUTABLE_TYPE, THIS])
                 call: com.ss.android.socialbase.downloader.downloader.d.1.<init>(com.ss.android.socialbase.downloader.downloader.d, com.ss.android.socialbase.downloader.downloader.o, com.ss.android.socialbase.downloader.model.DownloadTask):void type: CONSTRUCTOR)
                  (500 long)
                 type: VIRTUAL call: android.os.Handler.postDelayed(java.lang.Runnable, long):boolean in method: com.ss.android.socialbase.downloader.model.DownloadTask.download():int, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r2v0 com.ss.android.socialbase.downloader.downloader.d$1) = 
                  (r5v0 'a2' com.ss.android.socialbase.downloader.downloader.d)
                  (r1v2 'a3' com.ss.android.socialbase.downloader.downloader.o)
                  (r6v0 'this' com.ss.android.socialbase.downloader.model.DownloadTask A[IMMUTABLE_TYPE, THIS])
                 call: com.ss.android.socialbase.downloader.downloader.d.1.<init>(com.ss.android.socialbase.downloader.downloader.d, com.ss.android.socialbase.downloader.downloader.o, com.ss.android.socialbase.downloader.model.DownloadTask):void type: CONSTRUCTOR in method: com.ss.android.socialbase.downloader.model.DownloadTask.download():int, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.socialbase.downloader.downloader.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.model.DownloadTask.download():int");
        }

        public DownloadTask autoSetHashCodeForSameTask(boolean z) {
            this.autoSetHashCodeForSameTask = z;
            return this;
        }

        public DownloadTask chunkAdjustCalculator(i iVar) {
            this.chunkAdjustCalculator = iVar;
            return this;
        }

        public DownloadTask chunkStategy(j jVar) {
            this.chunkStrategy = jVar;
            return this;
        }

        public DownloadTask depend(IDownloadDepend iDownloadDepend) {
            this.depend = iDownloadDepend;
            return this;
        }

        public DownloadTask diskSpaceHandler(o oVar) {
            this.diskSpaceHandler = oVar;
            return this;
        }

        public DownloadTask fileUriProvider(q qVar) {
            this.fileUriProvider = qVar;
            return this;
        }

        public DownloadTask forbiddenHandler(u uVar) {
            this.forbiddenHandler = uVar;
            return this;
        }

        public DownloadTask hashCodeForSameTask(int i2) {
            this.hashCodeForSameTask = i2;
            return this;
        }

        public DownloadTask interceptor(v vVar) {
            this.interceptor = vVar;
            return this;
        }

        public DownloadTask monitorDepend(w wVar) {
            this.monitorDepend = wVar;
            return this;
        }

        public DownloadTask notificationClickCallback(ac acVar) {
            this.notificationClickCallback = acVar;
            return this;
        }

        public DownloadTask notificationEventListener(y yVar) {
            this.notificationEventListener = yVar;
            return this;
        }

        public DownloadTask retryDelayTimeCalculator(com.ss.android.socialbase.downloader.downloader.u uVar) {
            this.retryDelayTimeCalculator = uVar;
            return this;
        }

        public void setNeedDelayForCacheSync(boolean z) {
            this.needDelayForCacheSync = z;
        }

        public void setNotificationEventListener(y yVar) {
            this.notificationEventListener = yVar;
        }

        public DownloadTask(DownloadInfo downloadInfo2) {
            this();
            this.downloadInfo = downloadInfo2;
        }

        public DownloadTask addListenerToSameTask(boolean z) {
            this.downloadInfoBuilder.O = z;
            return this;
        }

        public DownloadTask addTTNetCommonParam(boolean z) {
            this.downloadInfoBuilder.X = z;
            return this;
        }

        public DownloadTask autoResumed(boolean z) {
            this.downloadInfoBuilder.w = z;
            return this;
        }

        public DownloadTask backUpUrlRetryCount(int i2) {
            this.downloadInfoBuilder.f60852m = i2;
            return this;
        }

        public DownloadTask backUpUrls(List<String> list) {
            this.downloadInfoBuilder.r = list;
            return this;
        }

        public DownloadTask deleteCacheIfCheckFailed(boolean z) {
            this.downloadInfoBuilder.V = z;
            return this;
        }

        public DownloadTask distinctDirectory(boolean z) {
            this.downloadInfoBuilder.Y = z;
            return this;
        }

        public DownloadTask downloadSetting(JSONObject jSONObject) {
            this.downloadInfoBuilder.P = jSONObject;
            return this;
        }

        public DownloadTask enqueueType(g gVar) {
            this.downloadInfoBuilder.H = gVar;
            return this;
        }

        public DownloadTask executorGroup(int i2) {
            this.downloadInfoBuilder.T = i2;
            return this;
        }

        public DownloadTask expectFileLength(long j2) {
            this.downloadInfoBuilder.C = j2;
            return this;
        }

        public DownloadTask expiredRedownload(boolean z) {
            this.downloadInfoBuilder.U = z;
            return this;
        }

        public DownloadTask extra(String str) {
            this.downloadInfoBuilder.f60846g = str;
            return this;
        }

        public DownloadTask extraHeaders(List<HttpHeader> list) {
            this.downloadInfoBuilder.f60847h = list;
            return this;
        }

        public DownloadTask extraMonitorStatus(int[] iArr) {
            this.downloadInfoBuilder.S = iArr;
            return this;
        }

        public DownloadTask force(boolean z) {
            this.downloadInfoBuilder.n = z;
            return this;
        }

        public DownloadTask headConnectionAvailable(boolean z) {
            this.downloadInfoBuilder.I = z;
            return this;
        }

        public DownloadTask iconUrl(String str) {
            this.downloadInfoBuilder.L = str;
            return this;
        }

        public DownloadTask ignoreDataVerify(boolean z) {
            this.downloadInfoBuilder.J = z;
            return this;
        }

        public DownloadTask isOpenLimitSpeed(boolean z) {
            this.downloadInfoBuilder.N = z;
            return this;
        }

        public DownloadTask maxBytes(int i2) {
            this.downloadInfoBuilder.f60848i = i2;
            return this;
        }

        public DownloadTask maxProgressCount(int i2) {
            this.downloadInfoBuilder.p = i2;
            return this;
        }

        public DownloadTask md5(String str) {
            this.downloadInfoBuilder.B = str;
            return this;
        }

        public DownloadTask mimeType(String str) {
            this.downloadInfoBuilder.u = str;
            return this;
        }

        public DownloadTask minProgressTimeMsInterval(int i2) {
            this.downloadInfoBuilder.q = i2;
            return this;
        }

        public DownloadTask monitorScene(String str) {
            this.downloadInfoBuilder.R = str;
            return this;
        }

        public DownloadTask name(String str) {
            this.downloadInfoBuilder.f60840a = str;
            return this;
        }

        public DownloadTask needChunkDowngradeRetry(boolean z) {
            this.downloadInfoBuilder.K = z;
            return this;
        }

        public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
            this.downloadInfoBuilder.y = z;
            return this;
        }

        public DownloadTask needHttpsToHttpRetry(boolean z) {
            this.downloadInfoBuilder.v = z;
            return this;
        }

        public DownloadTask needIndependentProcess(boolean z) {
            this.downloadInfoBuilder.G = z;
            return this;
        }

        public DownloadTask needPostProgress(boolean z) {
            this.downloadInfoBuilder.o = z;
            return this;
        }

        public DownloadTask needRetryDelay(boolean z) {
            this.downloadInfoBuilder.D = z;
            return this;
        }

        public DownloadTask needReuseChunkRunnable(boolean z) {
            this.downloadInfoBuilder.z = z;
            return this;
        }

        public DownloadTask needReuseFirstConnection(boolean z) {
            this.downloadInfoBuilder.F = z;
            return this;
        }

        public DownloadTask needSDKMonitor(boolean z) {
            this.downloadInfoBuilder.Q = z;
            return this;
        }

        public DownloadTask onlyWifi(boolean z) {
            this.downloadInfoBuilder.f60845f = z;
            return this;
        }

        public DownloadTask outIp(String[] strArr) {
            this.downloadInfoBuilder.f60849j = strArr;
            return this;
        }

        public DownloadTask outSize(int[] iArr) {
            this.downloadInfoBuilder.f60850k = iArr;
            return this;
        }

        public DownloadTask packageName(String str) {
            this.downloadInfoBuilder.A = str;
            return this;
        }

        public DownloadTask retryCount(int i2) {
            this.downloadInfoBuilder.f60851l = i2;
            return this;
        }

        public DownloadTask retryDelayTimeArray(String str) {
            this.downloadInfoBuilder.E = str;
            return this;
        }

        public DownloadTask savePath(String str) {
            this.downloadInfoBuilder.f60843d = str;
            return this;
        }

        public DownloadTask setAutoInstall(boolean z) {
            this.downloadInfoBuilder.t = z;
            return this;
        }

        public DownloadTask showNotification(boolean z) {
            this.downloadInfoBuilder.s = z;
            return this;
        }

        public DownloadTask showNotificationForAutoResumed(boolean z) {
            this.downloadInfoBuilder.x = z;
            return this;
        }

        public DownloadTask taskKey(String str) {
            this.downloadInfoBuilder.Z = str;
            return this;
        }

        public DownloadTask tempPath(String str) {
            this.downloadInfoBuilder.f60844e = str;
            return this;
        }

        public DownloadTask throttleNetSpeed(long j2) {
            this.downloadInfoBuilder.M = j2;
            return this;
        }

        public DownloadTask title(String str) {
            this.downloadInfoBuilder.f60841b = str;
            return this;
        }

        public DownloadTask ttnetProtectTimeout(long j2) {
            this.downloadInfoBuilder.W = j2;
            return this;
        }

        public DownloadTask url(String str) {
            this.downloadInfoBuilder.f60842c = str;
            return this;
        }

        public void asyncDownload(final r rVar) {
            com.ss.android.socialbase.downloader.j.d.f60723a.execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.model.DownloadTask.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37538);
                }

                public final void run() {
                    DownloadTask.this.download();
                }
            });
        }

        public IDownloadListener getSingleDownloadListener(h hVar) {
            return this.singleListenerMap.get(hVar);
        }

        public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
            if (iDownloadListener == null) {
                return this;
            }
            return mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        }

        public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
            if (iDownloadListener == null) {
                return this;
            }
            return notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        }

        public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
            if (iDownloadListener == null) {
                return this;
            }
            return subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        }

        public int getDownloadListenerSize(h hVar) {
            int size;
            MethodCollector.i(9940);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null) {
                MethodCollector.o(9940);
                return 0;
            }
            synchronized (downloadListeners) {
                try {
                    size = downloadListeners.size();
                } finally {
                    MethodCollector.o(9940);
                }
            }
            return size;
        }

        public SparseArray<IDownloadListener> getDownloadListeners(h hVar) {
            if (hVar == h.MAIN) {
                return this.mainThreadListeners;
            }
            if (hVar == h.SUB) {
                return this.subThreadListeners;
            }
            if (hVar == h.NOTIFICATION) {
                return this.notificationListeners;
            }
            return null;
        }

        public DownloadTask setDownloadCompleteHandlers(List<k> list) {
            if (list != null && !list.isEmpty()) {
                for (k kVar : list) {
                    addDownloadCompleteHandler(kVar);
                }
            }
            return this;
        }

        private void addListenerToDownloadingSameTask(h hVar) {
            MethodCollector.i(9938);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            synchronized (downloadListeners) {
                for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                    try {
                        IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i2));
                        if (iDownloadListener != null) {
                            d.a().b(getDownloadId(), iDownloadListener, hVar, false);
                        }
                    } finally {
                        MethodCollector.o(9938);
                    }
                }
            }
        }

        public DownloadTask addDownloadCompleteHandler(k kVar) {
            MethodCollector.i(11054);
            synchronized (this.downloadCompleteHandlers) {
                if (kVar != null) {
                    try {
                        if (!this.downloadCompleteHandlers.contains(kVar)) {
                            this.downloadCompleteHandlers.add(kVar);
                            return this;
                        }
                    } finally {
                        MethodCollector.o(11054);
                    }
                }
                MethodCollector.o(11054);
                return this;
            }
        }

        public k getDownloadCompleteHandlerByIndex(int i2) {
            MethodCollector.i(10886);
            synchronized (this.downloadCompleteHandlers) {
                try {
                    if (i2 < this.downloadCompleteHandlers.size()) {
                        return this.downloadCompleteHandlers.get(i2);
                    }
                    MethodCollector.o(10886);
                    return null;
                } finally {
                    MethodCollector.o(10886);
                }
            }
        }

        public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
            MethodCollector.i(10880);
            this.chunkAdjustCalculator = downloadTask.chunkAdjustCalculator;
            this.chunkStrategy = downloadTask.chunkStrategy;
            this.singleListenerMap.clear();
            this.singleListenerMap.putAll(downloadTask.singleListenerMap);
            synchronized (this.mainThreadListeners) {
                try {
                    this.mainThreadListeners.clear();
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                } finally {
                    MethodCollector.o(10880);
                }
            }
            synchronized (this.subThreadListeners) {
                try {
                    this.subThreadListeners.clear();
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                } finally {
                    MethodCollector.o(10880);
                }
            }
            synchronized (this.notificationListeners) {
                try {
                    this.notificationListeners.clear();
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                } finally {
                    MethodCollector.o(10880);
                }
            }
            this.notificationEventListener = downloadTask.notificationEventListener;
            this.interceptor = downloadTask.interceptor;
            this.depend = downloadTask.depend;
            this.monitorDepend = downloadTask.monitorDepend;
            this.forbiddenHandler = downloadTask.forbiddenHandler;
            this.diskSpaceHandler = downloadTask.diskSpaceHandler;
            this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
            this.notificationClickCallback = downloadTask.notificationClickCallback;
            this.fileUriProvider = downloadTask.fileUriProvider;
            synchronized (this.downloadCompleteHandlers) {
                try {
                    this.downloadCompleteHandlers.clear();
                    this.downloadCompleteHandlers.addAll(downloadTask.downloadCompleteHandlers);
                } finally {
                    MethodCollector.o(10880);
                }
            }
        }

        public void copyListenerFromPendingTask(DownloadTask downloadTask) {
            MethodCollector.i(10883);
            for (Map.Entry<h, IDownloadListener> entry : downloadTask.singleListenerMap.entrySet()) {
                if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                    this.singleListenerMap.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                if (downloadTask.mainThreadListeners.size() != 0) {
                    synchronized (this.mainThreadListeners) {
                        try {
                            removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                            addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                        } catch (Throwable th) {
                            MethodCollector.o(10883);
                            throw th;
                        }
                    }
                }
                if (downloadTask.subThreadListeners.size() != 0) {
                    synchronized (this.subThreadListeners) {
                        try {
                            removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                            addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                        } catch (Throwable th2) {
                            MethodCollector.o(10883);
                            throw th2;
                        }
                    }
                }
                if (downloadTask.notificationListeners.size() != 0) {
                    synchronized (this.notificationListeners) {
                        try {
                            removeAll(this.notificationListeners, downloadTask.notificationListeners);
                            addAll(downloadTask.notificationListeners, this.notificationListeners);
                        } finally {
                            MethodCollector.o(10883);
                        }
                    }
                    return;
                }
                MethodCollector.o(10883);
            } catch (Throwable unused) {
                MethodCollector.o(10883);
            }
        }

        private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
            if (!(sparseArray == null || sparseArray2 == null)) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = sparseArray.keyAt(i2);
                    sparseArray2.put(keyAt, sparseArray.get(keyAt));
                }
            }
        }

        private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
            sparseArray.clear();
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                int keyAt = sparseArray2.keyAt(i2);
                IDownloadListener iDownloadListener = sparseArray2.get(keyAt);
                if (iDownloadListener != null) {
                    sparseArray.put(keyAt, iDownloadListener);
                }
            }
        }

        private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
            if (!(sparseArray == null || sparseArray2 == null)) {
                int size = sparseArray2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sparseArray.remove(sparseArray2.keyAt(i2));
                }
            }
        }

        public IDownloadListener getDownloadListenerByIndex(h hVar, int i2) {
            MethodCollector.i(10090);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null || i2 < 0) {
                MethodCollector.o(10090);
                return null;
            }
            synchronized (downloadListeners) {
                try {
                    if (i2 < downloadListeners.size()) {
                        return downloadListeners.get(downloadListeners.keyAt(i2));
                    }
                    MethodCollector.o(10090);
                    return null;
                } finally {
                    MethodCollector.o(10090);
                }
            }
        }

        public DownloadTask mainThreadListenerWithHashCode(int i2, IDownloadListener iDownloadListener) {
            MethodCollector.i(14257);
            if (iDownloadListener != null) {
                synchronized (this.mainThreadListeners) {
                    try {
                        this.mainThreadListeners.put(i2, iDownloadListener);
                    } finally {
                        MethodCollector.o(14257);
                    }
                }
                this.singleListenerMap.put(h.MAIN, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i2, h.MAIN);
                    } finally {
                        MethodCollector.o(14257);
                    }
                }
            }
            return this;
        }

        public DownloadTask notificationListenerWithHashCode(int i2, IDownloadListener iDownloadListener) {
            MethodCollector.i(14350);
            if (iDownloadListener != null) {
                synchronized (this.notificationListeners) {
                    try {
                        this.notificationListeners.put(i2, iDownloadListener);
                    } finally {
                        MethodCollector.o(14350);
                    }
                }
                this.singleListenerMap.put(h.NOTIFICATION, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i2, h.NOTIFICATION);
                    } finally {
                        MethodCollector.o(14350);
                    }
                }
            }
            return this;
        }

        public DownloadTask subThreadListenerWithHashCode(int i2, IDownloadListener iDownloadListener) {
            MethodCollector.i(14320);
            if (iDownloadListener != null) {
                synchronized (this.subThreadListeners) {
                    try {
                        this.subThreadListeners.put(i2, iDownloadListener);
                    } finally {
                        MethodCollector.o(14320);
                    }
                }
                this.singleListenerMap.put(h.SUB, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i2, h.SUB);
                    } finally {
                        MethodCollector.o(14320);
                    }
                }
            }
            return this;
        }

        public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, h hVar) {
            MethodCollector.i(10725);
            if (sparseArray == null) {
                MethodCollector.o(10725);
                return;
            }
            try {
                if (hVar == h.MAIN) {
                    synchronized (this.mainThreadListeners) {
                        try {
                            copyListeners(this.mainThreadListeners, sparseArray);
                        } finally {
                            MethodCollector.o(10725);
                        }
                    }
                } else if (hVar == h.SUB) {
                    synchronized (this.subThreadListeners) {
                        try {
                            copyListeners(this.subThreadListeners, sparseArray);
                        } finally {
                            MethodCollector.o(10725);
                        }
                    }
                } else if (hVar == h.NOTIFICATION) {
                    synchronized (this.notificationListeners) {
                        try {
                            copyListeners(this.notificationListeners, sparseArray);
                        } finally {
                            MethodCollector.o(10725);
                        }
                    }
                } else {
                    MethodCollector.o(10725);
                }
            } catch (Throwable unused) {
                MethodCollector.o(10725);
            }
        }

        public void addDownloadListener(int i2, IDownloadListener iDownloadListener, h hVar, boolean z) {
            Map<h, IDownloadListener> map;
            MethodCollector.i(10567);
            if (iDownloadListener == null) {
                MethodCollector.o(10567);
                return;
            }
            if (z && (map = this.singleListenerMap) != null) {
                map.put(hVar, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    try {
                        this.singleListenerHashCodeMap.put(i2, hVar);
                    } catch (Throwable th) {
                        MethodCollector.o(10567);
                        throw th;
                    }
                }
            }
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null) {
                MethodCollector.o(10567);
                return;
            }
            synchronized (downloadListeners) {
                try {
                    downloadListeners.put(i2, iDownloadListener);
                } finally {
                    MethodCollector.o(10567);
                }
            }
        }

        public void removeDownloadListener(int i2, IDownloadListener iDownloadListener, h hVar, boolean z) {
            int indexOfValue;
            MethodCollector.i(10416);
            SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners == null) {
                if (z && this.singleListenerMap.containsKey(hVar)) {
                    this.singleListenerMap.remove(hVar);
                }
                MethodCollector.o(10416);
                return;
            }
            synchronized (downloadListeners) {
                if (z) {
                    try {
                        if (this.singleListenerMap.containsKey(hVar)) {
                            iDownloadListener = this.singleListenerMap.get(hVar);
                            this.singleListenerMap.remove(hVar);
                        }
                        if (iDownloadListener != null && (indexOfValue = downloadListeners.indexOfValue(iDownloadListener)) >= 0 && indexOfValue < downloadListeners.size()) {
                            downloadListeners.removeAt(indexOfValue);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(10416);
                        throw th;
                    }
                } else {
                    downloadListeners.remove(i2);
                    synchronized (this.singleListenerHashCodeMap) {
                        try {
                            h hVar2 = this.singleListenerHashCodeMap.get(i2);
                            if (hVar2 != null && this.singleListenerMap.containsKey(hVar2)) {
                                this.singleListenerMap.remove(hVar2);
                                this.singleListenerHashCodeMap.remove(i2);
                            }
                        } catch (Throwable th2) {
                            MethodCollector.o(10416);
                            throw th2;
                        }
                    }
                }
            }
            MethodCollector.o(10416);
        }
    }

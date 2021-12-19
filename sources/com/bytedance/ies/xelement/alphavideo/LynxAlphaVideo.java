package com.bytedance.ies.xelement.alphavideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import h.f.b.z;
import h.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class LynxAlphaVideo extends UISimpleView<d> {

    /* renamed from: m  reason: collision with root package name */
    public static final b f36585m = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.controller.a f36586a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.c.a f36587b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36588c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36589d = true;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c> f36590e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.xelement.a.b f36591f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36592g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f36593h;

    /* renamed from: i  reason: collision with root package name */
    public String f36594i = "";

    /* renamed from: j  reason: collision with root package name */
    public final List<Integer> f36595j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final List<Integer> f36596k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f36597l = -1;
    private Set<String> n;
    private com.ss.android.ugc.aweme.live.alphaplayer.d.a<b> o;
    private boolean p;
    private boolean q;
    private final a r;

    public interface a {
        static {
            Covode.recordClassIndex(21978);
        }

        void a();

        void a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(21975);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -2133601602:
                    if (nextKey.equals("keep-last-frame")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setKeepLastFrame(z);
                        continue;
                    }
                    break;
                case -982450867:
                    if (nextKey.equals("poster")) {
                        setPoster(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setLoop(z);
                        continue;
                    }
                    break;
                case 838895478:
                    if (nextKey.equals("last-frame")) {
                        setLastFrame(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        boolean z2 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setAutoPlay(z2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(21979);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class k extends com.lynx.tasm.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f36613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36614c;

        static {
            Covode.recordClassIndex(21988);
        }

        @Override // com.lynx.tasm.c.b
        public final Map<String, Object> a() {
            return this.f36613b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(LynxAlphaVideo lynxAlphaVideo, Map map, String str, int i2, String str2) {
            super(i2, str2);
            this.f36612a = lynxAlphaVideo;
            this.f36613b = map;
            this.f36614c = str;
        }
    }

    public final void a(String str, Map<String, Object> map) {
        com.lynx.tasm.behavior.j jVar;
        com.lynx.tasm.c cVar;
        Set<String> set = this.n;
        if (set != null && set.contains(str) && (jVar = this.mContext) != null && (cVar = jVar.f55897e) != null) {
            cVar.a(new k(this, map, str, getSign(), str));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void destroy() {
        super.destroy();
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onReset() {
        super.onReset();
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void onDetach() {
        super.onDetach();
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
        if (aVar != null) {
            aVar.b((ViewGroup) this.mView);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<V> implements Callable<com.bytedance.ies.xelement.alphavideo.a.c<Bitmap>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36616b;

        static {
            Covode.recordClassIndex(21989);
        }

        l(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f36615a = lynxAlphaVideo;
            this.f36616b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ com.bytedance.ies.xelement.alphavideo.a.c<Bitmap> call() {
            final z.e eVar = new z.e();
            eVar.element = null;
            this.f36615a.a(this.f36616b, new a(this) {
                /* class com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f36617a;

                static {
                    Covode.recordClassIndex(21990);
                }

                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.a
                public final void a() {
                    com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = this.f36617a.f36615a.f36587b;
                    if (aVar != null) {
                        aVar.b(true);
                    }
                    this.f36617a.f36615a.a("set video lastFrame failed, lastFrame is " + this.f36617a.f36616b, this.f36617a.f36615a.f36594i, -16);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.graphics.Bitmap */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.a
                public final void a(Bitmap bitmap) {
                    if (bitmap != 0) {
                        eVar.element = bitmap;
                    }
                }

                {
                    this.f36617a = r1;
                }
            });
            return new com.bytedance.ies.xelement.alphavideo.a.c((Object) eVar.element);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<V> implements Callable<com.bytedance.ies.xelement.alphavideo.a.c<Bitmap>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36623b;

        static {
            Covode.recordClassIndex(21993);
        }

        o(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f36622a = lynxAlphaVideo;
            this.f36623b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ com.bytedance.ies.xelement.alphavideo.a.c<Bitmap> call() {
            final z.e eVar = new z.e();
            eVar.element = null;
            this.f36622a.a(this.f36623b, new a(this) {
                /* class com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.o.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o f36624a;

                static {
                    Covode.recordClassIndex(21994);
                }

                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.a
                public final void a() {
                    this.f36624a.f36622a.a("set video poster failed, poster is " + this.f36624a.f36623b, this.f36624a.f36622a.f36594i, -15);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.graphics.Bitmap */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo.a
                public final void a(Bitmap bitmap) {
                    if (bitmap != 0) {
                        eVar.element = bitmap;
                    }
                }

                {
                    this.f36624a = r1;
                }
            });
            return new com.bytedance.ies.xelement.alphavideo.a.c((Object) eVar.element);
        }
    }

    private static JavaOnlyMap a() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("success", true);
        javaOnlyMap.putMap("data", new JavaOnlyMap());
        return javaOnlyMap;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void onAttach() {
        super.onAttach();
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
        if (aVar != null && this.f36588c) {
            aVar.a((ViewGroup) this.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
        if (aVar == null) {
            h.f.b.l.a();
        }
        aVar.a().layout(0, 0, getWidth(), getHeight());
    }

    private void b() {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
        if (aVar == null) {
            h.f.b.l.a();
        }
        aVar.g();
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar2 = this.f36586a;
        if (aVar2 == null) {
            h.f.b.l.a();
        }
        aVar2.b((ViewGroup) this.mView);
        ((d) this.mView).setMPoster(null);
        ((d) this.mView).setMLastFrame(null);
    }

    public static final class d implements com.ss.android.ugc.aweme.live.alphaplayer.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36599a;

        static {
            Covode.recordClassIndex(21981);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void a() {
            LLog.b("x-alpha-video", "start action, url is " + this.f36599a.f36594i);
            this.f36599a.a("start", LynxAlphaVideo.a(1, "start video", (JavaOnlyMap) null));
            ((d) this.f36599a.mView).setMIsShowPoster(false);
            ((d) this.f36599a.mView).f36658b = null;
            ((d) this.f36599a.mView).invalidate();
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void b() {
            LLog.b("x-alpha-video", "endAction action, url is " + this.f36599a.f36594i);
            ((d) this.f36599a.mView).setMIsShowLastFrame(true);
            ((d) this.f36599a.mView).setMLastFrame(this.f36599a.f36593h);
            ((d) this.f36599a.mView).setMPoster(null);
            ((d) this.f36599a.mView).setMIsShowPoster(false);
            ((d) this.f36599a.mView).f36657a = null;
            ((d) this.f36599a.mView).invalidate();
            this.f36599a.a("completion", LynxAlphaVideo.a(2, "play video success", (JavaOnlyMap) null));
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36599a.f36586a;
            if (aVar == null) {
                h.f.b.l.a();
            }
            aVar.f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(LynxAlphaVideo lynxAlphaVideo) {
            this.f36599a = lynxAlphaVideo;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void a(int i2, int i3, a.d dVar) {
            h.f.b.l.c(dVar, "");
            LLog.b("x-alpha-video", "onVideoSizeChange: videoWidth = " + i2 + " videoHeight = " + i3 + " scaleType = " + dVar.name());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable<com.bytedance.ies.xelement.alphavideo.a.c<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36609c;

        static {
            Covode.recordClassIndex(21985);
        }

        h(LynxAlphaVideo lynxAlphaVideo, String str, String str2) {
            this.f36607a = lynxAlphaVideo;
            this.f36608b = str;
            this.f36609c = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public com.bytedance.ies.xelement.alphavideo.a.c<String> call() {
            String str;
            StringBuilder append;
            try {
                File file = new File(this.f36608b);
                if (file.isDirectory()) {
                    LLog.b("x-alpha-video", "try to load resource which is already unzip, directUrl is " + this.f36609c);
                    LynxAlphaVideo lynxAlphaVideo = this.f36607a;
                    lynxAlphaVideo.f36587b = lynxAlphaVideo.b(file.getAbsolutePath() + File.separator);
                    return new com.bytedance.ies.xelement.alphavideo.a.c<>("success");
                } else if (!h.m.p.c(this.f36608b, ".zip", false)) {
                    return new com.bytedance.ies.xelement.alphavideo.a.c<>("fail, resource type is not support");
                } else {
                    LLog.b("x-alpha-video", "try to load .zip resource, directUrl is " + this.f36609c);
                    StringBuilder sb = new StringBuilder();
                    com.lynx.tasm.behavior.j jVar = this.f36607a.mContext;
                    h.f.b.l.a((Object) jVar, "");
                    File cacheDir = jVar.getCacheDir();
                    h.f.b.l.a((Object) cacheDir, "");
                    String sb2 = sb.append(cacheDir.getAbsolutePath()).append(File.separator).append(UUID.randomUUID().toString()).toString();
                    try {
                        str = com.bytedance.ies.xelement.alphavideo.a.e.a(file, sb2);
                        h.f.b.l.a((Object) str, "");
                    } catch (Exception e2) {
                        this.f36607a.a("unzip resource failed, error msg is " + e2.getMessage(), this.f36607a.f36594i, -2);
                        new com.bytedance.ies.xelement.alphavideo.a.c("fail");
                        str = "";
                    }
                    if (h.f.b.l.a((Object) str, (Object) "")) {
                        append = new StringBuilder().append(sb2).append(File.separator);
                    } else {
                        append = new StringBuilder().append(sb2).append(File.separator).append(str);
                    }
                    String sb3 = append.toString();
                    LynxAlphaVideo lynxAlphaVideo2 = this.f36607a;
                    lynxAlphaVideo2.f36587b = lynxAlphaVideo2.b(sb3);
                    return new com.bytedance.ies.xelement.alphavideo.a.c<>("success");
                }
            } catch (Exception e3) {
                return new com.bytedance.ies.xelement.alphavideo.a.c<>("fail, error msg is ".concat(String.valueOf(e3)));
            }
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.live.alphaplayer.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36600a;

        static {
            Covode.recordClassIndex(21982);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LynxAlphaVideo lynxAlphaVideo) {
            this.f36600a = lynxAlphaVideo;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.b
        public final void a(String str, Exception exc) {
            h.f.b.l.c(str, "");
            h.f.b.l.c(exc, "");
            this.f36600a.a("failed when init media player, and player is " + str + ", error msg is " + exc + ' ', this.f36600a.f36594i, -8);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.b
        public final void a(boolean z, String str, int i2, int i3, String str2) {
            h.f.b.l.c(str, "");
            h.f.b.l.c(str2, "");
            if (!z) {
                this.f36600a.a("failed when monitor: state = " + z + ", playerType = " + str + ", what = " + i2 + ", extra = " + i3 + ", errorInfo = " + str2, this.f36600a.f36594i, -9);
            }
        }
    }

    public static final class g extends com.facebook.imagepipeline.f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f36605b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.d.c f36606c;

        static {
            Covode.recordClassIndex(21984);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            this.f36604a.a();
            if (cVar != null) {
                cVar.g();
            }
            this.f36605b.countDown();
        }

        @Override // com.facebook.imagepipeline.f.b
        public final void a(Bitmap bitmap) {
            MethodCollector.i(6007);
            if (this.f36606c.b() && bitmap != null) {
                this.f36604a.a(bitmap.copy(bitmap.getConfig(), true));
                this.f36606c.g();
            }
            this.f36605b.countDown();
            MethodCollector.o(6007);
        }

        g(a aVar, CountDownLatch countDownLatch, com.facebook.d.c cVar) {
            this.f36604a = aVar;
            this.f36605b = countDownLatch;
            this.f36606c = cVar;
        }
    }

    private static Context a(com.lynx.tasm.behavior.j jVar) {
        Context applicationContext = jVar.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        Set<String> set;
        super.setEvents(map);
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        this.n = set;
    }

    @com.lynx.tasm.behavior.m(a = "keep-last-frame", f = false)
    public final void setKeepLastFrame(boolean z) {
        if (this.q != z) {
            com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = this.f36587b;
            if (aVar != null) {
                aVar.b(!z);
            }
            this.q = z;
        }
    }

    @com.lynx.tasm.behavior.m(a = "loop", f = false)
    public final void setLoop(boolean z) {
        this.p = z;
        com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = this.f36587b;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements com.bytedance.ies.xelement.alphavideo.a.b<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36611a;

        static {
            Covode.recordClassIndex(21987);
        }

        j(LynxAlphaVideo lynxAlphaVideo) {
            this.f36611a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.a.b
        public final /* synthetic */ void a(Throwable th) {
            this.f36611a.a("unknown exception, ".concat(String.valueOf(th)), this.f36611a.f36594i, -6);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements com.bytedance.ies.xelement.alphavideo.a.b<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36626a;

        static {
            Covode.recordClassIndex(21995);
        }

        p(LynxAlphaVideo lynxAlphaVideo) {
            this.f36626a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.a.b
        public final /* synthetic */ void a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            LynxAlphaVideo lynxAlphaVideo = this.f36626a;
            if (bitmap2 != null) {
                ((d) lynxAlphaVideo.mView).setMPoster(bitmap2);
                ((d) lynxAlphaVideo.mView).setMIsShowPoster(true);
                ((d) lynxAlphaVideo.mView).invalidate();
            }
        }
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    @com.lynx.tasm.behavior.m(a = "autoplay", f = true)
    public final void setAutoPlay(boolean z) {
        this.f36588c = z;
        View view = this.mView;
        if (view != null) {
            ((d) view).setMAutoPlay(z);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements com.bytedance.ies.xelement.alphavideo.a.b<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36619a;

        static {
            Covode.recordClassIndex(21991);
        }

        m(LynxAlphaVideo lynxAlphaVideo) {
            this.f36619a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.a.b
        public final /* synthetic */ void a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            LynxAlphaVideo lynxAlphaVideo = this.f36619a;
            if (bitmap2 != null) {
                com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = lynxAlphaVideo.f36587b;
                if (aVar != null) {
                    aVar.b(true);
                }
                lynxAlphaVideo.f36593h = bitmap2;
                ((d) lynxAlphaVideo.mView).setMLastFrame(lynxAlphaVideo.f36593h);
                ((d) lynxAlphaVideo.mView).setMIsShowLastFrame(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements com.bytedance.ies.xelement.alphavideo.a.b<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36620a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36621b;

        static {
            Covode.recordClassIndex(21992);
        }

        n(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f36620a = lynxAlphaVideo;
            this.f36621b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.a.b
        public final /* synthetic */ void a(Throwable th) {
            com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = this.f36620a.f36587b;
            if (aVar != null) {
                aVar.b(true);
            }
            this.f36620a.a("set video lastFrame failed, lastFrame is " + this.f36621b + ", error msg is " + th, this.f36620a.f36594i, -16);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<T> implements com.bytedance.ies.xelement.alphavideo.a.b<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36628b;

        static {
            Covode.recordClassIndex(21996);
        }

        q(LynxAlphaVideo lynxAlphaVideo, String str) {
            this.f36627a = lynxAlphaVideo;
            this.f36628b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.a.b
        public final /* synthetic */ void a(Throwable th) {
            this.f36627a.a("set video poster failed, poster is " + this.f36628b + ", error msg is " + th, this.f36627a.f36594i, -15);
        }
    }

    @com.lynx.tasm.behavior.m(a = "last-frame")
    public final void setLastFrame(String str) {
        h.f.b.l.c(str, "");
        new com.bytedance.ies.xelement.alphavideo.a.d(new l(this, str)).a(new m(this)).b(new n(this, str));
    }

    @com.lynx.tasm.behavior.m(a = "poster")
    public final void setPoster(String str) {
        h.f.b.l.c(str, "");
        new com.bytedance.ies.xelement.alphavideo.a.d(new o(this, str)).a(new p(this)).b(new q(this, str));
    }

    public static final class f extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36602b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f36603c;

        static {
            Covode.recordClassIndex(21983);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            LLog.b("x-alpha-video", "download resource success, and directUrl is " + this.f36602b);
            StringBuilder sb = new StringBuilder();
            com.lynx.tasm.behavior.j jVar = this.f36601a.mContext;
            h.f.b.l.a((Object) jVar, "");
            Context applicationContext = jVar.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.a((Object) applicationContext, "");
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = applicationContext.getCacheDir();
            }
            File file = com.ss.android.ugc.aweme.lancet.d.f107194b;
            h.f.b.l.a((Object) file, "");
            StringBuilder append = sb.append(file.getAbsolutePath()).append('/');
            Uri uri = this.f36603c;
            h.f.b.l.a((Object) uri, "");
            this.f36601a.a(append.append(uri.getLastPathSegment()).toString(), this.f36602b);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str = "download resource failed and resource is " + this.f36602b + ", error msg is " + baseException;
            LynxAlphaVideo lynxAlphaVideo = this.f36601a;
            lynxAlphaVideo.a(str, lynxAlphaVideo.f36594i, -12);
            this.f36601a.mContext.a(this.f36602b, "video", str);
        }

        f(LynxAlphaVideo lynxAlphaVideo, String str, Uri uri) {
            this.f36601a = lynxAlphaVideo;
            this.f36602b = str;
            this.f36603c = uri;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements com.bytedance.ies.xelement.alphavideo.a.b<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36610a;

        static {
            Covode.recordClassIndex(21986);
        }

        i(LynxAlphaVideo lynxAlphaVideo) {
            this.f36610a = lynxAlphaVideo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.xelement.alphavideo.a.b
        public final /* synthetic */ void a(String str) {
            LynxAlphaVideo lynxAlphaVideo = this.f36610a;
            if (str == "success") {
                lynxAlphaVideo.a("ready", LynxAlphaVideo.a(1, "load resource success", (JavaOnlyMap) null));
                if (lynxAlphaVideo.f36587b != null && lynxAlphaVideo.f36588c) {
                    com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = lynxAlphaVideo.f36586a;
                    if (aVar == null) {
                        h.f.b.l.a();
                    }
                    aVar.a((d) lynxAlphaVideo.mView);
                    com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar2 = lynxAlphaVideo.f36586a;
                    if (aVar2 == null) {
                        h.f.b.l.a();
                    }
                    aVar2.a(lynxAlphaVideo.f36587b);
                    return;
                }
                return;
            }
            lynxAlphaVideo.a("unknown exception, ".concat(String.valueOf(str)), lynxAlphaVideo.f36594i, -6);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.a.c, h.z> {
        final /* synthetic */ String $directUrl$inlined;
        final /* synthetic */ LynxAlphaVideo this$0;

        static {
            Covode.recordClassIndex(21997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(LynxAlphaVideo lynxAlphaVideo, String str) {
            super(1);
            this.this$0 = lynxAlphaVideo;
            this.$directUrl$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.xelement.a.c cVar) {
            String str;
            com.bytedance.ies.xelement.a.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            this.this$0.f36592g = true;
            this.this$0.f36591f = cVar2.f36583d;
            LLog.b("x-alpha-video", "load resource success: " + cVar2.f36581b + ", " + cVar2.f36582c);
            com.bytedance.ies.xelement.a.b bVar = cVar2.f36583d;
            if (bVar != null) {
                int i2 = c.f36656a[bVar.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    String str2 = cVar2.f36581b;
                    if (str2 != null) {
                        LynxAlphaVideo lynxAlphaVideo = this.this$0;
                        String str3 = this.$directUrl$inlined;
                        h.f.b.l.a((Object) str3, "");
                        lynxAlphaVideo.a(str2, str3);
                    }
                } else if (i2 == 3 && (str = cVar2.f36581b) != null) {
                    this.this$0.a(str);
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public d createView(Context context) {
        d dVar = new d(context);
        com.ss.android.ugc.aweme.live.alphaplayer.c a2 = new com.ss.android.ugc.aweme.live.alphaplayer.c().a(context).a(dVar).a();
        d dVar2 = new d(this);
        e eVar = new e(this);
        try {
            b bVar = new b(context);
            this.o = bVar;
            this.f36586a = PlayerController.a(a2, bVar);
        } catch (Exception e2) {
            a("init CustomPlayerImpl failed and try to use DefaultSystemPlayer, the exception is ".concat(String.valueOf(e2)), this.f36594i, -10);
            this.f36586a = PlayerController.a(a2, new com.ss.android.ugc.aweme.live.alphaplayer.d.b());
        }
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
        if (aVar != null) {
            aVar.a(dVar2);
        }
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar2 = this.f36586a;
        if (aVar2 != null) {
            aVar2.a(eVar);
        }
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar3 = this.f36586a;
        if (aVar3 != null) {
            aVar3.a(new c(this));
        }
        return dVar;
    }

    @com.lynx.tasm.behavior.m(a = "src")
    public final void setSrc(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
            if (aVar == null) {
                h.f.b.l.a();
            }
            aVar.b((ViewGroup) this.mView);
            this.f36587b = null;
            this.f36594i = "";
            if (this.f36589d) {
                str = com.lynx.tasm.behavior.ui.image.a.a(this.mContext, str);
            }
            String decode = URLDecoder.decode(str, "UTF-8");
            h.f.b.l.a((Object) decode, "");
            this.f36594i = decode;
            com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c> aVar2 = this.f36590e;
            if (aVar2 != null) {
                this.f36591f = null;
                aVar2.a(decode, new r(this, decode), new s(this, decode));
                return;
            }
            a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements com.ss.android.ugc.aweme.live.alphaplayer.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxAlphaVideo f36598a;

        static {
            Covode.recordClassIndex(21980);
        }

        c(LynxAlphaVideo lynxAlphaVideo) {
            this.f36598a = lynxAlphaVideo;
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.d
        public final void a(long j2) {
            try {
                LynxAlphaVideo lynxAlphaVideo = this.f36598a;
                com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = lynxAlphaVideo.f36586a;
                if (aVar == null) {
                    h.f.b.l.a();
                }
                lynxAlphaVideo.f36597l = aVar.c();
                int size = this.f36598a.f36596k.size();
                if (size < this.f36598a.f36595j.size()) {
                    int intValue = this.f36598a.f36595j.get(this.f36598a.f36596k.size()).intValue();
                    if (((long) intValue) <= j2) {
                        LLog.b("x-alpha-video", "send trackedMSCount is " + size + ", trackedMS is " + intValue + ", progress is " + j2);
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                        javaOnlyMap.putMap("detail", javaOnlyMap2);
                        javaOnlyMap2.putInt("subscribedMillisecond", intValue);
                        this.f36598a.a("update", LynxAlphaVideo.a(1, "", javaOnlyMap));
                        this.f36598a.f36596k.add(Integer.valueOf(intValue));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                LLog.d("x-alpha-video", e2.toString());
            }
        }
    }

    public final void a(String str) {
        try {
            this.f36592g = false;
            LLog.b("x-alpha-video", "legacySetSrc, directUrl is ".concat(String.valueOf(str)));
            if (str != null) {
                Uri parse = Uri.parse(str);
                this.f36587b = null;
                h.f.b.l.a((Object) parse, "");
                String scheme = parse.getScheme();
                if (scheme != null) {
                    int hashCode = scheme.hashCode();
                    if (hashCode != 3143036) {
                        if (hashCode != 3213448) {
                            if (hashCode != 99617003 || !scheme.equals("https")) {
                                return;
                            }
                        } else if (!scheme.equals("http")) {
                            return;
                        }
                        if (h.m.p.c(str, ".zip", false)) {
                            DownloadTask name = Downloader.with(this.mContext).url(str).name(parse.getLastPathSegment());
                            com.lynx.tasm.behavior.j jVar = this.mContext;
                            h.f.b.l.a((Object) jVar, "");
                            Context a2 = a(jVar);
                            h.f.b.l.a((Object) a2, "");
                            File b2 = b(a2);
                            h.f.b.l.a((Object) b2, "");
                            name.savePath(b2.getAbsolutePath()).mainThreadListener(new f(this, str, parse)).download();
                            return;
                        }
                        a("resource type is not support", this.f36594i, -13);
                    } else if (scheme.equals("file")) {
                        try {
                            this.f36587b = b(parse.getPath() + '/');
                            a("ready", a(1, "load resource success", (JavaOnlyMap) null));
                            if (this.f36587b != null && this.f36588c) {
                                com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
                                if (aVar == null) {
                                    h.f.b.l.a();
                                }
                                aVar.a((ViewGroup) this.mView);
                                com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar2 = this.f36586a;
                                if (aVar2 == null) {
                                    h.f.b.l.a();
                                }
                                aVar2.a(this.f36587b);
                            }
                        } catch (Exception e2) {
                            a("parse config.json failed, resource is " + str + ", error msg is " + e2, this.f36594i, -3);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            LLog.d("x-alpha-video", e3.toString());
        }
    }

    public final com.ss.android.ugc.aweme.live.alphaplayer.c.a b(String str) {
        MethodCollector.i(4037);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str + "config.json"));
        try {
            BufferedReader bufferedReader2 = bufferedReader;
            z.e eVar = new z.e();
            while (true) {
                T t2 = (T) bufferedReader2.readLine();
                eVar.element = t2;
                if (t2 == null) {
                    break;
                }
                sb.append((String) eVar.element).append("\n");
            }
            h.e.c.a(bufferedReader, null);
            try {
                f fVar = (f) com.bytedance.ies.xelement.alphavideo.a.a.a().a(sb.toString(), f.class);
                if (fVar == null) {
                    a("fileModel is null", this.f36594i, -14);
                    MethodCollector.o(4037);
                    return null;
                }
                com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = new com.ss.android.ugc.aweme.live.alphaplayer.c.a();
                if (fVar.f36669a != null) {
                    aVar.a(new a.b(str + fVar.f36669a.f36671a).a(fVar.f36669a.f36672b).b(fVar.f36669a.f36673c).c(fVar.f36669a.f36674d).d(fVar.f36669a.f36677g).e(fVar.f36669a.f36678h).f(fVar.f36669a.f36675e).g(fVar.f36669a.f36676f).a(fVar.f36669a.f36679i).b(fVar.f36669a.f36680j).a(fVar.f36669a.f36681k));
                }
                if (fVar.f36670b != null) {
                    aVar.b(new a.b(str + fVar.f36670b.f36671a).a(fVar.f36670b.f36672b).b(fVar.f36670b.f36673c).c(fVar.f36670b.f36674d).d(fVar.f36670b.f36677g).e(fVar.f36670b.f36678h).f(fVar.f36670b.f36675e).g(fVar.f36670b.f36676f).a(fVar.f36670b.f36679i).b(fVar.f36670b.f36680j).a(fVar.f36670b.f36681k));
                }
                if (h.f.b.l.a(getProps().get("keep-last-frame"), (Object) true)) {
                    aVar.b(false);
                }
                if (h.f.b.l.a(getProps().get("loop"), (Object) true)) {
                    aVar.a(true);
                }
                MethodCollector.o(4037);
                return aVar;
            } catch (com.google.gson.t e2) {
                a("parse config.json failed, error msg is ".concat(String.valueOf(e2)), this.f36594i, -3);
            }
        } catch (Throwable th) {
            h.e.c.a(bufferedReader, th);
            MethodCollector.o(4037);
            throw th;
        }
    }

    public static final class t<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(21999);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.intValue()), Integer.valueOf(t2.intValue()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxAlphaVideo(com.lynx.tasm.behavior.j jVar, String str) {
        super(jVar);
        h.f.b.l.c(jVar, "");
        h.f.b.l.c(str, "");
        this.r = new a(str);
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.m<Throwable, Boolean, h.z> {
        final /* synthetic */ String $directUrl$inlined;
        final /* synthetic */ LynxAlphaVideo this$0;

        static {
            Covode.recordClassIndex(21998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(LynxAlphaVideo lynxAlphaVideo, String str) {
            super(2);
            this.this$0 = lynxAlphaVideo;
            this.$directUrl$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Throwable th, Boolean bool) {
            Throwable th2 = th;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.c(th2, "");
            String str = "failed when use resource loader to load " + this.this$0.f36594i + ", and error msg " + String.valueOf(th2.getMessage());
            if (booleanValue) {
                LLog.b("x-alpha-video", str);
                this.this$0.a(this.$directUrl$inlined);
            } else {
                LynxAlphaVideo lynxAlphaVideo = this.this$0;
                lynxAlphaVideo.a(str, lynxAlphaVideo.f36594i, -11);
            }
            return h.z.f158842a;
        }
    }

    @com.lynx.tasm.behavior.p
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || this.f36586a == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            javaOnlyMap.putBoolean("success", true);
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
            if (aVar == null) {
                h.f.b.l.a();
            }
            int c2 = aVar.c();
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putInt("duration", c2);
            javaOnlyMap.putMap("data", javaOnlyMap2);
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e2) {
            javaOnlyMap.putString("message:", e2.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void isPlaying(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || this.f36586a == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            javaOnlyMap.putBoolean("success", true);
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f36586a;
            if (aVar == null) {
                h.f.b.l.a();
            }
            boolean b2 = aVar.b();
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putBoolean("isPlaying", b2);
            javaOnlyMap.putMap("data", javaOnlyMap2);
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e2) {
            javaOnlyMap.putString("message:", e2.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void pause(ReadableMap readableMap, Callback callback) {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar;
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || (aVar = this.f36586a) == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            aVar.d();
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e2) {
            javaOnlyMap.putString("message:", e2.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void play(ReadableMap readableMap, Callback callback) {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar;
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || (aVar = this.f36586a) == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            if (aVar.b() || this.f36587b == null) {
                callback.invoke(1, javaOnlyMap);
                return;
            }
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar2 = this.f36586a;
            if (aVar2 == null) {
                h.f.b.l.a();
            }
            aVar2.a((ViewGroup) this.mView);
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar3 = this.f36586a;
            if (aVar3 == null) {
                h.f.b.l.a();
            }
            aVar3.a(this.f36587b);
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e2) {
            javaOnlyMap.putString("message:", e2.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void release(ReadableMap readableMap, Callback callback) {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar;
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap a2 = a();
        if (this.mView == null || (aVar = this.f36586a) == null) {
            a2.putString("message", "view is not exist");
            callback.invoke(1, a2);
            return;
        }
        try {
            aVar.g();
            callback.invoke(0, a2);
        } catch (Exception e2) {
            a2.putString("message:", e2.getMessage());
            callback.invoke(1, a2);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void resume(ReadableMap readableMap, Callback callback) {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar;
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap a2 = a();
        if (this.mView == null || (aVar = this.f36586a) == null || aVar.b()) {
            a2.putString("message", "view is not exist");
            callback.invoke(1, a2);
            return;
        }
        try {
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar2 = this.f36586a;
            if (aVar2 == null) {
                h.f.b.l.a();
            }
            aVar2.a((ViewGroup) this.mView);
            com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar3 = this.f36586a;
            if (aVar3 == null) {
                h.f.b.l.a();
            }
            aVar3.e();
            callback.invoke(0, a2);
        } catch (Exception e2) {
            a2.putString("message:", e2.getMessage());
            callback.invoke(1, a2);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void stop(ReadableMap readableMap, Callback callback) {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar;
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null || (aVar = this.f36586a) == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
            return;
        }
        try {
            aVar.f();
            callback.invoke(0, javaOnlyMap);
        } catch (Exception e2) {
            javaOnlyMap.putString("message:", e2.getMessage());
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        int i2 = readableMap.getInt("ms");
        LLog.b("x-alpha-video", "subscribeUpdateEvent: ".concat(String.valueOf(i2)));
        if (!this.f36595j.contains(Integer.valueOf(i2))) {
            this.f36595j.add(Integer.valueOf(i2));
            List<Integer> list = this.f36595j;
            if (list.size() > 1) {
                h.a.n.a((List) list, (Comparator) new t());
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, "already subscribeUpdateEvent with " + i2 + " milliseconds");
        }
    }

    @com.lynx.tasm.behavior.p
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        int i2 = readableMap.getInt("ms");
        if (this.f36595j.contains(Integer.valueOf(i2))) {
            this.f36595j.remove(Integer.valueOf(i2));
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, i2 + " milliseconds is not subscribed");
        }
    }

    public final void a(String str, a aVar) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(aVar, "");
        String a2 = com.lynx.tasm.behavior.ui.image.a.a(this.mContext, str);
        h.f.b.l.a((Object) a2, "");
        com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = com.facebook.drawee.a.a.c.c().a(com.lynx.tasm.ui.image.b.b.a(com.facebook.imagepipeline.o.c.a(Uri.parse(a2))).a(), "x-alpha-video");
        if (a3 == null) {
            aVar.a();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        g gVar = new g(aVar, countDownLatch, a3);
        a3.a(gVar, com.facebook.common.b.a.a());
        try {
            if (!countDownLatch.await(3, TimeUnit.SECONDS)) {
                gVar.onFailure(a3);
            }
        } catch (InterruptedException unused) {
            gVar.onFailure(a3);
        }
    }

    public final void a(String str, String str2) {
        new com.bytedance.ies.xelement.alphavideo.a.d(new h(this, str, str2)).a(new i(this)).b(new j(this));
    }

    public static Map<String, Object> a(int i2, String str, JavaOnlyMap javaOnlyMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i2));
        linkedHashMap.put("msg", str);
        if (javaOnlyMap != null) {
            linkedHashMap.put("data", javaOnlyMap);
        }
        return linkedHashMap;
    }

    public final void a(String str, String str2, int i2) {
        a("error", a(i2, str, (JavaOnlyMap) null));
        this.r.a(str2, str, i2);
        LLog.d("x-alpha-video", str);
    }
}

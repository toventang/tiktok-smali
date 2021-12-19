package com.bytedance.ies.xelement.bytedlottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.LottieAnimationView;
import com.bytedance.lottie.q;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import h.f.b.z;
import h.w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class LynxBytedLottieView extends LynxUI<LottieAnimationView> implements com.bytedance.lottie.d {
    public static final b y = new b((byte) 0);
    private Set<String> A;
    private boolean B;
    private com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c> C;
    private int D;
    private int E;

    /* renamed from: a  reason: collision with root package name */
    public boolean f36740a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36741b;

    /* renamed from: c  reason: collision with root package name */
    public int f36742c;

    /* renamed from: d  reason: collision with root package name */
    public int f36743d;

    /* renamed from: e  reason: collision with root package name */
    public int f36744e;

    /* renamed from: f  reason: collision with root package name */
    public String f36745f;

    /* renamed from: g  reason: collision with root package name */
    public String f36746g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.ies.xelement.a.b f36747h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f36748i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f36749j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f36750k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f36751l;

    /* renamed from: m  reason: collision with root package name */
    public String f36752m;
    public ReadableMap n;
    public final List<Integer> o;
    public final List<Integer> p;
    public final b q;
    public com.bytedance.lottie.g r;
    public a s;
    public String t;
    public ArrayList<com.facebook.common.h.a<?>> u;
    public boolean v;
    public volatile boolean w;
    public com.bytedance.lottie.a x;
    private boolean z;

    public interface a {
        static {
            Covode.recordClassIndex(22069);
        }

        void a(Bitmap bitmap, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(22066);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            float f2 = 0.0f;
            int i2 = -1;
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            int i3 = 1;
            int i4 = 0;
            boolean z5 = false;
            int i5 = 0;
            boolean z6 = false;
            boolean z7 = false;
            switch (nextKey.hashCode()) {
                case -1796070362:
                    if (nextKey.equals("playstatus")) {
                        setPlayStatus(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1566748085:
                    if (nextKey.equals("startframe")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setStartFrame(i4);
                        continue;
                    }
                    break;
                case -1489589134:
                    if (nextKey.equals("objectfit")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1001078227:
                    if (nextKey.equals("progress")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setProgress(f2);
                        continue;
                    }
                    break;
                case -939482614:
                    if (nextKey.equals("only-local")) {
                        if (!readableMap.isNull(nextKey)) {
                            z7 = readableMap.getBoolean(nextKey, false);
                        }
                        setOnlyLocal(z7);
                        continue;
                    }
                    break;
                case -795328846:
                    if (nextKey.equals("keeplastframe")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, true);
                        }
                        setKeepLastFrame(z2);
                        continue;
                    }
                    break;
                case -629825370:
                    if (nextKey.equals("loop-count")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 1);
                        }
                        setLoopCount(i3);
                        continue;
                    }
                    break;
                case -261882880:
                    if (nextKey.equals("src-format")) {
                        setSrcFormat(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 97533:
                    if (nextKey.equals("bid")) {
                        setBID(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3271912:
                    if (nextKey.equals("json")) {
                        setJson(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setLoop(z6);
                        continue;
                    }
                    break;
                case 109641799:
                    if (nextKey.equals("speed")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setSpeed(f2);
                        continue;
                    }
                    break;
                case 110620997:
                    if (nextKey.equals("trace")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, true);
                        }
                        setTraceEnabled(z4);
                        continue;
                    }
                    break;
                case 508360187:
                    if (nextKey.equals("end-frame")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setEndFrame2(i2);
                        continue;
                    }
                    break;
                case 1327968322:
                    if (nextKey.equals("start-frame")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setStartFrame2(i5);
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, true);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1688643203:
                    if (nextKey.equals("repetcount")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setRepeat(i2);
                        continue;
                    }
                    break;
                case 1731948914:
                    if (nextKey.equals("endframe")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, -1);
                        }
                        setEndFrame(i2);
                        continue;
                    }
                    break;
                case 1821306136:
                    if (nextKey.equals("src-polyfill")) {
                        setSrcPolyfill(readableMap.getMap(nextKey));
                        continue;
                    }
                    break;
                case 1978397892:
                    if (nextKey.equals("auto-reverse")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setReverseMode(z5);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @com.lynx.tasm.behavior.m(a = "trace", f = true)
    public final void setTraceEnabled(boolean z2) {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(22070);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class p extends com.lynx.tasm.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f36797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36798c;

        static {
            Covode.recordClassIndex(22088);
        }

        @Override // com.lynx.tasm.c.b
        public final String b() {
            return "detail";
        }

        @Override // com.lynx.tasm.c.b
        public final Map<String, Object> a() {
            return this.f36797b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(LynxBytedLottieView lynxBytedLottieView, Map map, String str, int i2, String str2) {
            super(i2, str2);
            this.f36796a = lynxBytedLottieView;
            this.f36797b = map;
            this.f36798c = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a(java.lang.String):void");
    }

    public final void a(String str, Map<String, Object> map) {
        com.lynx.tasm.behavior.j jVar;
        com.lynx.tasm.c cVar;
        Set<String> set = this.A;
        if (set != null && set.contains(str) && (jVar = this.mContext) != null && (cVar = jVar.f55897e) != null) {
            cVar.a(new p(this, map, str, getSign(), str));
        }
    }

    @Override // com.bytedance.lottie.d
    public final void a(com.bytedance.lottie.j jVar, com.bytedance.lottie.f<Bitmap> fVar) {
        T t2;
        h.f.b.l.c(fVar, "");
        if (TextUtils.isEmpty(this.f36745f) || jVar == null) {
            LLog.d("byted-lottie", "fetchBitmap error mSrcUrl=`" + this.f36745f + "`, or asset is null");
        } else if (!this.f36750k) {
            LLog.d("byted-lottie", "fetchBitmapAsync error, one bitmap is already fetch fail before this, and mSrcUrl=`" + this.f36745f + "`,");
        } else {
            String str = jVar.f40798d;
            h.f.b.l.a((Object) str, "");
            if (h.m.p.b(str, "data:", false)) {
                LLog.b("byted-lottie", "fetchBitmapAsync with base64");
                fVar.a(com.bytedance.ies.xelement.bytedlottie.a.a.a(jVar.f40798d));
            } else if (this.f36748i) {
                String c2 = c(jVar.f40799e + jVar.f40798d);
                a(c2, jVar, new i(this, fVar, c2));
            } else {
                String str2 = this.f36745f;
                if (str2 == null) {
                    return;
                }
                if (h.m.p.b(str2, "http://", false) || h.m.p.b(str2, "https://", false) || h.m.p.b(str2, "file:/", false) || h.m.p.b(str2, "asset://", false)) {
                    z.e eVar = new z.e();
                    ReadableMap readableMap = this.n;
                    if (readableMap == null || !readableMap.hasKey(jVar.f40797c) || (t2 = (T) (jVar.f40799e + readableMap.getString(jVar.f40797c))) == null) {
                        t2 = (T) (jVar.f40799e + jVar.f40798d);
                    }
                    eVar.element = t2;
                    eVar.element = (h.m.p.b(eVar.element, "http://", false) || h.m.p.b(eVar.element, "https://", false)) ? eVar.element : (T) (str2 + '/' + ((String) eVar.element));
                    a(eVar.element, jVar, new h(eVar, this, jVar, fVar));
                    return;
                }
                a("use mSrcDir, the schema of mSrcDir is not supported, mSrcDir: " + this.f36745f, str2, 1);
                a("error", a(1, "request resource from " + this.f36745f + " failed"));
                LLog.d("byted-lottie", "fetchBitmap mSrcUrl=`" + this.f36745f + "`, url=`" + this.f36745f + "` not exists. lottieUrl is " + this.f36746g);
                fVar.a();
            }
        }
    }

    public final void a(String str, String str2, com.bytedance.lottie.j jVar, a aVar) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(str2, "");
        h.f.b.l.c(jVar, "");
        h.f.b.l.c(aVar, "");
        String a2 = com.lynx.tasm.behavior.ui.image.a.a(this.mContext, str);
        LLog.b("byted-lottie", "requestBitmap: ".concat(String.valueOf(a2)));
        Uri parse = Uri.parse(a2);
        if (parse == null || parse.getPath() == null) {
            this.f36750k = false;
            aVar.a("uri.path is null and uri is ".concat(String.valueOf(parse)));
            return;
        }
        com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(parse).a(com.facebook.imagepipeline.common.c.HIGH);
        com.lynx.tasm.ui.image.b.b.a(a3);
        String path = parse.getPath();
        if (path != null && !jVar.f40800f) {
            h.f.b.l.a((Object) a3, "");
            a3.a(new n(path, this, jVar, a3));
        }
        com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a4 = com.facebook.drawee.a.a.c.c().a(a3.a(), "byted-lottie");
        if (a4 == null) {
            aVar.a(str);
        } else {
            a4.a(new o(this, a2, aVar, jVar, str2, a4), com.facebook.common.b.a.a());
        }
    }

    public final void a(String str, String str2, int i2) {
        a("error", a(i2, str));
        this.q.a(this.f36746g, str2, str);
        LLog.d("byted-lottie", str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        e();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onReset() {
        super.onReset();
        e();
    }

    public final class c implements com.bytedance.lottie.a {

        /* renamed from: b  reason: collision with root package name */
        private final String f36754b;

        static {
            Covode.recordClassIndex(22071);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f36755a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.lottie.g f36756b;

            static {
                Covode.recordClassIndex(22072);
            }

            a(c cVar, com.bytedance.lottie.g gVar) {
                this.f36755a = cVar;
                this.f36756b = gVar;
            }

            public final void run() {
                ((LottieAnimationView) LynxBytedLottieView.this.mView).setComposition(this.f36756b);
            }
        }

        @Override // com.bytedance.lottie.a
        public final void a(com.bytedance.lottie.g gVar) {
            h.f.b.l.c(gVar, "");
            String str = this.f36754b;
            if (str != null && h.f.b.l.a((Object) str, (Object) LynxBytedLottieView.this.f36746g)) {
                com.lynx.tasm.utils.m.a(new a(this, gVar));
            }
        }

        @Override // com.bytedance.lottie.a
        public final void a(String str) {
            String str2 = "";
            h.f.b.l.c(str, str2);
            String str3 = this.f36754b;
            if (str3 != null && h.f.b.l.a((Object) str3, (Object) LynxBytedLottieView.this.f36746g) && (!h.m.p.a((CharSequence) str))) {
                LynxBytedLottieView lynxBytedLottieView = LynxBytedLottieView.this;
                String str4 = lynxBytedLottieView.f36746g;
                if (str4 != null) {
                    str2 = str4;
                }
                lynxBytedLottieView.a(str, str2, 1);
            }
        }

        public c(String str) {
            this.f36754b = str;
        }
    }

    @Override // com.bytedance.lottie.c
    public final Bitmap b() {
        LLog.d("byted-lottie", "fetch bitmap should not be called!!!");
        return null;
    }

    private final void c() {
        if (this.f36745f != null) {
            this.f36745f = null;
            this.f36750k = true;
            ((LottieAnimationView) this.mView).setImageDrawable(null);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.mView;
            if (lottieAnimationView != null) {
                lottieAnimationView.setImageAssetDelegate(null);
                lottieAnimationView.h();
            }
        }
    }

    private final void d() {
        Iterator<com.facebook.common.h.a<?>> it = this.u.iterator();
        while (it.hasNext()) {
            com.facebook.common.h.a.c(it.next());
        }
        this.u.clear();
    }

    public final void finalize() {
        MethodCollector.i(12298);
        synchronized (this) {
            try {
                d();
                this.w = true;
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                MethodCollector.o(12298);
                throw th;
            }
        }
        MethodCollector.o(12298);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.f36741b && !this.z && !this.B && this.f36750k) {
            ((LottieAnimationView) this.mView).c();
        }
        this.B = false;
    }

    public static final class m implements com.bytedance.lottie.f<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.g f36784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36785b;

        static {
            Covode.recordClassIndex(22085);
        }

        @Override // com.bytedance.lottie.f
        public final void a() {
            this.f36785b.a("error", LynxBytedLottieView.a(1, "fetch polyfill bitmap " + this.f36785b.n + " failed"));
            LLog.d("byted-lottie", "fetch polyfill Bitmap mSrcUrl=" + this.f36785b.f36745f + ", filePath=" + this.f36785b.n + " not exists.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.lottie.f
        public final /* synthetic */ void a(String str) {
            int i2;
            float f2;
            com.bytedance.lottie.g composition;
            h.f.b.l.c(str, "");
            LynxBytedLottieView lynxBytedLottieView = this.f36785b;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i2 = lottieAnimationView.getFrame();
            } else {
                i2 = 0;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f36785b.mView;
            if (lottieAnimationView2 == null || (composition = lottieAnimationView2.getComposition()) == null) {
                f2 = 0.0f;
            } else {
                f2 = composition.b();
            }
            lynxBytedLottieView.a("ready", LynxBytedLottieView.a(i2, (int) f2, this.f36785b.f36744e, this.f36785b.f36752m));
            this.f36785b.q.b(this.f36785b.f36746g);
            if (this.f36785b.f36741b && this.f36785b.f36750k) {
                ((LottieAnimationView) this.f36785b.mView).c();
            }
        }

        m(com.bytedance.lottie.g gVar, LynxBytedLottieView lynxBytedLottieView) {
            this.f36784a = gVar;
            this.f36785b = lynxBytedLottieView;
        }
    }

    private final void e() {
        MethodCollector.i(12297);
        ((LottieAnimationView) this.mView).f();
        ((LottieAnimationView) this.mView).e();
        ((LottieAnimationView) this.mView).j();
        ((LottieAnimationView) this.mView).h();
        synchronized (this) {
            try {
                d();
                View view = this.mView;
                if (!(view instanceof LynxBytedLottieAnimationView)) {
                    view = null;
                }
                LynxBytedLottieAnimationView lynxBytedLottieAnimationView = (LynxBytedLottieAnimationView) view;
                if (lynxBytedLottieAnimationView != null) {
                    lynxBytedLottieAnimationView.setDestroyed(true);
                }
                this.w = true;
            } finally {
                MethodCollector.o(12297);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<V> implements Callable<com.bytedance.lottie.n<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f36772b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.f f36773c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.g f36774d;

        static {
            Covode.recordClassIndex(22080);
        }

        j(LynxBytedLottieView lynxBytedLottieView, ReadableMap readableMap, com.bytedance.lottie.f fVar, com.bytedance.lottie.g gVar) {
            this.f36771a = lynxBytedLottieView;
            this.f36772b = readableMap;
            this.f36773c = fVar;
            this.f36774d = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ com.bytedance.lottie.n<String> call() {
            ReadableMapKeySetIterator keySetIterator = this.f36772b.keySetIterator();
            HashMap hashMap = new HashMap();
            if (this.f36772b.size() == 0) {
                this.f36773c.a("");
                return new com.bytedance.lottie.n("");
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f36772b.size());
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = this.f36772b.getString(nextKey);
                com.bytedance.lottie.j jVar = this.f36774d.f40707c.get(nextKey);
                if (jVar != null) {
                    z.e eVar = new z.e();
                    eVar.element = (T) (jVar.f40799e + string);
                    eVar.element = (h.m.p.b(eVar.element, "http://", false) || h.m.p.b(eVar.element, "https://", false)) ? eVar.element : (T) (this.f36771a.f36745f + '/' + ((String) eVar.element));
                    LynxBytedLottieView lynxBytedLottieView = this.f36771a;
                    String c2 = lynxBytedLottieView.c(eVar.element);
                    h.f.b.l.a((Object) nextKey, "");
                    lynxBytedLottieView.a(c2, nextKey, jVar, new a(eVar, this, string, nextKey, hashMap, atomicInteger));
                }
            }
            return new com.bytedance.lottie.n("");
        }

        public static final class a implements a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z.e f36775a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f36776b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f36777c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f36778d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ HashMap f36779e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f36780f;

            static {
                Covode.recordClassIndex(22081);
            }

            @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a
            public final void a(String str) {
                h.f.b.l.c(str, "");
                if (!h.m.p.a((CharSequence) str)) {
                    this.f36776b.f36771a.a("fetch polyfill bitmap failed, map: " + this.f36776b.f36772b + ", path: " + ((String) this.f36775a.element) + ", msg: " + str, this.f36775a.element, 1);
                }
                this.f36776b.f36773c.a();
            }

            @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a
            public final void a(final Bitmap bitmap, final String str) {
                h.f.b.l.c(bitmap, "");
                h.f.b.l.c(str, "");
                com.lynx.tasm.utils.m.a(new Runnable(this) {
                    /* class com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.j.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f36781a;

                    static {
                        Covode.recordClassIndex(22082);
                    }

                    {
                        this.f36781a = r1;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void run() {
                        this.f36781a.f36779e.put(str, bitmap);
                        if (this.f36781a.f36780f.decrementAndGet() == 0) {
                            for (Map.Entry entry : this.f36781a.f36779e.entrySet()) {
                                Object key = entry.getKey();
                                Bitmap bitmap = (Bitmap) entry.getValue();
                                com.bytedance.lottie.j jVar = this.f36781a.f36776b.f36774d.f40707c.get(key);
                                if (jVar != null) {
                                    jVar.f40801g = bitmap;
                                }
                            }
                            this.f36781a.f36776b.f36773c.a("");
                        }
                    }
                });
            }

            a(z.e eVar, j jVar, String str, String str2, HashMap hashMap, AtomicInteger atomicInteger) {
                this.f36775a = eVar;
                this.f36776b = jVar;
                this.f36777c = str;
                this.f36778d = str2;
                this.f36779e = hashMap;
                this.f36780f = atomicInteger;
            }
        }
    }

    public final void a() {
        ReadableMap readableMap;
        com.bytedance.lottie.g gVar = this.r;
        if (gVar != null && (readableMap = this.n) != null) {
            a(gVar, readableMap, new m(gVar, this));
        }
    }

    @com.lynx.tasm.behavior.m(a = "end-frame", e = -1)
    public final void setEndFrame2(int i2) {
        setEndFrame(i2);
    }

    @com.lynx.tasm.behavior.m(a = "keeplastframe", f = true)
    public final void setKeepLastFrame(boolean z2) {
        this.f36740a = z2;
    }

    @com.lynx.tasm.behavior.m(a = "only-local", f = false)
    public final void setOnlyLocal(boolean z2) {
        this.v = z2;
    }

    @com.lynx.tasm.behavior.m(a = "start-frame", e = 0)
    public final void setStartFrame2(int i2) {
        setStartFrame(i2);
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36759a;

        static {
            Covode.recordClassIndex(22074);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LynxBytedLottieView lynxBytedLottieView) {
            this.f36759a = lynxBytedLottieView;
        }

        public final void onAnimationCancel(Animator animator) {
            int i2;
            float f2;
            com.bytedance.lottie.g composition;
            LynxBytedLottieView lynxBytedLottieView = this.f36759a;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i2 = lottieAnimationView.getFrame();
            } else {
                i2 = 0;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f36759a.mView;
            if (lottieAnimationView2 == null || (composition = lottieAnimationView2.getComposition()) == null) {
                f2 = 0.0f;
            } else {
                f2 = composition.b();
            }
            lynxBytedLottieView.a("cancel", LynxBytedLottieView.a(i2, (int) f2, this.f36759a.f36744e, this.f36759a.f36752m));
            this.f36759a.p.clear();
        }

        public final void onAnimationStart(Animator animator) {
            float f2;
            com.bytedance.lottie.g composition;
            int i2 = 0;
            this.f36759a.f36744e = 0;
            LynxBytedLottieView lynxBytedLottieView = this.f36759a;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i2 = lottieAnimationView.getFrame();
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f36759a.mView;
            if (lottieAnimationView2 == null || (composition = lottieAnimationView2.getComposition()) == null) {
                f2 = 0.0f;
            } else {
                f2 = composition.b();
            }
            lynxBytedLottieView.a("start", LynxBytedLottieView.a(i2, (int) f2, this.f36759a.f36744e, this.f36759a.f36752m));
        }

        public final void onAnimationEnd(Animator animator) {
            int i2;
            float f2;
            Float f3;
            Float f4;
            float minFrame;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f36759a.mView;
            if (lottieAnimationView != null) {
                if (this.f36759a.f36740a) {
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f36759a.mView;
                    h.f.b.l.a((Object) lottieAnimationView2, "");
                    minFrame = lottieAnimationView2.getMaxFrame();
                } else {
                    LottieAnimationView lottieAnimationView3 = (LottieAnimationView) this.f36759a.mView;
                    h.f.b.l.a((Object) lottieAnimationView3, "");
                    minFrame = lottieAnimationView3.getMinFrame();
                }
                lottieAnimationView.setFrame((int) minFrame);
            }
            LynxBytedLottieView lynxBytedLottieView = this.f36759a;
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView4 != null) {
                i2 = lottieAnimationView4.getFrame();
            } else {
                i2 = 0;
            }
            LottieAnimationView lottieAnimationView5 = (LottieAnimationView) this.f36759a.mView;
            h.f.b.l.a((Object) lottieAnimationView5, "");
            com.bytedance.lottie.g composition = lottieAnimationView5.getComposition();
            if (composition != null) {
                f2 = composition.b();
            } else {
                f2 = 0.0f;
            }
            lynxBytedLottieView.a("completion", LynxBytedLottieView.a(i2, (int) f2, this.f36759a.f36744e, this.f36759a.f36752m));
            b bVar = this.f36759a.q;
            String str = this.f36759a.f36746g;
            String str2 = this.f36759a.t;
            Float valueOf = Float.valueOf(this.f36759a.s.a());
            com.bytedance.lottie.g gVar = this.f36759a.r;
            Float f5 = null;
            if (gVar != null) {
                f3 = Float.valueOf(gVar.f40715k);
            } else {
                f3 = null;
            }
            com.bytedance.lottie.g gVar2 = this.f36759a.r;
            if (gVar2 != null) {
                f4 = Float.valueOf(gVar2.b());
            } else {
                f4 = null;
            }
            com.bytedance.lottie.g gVar3 = this.f36759a.r;
            if (gVar3 != null) {
                f5 = Float.valueOf(gVar3.a());
            }
            bVar.a(str, str2, valueOf, f3, f4, f5, false);
            this.f36759a.p.clear();
        }

        public final void onAnimationRepeat(Animator animator) {
            int i2;
            float f2;
            Float f3;
            Float f4;
            this.f36759a.f36744e++;
            LynxBytedLottieView lynxBytedLottieView = this.f36759a;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
            if (lottieAnimationView != null) {
                i2 = lottieAnimationView.getFrame();
            } else {
                i2 = 0;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f36759a.mView;
            h.f.b.l.a((Object) lottieAnimationView2, "");
            com.bytedance.lottie.g composition = lottieAnimationView2.getComposition();
            if (composition != null) {
                f2 = composition.b();
            } else {
                f2 = 0.0f;
            }
            lynxBytedLottieView.a("repeat", LynxBytedLottieView.a(i2, (int) f2, this.f36759a.f36744e, this.f36759a.f36752m));
            b bVar = this.f36759a.q;
            String str = this.f36759a.f36746g;
            String str2 = this.f36759a.t;
            Float valueOf = Float.valueOf(this.f36759a.s.a());
            com.bytedance.lottie.g gVar = this.f36759a.r;
            Float f5 = null;
            if (gVar != null) {
                f3 = Float.valueOf(gVar.f40715k);
            } else {
                f3 = null;
            }
            com.bytedance.lottie.g gVar2 = this.f36759a.r;
            if (gVar2 != null) {
                f4 = Float.valueOf(gVar2.b());
            } else {
                f4 = null;
            }
            com.bytedance.lottie.g gVar3 = this.f36759a.r;
            if (gVar3 != null) {
                f5 = Float.valueOf(gVar3.a());
            }
            bVar.a(str, str2, valueOf, f3, f4, f5, true);
        }
    }

    public /* synthetic */ LynxBytedLottieView(com.lynx.tasm.behavior.j jVar) {
        this(jVar, "");
    }

    public final void a(com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c> aVar) {
        h.f.b.l.c(aVar, "");
        this.C = aVar;
    }

    @com.lynx.tasm.behavior.m(a = "bid")
    public final void setBID(String str) {
        h.f.b.l.c(str, "");
        this.t = str;
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
        this.A = set;
    }

    @com.lynx.tasm.behavior.m(a = "repetcount", e = -1)
    public final void setRepeat(int i2) {
        if (i2 < 0) {
            i2 = -1;
        }
        View view = this.mView;
        h.f.b.l.a((Object) view, "");
        ((LottieAnimationView) view).setRepeatCount(i2);
    }

    @com.lynx.tasm.behavior.m(a = "src-format")
    public final void setSrcFormat(String str) {
        if (str != null && !h.m.p.a((CharSequence) str)) {
            c();
            d(str);
        }
    }

    @com.lynx.tasm.behavior.m(a = "src-polyfill")
    public final void setSrcPolyfill(ReadableMap readableMap) {
        h.f.b.l.c(readableMap, "");
        this.n = readableMap;
        a();
    }

    @com.lynx.tasm.behavior.m(a = "startframe", e = 0)
    public final void setStartFrame(int i2) {
        this.D = i2;
        ((LottieAnimationView) this.mView).setMinFrame(i2);
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    @com.lynx.tasm.behavior.m(a = "autoplay", f = true)
    public final void setAutoPlay(boolean z2) {
        this.f36741b = z2;
        View view = this.mView;
        if (view != null) {
            ((LynxBytedLottieAnimationView) view).setMAutoPlay(z2);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @com.lynx.tasm.behavior.m(a = "endframe", e = -1)
    public final void setEndFrame(int i2) {
        if (i2 < 0) {
            this.E = Integer.MAX_VALUE;
            ((LottieAnimationView) this.mView).setMaxFrame(Integer.MAX_VALUE);
            return;
        }
        this.E = i2;
        ((LottieAnimationView) this.mView).setMaxFrame(i2);
    }

    @com.lynx.tasm.behavior.m(a = "loop", f = false)
    public final void setLoop(boolean z2) {
        if (z2) {
            View view = this.mView;
            h.f.b.l.a((Object) view, "");
            ((LottieAnimationView) view).setRepeatCount(-1);
            return;
        }
        View view2 = this.mView;
        h.f.b.l.a((Object) view2, "");
        ((LottieAnimationView) view2).setRepeatCount(0);
    }

    @com.lynx.tasm.behavior.m(a = "loop-count", e = 1)
    public final void setLoopCount(int i2) {
        if (i2 <= 0) {
            View view = this.mView;
            h.f.b.l.a((Object) view, "");
            ((LottieAnimationView) view).setRepeatCount(-1);
            return;
        }
        View view2 = this.mView;
        h.f.b.l.a((Object) view2, "");
        ((LottieAnimationView) view2).setRepeatCount(i2 - 1);
    }

    @com.lynx.tasm.behavior.m(a = "progress")
    public final void setProgress(float f2) {
        if (f2 >= 0.0f || f2 <= 1.0f) {
            View view = this.mView;
            h.f.b.l.a((Object) view, "");
            ((LottieAnimationView) view).setProgress(f2);
        }
    }

    @com.lynx.tasm.behavior.m(a = "auto-reverse")
    public final void setReverseMode(boolean z2) {
        if (z2) {
            View view = this.mView;
            h.f.b.l.a((Object) view, "");
            ((LottieAnimationView) view).setRepeatMode(2);
            return;
        }
        View view2 = this.mView;
        h.f.b.l.a((Object) view2, "");
        ((LottieAnimationView) view2).setRepeatMode(1);
    }

    @com.lynx.tasm.behavior.m(a = "speed")
    public final void setSpeed(float f2) {
        boolean z2;
        View view = this.mView;
        h.f.b.l.a((Object) view, "");
        ((LottieAnimationView) view).setSpeed(f2);
        if (f2 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f36740a = z2;
    }

    public final void b(String str) {
        int b2 = h.m.p.b((CharSequence) str, '/');
        if (b2 <= 0) {
            LLog.d("byted-lottie", "uri is error:".concat(String.valueOf(str)));
        } else if (str != null) {
            String substring = str.substring(0, b2);
            h.f.b.l.a((Object) substring, "");
            this.f36745f = substring;
            ((LottieAnimationView) this.mView).setImageAssetDelegate(this);
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ LottieAnimationView createView(Context context) {
        LynxBytedLottieAnimationView lynxBytedLottieAnimationView = new LynxBytedLottieAnimationView(context);
        if (Build.VERSION.SDK_INT > 19) {
            lynxBytedLottieAnimationView.b();
            lynxBytedLottieAnimationView.a(true);
        }
        lynxBytedLottieAnimationView.a();
        lynxBytedLottieAnimationView.a(new e(this));
        lynxBytedLottieAnimationView.a(new f(this, lynxBytedLottieAnimationView));
        lynxBytedLottieAnimationView.a(new g(this));
        return lynxBytedLottieAnimationView;
    }

    @com.lynx.tasm.behavior.m(a = "json")
    public final void setJson(String str) {
        if (str != null && str.length() != 0) {
            ((LottieAnimationView) this.mView).setImageAssetDelegate(this);
            ((LottieAnimationView) this.mView).a(str);
            if (this.z || !this.f36741b) {
                ((LottieAnimationView) this.mView).h();
            } else {
                ((LottieAnimationView) this.mView).c();
            }
            this.z = false;
            this.f36741b = true;
        }
    }

    @com.lynx.tasm.behavior.m(a = "objectfit")
    public final void setObjectFit(String str) {
        ImageView.ScaleType scaleType;
        h.f.b.l.c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 94852023) {
            if (hashCode == 951526612 && str.equals("contain")) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
                View view = this.mView;
                h.f.b.l.a((Object) view, "");
                ((LottieAnimationView) view).setScaleType(scaleType);
            }
        } else if (str.equals("cover")) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
            View view2 = this.mView;
            h.f.b.l.a((Object) view2, "");
            ((LottieAnimationView) view2).setScaleType(scaleType);
        }
        scaleType = ImageView.ScaleType.CENTER;
        View view22 = this.mView;
        h.f.b.l.a((Object) view22, "");
        ((LottieAnimationView) view22).setScaleType(scaleType);
    }

    @com.lynx.tasm.behavior.m(a = "playstatus")
    public final void setPlayStatus(String str) {
        h.f.b.l.c(str, "");
        if (h.f.b.l.a((Object) "play", (Object) str)) {
            ((LottieAnimationView) this.mView).c();
            this.B = true;
            this.z = false;
        } else if (h.f.b.l.a((Object) "pause", (Object) str)) {
            ((LottieAnimationView) this.mView).h();
            this.z = true;
        }
    }

    @com.lynx.tasm.behavior.m(a = "src")
    public final void setSrc(String str) {
        MethodCollector.i(14245);
        if (str == null || h.m.p.a((CharSequence) str)) {
            MethodCollector.o(14245);
            return;
        }
        c();
        ((LottieAnimationView) this.mView).setImageDrawable(null);
        synchronized (this) {
            try {
                d();
            } catch (Throwable th) {
                MethodCollector.o(14245);
                throw th;
            }
        }
        ((LottieAnimationView) this.mView).setMinFrame(this.D);
        ((LottieAnimationView) this.mView).setMaxFrame(this.E);
        d(str);
        MethodCollector.o(14245);
    }

    public static final class d extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<LynxBytedLottieView> f36757a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f36758b;

        static {
            Covode.recordClassIndex(22073);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            LynxBytedLottieView lynxBytedLottieView = this.f36757a.get();
            if (lynxBytedLottieView != null) {
                String uuid = UUID.randomUUID().toString();
                h.f.b.l.a((Object) uuid, "");
                lynxBytedLottieView.f36752m = uuid;
                StringBuilder sb = new StringBuilder();
                h.f.b.l.a((Object) lynxBytedLottieView, "");
                com.lynx.tasm.behavior.j jVar = lynxBytedLottieView.mContext;
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
                com.bytedance.lottie.h.a(sb.append(file.getAbsolutePath()).append('/').append(this.f36758b.getLastPathSegment()).toString(), lynxBytedLottieView, lynxBytedLottieView.x);
            }
        }

        public d(LynxBytedLottieView lynxBytedLottieView, Uri uri) {
            h.f.b.l.c(lynxBytedLottieView, "");
            h.f.b.l.c(uri, "");
            this.f36758b = uri;
            this.f36757a = new WeakReference<>(lynxBytedLottieView);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            LynxBytedLottieView lynxBytedLottieView = this.f36757a.get();
            if (lynxBytedLottieView != null) {
                StringBuilder append = new StringBuilder("byted-lottie setSrc Failed, directUrl is ").append(this.f36758b.getPath()).append(", error msg is ");
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                } else {
                    str = null;
                }
                String sb = append.append(str).toString();
                String str2 = lynxBytedLottieView.f36746g;
                if (str2 == null) {
                    str2 = "";
                }
                lynxBytedLottieView.a(sb, str2, 1);
                h.f.b.l.a((Object) lynxBytedLottieView, "");
                lynxBytedLottieView.mContext.a(lynxBytedLottieView.f36746g, "lottie", sb);
            }
        }
    }

    public static final class o extends com.facebook.imagepipeline.f.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f36792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.j f36793d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f36794e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.facebook.d.c f36795f;

        static {
            Covode.recordClassIndex(22087);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            String str;
            if (cVar == null) {
                h.f.b.l.a();
            }
            Throwable e2 = cVar.e();
            StringBuilder append = new StringBuilder("requestBitmap failed! url: ").append(this.f36791b).append(" Reason: ");
            String str2 = null;
            if (e2 != null) {
                str = e2.getMessage();
            } else {
                str = null;
            }
            LLog.b("byted-lottie", append.append(str).toString());
            a aVar = this.f36792c;
            StringBuilder sb = new StringBuilder(" error msg is ");
            if (e2 != null) {
                str2 = e2.getMessage();
            }
            aVar.a(sb.append(str2).append('}').toString());
            cVar.g();
        }

        @Override // com.facebook.imagepipeline.f.c
        public final void a(com.facebook.common.h.a<Bitmap> aVar) {
            MethodCollector.i(13391);
            LLog.b("byted-lottie", "requestBitmap success. url: " + this.f36791b);
            if (aVar != null) {
                synchronized (this.f36790a) {
                    try {
                        if (this.f36790a.w) {
                            this.f36792c.a("the lottie-view is destroyed already.");
                            return;
                        }
                        LynxBytedLottieView lynxBytedLottieView = this.f36790a;
                        int i2 = this.f36793d.f40795a;
                        int i3 = this.f36793d.f40796b;
                        String str = this.f36791b;
                        h.f.b.l.a((Object) str, "");
                        com.facebook.common.h.a<Bitmap> a2 = lynxBytedLottieView.a(aVar, i2, i3, str);
                        if (a2 != null) {
                            this.f36790a.u.add(a2);
                            try {
                                Bitmap a3 = a2.a();
                                if (a3 != null) {
                                    this.f36792c.a(a3, this.f36794e);
                                } else {
                                    LLog.d("byted-lottie", "requestBitmapSync, onNewResultImpl");
                                    this.f36792c.a(this.f36794e);
                                }
                            } catch (Exception e2) {
                                LLog.d("byted-lottie", "requestBitmapSync, onNewResultImpl, error is ".concat(String.valueOf(e2)));
                                this.f36792c.a(this.f36794e);
                            }
                        } else {
                            this.f36792c.a("failed when scaleBitmap");
                        }
                    } finally {
                        MethodCollector.o(13391);
                    }
                }
            }
            this.f36795f.g();
            MethodCollector.o(13391);
            this.f36795f.g();
            MethodCollector.o(13391);
        }

        o(LynxBytedLottieView lynxBytedLottieView, String str, a aVar, com.bytedance.lottie.j jVar, String str2, com.facebook.d.c cVar) {
            this.f36790a = lynxBytedLottieView;
            this.f36791b = str;
            this.f36792c = aVar;
            this.f36793d = jVar;
            this.f36794e = str2;
            this.f36795f = cVar;
        }
    }

    static final class f implements com.bytedance.lottie.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieAnimationView f36761b;

        static {
            Covode.recordClassIndex(22075);
        }

        f(LynxBytedLottieView lynxBytedLottieView, LynxBytedLottieAnimationView lynxBytedLottieAnimationView) {
            this.f36760a = lynxBytedLottieView;
            this.f36761b = lynxBytedLottieAnimationView;
        }

        @Override // com.bytedance.lottie.l
        public final void a(com.bytedance.lottie.g gVar) {
            com.bytedance.lottie.g composition;
            com.bytedance.lottie.g composition2;
            this.f36760a.r = gVar;
            com.bytedance.lottie.q performanceTracker = this.f36761b.getPerformanceTracker();
            if (performanceTracker != null) {
                performanceTracker.f40830a = true;
            }
            com.bytedance.lottie.q performanceTracker2 = this.f36761b.getPerformanceTracker();
            if (performanceTracker2 != null) {
                performanceTracker2.a(new q.a(this) {
                    /* class com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f36762a;

                    static {
                        Covode.recordClassIndex(22076);
                    }

                    {
                        this.f36762a = r1;
                    }

                    @Override // com.bytedance.lottie.q.a
                    public final void a() {
                        a aVar = this.f36762a.f36760a.s;
                        long nanoTime = System.nanoTime();
                        if (aVar.f36799a != 0) {
                            aVar.f36800b[aVar.f36801c] = nanoTime - aVar.f36799a;
                            aVar.f36801c++;
                            aVar.f36802d++;
                        }
                        aVar.f36799a = nanoTime;
                        if (aVar.f36801c == aVar.f36800b.length && aVar.f36800b.length != 0) {
                            double d2 = 0.0d;
                            long[] jArr = aVar.f36800b;
                            int length = jArr.length;
                            int i2 = 0;
                            int i3 = 0;
                            while (i2 < length) {
                                double d3 = (double) jArr[i2];
                                Double.isNaN(d3);
                                d2 += d3;
                                aVar.f36800b[i3] = 0;
                                i2++;
                                i3++;
                            }
                            double d4 = aVar.f36803e;
                            double d5 = (double) (aVar.f36802d - aVar.f36801c);
                            Double.isNaN(d5);
                            double d6 = (double) aVar.f36802d;
                            Double.isNaN(d6);
                            aVar.f36803e = ((d4 * d5) + d2) / d6;
                            aVar.f36801c = 0;
                        }
                    }
                });
            }
            h.f.b.l.a((Object) gVar, "");
            if (gVar.f40717m) {
                this.f36760a.a();
                return;
            }
            float f2 = 0.0f;
            int i2 = 0;
            if (gVar.f40716l) {
                LynxBytedLottieView lynxBytedLottieView = this.f36760a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) lynxBytedLottieView.mView;
                if (lottieAnimationView != null) {
                    i2 = lottieAnimationView.getFrame();
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f36760a.mView;
                if (!(lottieAnimationView2 == null || (composition2 = lottieAnimationView2.getComposition()) == null)) {
                    f2 = composition2.b();
                }
                lynxBytedLottieView.a("ready", LynxBytedLottieView.a(i2, (int) f2, this.f36760a.f36744e, this.f36760a.f36752m));
                this.f36760a.q.b(this.f36760a.f36746g);
                if (this.f36760a.f36741b && this.f36760a.f36750k) {
                    ((LottieAnimationView) this.f36760a.mView).c();
                    return;
                }
                return;
            }
            LynxBytedLottieView lynxBytedLottieView2 = this.f36760a;
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) lynxBytedLottieView2.mView;
            if (lottieAnimationView3 != null) {
                i2 = lottieAnimationView3.getFrame();
            }
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) this.f36760a.mView;
            if (!(lottieAnimationView4 == null || (composition = lottieAnimationView4.getComposition()) == null)) {
                f2 = composition.b();
            }
            lynxBytedLottieView2.a("error", LynxBytedLottieView.a(i2, (int) f2, this.f36760a.f36744e, this.f36760a.f36752m));
            LLog.d("byted-lottie", "lottieComposition Loaded, but bitmap is not ready, lottieUrl is " + this.f36760a.f36746g + ", mSrcDir is " + this.f36760a.f36745f);
        }
    }

    static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36763a;

        static {
            Covode.recordClassIndex(22077);
        }

        g(LynxBytedLottieView lynxBytedLottieView) {
            this.f36763a = lynxBytedLottieView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f36763a.mView;
            h.f.b.l.a((Object) lottieAnimationView, "");
            com.bytedance.lottie.g composition = lottieAnimationView.getComposition();
            if (composition != null) {
                h.f.b.l.a((Object) valueAnimator, "");
                if (valueAnimator.getAnimatedValue() != null && this.f36763a.f36749j) {
                    try {
                        LynxBytedLottieView lynxBytedLottieView = this.f36763a;
                        float f2 = composition.f40713i;
                        float b2 = composition.b();
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue != null) {
                            lynxBytedLottieView.f36742c = h.g.a.a(f2 + (b2 * ((Float) animatedValue).floatValue()));
                            this.f36763a.f36743d = (int) composition.b();
                            if (this.f36763a.p.size() < this.f36763a.o.size() && (intValue = this.f36763a.o.get(this.f36763a.p.size()).intValue()) <= this.f36763a.f36742c) {
                                this.f36763a.p.add(Integer.valueOf(intValue));
                                LynxBytedLottieView lynxBytedLottieView2 = this.f36763a;
                                lynxBytedLottieView2.a("update", LynxBytedLottieView.a(lynxBytedLottieView2.f36742c, this.f36763a.f36743d, this.f36763a.f36744e, this.f36763a.f36752m));
                                return;
                            }
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        LLog.d("byted-lottie", e2.toString());
                    }
                }
            }
        }
    }

    public static final class h implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f36764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.j f36766c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.f f36767d;

        static {
            Covode.recordClassIndex(22078);
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a
        public final void a(String str) {
            h.f.b.l.c(str, "");
            this.f36765b.f36750k = false;
            if (!h.m.p.a((CharSequence) str)) {
                this.f36765b.a("use mSrcDir, mSrcUrl: " + this.f36765b.f36745f + ", path: " + ((String) this.f36764a.element) + ", msg: " + str, this.f36764a.element, 1);
            }
            String str2 = "request resource from " + ((String) this.f36764a.element) + " failed";
            this.f36765b.a("error", LynxBytedLottieView.a(1, str2));
            this.f36765b.q.a(this.f36765b.f36746g, this.f36764a.element, str2);
            LLog.d("byted-lottie", "fetchBitmap failed, mSrcUrl=`" + this.f36765b.f36745f + "`, url=`" + ((String) this.f36764a.element) + '`');
            this.f36767d.a();
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a
        public final void a(Bitmap bitmap, String str) {
            h.f.b.l.c(bitmap, "");
            h.f.b.l.c(str, "");
            this.f36767d.a(bitmap);
        }

        h(z.e eVar, LynxBytedLottieView lynxBytedLottieView, com.bytedance.lottie.j jVar, com.bytedance.lottie.f fVar) {
            this.f36764a = eVar;
            this.f36765b = lynxBytedLottieView;
            this.f36766c = jVar;
            this.f36767d = fVar;
        }
    }

    public static final class i implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.f f36769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36770c;

        static {
            Covode.recordClassIndex(22079);
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a
        public final void a(String str) {
            h.f.b.l.c(str, "");
            this.f36768a.f36750k = false;
            if (!h.m.p.a((CharSequence) str)) {
                this.f36768a.a("useXResourceFrom: " + this.f36768a.f36747h + ", mSrcUrl: " + this.f36768a.f36745f + ", path: " + this.f36770c + ", msg: " + str, this.f36770c, 1);
            }
            this.f36768a.a("error", LynxBytedLottieView.a(1, "fetch bitmap failed, useXResourceFrom: " + this.f36768a.f36747h + ", path: " + this.f36770c));
            LLog.d("byted-lottie", "fetchBitmap mSrcUrl=`" + this.f36768a.f36745f + "`, filePath=`" + this.f36770c + "` not exists.");
            this.f36769b.a();
        }

        @Override // com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView.a
        public final void a(Bitmap bitmap, String str) {
            h.f.b.l.c(bitmap, "");
            h.f.b.l.c(str, "");
            this.f36769b.a(bitmap);
        }

        i(LynxBytedLottieView lynxBytedLottieView, com.bytedance.lottie.f fVar, String str) {
            this.f36768a = lynxBytedLottieView;
            this.f36769b = fVar;
            this.f36770c = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.a.c, h.z> {
        final /* synthetic */ com.bytedance.ies.xelement.a.a $loader$inlined;
        final /* synthetic */ String $safeSrc;
        final /* synthetic */ String $src$inlined;
        final /* synthetic */ LynxBytedLottieView this$0;

        static {
            Covode.recordClassIndex(22083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(String str, com.bytedance.ies.xelement.a.a aVar, LynxBytedLottieView lynxBytedLottieView, String str2) {
            super(1);
            this.$safeSrc = str;
            this.$loader$inlined = aVar;
            this.this$0 = lynxBytedLottieView;
            this.$src$inlined = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.xelement.a.c cVar) {
            com.bytedance.ies.xelement.a.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            this.this$0.b(this.$safeSrc);
            this.this$0.f36748i = true;
            this.this$0.f36747h = cVar2.f36583d;
            com.bytedance.ies.xelement.a.b bVar = cVar2.f36583d;
            if (bVar != null) {
                int i2 = c.f36819a[bVar.ordinal()];
                if (i2 == 1) {
                    LLog.b("byted-lottie", "load resource success from builtin: " + cVar2.f36581b);
                    String str = cVar2.f36581b;
                    if (str != null) {
                        this.this$0.b(str);
                        this.this$0.f36751l = true;
                        com.lynx.tasm.behavior.j jVar = this.this$0.mContext;
                        LynxBytedLottieView lynxBytedLottieView = this.this$0;
                        com.bytedance.lottie.h.a(jVar, str, null, lynxBytedLottieView, lynxBytedLottieView.x);
                    }
                } else if (i2 == 2) {
                    LLog.b("byted-lottie", "load resource success from gecko: " + cVar2.f36581b);
                    String str2 = cVar2.f36581b;
                    if (str2 != null) {
                        this.this$0.b(str2);
                        this.this$0.f36751l = true;
                        LynxBytedLottieView lynxBytedLottieView2 = this.this$0;
                        com.bytedance.lottie.h.a(str2, lynxBytedLottieView2, lynxBytedLottieView2.x);
                    }
                } else if (i2 == 3) {
                    LLog.b("byted-lottie", "load resource success from gecko: " + cVar2.f36581b);
                    String str3 = cVar2.f36581b;
                    if (str3 != null) {
                        this.this$0.f36751l = false;
                        LynxBytedLottieView lynxBytedLottieView3 = this.this$0;
                        com.bytedance.lottie.h.a(str3, lynxBytedLottieView3, lynxBytedLottieView3.x);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    private final void d(String str) {
        String str2;
        String str3;
        String uri;
        if (h.m.p.b(str, "./", false)) {
            str2 = com.lynx.tasm.behavior.ui.image.a.a(this.mContext, str);
        } else {
            str2 = str;
        }
        if (!h.f.b.l.a((Object) this.f36746g, (Object) str2)) {
            LLog.b("byted-lottie", "start load lottie: ".concat(String.valueOf(str2)));
            this.f36746g = str2;
            this.q.a(str2);
            this.x = new c(this.f36746g);
            View view = this.mView;
            if (!(view instanceof LynxBytedLottieAnimationView)) {
                view = null;
            }
            LynxBytedLottieAnimationView lynxBytedLottieAnimationView = (LynxBytedLottieAnimationView) view;
            if (lynxBytedLottieAnimationView != null) {
                lynxBytedLottieAnimationView.setSrcUrl(this.f36746g);
            }
            com.bytedance.ies.xelement.a.a<com.bytedance.ies.xelement.a.c> aVar = this.C;
            if (!(aVar == null || (str3 = this.f36746g) == null)) {
                this.f36747h = null;
                boolean a2 = h.f.b.l.a(getProps().get("only-local"), (Object) true);
                this.v = a2;
                if (a2) {
                    uri = Uri.parse(str3).buildUpon().appendQueryParameter("dynamic", "2").appendQueryParameter("onlyLocal", "1").build().toString();
                } else {
                    uri = Uri.parse(str3).buildUpon().appendQueryParameter("dynamic", "2").build().toString();
                }
                h.f.b.l.a((Object) uri, "");
                aVar.a(uri, new k(str3, aVar, this, str), new l(aVar, this, str));
                if (h.z.f158842a != null) {
                    return;
                }
            }
            a(str);
        }
    }

    public final String c(String str) {
        String str2;
        com.bytedance.ies.xelement.a.b bVar = this.f36747h;
        if (bVar != null) {
            int i2 = c.f36820b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (h.m.p.b(str, "http://", false) || h.m.p.b(str, "https://", false)) {
                        str2 = com.lynx.tasm.behavior.ui.image.a.a(this.mContext, str);
                    } else {
                        str2 = this.f36745f + '/' + str;
                    }
                    h.f.b.l.a((Object) str2, "");
                    if (!h.m.p.b(str2, "file:", false)) {
                        str2 = "file:".concat(String.valueOf(str2));
                    }
                    h.f.b.l.a((Object) str2, "");
                    return str2;
                } else if (i2 == 3 && !h.m.p.b(str, "http://", false) && !h.m.p.b(str, "https://", false)) {
                    return this.f36745f + '/' + str;
                } else {
                    return str;
                }
            } else if (h.m.p.b(str, "http://", false) || h.m.p.b(str, "https://", false)) {
                return str;
            } else {
                return this.f36745f + '/' + str;
            }
        }
        return str;
    }

    public static final class q<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(22089);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.intValue()), Integer.valueOf(t2.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.m<Throwable, Boolean, h.z> {
        final /* synthetic */ com.bytedance.ies.xelement.a.a $loader$inlined;
        final /* synthetic */ String $src$inlined;
        final /* synthetic */ LynxBytedLottieView this$0;

        static {
            Covode.recordClassIndex(22084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(com.bytedance.ies.xelement.a.a aVar, LynxBytedLottieView lynxBytedLottieView, String str) {
            super(2);
            this.$loader$inlined = aVar;
            this.this$0 = lynxBytedLottieView;
            this.$src$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Throwable th, Boolean bool) {
            Throwable th2 = th;
            boolean booleanValue = bool.booleanValue();
            String str = "";
            h.f.b.l.c(th2, str);
            String str2 = "request resource failed, errorMsg is \n " + String.valueOf(th2.getMessage());
            if (this.this$0.v) {
                LynxBytedLottieView lynxBytedLottieView = this.this$0;
                String str3 = lynxBytedLottieView.f36746g;
                if (str3 != null) {
                    str = str3;
                }
                lynxBytedLottieView.a(str2, str, 4);
            } else if (booleanValue) {
                this.this$0.a(this.$src$inlined);
            } else {
                LynxBytedLottieView lynxBytedLottieView2 = this.this$0;
                String str4 = lynxBytedLottieView2.f36746g;
                if (str4 != null) {
                    str = str4;
                }
                lynxBytedLottieView2.a(str2, str, 1);
            }
            return h.z.f158842a;
        }
    }

    public static final class n extends com.facebook.imagepipeline.o.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36786a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxBytedLottieView f36787b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lottie.j f36788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.o.c f36789d;

        static {
            Covode.recordClassIndex(22086);
        }

        @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
        public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, com.facebook.imagepipeline.c.f fVar) {
            Throwable th;
            com.facebook.common.h.a<Bitmap> aVar;
            Exception e2;
            h.f.b.l.c(bitmap, "");
            h.f.b.l.c(fVar, "");
            LLog.b("byted-lottie", "some memory is wasted, recreate the bitmap with 565");
            com.facebook.common.h.a<Bitmap> aVar2 = null;
            try {
                aVar = fVar.a(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
                try {
                    new Canvas(aVar.a()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    com.facebook.common.h.a<Bitmap> b2 = com.facebook.common.h.a.b(aVar);
                    com.facebook.common.h.a.c(aVar);
                    return b2;
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        e2.printStackTrace();
                        this.f36787b.a("error happened when change bitmap from ARG_8888 to RGB_565, imagePath is " + this.f36786a, this.f36786a, 3);
                        com.facebook.common.h.a.c(aVar);
                        return super.process(bitmap, fVar);
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        com.facebook.common.h.a.c(aVar2);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                aVar = null;
                e2.printStackTrace();
                this.f36787b.a("error happened when change bitmap from ARG_8888 to RGB_565, imagePath is " + this.f36786a, this.f36786a, 3);
                com.facebook.common.h.a.c(aVar);
                return super.process(bitmap, fVar);
            } catch (Throwable th3) {
                th = th3;
                com.facebook.common.h.a.c(aVar2);
                throw th;
            }
        }

        n(String str, LynxBytedLottieView lynxBytedLottieView, com.bytedance.lottie.j jVar, com.facebook.imagepipeline.o.c cVar) {
            this.f36786a = str;
            this.f36787b = lynxBytedLottieView;
            this.f36788c = jVar;
            this.f36789d = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LynxBytedLottieView(com.lynx.tasm.behavior.j jVar, String str) {
        super(jVar);
        h.f.b.l.c(jVar, "");
        h.f.b.l.c(str, "");
        this.f36740a = true;
        this.f36741b = true;
        this.f36743d = -1;
        this.f36749j = true;
        this.f36750k = true;
        this.f36752m = "";
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new b(str);
        this.s = new a();
        this.t = "";
        this.u = new ArrayList<>();
        this.E = Integer.MAX_VALUE;
    }

    public static Map<String, Object> a(int i2, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i2));
        linkedHashMap.put("msg", str);
        return linkedHashMap;
    }

    @com.lynx.tasm.behavior.p
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            View view = this.mView;
            if (view == null) {
                h.f.b.l.a();
            }
            javaOnlyMap.putInt("data", (int) ((LottieAnimationView) view).getDuration());
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @com.lynx.tasm.behavior.p
    public final void isAnimating(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            View view = this.mView;
            h.f.b.l.a((Object) view, "");
            javaOnlyMap.putBoolean("data", ((LottieAnimationView) view).g());
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @com.lynx.tasm.behavior.p
    public final void listenAnimationUpdate(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            javaOnlyMap.putBoolean("data", true);
            this.f36749j = readableMap.getBoolean("isListen");
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @com.lynx.tasm.behavior.p
    public final void pause(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                ((LottieAnimationView) this.mView).i();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e2) {
                javaOnlyMap.putString("message:", e2.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void play(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.a((Object) uuid, "");
        this.f36752m = uuid;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                ((LottieAnimationView) this.mView).c();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e2) {
                javaOnlyMap.putString("message:", e2.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void resume(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.a((Object) uuid, "");
        this.f36752m = uuid;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                ((LottieAnimationView) this.mView).d();
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e2) {
                javaOnlyMap.putString("message:", e2.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
        if (this.mView == null) {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void seek(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            int i2 = readableMap.getInt("frame");
            View view = this.mView;
            h.f.b.l.a((Object) view, "");
            ((LottieAnimationView) view).setFrame(i2);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("message", "view is not exist");
        callback.invoke(1, javaOnlyMap);
    }

    @com.lynx.tasm.behavior.p
    public final void stop(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        h.f.b.l.c(callback, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView != null) {
            try {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.mView;
                if (lottieAnimationView != null) {
                    lottieAnimationView.h();
                    Drawable drawable = lottieAnimationView.getDrawable();
                    if (!(drawable instanceof com.bytedance.lottie.i)) {
                        drawable = null;
                    }
                    com.bytedance.lottie.i iVar = (com.bytedance.lottie.i) drawable;
                    if (iVar != null) {
                        iVar.stop();
                    }
                }
                callback.invoke(0, javaOnlyMap);
            } catch (Exception e2) {
                javaOnlyMap.putString("message:", e2.getMessage());
                callback.invoke(1, javaOnlyMap);
            }
        } else {
            javaOnlyMap.putString("message", "view is not exist");
            callback.invoke(1, javaOnlyMap);
        }
    }

    @com.lynx.tasm.behavior.p
    public final void subscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        int i2 = readableMap.getInt("frame");
        if (!this.o.contains(Integer.valueOf(i2))) {
            this.o.add(Integer.valueOf(i2));
            List<Integer> list = this.o;
            if (list.size() > 1) {
                h.a.n.a((List) list, (Comparator) new q());
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, "already subscribeUpdateEvent with " + i2 + " frame");
        }
    }

    @com.lynx.tasm.behavior.p
    public final void unsubscribeUpdateEvent(ReadableMap readableMap, Callback callback) {
        h.f.b.l.c(readableMap, "");
        int i2 = readableMap.getInt("frame");
        if (this.o.contains(Integer.valueOf(i2))) {
            this.o.remove(Integer.valueOf(i2));
            if (callback != null) {
                callback.invoke(0);
            }
        } else if (callback != null) {
            callback.invoke(1, i2 + " frame is not subscribed");
        }
    }

    private final void a(com.bytedance.lottie.g gVar, ReadableMap readableMap, com.bytedance.lottie.f<String> fVar) {
        new com.bytedance.ies.xelement.bytedlottie.a.b(new j(this, readableMap, fVar, gVar));
    }

    private void a(String str, com.bytedance.lottie.j jVar, a aVar) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(jVar, "");
        h.f.b.l.c(aVar, "");
        a(str, str, jVar, aVar);
    }

    public static Map<String, Object> a(int i2, int i3, int i4, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("current", Integer.valueOf(i2));
        linkedHashMap.put("total", Integer.valueOf(i3));
        linkedHashMap.put("loopIndex", Integer.valueOf(i4));
        linkedHashMap.put("animationID", str);
        return linkedHashMap;
    }

    public final com.facebook.common.h.a<Bitmap> a(com.facebook.common.h.a<Bitmap> aVar, int i2, int i3, String str) {
        com.facebook.common.h.a<Bitmap> aVar2;
        MethodCollector.i(12150);
        Bitmap a2 = aVar.a();
        try {
            h.f.b.l.a((Object) a2, "");
            if (a2.getWidth() == i2 && a2.getHeight() == i3) {
                aVar2 = aVar.c();
            } else {
                aVar2 = com.facebook.common.h.a.a(Bitmap.createScaledBitmap(a2, i2, i3, false), com.facebook.imagepipeline.c.g.a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            a("scale image failed, and detail is ".concat(String.valueOf(e2)), str, 2);
            aVar2 = null;
        }
        MethodCollector.o(12150);
        return aVar2;
    }
}

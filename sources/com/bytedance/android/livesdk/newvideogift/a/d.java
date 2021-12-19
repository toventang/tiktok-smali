package com.bytedance.android.livesdk.newvideogift.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPlayerUserTypeNewSetting;
import com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerController;
import com.bytedance.android.livesdkapi.depend.d.a.a;
import com.bytedance.android.livesdkapi.depend.d.a.c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.t;
import com.ss.android.ugc.aweme.live.alphaplayer.a.b;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import java.io.File;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public c f19880a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.d.a.d f19881b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f19882c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.controller.a f19883d;

    /* renamed from: e  reason: collision with root package name */
    private Context f19884e;

    /* renamed from: f  reason: collision with root package name */
    private m f19885f;

    /* renamed from: g  reason: collision with root package name */
    private final IHostPlugin f19886g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.live.alphaplayer.d.c f19887h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.live.alphaplayer.a.a f19888i = new com.ss.android.ugc.aweme.live.alphaplayer.a.a() {
        /* class com.bytedance.android.livesdk.newvideogift.a.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(11773);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void a() {
            if (d.this.f19880a != null) {
                d.this.f19880a.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        public final void b() {
            if (d.this.f19880a != null) {
                d.this.f19880a.b();
            }
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
            if (r9 > r8) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
            if (r9 > r8) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
            if (r9 > r8) goto L_0x0095;
         */
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r11, int r12, com.ss.android.ugc.aweme.live.alphaplayer.c.a.d r13) {
            /*
            // Method dump skipped, instructions count: 196
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.a.d.AnonymousClass1.a(int, int, com.ss.android.ugc.aweme.live.alphaplayer.c.a$d):void");
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private b f19889j = new b() {
        /* class com.bytedance.android.livesdk.newvideogift.a.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(11774);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.b
        public final void a(String str, Exception exc) {
            com.bytedance.android.live.core.c.a.a(4, "LiveGiftPlay", "create " + str + " failure, errorMsg: " + exc.toString());
            com.bytedance.android.live.core.c.a.a(6, "LiveGiftPlay", exc.getStackTrace());
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.b
        public final void a(boolean z, String str, int i2, int i3, String str2) {
            MethodCollector.i(10932);
            synchronized (d.this.f19882c) {
                try {
                    if (d.this.f19881b != null) {
                        d.this.f19881b.a(z, str, i2, i3, str2);
                    }
                } finally {
                    MethodCollector.o(10932);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(11772);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void d() {
        this.f19880a = null;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final boolean a() {
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f19883d;
        if (aVar == null || !aVar.b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void e() {
        MethodCollector.i(9117);
        synchronized (this.f19882c) {
            try {
                this.f19881b = null;
            } finally {
                MethodCollector.o(9117);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void b() {
        if (this.f19883d != null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveGiftPlay", "stopWhenSlideSwitch() called with: playerController = [" + this.f19883d + "]");
            this.f19883d.h();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void c() {
        MethodCollector.i(8918);
        if (this.f19883d != null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveGiftPlay", "release() called with: playerController = [" + this.f19883d + "]");
            this.f19883d.a((com.ss.android.ugc.aweme.live.alphaplayer.a.a) null);
            this.f19883d.a((b) null);
            this.f19883d.g();
            this.f19883d = null;
        }
        this.f19885f = null;
        this.f19884e = null;
        this.f19880a = null;
        synchronized (this.f19882c) {
            try {
                this.f19881b = null;
            } finally {
                MethodCollector.o(8918);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.newvideogift.a.d$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19892a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.a.d.AnonymousClass3.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void a(c cVar) {
        this.f19880a = cVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void a(com.bytedance.android.livesdkapi.depend.d.a.d dVar) {
        MethodCollector.i(9116);
        synchronized (this.f19882c) {
            try {
                this.f19881b = dVar;
            } finally {
                MethodCollector.o(9116);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void a(ViewGroup viewGroup) {
        if (this.f19883d != null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveGiftPlay", "attachAlphaView() called with: playerController = [" + this.f19883d + "]");
            this.f19883d.a(viewGroup);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void b(ViewGroup viewGroup) {
        if (this.f19883d != null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveGiftPlay", "detachAlphaView() called with: playerController = [" + this.f19883d + "]");
            this.f19883d.b(viewGroup);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void a(m mVar) {
        com.ss.android.ugc.aweme.live.alphaplayer.d.c hVar;
        this.f19885f = mVar;
        if (this.f19884e == null || mVar == null) {
            com.bytedance.android.live.core.c.a.a(6, "LiveGiftPlay", "context or lifecycleOwner is null!");
            return;
        }
        com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar = this.f19883d;
        if (aVar != null) {
            aVar.g();
        }
        com.ss.android.ugc.aweme.live.alphaplayer.c cVar = new com.ss.android.ugc.aweme.live.alphaplayer.c();
        cVar.f108152a = this.f19884e;
        cVar.f108154c = 1;
        cVar.f108153b = this.f19885f;
        if (LiveGiftPlayerUserTypeNewSetting.INSTANCE.getValue() == 1 && !com.bytedance.android.livesdk.ap.a.bu.a().booleanValue()) {
            hVar = new com.ss.android.ugc.aweme.live.alphaplayer.d.b();
        } else if (LiveGiftPlayerUserTypeNewSetting.INSTANCE.getValue() == 4) {
            hVar = new g(this.f19884e);
        } else {
            hVar = new h(this.f19884e);
        }
        this.f19887h = hVar;
        com.bytedance.android.live.core.c.a.a(4, "LiveGiftPlay", "use " + hVar.j());
        LocalPlayerController localPlayerController = new LocalPlayerController(cVar.f108152a, cVar.f108153b, hVar, cVar.f108154c);
        this.f19883d = localPlayerController;
        localPlayerController.a(this.f19888i);
        this.f19883d.a(this.f19889j);
    }

    public d(Context context, IHostPlugin iHostPlugin) {
        this.f19884e = context;
        this.f19886g = iHostPlugin;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.a
    public final void a(String str, long j2) {
        StringBuilder append;
        StringBuilder append2;
        MethodCollector.i(8915);
        if (this.f19883d != null) {
            com.bytedance.android.live.core.c.a.a(3, "LiveGiftPlay", "start() called with: playerController = [" + this.f19883d + "]");
            if (str.endsWith(File.separator)) {
                append = new StringBuilder().append(str);
            } else {
                append = new StringBuilder().append(str).append(File.separator);
            }
            String sb = append.append("config.json").toString();
            String a2 = a.a(sb);
            if (a2 == null || a2.isEmpty()) {
                boolean exists = new File(sb).exists();
                synchronized (this.f19882c) {
                    try {
                        com.bytedance.android.livesdkapi.depend.d.a.d dVar = this.f19881b;
                        if (dVar != null) {
                            dVar.a(false, "", 0, 0, "configJson is null; exist:".concat(String.valueOf(exists)));
                        }
                    } finally {
                        MethodCollector.o(8915);
                    }
                }
                return;
            }
            try {
                i iVar = (i) e.a.f9629c.a(a2, i.class);
                if (iVar == null) {
                    synchronized (this.f19882c) {
                        try {
                            com.bytedance.android.livesdkapi.depend.d.a.d dVar2 = this.f19881b;
                            if (dVar2 != null) {
                                dVar2.a(false, "", 0, 0, "Gson convert failed: " + a2.replaceAll("\\s", ""));
                            }
                        } finally {
                            MethodCollector.o(8915);
                        }
                    }
                    return;
                }
                com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar = new com.ss.android.ugc.aweme.live.alphaplayer.c.a();
                aVar.f108158d = j2;
                if (iVar.f19918b != null) {
                    if (str.endsWith(File.separator)) {
                        append2 = new StringBuilder().append(str);
                    } else {
                        append2 = new StringBuilder().append(str).append(File.separator);
                    }
                    a.b a3 = new a.b(append2.append(iVar.f19918b.f19923a).toString()).a(iVar.f19918b.f19924b);
                    a3.f108175j = iVar.f19918b.f19925c;
                    a3.f108168c = iVar.f19918b.f19926d;
                    a3.f108171f = iVar.f19918b.f19929g;
                    a3.f108172g = iVar.f19918b.f19930h;
                    a3.f108173h = iVar.f19918b.f19927e;
                    a3.f108174i = iVar.f19918b.f19928f;
                    a.b b2 = a3.a(iVar.f19918b.f19931i).b(iVar.f19918b.f19932j);
                    b2.f108176k = iVar.f19918b.f19933k;
                    aVar.b(b2);
                }
                if (iVar.f19917a != null) {
                    a.b a4 = new a.b(str + File.separator + iVar.f19917a.f19923a).a(iVar.f19917a.f19924b);
                    a4.f108175j = iVar.f19917a.f19925c;
                    a4.f108168c = iVar.f19917a.f19926d;
                    a4.f108171f = iVar.f19917a.f19929g;
                    a4.f108172g = iVar.f19917a.f19930h;
                    a4.f108173h = iVar.f19917a.f19927e;
                    a4.f108174i = iVar.f19917a.f19928f;
                    a.b b3 = a4.a(iVar.f19917a.f19931i).b(iVar.f19917a.f19932j);
                    b3.f108176k = iVar.f19917a.f19933k;
                    aVar.a(b3);
                    aVar.b(b3);
                }
                this.f19883d.a(aVar);
            } catch (t e2) {
                com.bytedance.android.live.core.c.a.a("LiveGiftPlay", e2);
            }
        }
        MethodCollector.o(8915);
    }
}

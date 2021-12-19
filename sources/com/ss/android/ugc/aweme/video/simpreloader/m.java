package com.ss.android.ugc.aweme.video.simpreloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.preload.a.d;
import com.ss.android.ugc.aweme.video.preload.a.e;
import com.ss.android.ugc.aweme.video.preload.k;
import com.ss.android.ugc.aweme.video.preload.s;
import h.f.b.l;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final h f143981c = i.a((h.f.a.a) b.f143991a);

    /* renamed from: d  reason: collision with root package name */
    public static final d f143982d = e.a();

    /* renamed from: e  reason: collision with root package name */
    public static final a f143983e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Executor f143984a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f143985b;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<i> f143986f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private String f143987g = "";

    /* renamed from: h  reason: collision with root package name */
    private final HandlerThread f143988h;

    public static final class a {
        static {
            Covode.recordClassIndex(94213);
        }

        public static m a() {
            return (m) m.f143981c.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143991a = new b();

        static {
            Covode.recordClassIndex(94214);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return new m();
        }
    }

    static {
        Covode.recordClassIndex(94210);
    }

    public m() {
        HandlerThread handlerThread = new HandlerThread("VideoCoverPreloader");
        this.f143988h = handlerThread;
        this.f143984a = new c(this);
        if (f143982d.f143601a) {
            handlerThread.start();
            this.f143985b = new Handler(this, handlerThread.getLooper()) {
                /* class com.ss.android.ugc.aweme.video.simpreloader.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f143989a;

                static {
                    Covode.recordClassIndex(94211);
                }

                public final void handleMessage(Message message) {
                    l.d(message, "");
                    switch (message.what) {
                        case 1:
                            m mVar = this.f143989a;
                            Object obj = message.obj;
                            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.video.simpreloader.AddMediaMsg");
                            mVar.a((a) obj);
                            break;
                        case 2:
                            m mVar2 = this.f143989a;
                            Object obj2 = message.obj;
                            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            mVar2.a((String) obj2);
                            break;
                        case 3:
                            m mVar3 = this.f143989a;
                            Object obj3 = message.obj;
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            mVar3.b((String) obj3);
                            break;
                        case 4:
                            m mVar4 = this.f143989a;
                            Object obj4 = message.obj;
                            Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            mVar4.d((String) obj4);
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            m mVar5 = this.f143989a;
                            Object obj5 = message.obj;
                            Objects.requireNonNull(obj5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                            mVar5.a((Aweme) obj5);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            m mVar6 = this.f143989a;
                            Object obj6 = message.obj;
                            Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.String");
                            mVar6.f((String) obj6);
                            break;
                    }
                    super.handleMessage(message);
                }

                {
                    this.f143989a = r2;
                }
            };
            com.ss.android.ugc.aweme.video.preload.i b2 = s.b();
            l.b(b2, "");
            b2.e().a(new k(this) {
                /* class com.ss.android.ugc.aweme.video.simpreloader.m.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f143990a;

                static {
                    Covode.recordClassIndex(94212);
                }

                @Override // com.ss.android.ugc.aweme.video.preload.k
                public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
                }

                @Override // com.ss.android.ugc.aweme.video.preload.k
                public final void a(List<com.ss.android.ugc.playerkit.simapicommon.a.i> list) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f143990a = r1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.k
                public final void a(Pair<com.ss.android.ugc.playerkit.simapicommon.a.i, String> pair) {
                    String str;
                    Handler handler;
                    Message obtainMessage;
                    com.ss.android.ugc.playerkit.simapicommon.a.i iVar;
                    m mVar = this.f143990a;
                    if (pair == null || (iVar = (com.ss.android.ugc.playerkit.simapicommon.a.i) pair.first) == null) {
                        str = null;
                    } else {
                        str = iVar.getSourceId();
                    }
                    if (m.f143982d.f143601a && m.f143982d.f143603c && str != null && str.length() != 0 && (handler = mVar.f143985b) != null && (obtainMessage = handler.obtainMessage(2, str)) != null) {
                        obtainMessage.sendToTarget();
                    }
                }
            });
        }
    }

    static final class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f143992a;

        static {
            Covode.recordClassIndex(94215);
        }

        c(m mVar) {
            this.f143992a = mVar;
        }

        public final void execute(Runnable runnable) {
            Handler handler = this.f143992a.f143985b;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    private final int g(String str) {
        int size = this.f143986f.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, this.f143986f.get(i2).f143974a)) {
                return i2;
            }
        }
        return -1;
    }

    public final void c(String str) {
        Handler handler;
        Message obtainMessage;
        if (f143982d.f143601a && str != null && str.length() != 0 && (handler = this.f143985b) != null && (obtainMessage = handler.obtainMessage(4, str)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    public final void e(String str) {
        Handler handler;
        Message obtainMessage;
        if (f143982d.f143601a && str != null && str.length() != 0 && (handler = this.f143985b) != null && (obtainMessage = handler.obtainMessage(6, str)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    public final void a(Aweme aweme) {
        String aid = aweme.getAid();
        l.b(aid, "");
        this.f143987g = aid;
        if (this.f143986f.size() != 0 && ac.a(aweme)) {
            ArrayList<i> arrayList = this.f143986f;
            i iVar = arrayList.get(arrayList.size() - 1);
            l.b(iVar, "");
            iVar.a(this.f143987g);
        }
    }

    public final void b(String str) {
        if (this.f143986f.size() != 0) {
            ArrayList<i> arrayList = this.f143986f;
            i iVar = arrayList.get(arrayList.size() - 1);
            l.b(iVar, "");
            i iVar2 = iVar;
            if (l.a((Object) str, (Object) this.f143987g)) {
                iVar2.a(str);
            }
        }
    }

    public final void d(String str) {
        if (this.f143986f.size() != 0) {
            ArrayList<i> arrayList = this.f143986f;
            i iVar = arrayList.get(arrayList.size() - 1);
            l.b(iVar, "");
            i iVar2 = iVar;
            if (l.a((Object) str, (Object) this.f143987g)) {
                iVar2.c();
            }
        }
    }

    public final void f(String str) {
        int i2;
        int g2 = g(str);
        if (g2 != -1 && g2 < this.f143986f.size() && this.f143986f.size() - 1 >= g2) {
            while (true) {
                this.f143986f.get(i2).c();
                this.f143986f.get(i2).d();
                this.f143986f.remove(i2);
                if (i2 != g2) {
                    i2--;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(String str) {
        if (this.f143986f.size() != 0) {
            ArrayList<i> arrayList = this.f143986f;
            i iVar = arrayList.get(arrayList.size() - 1);
            l.b(iVar, "");
            i iVar2 = iVar;
            if (iVar2.b(str) > iVar2.b(this.f143987g)) {
                iVar2.a(this.f143987g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r4 == -1) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.video.simpreloader.a r7) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simpreloader.m.a(com.ss.android.ugc.aweme.video.simpreloader.a):void");
    }

    public final void a(List<? extends Aweme> list, boolean z, String str) {
        Handler handler;
        Message obtainMessage;
        if (f143982d.f143601a && list != null && !list.isEmpty() && str != null && str.length() != 0 && (handler = this.f143985b) != null && (obtainMessage = handler.obtainMessage(1, new a(new ArrayList(list), z, str))) != null) {
            obtainMessage.sendToTarget();
        }
    }
}

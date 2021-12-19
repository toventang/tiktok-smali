package com.bytedance.android.livesdk.widget.b;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.widget.b.c;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22598a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22599b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f22600c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    public Runnable f22601d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    public long f22602e = InteractFirstFrameTimeOutDurationSetting.INSTANCE.getValue();

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.ui.a f22603f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f22604g;

    static {
        Covode.recordClassIndex(13350);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f22606a;

        static {
            Covode.recordClassIndex(13352);
        }

        b(d dVar) {
            this.f22606a = dVar;
        }

        public final void run() {
            c cVar;
            com.bytedance.android.live.core.c.a.a(4, "WidgetLoadState", "widget state loadWidgetP1Runnable call");
            com.bytedance.android.livesdk.chatroom.ui.a aVar = this.f22606a.f22603f;
            if (aVar != null && (cVar = aVar.D) != null) {
                cVar.f22576a.a(c.a.d.f22581a);
            }
        }
    }

    public final void b() {
        Handler handler = this.f22604g;
        if (handler != null) {
            handler.removeCallbacks(this.f22600c);
        }
        Handler handler2 = this.f22604g;
        if (handler2 != null) {
            handler2.removeCallbacks(this.f22601d);
        }
        this.f22604g = null;
        this.f22603f = null;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f22605a;

        static {
            Covode.recordClassIndex(13351);
        }

        a(d dVar) {
            this.f22605a = dVar;
        }

        public final void run() {
            c cVar;
            c cVar2;
            com.bytedance.android.live.core.c.a.a(4, "WidgetLoadState", "widget state loadWidgetP2Runnable call");
            com.bytedance.android.livesdk.chatroom.ui.a aVar = this.f22605a.f22603f;
            if (!(aVar == null || (cVar2 = aVar.D) == null)) {
                cVar2.f22576a.a(c.a.b.f22579a);
            }
            com.bytedance.android.livesdk.chatroom.ui.a aVar2 = this.f22605a.f22603f;
            if (aVar2 != null && (cVar = aVar2.D) != null) {
                cVar.f22576a.a(c.a.C0488a.f22578a);
            }
        }
    }

    public final void a() {
        c cVar;
        Handler handler = this.f22604g;
        if (handler != null) {
            handler.removeCallbacks(this.f22600c);
        }
        Handler handler2 = this.f22604g;
        if (handler2 != null) {
            handler2.removeCallbacks(this.f22601d);
        }
        com.bytedance.android.livesdk.chatroom.ui.a aVar = this.f22603f;
        if (!(aVar == null || (cVar = aVar.D) == null)) {
            cVar.a();
        }
        this.f22598a = false;
        this.f22599b = false;
    }

    public d(com.bytedance.android.livesdk.chatroom.ui.a aVar, Handler handler) {
        this.f22603f = aVar;
        this.f22604g = handler;
    }
}

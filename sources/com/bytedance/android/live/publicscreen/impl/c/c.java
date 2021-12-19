package com.bytedance.android.live.publicscreen.impl.c;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import org.json.JSONObject;

public final class c implements com.bytedance.android.livesdkapi.depend.d.c {

    /* renamed from: a  reason: collision with root package name */
    public f f12235a;

    /* renamed from: b  reason: collision with root package name */
    private IMessageManager f12236b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12237c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f12238d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f12239e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12240f;

    static {
        Covode.recordClassIndex(6741);
    }

    public static final class b implements com.bytedance.android.livesdkapi.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12244b;

        static {
            Covode.recordClassIndex(6743);
        }

        @Override // com.bytedance.android.livesdkapi.service.b
        public final void a() {
            f fVar = this.f12243a.f12235a;
            if (fVar != null) {
                fVar.a(this.f12244b);
            }
            this.f12243a.b();
        }

        @Override // com.bytedance.android.livesdkapi.service.b
        public final void a(Room room) {
            f fVar = this.f12243a.f12235a;
            if (fVar != null) {
                fVar.setRoom(room);
            }
            f fVar2 = this.f12243a.f12235a;
            if (fVar2 != null) {
                fVar2.a(this.f12244b);
            }
            this.f12243a.b();
        }

        b(c cVar, int i2) {
            this.f12243a = cVar;
            this.f12244b = i2;
        }
    }

    public final void b() {
        try {
            IMessageManager iMessageManager = this.f12236b;
            if (iMessageManager != null) {
                iMessageManager.startMessage();
            }
        } catch (Exception e2) {
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "exception_message", e2.toString());
            com.bytedance.android.live.core.d.c.a("feed_follow_live_message_exception", 0, jSONObject);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.c
    public final void a() {
        MethodCollector.i(5991);
        IMessageManager iMessageManager = this.f12236b;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(true);
        }
        IMessageManager iMessageManager2 = this.f12236b;
        if (iMessageManager2 != null) {
            iMessageManager2.release();
        }
        f fVar = this.f12235a;
        if (fVar != null) {
            f.a.b.b bVar = fVar.f12275b;
            if (bVar != null) {
                bVar.dispose();
            }
            f.a.b.b bVar2 = fVar.f12276c;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            f.a.b.b bVar3 = fVar.f12277d;
            if (bVar3 != null) {
                bVar3.dispose();
            }
            f.a.b.b bVar4 = fVar.f12278e;
            if (bVar4 != null) {
                bVar4.dispose();
            }
            ValueAnimator valueAnimator = fVar.f12280g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        ViewGroup viewGroup = this.f12239e;
        if (viewGroup != null) {
            viewGroup.removeView(this.f12235a);
            MethodCollector.o(5991);
            return;
        }
        MethodCollector.o(5991);
    }

    public static final class a implements com.bytedance.android.livesdkapi.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12242b;

        static {
            Covode.recordClassIndex(6742);
        }

        @Override // com.bytedance.android.livesdkapi.service.b
        public final void a() {
        }

        @Override // com.bytedance.android.livesdkapi.service.b
        public final void a(Room room) {
            f fVar = this.f12241a.f12235a;
            if (fVar != null) {
                fVar.setRoom(room);
            }
            f fVar2 = this.f12241a.f12235a;
            if (fVar2 != null) {
                fVar2.a(this.f12242b);
            }
        }

        a(c cVar, int i2) {
            this.f12241a = cVar;
            this.f12242b = i2;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.c
    public final void a(int i2) {
        if (i2 == 1) {
            f.a(this.f12240f, new a(this, i2));
        } else if (i2 == 2) {
            f fVar = this.f12235a;
            if (fVar != null) {
                fVar.a(i2);
            }
            b();
        } else if (i2 == 3 || i2 == 4) {
            f.a(this.f12240f, new b(this, i2));
        }
    }

    public c(Context context, ViewGroup viewGroup, long j2) {
        MethodCollector.i(6073);
        this.f12238d = context;
        this.f12239e = viewGroup;
        this.f12240f = j2;
        String str = com.bytedance.android.livesdk.model.message.a.a.CHAT.getWsMethod() + "," + com.bytedance.android.livesdk.model.message.a.a.SCREEN.getWsMethod() + "," + com.bytedance.android.livesdk.model.message.a.a.MEMBER.getWsMethod();
        this.f12237c = str;
        if (context == null || viewGroup == null) {
            MethodCollector.o(6073);
            return;
        }
        this.f12236b = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).messageManagerProvider(j2, context, str);
        f fVar = new f(context, this.f12236b);
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f12235a = fVar;
        viewGroup.addView(fVar);
        MethodCollector.o(6073);
    }
}

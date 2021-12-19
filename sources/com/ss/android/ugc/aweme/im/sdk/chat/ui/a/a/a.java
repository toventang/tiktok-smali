package com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatDiggLayout;
import com.zhiliaoapp.musically.R;
import h.a.ab;
import h.a.n;
import h.f.b.l;
import java.util.Set;

public abstract class a extends c {
    public static final Set<com.ss.android.ugc.aweme.im.sdk.chat.data.e.b> v = ab.INSTANCE;
    public static final C2513a w = new C2513a((byte) 0);
    public long t;
    public String u;
    private final ChatDiggLayout x;
    private final Handler y = new Handler(Looper.getMainLooper());

    public abstract boolean b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a$a  reason: collision with other inner class name */
    public static final class C2513a {
        static {
            Covode.recordClassIndex(64682);
        }

        private C2513a() {
        }

        public /* synthetic */ C2513a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101104a;

        static {
            Covode.recordClassIndex(64683);
        }

        b(a aVar) {
            this.f101104a = aVar;
        }

        public final void run() {
            this.f101104a.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public void c() {
        super.c();
        this.u = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(this.f101101b);
    }

    static {
        Covode.recordClassIndex(64681);
    }

    public final void g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.t < InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            com.ss.android.ugc.aweme.im.service.m.a.c("DiggMessageAdapter", "findOtherLastUserMsgAndUpdate lower than two sec");
            this.y.removeCallbacksAndMessages(null);
            this.y.postDelayed(new b(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            return;
        }
        this.t = uptimeMillis;
        String a2 = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(this.f101101b);
        if (a2 != null && (!l.a((Object) this.u, (Object) a2))) {
            this.u = a2;
            com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "SingleMessageAdapter->updatePartly->fail to notify all due to like");
            notifyDataSetChanged();
        }
    }

    private static boolean a(com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        if (n.a((Iterable) v, (Object) bVar)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<?> aVar, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        if (a(bVar) || aVar == null) {
            return;
        }
        if (b()) {
            ChatDiggLayout chatDiggLayout = this.x;
            if (aVar.f101321l != null) {
                aVar.f101321l.a(chatDiggLayout);
                return;
            }
            return;
        }
        aVar.f101321l = null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c
    public final void b(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<?> aVar, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        if (a(bVar) || aVar == null) {
            return;
        }
        if (b()) {
            aVar.a(this.n);
        } else {
            aVar.f101321l = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar, View view) {
        super(aVar);
        l.d(aVar, "");
        l.d(view, "");
        this.x = (ChatDiggLayout) view.findViewById(R.id.b56);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c, com.ss.android.ugc.aweme.im.sdk.chat.b.g.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public final void a(Object obj, int i2) {
        super.a(obj, i2);
        if (obj != null) {
            if (i2 == 1 || i2 == 3) {
                g();
            }
        }
    }
}

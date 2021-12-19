package com.ss.android.ugc.aweme.autoplay.player.video;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class e implements WeakHandler.IHandler, b.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67597b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b.d f67598a;

    /* renamed from: c  reason: collision with root package name */
    private final h f67599c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final c f67600d;

    static {
        Covode.recordClassIndex(41613);
    }

    private WeakHandler a() {
        return (WeakHandler) this.f67599c.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41614);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void i() {
        b.d dVar = this.f67598a;
        if (dVar != null) {
            dVar.B();
        }
    }

    static final class b extends m implements h.f.a.a<WeakHandler> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(41615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(Looper.getMainLooper(), this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final boolean h() {
        b.d dVar = this.f67598a;
        if (dVar != null) {
            return dVar.m();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void e() {
        a().removeMessages(16);
        b.d dVar = this.f67598a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void f() {
        a().removeMessages(16);
        b.d dVar = this.f67598a;
        if (dVar != null) {
            dVar.z();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void g() {
        a().removeCallbacksAndMessages(null);
        a().removeMessages(16);
        b.d dVar = this.f67598a;
        if (dVar != null) {
            dVar.A();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void a(long j2) {
        Aweme aweme;
        a().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        c cVar = this.f67600d;
        if (cVar != null) {
            aweme = cVar.f67578d;
        } else {
            aweme = null;
        }
        message.obj = aweme;
        a().sendMessageDelayed(message, j2);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        b.d dVar;
        Aweme aweme;
        l.d(message, "");
        if (message.what == 16 && (message.obj instanceof Aweme)) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            String aid = ((Aweme) obj).getAid();
            c cVar = this.f67600d;
            if (cVar == null || (aweme = cVar.f67578d) == null) {
                str = null;
            } else {
                str = aweme.getAid();
            }
            if (l.a((Object) aid, (Object) str) && (dVar = this.f67598a) != null) {
                dVar.x();
            }
        }
    }

    public e(b.d dVar, c cVar) {
        this.f67598a = dVar;
        this.f67600d = cVar;
    }
}

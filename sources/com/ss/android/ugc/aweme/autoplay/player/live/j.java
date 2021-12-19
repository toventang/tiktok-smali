package com.ss.android.ugc.aweme.autoplay.player.live;

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

public final class j implements WeakHandler.IHandler, b.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67540b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b.d f67541a;

    /* renamed from: c  reason: collision with root package name */
    private final h f67542c;

    /* renamed from: d  reason: collision with root package name */
    private final b.AbstractC1522b f67543d;

    static {
        Covode.recordClassIndex(41578);
    }

    private WeakHandler a() {
        return (WeakHandler) this.f67542c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void i() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41579);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<WeakHandler> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(Looper.getMainLooper(), this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final boolean h() {
        b.d dVar = this.f67541a;
        if (dVar != null) {
            return dVar.m();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void e() {
        a().removeMessages(16);
        b.d dVar = this.f67541a;
        if (dVar != null) {
            dVar.hashCode();
        }
        b.d dVar2 = this.f67541a;
        if (dVar2 != null) {
            dVar2.y();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void f() {
        b.d dVar = this.f67541a;
        if (dVar != null) {
            dVar.hashCode();
        }
        a().removeMessages(16);
        b.d dVar2 = this.f67541a;
        if (dVar2 != null) {
            dVar2.z();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void g() {
        b.d dVar = this.f67541a;
        if (dVar != null) {
            dVar.hashCode();
        }
        a().removeCallbacksAndMessages(null);
        a().removeMessages(16);
        b.d dVar2 = this.f67541a;
        if (dVar2 != null) {
            dVar2.A();
        }
    }

    public /* synthetic */ j(b.d dVar) {
        this(dVar, null);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void a(long j2) {
        Aweme aweme;
        a().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        b.AbstractC1522b bVar = this.f67543d;
        if (bVar != null) {
            aweme = bVar.a();
        } else {
            aweme = null;
        }
        message.obj = aweme;
        a().sendMessageDelayed(message, j2);
        b.d dVar = this.f67541a;
        if (dVar != null) {
            dVar.hashCode();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        l.d(message, "");
        if (this.f67543d != null) {
            if (message.what == 16 && (message.obj instanceof Aweme)) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                String aid = ((Aweme) obj).getAid();
                Aweme a2 = this.f67543d.a();
                if (a2 != null) {
                    str = a2.getAid();
                } else {
                    str = null;
                }
                if (!l.a((Object) aid, (Object) str)) {
                    return;
                }
            } else {
                return;
            }
        }
        b.d dVar = this.f67541a;
        if (dVar != null) {
            com.ss.android.ugc.aweme.autoplay.e.a.d(dVar);
            this.f67541a.hashCode();
            dVar.x();
        }
    }

    public j(b.d dVar, b.AbstractC1522b bVar) {
        this.f67541a = dVar;
        this.f67543d = bVar;
        this.f67542c = i.a((h.f.a.a) new b(this));
    }
}

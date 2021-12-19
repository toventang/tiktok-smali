package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedList;
import java.util.Queue;

public final class v implements com.bytedance.android.livesdk.watch.a {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f21572a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<Runnable> f21573b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final b<Boolean, z> f21574c;

    /* renamed from: d  reason: collision with root package name */
    private final g f21575d;

    static {
        Covode.recordClassIndex(12729);
    }

    @Override // com.bytedance.android.livesdk.watch.a
    public final void a() {
        this.f21575d.b();
    }

    @Override // com.bytedance.android.livesdk.watch.a
    public final boolean c() {
        return this.f21575d.a();
    }

    @Override // com.bytedance.android.livesdk.watch.a
    public final void b() {
        this.f21573b.clear();
        for (T t : this.f21575d.f21564a) {
            DataChannel dataChannel = t.f21562e;
            if (dataChannel != null) {
                dataChannel.b((Object) t);
            }
            t.f21561d.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.watch.a
    public final void a(Runnable runnable) {
        l.d(runnable, "");
        if (this.f21575d.a()) {
            runnable.run();
        } else {
            this.f21573b.offer(runnable);
        }
    }

    static final class a extends m implements b<Boolean, z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(12730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if ((!l.a(Boolean.valueOf(booleanValue), this.this$0.f21572a)) && booleanValue) {
                while (!this.this$0.f21573b.isEmpty()) {
                    Runnable poll = this.this$0.f21573b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                }
            }
            this.this$0.f21572a = Boolean.valueOf(booleanValue);
            return z.f158842a;
        }
    }

    public v(DataChannel dataChannel) {
        l.d(dataChannel, "");
        a aVar = new a(this);
        this.f21574c = aVar;
        g gVar = new g(dataChannel, aVar);
        gVar.a(new o());
        gVar.a(new i());
        gVar.a(new j());
        gVar.a(new t());
        gVar.a(new w());
        gVar.a(new q());
        gVar.a(new l());
        this.f21575d = gVar;
    }
}

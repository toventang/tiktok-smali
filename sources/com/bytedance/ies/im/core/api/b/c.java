package com.bytedance.ies.im.core.api.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.proto.MessageBody;
import h.f.a.b;
import h.z;

public interface c {
    static {
        Covode.recordClassIndex(20193);
    }

    int a(com.bytedance.ies.im.core.api.f.c cVar);

    com.bytedance.ies.im.core.api.f.a a();

    MessageBody a(MessageBody messageBody);

    void a(int i2, int i3);

    void a(ai aiVar);

    void a(h hVar, ai aiVar, com.bytedance.ies.im.core.api.f.c cVar);

    void a(b<? super c, z> bVar);

    void b();

    void b(int i2, int i3);

    void c();

    public static final class a {
        static {
            Covode.recordClassIndex(20194);
        }

        /* renamed from: com.bytedance.ies.im.core.api.b.c$a$a  reason: collision with other inner class name */
        public static final class RunnableC0746a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f33951a;

            static {
                Covode.recordClassIndex(20195);
            }

            public RunnableC0746a(b bVar) {
                this.f33951a = bVar;
            }

            public final void run() {
                this.f33951a.invoke(com.bytedance.ies.im.core.api.a.f());
            }
        }
    }
}

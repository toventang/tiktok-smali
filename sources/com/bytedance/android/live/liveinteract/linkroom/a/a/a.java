package com.bytedance.android.live.liveinteract.linkroom.a.a;

import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a {

    public static abstract class b extends d.b<AbstractC0188a> {

        /* renamed from: d  reason: collision with root package name */
        private HashMap f10491d;

        static {
            Covode.recordClassIndex(5583);
        }

        public abstract void a();

        public abstract void a(Throwable th);

        public void b() {
            HashMap hashMap = this.f10491d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            b();
        }
    }

    public static final class c extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0189a f10492a = new C0189a((byte) 0);

        static {
            Covode.recordClassIndex(5584);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a$c$a  reason: collision with other inner class name */
        public static final class C0189a {
            static {
                Covode.recordClassIndex(5585);
            }

            private C0189a() {
            }

            public static c a() {
                return new c((byte) 0);
            }

            public /* synthetic */ C0189a(byte b2) {
                this();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(5581);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0188a extends d.a<b> {
        static {
            Covode.recordClassIndex(5582);
        }

        public abstract void a(long j2);

        public AbstractC0188a(b bVar) {
            super(bVar);
        }
    }
}

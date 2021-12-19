package com.bytedance.android.live.liveinteract.cohost.a.a;

import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a {

    public static abstract class b extends d.b<AbstractC0156a> {

        /* renamed from: d  reason: collision with root package name */
        private HashMap f10019d;

        static {
            Covode.recordClassIndex(5216);
        }

        public abstract void a();

        public abstract void a(int i2, int i3);

        public void b() {
            HashMap hashMap = this.f10019d;
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

        /* renamed from: b  reason: collision with root package name */
        public static final C0157a f10020b = new C0157a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.livesdk.model.message.d.c.d f10021a;

        static {
            Covode.recordClassIndex(5217);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a$c$a  reason: collision with other inner class name */
        public static final class C0157a {
            static {
                Covode.recordClassIndex(5218);
            }

            private C0157a() {
            }

            public /* synthetic */ C0157a(byte b2) {
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
        Covode.recordClassIndex(5214);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0156a extends d.a<b> {
        static {
            Covode.recordClassIndex(5215);
        }

        public abstract void a();

        public abstract void a(int i2);

        public abstract void a(int i2, long j2, long j3, long j4);

        public abstract void b();

        public AbstractC0156a(b bVar) {
            super(bVar);
        }
    }
}

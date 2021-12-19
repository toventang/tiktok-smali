package com.bytedance.android.live.liveinteract.match.b.a;

import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class a {

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a$a  reason: collision with other inner class name */
    public static final class C0197a extends d.c {

        /* renamed from: d  reason: collision with root package name */
        public static final C0198a f10670d = new C0198a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public int f10671a;

        /* renamed from: b  reason: collision with root package name */
        public long f10672b;

        static {
            Covode.recordClassIndex(5696);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.match.b.a.a$a$a  reason: collision with other inner class name */
        public static final class C0198a {
            static {
                Covode.recordClassIndex(5697);
            }

            private C0198a() {
            }

            public /* synthetic */ C0198a(byte b2) {
                this();
            }
        }

        private C0197a() {
        }

        public /* synthetic */ C0197a(byte b2) {
            this();
        }
    }

    public static abstract class c extends d.b<b> {

        /* renamed from: d  reason: collision with root package name */
        private HashMap f10673d;

        static {
            Covode.recordClassIndex(5699);
        }

        public void a() {
            HashMap hashMap = this.f10673d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        public abstract void a(Throwable th);

        public abstract void b(Throwable th);

        @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            a();
        }
    }

    static {
        Covode.recordClassIndex(5695);
    }

    public static abstract class b extends d.a<c> {
        static {
            Covode.recordClassIndex(5698);
        }

        public abstract void a(int i2, long j2);

        public abstract void b(int i2, long j2);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(cVar);
            l.d(cVar, "");
        }
    }
}

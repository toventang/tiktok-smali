package com.bytedance.android.livesdk.chatroom.g.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0327a f15500b = new C0327a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private int f15501a = c.f15502a;

    static {
        Covode.recordClassIndex(8567);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.a.a$a  reason: collision with other inner class name */
    public static final class C0327a {
        static {
            Covode.recordClassIndex(8568);
        }

        private C0327a() {
        }

        public /* synthetic */ C0327a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.g.a.b
    public final int b() {
        return this.f15501a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(b bVar) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        return this.f15501a - bVar2.b();
    }
}

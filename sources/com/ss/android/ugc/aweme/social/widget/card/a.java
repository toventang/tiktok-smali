package com.ss.android.ugc.aweme.social.widget.card;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3468a f133722b = new C3468a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f133723a;

    static {
        Covode.recordClassIndex(87483);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.a$a  reason: collision with other inner class name */
    public static final class C3468a {
        static {
            Covode.recordClassIndex(87484);
        }

        private C3468a() {
        }

        public /* synthetic */ C3468a(byte b2) {
            this();
        }
    }

    public a(int i2) {
        this.f133723a = i2;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        int i2 = this.f133723a;
        if (!(aVar instanceof a)) {
            aVar = null;
        }
        a aVar2 = (a) aVar;
        if (aVar2 == null || i2 != aVar2.f133723a) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        l.d(aVar, "");
        int i2 = this.f133723a;
        if (!(aVar instanceof a)) {
            aVar = null;
        }
        a aVar2 = (a) aVar;
        if (aVar2 == null || i2 != aVar2.f133723a) {
            return false;
        }
        return true;
    }
}

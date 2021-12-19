package com.ss.android.ugc.aweme.inbox.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104048a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f104049b = i.a((h.f.a.a) C2646a.f104050a);

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.a$a  reason: collision with other inner class name */
    static final class C2646a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2646a f104050a = new C2646a();

        static {
            Covode.recordClassIndex(66637);
        }

        C2646a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "inbox_redesign_contact_request_enable", true));
        }
    }

    static {
        Covode.recordClassIndex(66636);
    }

    public static boolean a() {
        if (((Boolean) f104049b.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}

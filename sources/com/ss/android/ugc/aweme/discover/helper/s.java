package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.LinkedList;

public final class s implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f81168a = i.a(m.SYNCHRONIZED, b.f81173a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f81169b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private LinkedList<m> f81170c;

    /* renamed from: d  reason: collision with root package name */
    private int f81171d;

    /* renamed from: e  reason: collision with root package name */
    private final f f81172e;

    public static final class a {
        static {
            Covode.recordClassIndex(50451);
        }

        public static s a() {
            return (s) s.f81168a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<s> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f81173a = new b();

        static {
            Covode.recordClassIndex(50452);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ s invoke() {
            return new s((byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.h
    public final String a() {
        String b2 = this.f81172e.b(this.f81170c);
        l.b(b2, "");
        return b2;
    }

    static {
        Covode.recordClassIndex(50450);
    }

    private s() {
        this.f81170c = new LinkedList<>();
        this.f81171d = SettingsManager.a().a("query_list_local_storage", 10);
        this.f81172e = new f();
    }

    public /* synthetic */ s(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.h
    public final void a(m mVar) {
        l.d(mVar, "");
        if (this.f81170c.size() < this.f81171d) {
            this.f81170c.addFirst(mVar);
            return;
        }
        this.f81170c.removeLast();
        this.f81170c.addFirst(mVar);
    }
}

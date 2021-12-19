package com.ss.android.ugc.aweme.friends.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModelV2;
import com.ss.android.ugc.aweme.search.model.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends c<SummonFriendSearchModelV2, b> {

    /* renamed from: a  reason: collision with root package name */
    public String f96845a;

    /* renamed from: b  reason: collision with root package name */
    private final h f96846b = i.a((h.f.a.a) a.f96848a);

    /* renamed from: c  reason: collision with root package name */
    private String f96847c;

    static {
        Covode.recordClassIndex(61453);
    }

    private final SummonFriendSearchModelV2 d() {
        return (SummonFriendSearchModelV2) this.f96846b.getValue();
    }

    static final class a extends m implements h.f.a.a<SummonFriendSearchModelV2> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f96848a = new a();

        static {
            Covode.recordClassIndex(61454);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SummonFriendSearchModelV2 invoke() {
            return new SummonFriendSearchModelV2();
        }
    }

    public f() {
        a(d());
        this.f96847c = "";
        this.f96845a = "";
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        b bVar;
        super.b();
        SummonFriendSearchModelV2 summonFriendSearchModelV2 = (SummonFriendSearchModelV2) this.f76396h;
        if (summonFriendSearchModelV2 != null && summonFriendSearchModelV2.forceRefresh && (bVar = (b) this.f76397i) != null) {
            bVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        String str;
        super.c();
        T t = d().mData;
        if (t != null) {
            SummonFriendSearchModelV2 summonFriendSearchModelV2 = (SummonFriendSearchModelV2) this.f76396h;
            String str2 = "";
            if (summonFriendSearchModelV2 != null && summonFriendSearchModelV2.forceRefresh) {
                LogPbBean logPbBean = t.f121537b;
                if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                    str = str2;
                }
                this.f96847c = str;
            }
            String str3 = t.f121538c;
            if (str3 != null) {
                str2 = str3;
            }
            this.f96845a = str2;
            ac.a.f91473a.a(this.f96845a, t.f121537b);
            b bVar = (b) this.f76397i;
            if (bVar != null) {
                bVar.a(t, d().getKeyword());
            }
            b bVar2 = (b) this.f76397i;
            if (bVar2 != null) {
                bVar2.a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        super.a_(exc);
        b bVar = (b) this.f76397i;
        if (bVar != null) {
            bVar.b();
        }
        b bVar2 = (b) this.f76397i;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        this.f96847c = "";
    }

    public final void a(boolean z, g gVar) {
        l.d(gVar, "");
        super.a(Boolean.valueOf(z), gVar);
    }
}

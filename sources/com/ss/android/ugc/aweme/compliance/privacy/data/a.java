package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static String f77374a;

    /* renamed from: b  reason: collision with root package name */
    static final Keva f77375b;

    /* renamed from: c  reason: collision with root package name */
    static final o f77376c = new o(2, 0, null, 0, 14, null);

    /* renamed from: d  reason: collision with root package name */
    static o f77377d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f77378e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final o f77379f = new o(0, 0, null, 0, 14, null);

    private a() {
    }

    static {
        Covode.recordClassIndex(47860);
        Keva repo = Keva.getRepo("compliance_privacy_group_chat_cache");
        l.b(repo, "");
        f77375b = repo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.a$a  reason: collision with other inner class name */
    public static final class C1786a extends m implements b<c, c> {
        final /* synthetic */ o $cache;

        static {
            Covode.recordClassIndex(47861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1786a(o oVar) {
            super(1);
            this.$cache = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "load groupchat restriction cache");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cache", a.f77377d);
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "keva", this.$cache);
        }
    }

    static o a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (o) dg.a(f77375b.getString(str, ""), o.class);
        } catch (Exception unused) {
            return null;
        }
    }
}

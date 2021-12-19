package com.ss.android.ugc.aweme.compliance.business.commentfilter.api;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.compliance.business.commentfilter.api.CommentFilterApi;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1760a f76868b = new C1760a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DataCenter f76869a;

    /* renamed from: c  reason: collision with root package name */
    private final h f76870c = i.a((h.f.a.a) c.f76872a);

    static {
        Covode.recordClassIndex(47512);
    }

    public final CommentFilterApi.API a() {
        return (CommentFilterApi.API) this.f76870c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a$a  reason: collision with other inner class name */
    public static final class C1760a {
        static {
            Covode.recordClassIndex(47513);
        }

        private C1760a() {
        }

        public /* synthetic */ C1760a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<CommentFilterApi.API> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f76872a = new c();

        static {
            Covode.recordClassIndex(47515);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ CommentFilterApi.API invoke() {
            return CommentFilterApi.f76867a;
        }
    }

    public final void b() {
        CommentFilterApi.API a2 = a();
        l.b(a2, "");
        a2.getCommentFilterKeywords().a(new b(this), b.i.f4826c, null);
    }

    public a(DataCenter dataCenter) {
        this.f76869a = dataCenter;
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76871a;

        static {
            Covode.recordClassIndex(47514);
        }

        b(a aVar) {
            this.f76871a = aVar;
        }

        @Override // b.g
        public final Object then(b.i<com.ss.android.ugc.aweme.compliance.business.commentfilter.b.a> iVar) {
            DataCenter dataCenter;
            l.b(iVar, "");
            if (!iVar.b() && !iVar.c() && iVar.a() && (dataCenter = this.f76871a.f76869a) != null) {
                dataCenter.a("list_keywords", iVar.d().f76873a);
            }
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;

public final class i extends c<i> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109576a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f109577b;

    static {
        Covode.recordClassIndex(70133);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70134);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public i() {
        super("create_new_collection");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        if (this.f109556h != null) {
            a("enter_from", this.f109556h);
        }
        if (this.f109556h != null) {
            a("is_blank", this.f109577b);
        }
    }

    public final i a(String str) {
        this.f109556h = str;
        return this;
    }

    public final i a(Integer num) {
        this.f109577b = String.valueOf(num);
        return this;
    }
}

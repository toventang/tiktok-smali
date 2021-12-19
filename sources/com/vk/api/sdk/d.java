package com.vk.api.sdk;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.d.b;
import com.vk.api.sdk.d.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final f f156267a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f156268b;

    /* renamed from: c  reason: collision with root package name */
    public final b f156269c;

    /* renamed from: d  reason: collision with root package name */
    private final h f156270d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(103786);
    }

    public final b a() {
        return (b) this.f156270d.getValue();
    }

    static final class a extends m implements h.f.a.a<b> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(103787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(new c(this.this$0.f156269c));
        }
    }

    public d(b bVar) {
        l.c(bVar, "");
        this.f156269c = bVar;
        this.f156267a = bVar.f156230c;
    }

    public final void a(String str, String str2) {
        l.c(str, "");
        a().a(str, str2);
    }
}

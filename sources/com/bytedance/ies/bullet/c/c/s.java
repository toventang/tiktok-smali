package com.bytedance.ies.bullet.c.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    final List<j> f32063a;

    /* renamed from: b  reason: collision with root package name */
    private final r f32064b;

    static {
        Covode.recordClassIndex(18794);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<Uri, z> {
        final /* synthetic */ Iterator $iterator;
        final /* synthetic */ b $reject;
        final /* synthetic */ b $resolve;
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(18795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar, Iterator it, b bVar, b bVar2) {
            super(1);
            this.this$0 = sVar;
            this.$iterator = it;
            this.$resolve = bVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Uri uri) {
            Uri uri2 = uri;
            l.c(uri2, "");
            if (this.$iterator.hasNext()) {
                this.this$0.a(this.$iterator, uri2, this.$resolve, this.$reject);
            } else {
                this.$resolve.invoke(uri2);
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.c.c.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public s(r rVar, List<? extends j> list) {
        l.c(rVar, "");
        l.c(list, "");
        this.f32064b = rVar;
        this.f32063a = list;
    }

    public final void a(Iterator<? extends j> it, Uri uri, b<? super Uri, z> bVar, b<? super Throwable, z> bVar2) {
        try {
            ((j) it.next()).a(this.f32064b, uri, new a(this, it, bVar, bVar2), bVar2);
        } catch (Exception e2) {
            bVar2.invoke(e2);
        }
    }
}

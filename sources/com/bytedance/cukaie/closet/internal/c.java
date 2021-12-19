package com.bytedance.cukaie.closet.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.keva.Keva;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.Set;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f28507a = {new y(ab.a(c.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;")};

    /* renamed from: b  reason: collision with root package name */
    private final h f28508b;

    private final Keva a() {
        return (Keva) this.f28508b.getValue();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final byte[] a(String str, byte[] bArr) {
        l.c(str, "");
        return a().getBytes(str, bArr);
    }

    static final class a extends m implements h.f.a.a<Keva> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $repoName;

        static {
            Covode.recordClassIndex(16758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(0);
            this.$context = context;
            this.$repoName = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoFromSp(this.$context, this.$repoName, 0);
        }
    }

    static {
        Covode.recordClassIndex(16757);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void a(String str) {
        l.c(str, "");
        a().erase(str);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, float f2) {
        l.c(str, "");
        a().storeFloat(str, f2);
    }

    public c(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        this.f28508b = h.i.a((h.f.a.a) new a(context, str));
    }

    @Override // com.bytedance.cukaie.closet.d
    public final float a(String str, float f2) {
        l.c(str, "");
        return a().getFloat(str, f2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, int i2) {
        l.c(str, "");
        a().storeInt(str, i2);
    }

    @Override // com.bytedance.cukaie.closet.d
    public final int a(String str, int i2) {
        l.c(str, "");
        return a().getInt(str, i2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, long j2) {
        l.c(str, "");
        a().storeLong(str, j2);
    }

    @Override // com.bytedance.cukaie.closet.d
    public final long a(String str, long j2) {
        l.c(str, "");
        return a().getLong(str, j2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, String str2) {
        l.c(str, "");
        a().storeString(str, str2);
    }

    @Override // com.bytedance.cukaie.closet.d
    public final String a(String str, String str2) {
        l.c(str, "");
        return a().getString(str, str2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, Set<String> set) {
        l.c(str, "");
        a().storeStringSet(str, set);
    }

    @Override // com.bytedance.cukaie.closet.d
    public final Set<String> a(String str, Set<String> set) {
        l.c(str, "");
        return a().getStringSet(str, set);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, boolean z) {
        l.c(str, "");
        a().storeBoolean(str, z);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, byte[] bArr) {
        l.c(str, "");
        a().storeBytes(str, bArr);
    }

    @Override // com.bytedance.cukaie.closet.d
    public final boolean a(String str, boolean z) {
        l.c(str, "");
        return a().getBoolean(str, z);
    }
}

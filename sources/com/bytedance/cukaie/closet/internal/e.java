package com.bytedance.cukaie.closet.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public final class e implements com.bytedance.cukaie.closet.e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f28509a = {new y(ab.a(e.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;")};

    /* renamed from: b  reason: collision with root package name */
    private final h f28510b;

    private final SharedPreferences a() {
        return (SharedPreferences) this.f28510b.getValue();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final byte[] a(String str, byte[] bArr) {
        l.c(str, "");
        String string = a().getString(str, null);
        if (string == null) {
            return bArr;
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        l.a((Object) charset, "");
        byte[] bytes = string.getBytes(charset);
        l.a((Object) bytes, "");
        return bytes == null ? bArr : bytes;
    }

    static final class a extends m implements h.f.a.a<SharedPreferences> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $spName;

        static {
            Covode.recordClassIndex(16761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(0);
            this.$context = context;
            this.$spName = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SharedPreferences invoke() {
            return d.a(this.$context, this.$spName, 0);
        }
    }

    static {
        Covode.recordClassIndex(16760);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void a(String str) {
        l.c(str, "");
        a().edit().remove(str).apply();
    }

    public e(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        this.f28510b = h.i.a((h.f.a.a) new a(context, str));
    }

    @Override // com.bytedance.cukaie.closet.d
    public final float a(String str, float f2) {
        l.c(str, "");
        return a().getFloat(str, f2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, float f2) {
        l.c(str, "");
        a().edit().putFloat(str, f2).apply();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final int a(String str, int i2) {
        l.c(str, "");
        return a().getInt(str, i2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, int i2) {
        l.c(str, "");
        a().edit().putInt(str, i2).apply();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final long a(String str, long j2) {
        l.c(str, "");
        return a().getLong(str, j2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, long j2) {
        l.c(str, "");
        a().edit().putLong(str, j2).apply();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final String a(String str, String str2) {
        l.c(str, "");
        return a().getString(str, str2);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, String str2) {
        l.c(str, "");
        a().edit().putString(str, str2).apply();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final Set<String> a(String str, Set<String> set) {
        l.c(str, "");
        return a().getStringSet(str, set);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, Set<String> set) {
        l.c(str, "");
        a().edit().putStringSet(str, set).apply();
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, boolean z) {
        l.c(str, "");
        a().edit().putBoolean(str, z).apply();
    }

    @Override // com.bytedance.cukaie.closet.d
    public final boolean a(String str, boolean z) {
        l.c(str, "");
        return a().getBoolean(str, z);
    }

    @Override // com.bytedance.cukaie.closet.e
    public final void b(String str, byte[] bArr) {
        String str2;
        l.c(str, "");
        SharedPreferences.Editor edit = a().edit();
        if (bArr != null) {
            Charset charset = StandardCharsets.ISO_8859_1;
            l.a((Object) charset, "");
            str2 = new String(bArr, charset);
        } else {
            str2 = null;
        }
        edit.putString(str, str2).apply();
    }
}

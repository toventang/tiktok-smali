package com.bytedance.ies.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.Collection;
import java.util.Set;

public class d implements g {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f33233a = {new y(ab.a(d.class), "cacheShared", "getCacheShared()Landroid/content/SharedPreferences;")};

    /* renamed from: b  reason: collision with root package name */
    public final Context f33234b;

    /* renamed from: c  reason: collision with root package name */
    private final h f33235c;

    private final SharedPreferences b() {
        return (SharedPreferences) this.f33235c.getValue();
    }

    static final class a extends m implements h.f.a.a<SharedPreferences> {
        final /* synthetic */ String $spKey;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(19846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str) {
            super(0);
            this.this$0 = dVar;
            this.$spKey = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SharedPreferences invoke() {
            return com.ss.android.ugc.aweme.bf.d.a(this.this$0.f33234b, this.$spKey, 0);
        }
    }

    static {
        Covode.recordClassIndex(19845);
    }

    @Override // com.bytedance.ies.d.a.g
    public final void a() {
        b().edit().clear().apply();
    }

    @Override // com.bytedance.ies.d.a.g
    public final String a(String str) {
        l.c(str, "");
        return b().getString(str, null);
    }

    @Override // com.bytedance.ies.d.a.g
    public final Collection<String> b(String str) {
        l.c(str, "");
        return b().getStringSet(str, null);
    }

    @Override // com.bytedance.ies.d.a.g
    public final void c(String str) {
        l.c(str, "");
        b().edit().remove(str).apply();
    }

    public d(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        this.f33234b = context;
        this.f33235c = h.i.a((h.f.a.a) new a(this, str));
    }

    @Override // com.bytedance.ies.d.a.g
    public final void a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        b().edit().putString(str, str2).apply();
    }

    @Override // com.bytedance.ies.d.a.g
    public final void a(String str, Collection<String> collection) {
        l.c(str, "");
        l.c(collection, "");
        if (collection instanceof Set) {
            b().edit().putStringSet(str, (Set) collection).apply();
        }
    }
}

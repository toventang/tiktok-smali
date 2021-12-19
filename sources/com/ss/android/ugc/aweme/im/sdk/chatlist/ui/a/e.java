package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends b {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f102087f;

    /* renamed from: g  reason: collision with root package name */
    private final int f102088g;

    /* renamed from: h  reason: collision with root package name */
    private final int f102089h;

    static {
        Covode.recordClassIndex(65326);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int a() {
        return this.f102088g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int b() {
        return this.f102089h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final void d() {
        String str;
        this.f102074d.b(!this.f102087f, new a(this));
        if (this.f102087f) {
            str = "unmute";
        } else {
            str = "mute";
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.a(str, this.f102075e.c());
    }

    public static final class a implements b<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f102090a;

        static {
            Covode.recordClassIndex(65327);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* bridge */ /* synthetic */ void a(h hVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f102090a = eVar;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(this.f102090a.f102073c, uVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        super(context, bVar, aVar, (byte) 0);
        int i2;
        l.d(context, "");
        l.d(bVar, "");
        l.d(aVar, "");
        boolean z = false;
        h c2 = bVar.c();
        z = c2 != null ? c2.isMute() : z;
        this.f102087f = z;
        if (z) {
            i2 = R.string.b9w;
        } else {
            i2 = R.string.b9u;
        }
        this.f102088g = i2;
        this.f102089h = R.raw.icon_bell_slash;
    }
}

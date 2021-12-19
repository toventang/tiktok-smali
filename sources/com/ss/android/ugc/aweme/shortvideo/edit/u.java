package com.ss.android.ugc.aweme.shortvideo.edit;

import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.runtime.b;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class u implements x {

    /* renamed from: a  reason: collision with root package name */
    public j<Boolean> f128037a = new j<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f128038b;

    /* renamed from: c  reason: collision with root package name */
    private g f128039c;

    /* renamed from: d  reason: collision with root package name */
    private final g f128040d;

    /* renamed from: e  reason: collision with root package name */
    private final MultiEditVideoRecordData f128041e;

    static {
        Covode.recordClassIndex(83911);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] c() {
        return this.f128040d.g();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] d() {
        return this.f128040d.h();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] e() {
        return this.f128040d.i();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final boolean b() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final i<Boolean> a() {
        com.ss.android.ugc.asve.editor.a aVar;
        if (c() != null) {
            this.f128038b = true;
            this.f128037a.a((Boolean) true);
        } else {
            b a2 = this.f128040d.a();
            VERecordData a3 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(this.f128041e);
            a aVar2 = new a(this);
            l.d(a2, "");
            l.d(a3, "");
            l.d(aVar2, "");
            x a4 = x.a(a2, a3, -1, -1, aVar2);
            if (a4 != null) {
                aVar = new com.ss.android.ugc.asve.editor.a(a4);
            } else {
                aVar = null;
            }
            this.f128039c = aVar;
        }
        i<TResult> iVar = this.f128037a.f4869a;
        l.b(iVar, "");
        return iVar;
    }

    public static final class a implements VEListener.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f128042a;

        static {
            Covode.recordClassIndex(83912);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(u uVar) {
            this.f128042a = uVar;
        }

        @Override // com.ss.android.vesdk.VEListener.r
        public final void a(int i2) {
            boolean z;
            u uVar = this.f128042a;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            uVar.f128038b = z;
            this.f128042a.f128037a.a(Boolean.valueOf(this.f128042a.f128038b));
        }
    }

    public u(g gVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        l.d(gVar, "");
        l.d(multiEditVideoRecordData, "");
        this.f128040d = gVar;
        this.f128041e = multiEditVideoRecordData;
    }
}

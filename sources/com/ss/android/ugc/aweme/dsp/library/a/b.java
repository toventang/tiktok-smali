package com.ss.android.ugc.aweme.dsp.library.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import h.f.a.q;
import h.f.b.l;
import h.z;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f83316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f83317b;

    /* renamed from: c  reason: collision with root package name */
    public final UrlModel f83318c;

    /* renamed from: d  reason: collision with root package name */
    public final String f83319d;

    /* renamed from: e  reason: collision with root package name */
    public final String f83320e;

    /* renamed from: f  reason: collision with root package name */
    public final int f83321f;

    /* renamed from: g  reason: collision with root package name */
    public final f f83322g;

    /* renamed from: h  reason: collision with root package name */
    public final q<Context, String, String, z> f83323h;

    static {
        Covode.recordClassIndex(51982);
    }

    /* access modifiers changed from: private */
    public static b a(String str, String str2, UrlModel urlModel, String str3, String str4, int i2, f fVar, q<? super Context, ? super String, ? super String, z> qVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(urlModel, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(fVar, "");
        return new b(str, str2, urlModel, str3, str4, i2, fVar, qVar);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f83316a, bVar.f83316a) && l.a(this.f83317b, bVar.f83317b) && l.a(this.f83318c, bVar.f83318c) && l.a(this.f83319d, bVar.f83319d) && l.a(this.f83320e, bVar.f83320e) && this.f83321f == bVar.f83321f && l.a(this.f83322g, bVar.f83322g) && l.a(this.f83323h, bVar.f83323h);
    }

    public final int hashCode() {
        String str = this.f83316a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83317b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f83318c;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f83319d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83320e;
        int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f83321f) * 31;
        f fVar = this.f83322g;
        int hashCode6 = (hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        q<Context, String, String, z> qVar = this.f83323h;
        if (qVar != null) {
            i2 = qVar.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "LibraryMusicItem(id=" + this.f83316a + ", fullClipId=" + this.f83317b + ", pictureUrl=" + this.f83318c + ", name=" + this.f83319d + ", artistName=" + this.f83320e + ", duration=" + this.f83321f + ", playbackState=" + this.f83322g + ", onPlayClickListener=" + this.f83323h + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.q<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, String str2, UrlModel urlModel, String str3, String str4, int i2, f fVar, q<? super Context, ? super String, ? super String, z> qVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(urlModel, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(fVar, "");
        this.f83316a = str;
        this.f83317b = str2;
        this.f83318c = urlModel;
        this.f83319d = str3;
        this.f83320e = str4;
        this.f83321f = i2;
        this.f83322g = fVar;
        this.f83323h = qVar;
    }
}

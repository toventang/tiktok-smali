package com.ss.android.ugc.aweme.dsp.playpage.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f83732a;

    /* renamed from: b  reason: collision with root package name */
    public final UrlModel f83733b;

    /* renamed from: c  reason: collision with root package name */
    public final String f83734c;

    /* renamed from: d  reason: collision with root package name */
    public final String f83735d;

    /* renamed from: e  reason: collision with root package name */
    public final f f83736e;

    /* renamed from: f  reason: collision with root package name */
    public final m<String, Context, z> f83737f;

    static {
        Covode.recordClassIndex(52239);
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
        return l.a(this.f83732a, bVar.f83732a) && l.a(this.f83733b, bVar.f83733b) && l.a(this.f83734c, bVar.f83734c) && l.a(this.f83735d, bVar.f83735d) && l.a(this.f83736e, bVar.f83736e) && l.a(this.f83737f, bVar.f83737f);
    }

    public final int hashCode() {
        String str = this.f83732a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f83733b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f83734c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83735d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        f fVar = this.f83736e;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        m<String, Context, z> mVar = this.f83737f;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "MDQueueCurrentMusicItem(id=" + this.f83732a + ", pictureUrl=" + this.f83733b + ", songName=" + this.f83734c + ", artistName=" + this.f83735d + ", playbackState=" + this.f83736e + ", clickListener=" + this.f83737f + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.m<? super java.lang.String, ? super android.content.Context, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, UrlModel urlModel, String str2, String str3, f fVar, m<? super String, ? super Context, z> mVar) {
        l.d(str, "");
        l.d(urlModel, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(fVar, "");
        this.f83732a = str;
        this.f83733b = urlModel;
        this.f83734c = str2;
        this.f83735d = str3;
        this.f83736e = fVar;
        this.f83737f = mVar;
    }
}

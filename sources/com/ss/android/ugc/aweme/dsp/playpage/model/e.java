package com.ss.android.ugc.aweme.dsp.playpage.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f83739a;

    /* renamed from: b  reason: collision with root package name */
    public final UrlModel f83740b;

    /* renamed from: c  reason: collision with root package name */
    public final String f83741c;

    /* renamed from: d  reason: collision with root package name */
    public final String f83742d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f83743e;

    /* renamed from: f  reason: collision with root package name */
    public final m<String, Context, z> f83744f;

    static {
        Covode.recordClassIndex(52242);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f83739a, eVar.f83739a) && l.a(this.f83740b, eVar.f83740b) && l.a(this.f83741c, eVar.f83741c) && l.a(this.f83742d, eVar.f83742d) && this.f83743e == eVar.f83743e && l.a(this.f83744f, eVar.f83744f);
    }

    public final int hashCode() {
        String str = this.f83739a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f83740b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f83741c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83742d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f83743e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        m<String, Context, z> mVar = this.f83744f;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "MDQueueNextMusicItem(id=" + this.f83739a + ", pictureUrl=" + this.f83740b + ", songName=" + this.f83741c + ", artistName=" + this.f83742d + ", isExpired=" + this.f83743e + ", clickListener=" + this.f83744f + ")";
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
    public e(String str, UrlModel urlModel, String str2, String str3, boolean z, m<? super String, ? super Context, z> mVar) {
        l.d(str, "");
        l.d(urlModel, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f83739a = str;
        this.f83740b = urlModel;
        this.f83741c = str2;
        this.f83742d = str3;
        this.f83743e = z;
        this.f83744f = mVar;
    }
}

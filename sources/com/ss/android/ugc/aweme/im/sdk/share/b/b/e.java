package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.b.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.m;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public m f103365a;

    /* renamed from: b  reason: collision with root package name */
    public String f103366b;

    /* renamed from: c  reason: collision with root package name */
    public String f103367c;

    /* renamed from: d  reason: collision with root package name */
    public final List<IMContact> f103368d;

    /* renamed from: e  reason: collision with root package name */
    public final String f103369e;

    /* renamed from: f  reason: collision with root package name */
    public final SharePackage f103370f;

    /* renamed from: g  reason: collision with root package name */
    public final BaseContent f103371g = null;

    /* renamed from: h  reason: collision with root package name */
    public final String f103372h;

    /* renamed from: i  reason: collision with root package name */
    public a f103373i;

    static {
        Covode.recordClassIndex(66247);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f103365a, eVar.f103365a) && l.a(this.f103366b, eVar.f103366b) && l.a(this.f103367c, eVar.f103367c) && l.a(this.f103368d, eVar.f103368d) && l.a(this.f103369e, eVar.f103369e) && l.a(this.f103370f, eVar.f103370f) && l.a(this.f103371g, eVar.f103371g) && l.a(this.f103372h, eVar.f103372h) && l.a(this.f103373i, eVar.f103373i);
    }

    public final int hashCode() {
        m mVar = this.f103365a;
        int i2 = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        String str = this.f103366b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f103367c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<IMContact> list = this.f103368d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f103369e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SharePackage sharePackage = this.f103370f;
        int hashCode6 = (hashCode5 + (sharePackage != null ? sharePackage.hashCode() : 0)) * 31;
        BaseContent baseContent = this.f103371g;
        int hashCode7 = (hashCode6 + (baseContent != null ? baseContent.hashCode() : 0)) * 31;
        String str4 = this.f103372h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        a aVar = this.f103373i;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "ShareMessageParams(status=" + this.f103365a + ", shareId=" + this.f103366b + ", aid=" + this.f103367c + ", contactList=" + this.f103368d + ", msg=" + this.f103369e + ", sharePackage=" + this.f103370f + ", shareContent=" + this.f103371g + ", processId=" + this.f103372h + ", shareComplete=" + this.f103373i + ")";
    }

    public final void a(m mVar) {
        l.d(mVar, "");
        this.f103365a = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(m mVar, String str, String str2, List<? extends IMContact> list, String str3, SharePackage sharePackage, String str4, a aVar) {
        l.d(mVar, "");
        l.d(str, "");
        this.f103365a = mVar;
        this.f103366b = str;
        this.f103367c = str2;
        this.f103368d = list;
        this.f103369e = str3;
        this.f103370f = sharePackage;
        this.f103372h = str4;
        this.f103373i = aVar;
    }
}

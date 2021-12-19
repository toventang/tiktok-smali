package com.bytedance.ies.xelement.defaultimpl.player.engine.api.a;

import android.content.res.AssetFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f36955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36956b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36957c;

    /* renamed from: d  reason: collision with root package name */
    public final AssetFileDescriptor f36958d;

    /* renamed from: e  reason: collision with root package name */
    public final PlayModel f36959e;

    static {
        Covode.recordClassIndex(22213);
    }

    public n() {
        this(null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f36955a, nVar.f36955a) && l.a(this.f36956b, nVar.f36956b) && l.a(this.f36957c, nVar.f36957c) && l.a(this.f36958d, nVar.f36958d) && l.a(this.f36959e, nVar.f36959e);
    }

    public final int hashCode() {
        String str = this.f36955a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36956b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36957c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AssetFileDescriptor assetFileDescriptor = this.f36958d;
        int hashCode4 = (hashCode3 + (assetFileDescriptor != null ? assetFileDescriptor.hashCode() : 0)) * 31;
        PlayModel playModel = this.f36959e;
        if (playModel != null) {
            i2 = playModel.hashCode();
        }
        return hashCode4 + i2;
    }

    public final boolean a() {
        String str = this.f36955a;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "PlayerModel(playUrl=" + this.f36955a + ", localFilePath=" + this.f36956b + ", cacheKey=" + this.f36957c + ", assetFd=" + this.f36958d + ')';
    }

    private n(String str, String str2, PlayModel playModel) {
        this.f36955a = str;
        this.f36956b = str2;
        this.f36957c = null;
        this.f36958d = null;
        this.f36959e = playModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, String str2, PlayModel playModel, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 16) != 0 ? null : playModel);
    }
}

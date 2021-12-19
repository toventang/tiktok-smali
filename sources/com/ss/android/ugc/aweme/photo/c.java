package com.ss.android.ugc.aweme.photo;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

public final class c implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f114841a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114842b;

    /* renamed from: c  reason: collision with root package name */
    public final String f114843c;

    static {
        Covode.recordClassIndex(73876);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f114841a, cVar.f114841a) && l.a(this.f114842b, cVar.f114842b) && l.a(this.f114843c, cVar.f114843c);
    }

    public final int hashCode() {
        String str = this.f114841a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f114842b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f114843c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EffectCapturedPhotoPathGenerator(videoDir=" + this.f114841a + ", segmentDir=" + this.f114842b + ", imageFilePath=" + this.f114843c + ")";
    }

    private /* synthetic */ c() {
        this(null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.photo.s
    public final String a() {
        String str;
        if (TextUtils.isEmpty(this.f114841a)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f114842b)) {
            str = this.f114841a + File.separator + this.f114842b;
        } else {
            str = this.f114841a;
        }
        i.c(new File(str));
        String a2 = a.a(Locale.getDefault(), "%s/IMG_%s.png", Arrays.copyOf(new Object[]{str, this.f114843c}, 2));
        l.b(a2, "");
        return a2;
    }

    public c(String str, String str2, String str3) {
        this.f114841a = str;
        this.f114842b = str2;
        this.f114843c = str3;
    }
}

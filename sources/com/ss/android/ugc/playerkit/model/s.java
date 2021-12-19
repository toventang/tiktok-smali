package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.a;
import java.util.ArrayList;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public int f148809a;

    /* renamed from: b  reason: collision with root package name */
    public Object f148810b;

    /* renamed from: c  reason: collision with root package name */
    public int f148811c;

    /* renamed from: d  reason: collision with root package name */
    public int f148812d;

    /* renamed from: e  reason: collision with root package name */
    public float f148813e;

    /* renamed from: f  reason: collision with root package name */
    public float f148814f;

    /* renamed from: g  reason: collision with root package name */
    public String f148815g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f148816h;

    static {
        Covode.recordClassIndex(98014);
    }

    public final String toString() {
        return "ProcessAudioUrlData{mediaType=" + this.f148809a + ", url=" + this.f148810b + ", bitRate=" + this.f148811c + ", infoId=" + this.f148812d + ", loudness='" + this.f148813e + '\'' + ", peak='" + this.f148814f + '\'' + ", fileKey='" + this.f148815g + '\'' + ", forceSoftwareDecode=" + this.f148816h + '}';
    }

    public static List<a> a(List<s> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (s sVar : list) {
            if (sVar != null) {
                com.ss.android.ugc.aweme.player.sdk.a.a("Ryan1", sVar.toString());
                arrayList.add(new a(sVar.f148809a, sVar.f148810b.toString(), Integer.valueOf(sVar.f148811c), sVar.f148812d, Float.valueOf(sVar.f148813e), Float.valueOf(sVar.f148814f), sVar.f148815g));
            }
        }
        return arrayList;
    }
}

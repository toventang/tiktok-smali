package com.ss.android.ugc.aweme.port.in;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends MusicModel> f115560a;

    /* renamed from: b  reason: collision with root package name */
    public long f115561b;

    /* renamed from: c  reason: collision with root package name */
    public int f115562c;

    /* renamed from: d  reason: collision with root package name */
    public int f115563d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f115564e;

    /* renamed from: f  reason: collision with root package name */
    public String f115565f;

    static {
        Covode.recordClassIndex(74491);
    }

    public a(List<? extends MusicModel> list, long j2, int i2, int i3, boolean z, String str) {
        l.d(str, "");
        this.f115560a = list;
        this.f115561b = j2;
        this.f115562c = i2;
        this.f115563d = i3;
        this.f115564e = z;
        this.f115565f = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, long j2, int i2, int i3, boolean z, String str, int i4) {
        this(list, (i4 & 2) != 0 ? 0 : j2, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? "" : str);
    }
}

package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public boolean f37680a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37681b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37682c;

    /* renamed from: d  reason: collision with root package name */
    public int f37683d;

    /* renamed from: e  reason: collision with root package name */
    public int f37684e;

    /* renamed from: f  reason: collision with root package name */
    public int f37685f;

    /* renamed from: g  reason: collision with root package name */
    public int f37686g;

    /* renamed from: h  reason: collision with root package name */
    public u f37687h;

    /* renamed from: i  reason: collision with root package name */
    public List<ap> f37688i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public aq f37689j = new aq();

    static {
        Covode.recordClassIndex(22656);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Info{isSuccess:").append(this.f37680a).append(", reachBase:").append(this.f37681b).append(", reachLocal:").append(this.f37682c).append(", pullTimes:").append(this.f37683d).append(", msgCount:").append(this.f37684e).append(", validMsgCount:").append(this.f37685f).append(", leakMsgCount:").append(this.f37686g).append(", repairedRanges:").append(this.f37688i).append(", repairedMergedRanges:").append(this.f37689j).append(", errorMsg:");
        u uVar = this.f37687h;
        String str2 = "";
        if (uVar != null) {
            str = uVar.f38025c;
        } else {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append(", logId:");
        u uVar2 = this.f37687h;
        if (uVar2 != null) {
            str2 = uVar2.f38028f;
        }
        return append2.append(str2).append("}").toString();
    }
}

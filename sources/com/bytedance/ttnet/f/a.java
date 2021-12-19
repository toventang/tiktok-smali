package com.bytedance.ttnet.f;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f44605a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44606b = true;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Integer> f44607c;

    /* renamed from: d  reason: collision with root package name */
    public int f44608d = 10;

    /* renamed from: e  reason: collision with root package name */
    public int f44609e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f44610f = 3;

    /* renamed from: g  reason: collision with root package name */
    public int f44611g = 10;

    /* renamed from: h  reason: collision with root package name */
    public int f44612h = 3;

    /* renamed from: i  reason: collision with root package name */
    public int f44613i = 3;

    /* renamed from: j  reason: collision with root package name */
    public int f44614j = 900;

    /* renamed from: k  reason: collision with root package name */
    public int f44615k = 120;

    /* renamed from: l  reason: collision with root package name */
    public String f44616l;

    static {
        Covode.recordClassIndex(27285);
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ").append(this.f44605a);
        sb.append(" probeEnable: ").append(this.f44606b);
        StringBuilder append = sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f44607c;
        if (map != null) {
            i2 = map.size();
        } else {
            i2 = 0;
        }
        append.append(i2);
        sb.append(" reqTo: ").append(this.f44608d).append("#").append(this.f44609e).append("#").append(this.f44610f);
        sb.append(" reqErr: ").append(this.f44611g).append("#").append(this.f44612h).append("#").append(this.f44613i);
        sb.append(" updateInterval: ").append(this.f44614j);
        sb.append(" updateRandom: ").append(this.f44615k);
        sb.append(" httpBlack: ").append(this.f44616l);
        return sb.toString();
    }
}

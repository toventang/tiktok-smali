package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.d;
import java.util.List;
import java.util.Set;

public class c implements d {
    @com.google.gson.a.c(a = "default_gear_name")

    /* renamed from: a  reason: collision with root package name */
    public String f133606a;
    @com.google.gson.a.c(a = "gear_group")

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f133607b;
    @com.google.gson.a.c(a = "default_bitrate")

    /* renamed from: c  reason: collision with root package name */
    private double f133608c;
    @com.google.gson.a.c(a = "bitrate_range")

    /* renamed from: d  reason: collision with root package name */
    private List<Double> f133609d;

    static {
        Covode.recordClassIndex(87395);
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.d
    public final String a() {
        return this.f133606a;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.d
    public final Set<String> b() {
        return this.f133607b;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.d
    public final double c() {
        return this.f133608c;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.d
    public final Pair<Double, Double> d() {
        List<Double> list = this.f133609d;
        if (list == null || list.size() != 2) {
            return null;
        }
        return new Pair<>(this.f133609d.get(0), this.f133609d.get(1));
    }

    public String toString() {
        return "GearConfig{defaultGearName='" + this.f133606a + '\'' + ", gearGroup=" + this.f133607b + '}';
    }
}

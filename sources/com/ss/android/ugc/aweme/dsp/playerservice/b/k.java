package com.ss.android.ugc.aweme.dsp.playerservice.b;

import com.bytedance.covode.number.Covode;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f83396a;

    /* renamed from: b  reason: collision with root package name */
    public final String f83397b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f83398c;

    /* renamed from: d  reason: collision with root package name */
    public final List<HttpCookie> f83399d;

    /* renamed from: e  reason: collision with root package name */
    public final Double f83400e;

    /* renamed from: f  reason: collision with root package name */
    public final Double f83401f;

    static {
        Covode.recordClassIndex(52043);
    }

    public k() {
        this(null, null, null, null, 63);
    }

    private k(String str, String str2, Double d2, Double d3) {
        this.f83396a = str;
        this.f83397b = str2;
        this.f83398c = null;
        this.f83399d = null;
        this.f83400e = d2;
        this.f83401f = d3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, String str2, Double d2, Double d3, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 16) != 0 ? null : d2, (i2 & 32) != 0 ? null : d3);
    }
}

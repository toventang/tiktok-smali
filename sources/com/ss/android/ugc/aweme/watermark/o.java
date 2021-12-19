package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class o extends t {

    /* renamed from: a  reason: collision with root package name */
    public n f144811a;

    /* renamed from: b  reason: collision with root package name */
    public m f144812b;

    /* renamed from: c  reason: collision with root package name */
    public b f144813c;

    /* renamed from: d  reason: collision with root package name */
    public x.l f144814d = x.l.VIDEO_OUT_RATIO_ORIGINAL;

    /* renamed from: e  reason: collision with root package name */
    public int f144815e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    public final VEWatermarkParam f144816f;

    /* renamed from: g  reason: collision with root package name */
    public VEVideoEncodeSettings f144817g;

    static {
        Covode.recordClassIndex(94700);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, VEWatermarkParam vEWatermarkParam, VEVideoEncodeSettings vEVideoEncodeSettings, b bVar) {
        super(str, str2, (byte) 0);
        l.d(str, "");
        l.d(str2, "");
        l.d(vEVideoEncodeSettings, "");
        this.f144816f = vEWatermarkParam;
        this.f144817g = vEVideoEncodeSettings;
        this.f144813c = bVar;
    }
}

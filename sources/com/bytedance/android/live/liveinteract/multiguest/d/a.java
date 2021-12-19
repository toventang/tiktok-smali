package com.bytedance.android.live.liveinteract.multiguest.d;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.List;
import org.json.JSONObject;

public final class a extends com.bytedance.android.live.liveinteract.platform.common.e.a {

    /* renamed from: a  reason: collision with root package name */
    private double f11172a;

    /* renamed from: b  reason: collision with root package name */
    private double f11173b;

    /* renamed from: d  reason: collision with root package name */
    private double f11174d;

    /* renamed from: e  reason: collision with root package name */
    private double f11175e;

    /* renamed from: f  reason: collision with root package name */
    private double f11176f;

    /* renamed from: g  reason: collision with root package name */
    private AbstractC0214a f11177g;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.d.a$a  reason: collision with other inner class name */
    public interface AbstractC0214a {
        static {
            Covode.recordClassIndex(6005);
        }

        int f(String str);

        long g(String str);
    }

    static {
        Covode.recordClassIndex(6004);
    }

    public a(Config.VideoQuality videoQuality, AbstractC0214a aVar) {
        this.f11177g = aVar;
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d2 = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d2);
        double d3 = (double) width;
        Double.isNaN(d3);
        double d4 = (120.0d * d2) / d3;
        this.f11172a = d4;
        Double.isNaN(d2);
        double d5 = (double) height;
        Double.isNaN(d5);
        this.f11173b = (160.0d * d2) / d5;
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.f11174d = (1.0d - d4) - ((12.0d * d2) / d3);
        Double.isNaN(d2);
        Double.isNaN(d5);
        this.f11175e = (60.0d * d2) / d5;
        Double.isNaN(d2);
        Double.isNaN(d5);
        this.f11176f = (d2 * 4.0d) / d5;
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<Region> list) {
        String str;
        String str2 = d.a().f14185f;
        long c2 = u.a().b().c();
        int i4 = 0;
        for (Region region : list) {
            if (TextUtils.equals(region.getInteractId(), str2)) {
                region.mediaType(1).size(1.0d, 1.0d).position(0.0d, 0.0d).userId(c2);
            } else {
                i4++;
                double d2 = 1.0d - this.f11175e;
                double d3 = (double) i4;
                double d4 = this.f11173b;
                Double.isNaN(d3);
                double d5 = d2 - (d3 * d4);
                if (i4 > 1) {
                    double d6 = (double) (i4 - 1);
                    double d7 = this.f11176f;
                    Double.isNaN(d6);
                    d5 -= d6 * d7;
                }
                region.mediaType(this.f11177g.f(region.getInteractId())).size(this.f11172a, this.f11173b).position(this.f11174d, d5).userId(this.f11177g.g(region.getInteractId()));
            }
        }
        JSONObject a2 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, null, false);
        if (a2 != null) {
            str = a2.toString();
        } else {
            str = "";
        }
        v.a(2, str2, list.size(), str);
        return str;
    }
}

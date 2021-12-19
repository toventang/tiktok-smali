package com.bytedance.android.live.liveinteract.match.b.f;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnebleLinkmicRegionBackupSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class a extends com.bytedance.android.live.liveinteract.platform.common.e.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10693a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10694b = true;

    /* renamed from: d  reason: collision with root package name */
    private double f10695d;

    /* renamed from: e  reason: collision with root package name */
    private double f10696e;

    static {
        Covode.recordClassIndex(5719);
    }

    public a(Config.VideoQuality videoQuality) {
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d2 = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d2);
        double d3 = (double) height;
        Double.isNaN(d3);
        this.f10695d = (138.0d * d2) / d3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.f10696e = (d2 * 260.0d) / d3;
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<Region> list) {
        String str = b.a.a().L;
        if (str == null && LiveAnebleLinkmicRegionBackupSetting.INSTANCE.getValue()) {
            str = b.a.a().t;
        }
        long c2 = u.a().b().c();
        long j2 = b.a.a().f9941f;
        boolean z = b.a.a().ae;
        String str2 = "";
        l.d(list, str2);
        b a2 = b.a.a();
        if (LiveAnebleLinkmicRegionBackupSetting.INSTANCE.getValue() && !a2.f9939d && str != null) {
            list.clear();
        }
        for (Region region : list) {
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.mediaType(1).userId(c2).status(!this.f10693a ? 1 : 0).writeToSei(false);
                if (list.size() <= 1) {
                    region.size(1.0d, 1.0d).position(0.0d, 0.0d);
                } else {
                    region.size(0.5d, this.f10696e).position(0.0d, this.f10695d);
                }
            } else {
                if (b.a.a().f9940e != 0) {
                    b.a.a().M = region.getInteractId();
                }
                region.mediaType(1).size(0.5d, this.f10696e).position(0.5d, this.f10695d).userId(j2).muteAudio(z).status(!this.f10694b ? 1 : 0);
            }
        }
        JSONObject a3 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, null, false);
        if (a3 != null) {
            str2 = a3.toString();
        }
        v.a(4, str, list.size(), str2);
        return str2;
    }
}

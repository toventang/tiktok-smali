package dmt.av.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.ss.android.ugc.b;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import dmt.av.video.m;
import h.f.b.l;

public final class VEEncodingImpl implements IVEEncodingSetting {
    static {
        Covode.recordClassIndex(104089);
    }

    public static IVEEncodingSetting a() {
        MethodCollector.i(12496);
        Object a2 = b.a(IVEEncodingSetting.class, false);
        if (a2 != null) {
            IVEEncodingSetting iVEEncodingSetting = (IVEEncodingSetting) a2;
            MethodCollector.o(12496);
            return iVEEncodingSetting;
        }
        if (b.eO == null) {
            synchronized (IVEEncodingSetting.class) {
                try {
                    if (b.eO == null) {
                        b.eO = new VEEncodingImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12496);
                    throw th;
                }
            }
        }
        VEEncodingImpl vEEncodingImpl = (VEEncodingImpl) b.eO;
        MethodCollector.o(12496);
        return vEEncodingImpl;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting
    public final VEVideoEncodeSettings a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, g gVar, String str) {
        l.d(videoPublishEditModel, "");
        l.d(synthetiseResult, "");
        l.d(gVar, "");
        l.d(str, "");
        return m.a(videoPublishEditModel, synthetiseResult, (VEWatermarkParam) null, gVar, str);
    }
}

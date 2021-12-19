package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.List;

public final class q {
    static {
        Covode.recordClassIndex(104246);
    }

    public static void a(List<EffectPointModel> list, g<p> gVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            EffectPointModel effectPointModel = list.get(i2);
            if (effectPointModel.getType() != 2) {
                p b2 = p.b(effectPointModel.getResDir(), (long) effectPointModel.getStartPoint());
                b2.f156929e = (long) effectPointModel.getUiStartPoint();
                b2.f156930f = (long) effectPointModel.getUiEndPoint();
                b2.f156933i = effectPointModel.getSelectedColor();
                b2.f156935k = effectPointModel.getKey();
                b2.f156932h = effectPointModel.isFromEnd();
                b2.n = effectPointModel.getCategory();
                b2.f156937m = effectPointModel.getDuration();
                b2.o = effectPointModel.getExtra();
                b2.p = effectPointModel.getAdjustParams();
                b2.q = effectPointModel.getIsNewEngineEffect();
                gVar.setValue(b2);
                p a2 = p.a((long) effectPointModel.getEndPoint());
                a2.f156929e = (long) effectPointModel.getUiStartPoint();
                a2.f156930f = (long) effectPointModel.getUiEndPoint();
                a2.f156932h = effectPointModel.isFromEnd();
                a2.q = effectPointModel.getIsNewEngineEffect();
                gVar.setValue(a2);
            }
        }
    }
}

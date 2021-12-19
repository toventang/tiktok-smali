package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.model.EffectFileInfo;
import com.ss.android.medialib.model.EffectModel;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final File f88945a = new File(i.f115645a.getFilesDir(), "effect");

    static {
        Covode.recordClassIndex(55938);
    }

    public static EffectConfig a(List<EffectPointModel> list, VideoCutInfo videoCutInfo, boolean z, long[] jArr) {
        int size;
        float f2;
        long j2;
        EffectConfig effectConfig = new EffectConfig();
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            for (int i2 = 0; i2 < size; i2++) {
                EffectPointModel effectPointModel = list.get(i2);
                String key = effectPointModel.getKey();
                if ("4".equals(key)) {
                    effectPointModel.setKey("7778");
                    effectPointModel.setResDir(f88945a.getAbsolutePath() + File.separator + "1affdb4d5f33b7e99a052b66ec941819");
                } else if ("5".equals(key)) {
                    effectPointModel.setKey("7779");
                    effectPointModel.setResDir(f88945a.getAbsolutePath() + File.separator + "53d18e52dc34ba68a72a6c8dcb4d7038");
                } else if ("6".equals(key)) {
                    effectPointModel.setKey("7780");
                    effectPointModel.setResDir(f88945a.getAbsolutePath() + File.separator + "53899e5b1044d0e96b075d8ac8f99f00");
                } else if ("7".equals(key)) {
                    effectPointModel.setKey("7781");
                    effectPointModel.setResDir(f88945a.getAbsolutePath() + File.separator + "a0e184d4d6bf7e32a629d425f8b37f69");
                } else if ("8".equals(key)) {
                    effectPointModel.setKey("7782");
                    effectPointModel.setResDir(f88945a.getAbsolutePath() + File.separator + "f5836e3fe6c59ee1da264e768903b713");
                } else if ("9".equals(key)) {
                    effectPointModel.setKey("7783");
                    effectPointModel.setResDir(f88945a.getAbsolutePath() + File.separator + "d492b66348b9dde8509ee382f61d89c9");
                }
                try {
                    int parseInt = Integer.parseInt(effectPointModel.getKey());
                    if (videoCutInfo == null) {
                        f2 = 1.0f;
                        j2 = 0;
                    } else {
                        f2 = videoCutInfo.getSpeed();
                        j2 = videoCutInfo.getStart();
                    }
                    long startPoint = (long) ((((float) (((long) effectPointModel.getStartPoint()) - jArr[0])) * f2) + ((float) j2));
                    arrayList.add(new EffectModel(parseInt, (int) TimeUnit.MILLISECONDS.toMicros(startPoint), (int) TimeUnit.MILLISECONDS.toMicros((long) (((float) startPoint) + (((float) (effectPointModel.getEndPoint() - effectPointModel.getStartPoint())) * f2)))));
                    arrayList2.add(new EffectFileInfo(parseInt, effectPointModel.getResDir()));
                } catch (NumberFormatException unused) {
                }
            }
        }
        effectConfig.setEffectType(1).setEffectFileInfos((EffectFileInfo[]) arrayList2.toArray(new EffectFileInfo[arrayList2.size()])).setEffectModels((EffectModel[]) arrayList.toArray(new EffectModel[arrayList.size()])).setEffectBuildChainType(1);
        return effectConfig;
    }
}

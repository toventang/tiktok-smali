package com.bytedance.geckox.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.v4.model.V4DeploymentModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(17484);
    }

    public static String a(List<CheckRequestBodyModel.TargetChannel> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list, new Comparator<CheckRequestBodyModel.TargetChannel>() {
            /* class com.bytedance.geckox.utils.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17485);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(CheckRequestBodyModel.TargetChannel targetChannel, CheckRequestBodyModel.TargetChannel targetChannel2) {
                CheckRequestBodyModel.TargetChannel targetChannel3 = targetChannel;
                CheckRequestBodyModel.TargetChannel targetChannel4 = targetChannel2;
                if (targetChannel3 == null) {
                    if (targetChannel4 == null) {
                        return 0;
                    }
                    return -1;
                } else if (targetChannel4 == null) {
                    return 1;
                } else {
                    return targetChannel3.channelName.compareTo(targetChannel4.channelName);
                }
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (CheckRequestBodyModel.TargetChannel targetChannel : list) {
            if (targetChannel != null && !TextUtils.isEmpty(targetChannel.channelName)) {
                stringBuffer.append(targetChannel.channelName);
            }
        }
        return stringBuffer.toString();
    }

    public static String b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : list) {
            if (str != null && !TextUtils.isEmpty(str)) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public static String c(List<V4DeploymentModel.a> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list, new Comparator<V4DeploymentModel.a>() {
            /* class com.bytedance.geckox.utils.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17486);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(V4DeploymentModel.a aVar, V4DeploymentModel.a aVar2) {
                V4DeploymentModel.a aVar3 = aVar;
                V4DeploymentModel.a aVar4 = aVar2;
                if (aVar3 == null) {
                    if (aVar4 == null) {
                        return 0;
                    }
                    return -1;
                } else if (aVar4 == null) {
                    return 1;
                } else {
                    return aVar3.f30025a.compareTo(aVar4.f30025a);
                }
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (V4DeploymentModel.a aVar : list) {
            if (aVar != null && !TextUtils.isEmpty(aVar.f30025a)) {
                stringBuffer.append(aVar.f30025a);
            }
        }
        return stringBuffer.toString();
    }
}

package com.ss.android.ugc.aweme.im;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.service.model.i;

public final class a extends c {
    static {
        Covode.recordClassIndex(63770);
    }

    public static boolean a() {
        return IMAdapterServiceImpl.d().a();
    }

    public static i a(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        i iVar = new i();
        try {
            SharePrefCache.inst().getOpenImLinkItem().b(editor, iESSettingsProxy.getOpenImLink());
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
        try {
            SharePrefCache.inst().getImUrlTemplateItem().b(editor, iESSettingsProxy.getImUrlTemplate());
        } catch (com.bytedance.ies.a e3) {
            e3.printStackTrace();
        }
        try {
            iVar.f103904a = iESSettingsProxy.getOpenImLink().intValue();
        } catch (com.bytedance.ies.a e4) {
            e4.printStackTrace();
        }
        try {
            iVar.f103905b = iESSettingsProxy.getImUrlTemplate();
        } catch (com.bytedance.ies.a e5) {
            e5.printStackTrace();
        }
        try {
            if (iESSettingsProxy.getImContactsMultiSelectLimit().intValue() > 0) {
                SharePrefCache.inst().getMultiSelectLimitItem().b(editor, iESSettingsProxy.getImContactsMultiSelectLimit());
                iVar.f103906c = iESSettingsProxy.getImContactsMultiSelectLimit().intValue();
            } else {
                iVar.f103906c = SharePrefCache.inst().getMultiSelectLimit();
            }
        } catch (com.bytedance.ies.a e6) {
            e6.printStackTrace();
            iVar.f103906c = SharePrefCache.inst().getMultiSelectLimit();
        }
        try {
            iVar.f103907d = iESSettingsProxy.getFlipchatSettings();
        } catch (com.bytedance.ies.a e7) {
            e7.printStackTrace();
        }
        try {
            iVar.f103909f = iESSettingsProxy.getMaxMessageCountForRecommend().intValue();
        } catch (com.bytedance.ies.a e8) {
            e8.printStackTrace();
        }
        try {
            iVar.f103910g = iESSettingsProxy.getDisableImMessageFullFeedSlide().booleanValue();
        } catch (com.bytedance.ies.a e9) {
            e9.printStackTrace();
        }
        try {
            iVar.f103911h = iESSettingsProxy.getEnabledImAsupporterMsgTypes().intValue();
        } catch (com.bytedance.ies.a e10) {
            e10.printStackTrace();
        }
        try {
            iVar.f103912i = iESSettingsProxy.getEnabledImAsupporterFuncs().intValue();
        } catch (com.bytedance.ies.a e11) {
            e11.printStackTrace();
        }
        iVar.f103908e = iESSettingsProxy.getImImageDomains();
        return iVar;
    }
}

package com.ss.android.ugc.aweme.specact.pendant.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.pendant.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134281a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(87818);
    }

    public static UgAwemeActivitySetting a() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            return iESSettingsProxy.getAwemeActivitySetting();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        try {
            String taskId = ugActivityTasks.getTaskId();
            l.b(taskId, "");
            return taskId;
        } catch (com.bytedance.ies.a unused) {
            return "";
        }
    }

    public static String d(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            return ugAwemeActivitySetting.getActivityId();
        } catch (com.bytedance.ies.a unused) {
            return null;
        }
    }

    public static String a(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        try {
            return ugActivityTasks.getFinishPush();
        } catch (com.bytedance.ies.a unused) {
            return null;
        }
    }

    public static int b(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        try {
            Integer time = ugActivityTasks.getTime();
            l.b(time, "");
            return time.intValue();
        } catch (com.bytedance.ies.a unused) {
            return 0;
        }
    }

    public static boolean c(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            return TextUtils.isEmpty(ugAwemeActivitySetting.getActivityId());
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    private static int d(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        try {
            Integer taskType = ugActivityTasks.getTaskType();
            l.b(taskType, "");
            return taskType.intValue();
        } catch (com.bytedance.ies.a unused) {
            return -1;
        }
    }

    public static String h(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return "";
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null) {
                return "";
            }
            String h5Link = newFeedPendant.getH5Link();
            if (h5Link == null) {
                return "";
            }
            return h5Link;
        } catch (com.bytedance.ies.a unused) {
            return "";
        }
    }

    public static String i(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return "";
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null) {
                return "";
            }
            String timerLink = newFeedPendant.getTimerLink();
            if (timerLink == null) {
                return "";
            }
            return timerLink;
        } catch (com.bytedance.ies.a unused) {
            return "";
        }
    }

    public static List<String> j(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> promotionIds;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (promotionIds = newFeedPendant.getPromotionIds()) == null)) {
                    return promotionIds;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public static boolean k(UgAwemeActivitySetting ugAwemeActivitySetting) {
        Boolean showInFollow;
        if (ugAwemeActivitySetting == null) {
            return false;
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null || (showInFollow = newFeedPendant.getShowInFollow()) == null) {
                return false;
            }
            return showInFollow.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public static boolean l(UgAwemeActivitySetting ugAwemeActivitySetting) {
        Boolean miniPendantClosable;
        if (ugAwemeActivitySetting == null) {
            return false;
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null || (miniPendantClosable = newFeedPendant.getMiniPendantClosable()) == null) {
                return false;
            }
            return miniPendantClosable.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public static String m(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return "";
        }
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            if (newFeedPendant == null) {
                return "";
            }
            String timerLottieFileMd5 = newFeedPendant.getTimerLottieFileMd5();
            if (timerLottieFileMd5 == null) {
                return "";
            }
            return timerLottieFileMd5;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static List<String> n(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> barColor;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (barColor = newFeedPendant.getBarColor()) == null)) {
                    return barColor;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public static List<String> o(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> bgColor;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (bgColor = newFeedPendant.getBgColor()) == null)) {
                    return bgColor;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public static List<String> r(UgAwemeActivitySetting ugAwemeActivitySetting) {
        List<String> timerLottieFileZip;
        if (ugAwemeActivitySetting != null) {
            try {
                UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                if (!(newFeedPendant == null || (timerLottieFileZip = newFeedPendant.getTimerLottieFileZip()) == null)) {
                    return timerLottieFileZip;
                }
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public static int s(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            l.b(newFeedPendant, "");
            Integer disappearAfter = newFeedPendant.getDisappearAfter();
            l.b(disappearAfter, "");
            return disappearAfter.intValue();
        } catch (com.bytedance.ies.a unused) {
            return 3;
        }
    }

    public static int t(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            l.b(newFeedPendant, "");
            Integer dismissAfter = newFeedPendant.getDismissAfter();
            if (dismissAfter != null) {
                return dismissAfter.intValue();
            }
            return 0;
        } catch (com.bytedance.ies.a unused) {
            return 0;
        }
    }

    public static boolean a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            Boolean overallSwitch = ugAwemeActivitySetting.getOverallSwitch();
            l.b(overallSwitch, "");
            return overallSwitch.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    public static int b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            Integer pendantVersion = ugAwemeActivitySetting.getPendantVersion();
            l.b(pendantVersion, "");
            return pendantVersion.intValue();
        } catch (com.bytedance.ies.a unused) {
            return 0;
        }
    }

    public static UgActivityTasks f(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            for (UgActivityTasks ugActivityTasks : ugAwemeActivitySetting.getActivityTasks()) {
                l.b(ugActivityTasks, "");
                if (d(ugActivityTasks) == 3) {
                    return ugActivityTasks;
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g(com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r0 = r3.getNewFeedPendant()     // Catch:{ a -> 0x0022 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.getH5Link()     // Catch:{ a -> 0x0022 }
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ a -> 0x0022 }
            java.lang.String r0 = "event_keyword"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ a -> 0x0022 }
            if (r0 != 0) goto L_0x001e
            r0 = r2
        L_0x001e:
            h.f.b.l.b(r0, r2)     // Catch:{ a -> 0x0022 }
            r2 = r0
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.pendant.h.a.g(com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting):java.lang.String");
    }

    public static String p(UgAwemeActivitySetting ugAwemeActivitySetting) {
        UgNewFeedPendant ugNewFeedPendant;
        if (ugAwemeActivitySetting != null) {
            try {
                ugNewFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            } catch (Exception unused) {
                return "";
            }
        } else {
            ugNewFeedPendant = null;
        }
        if (ugNewFeedPendant == null) {
            l.b();
        }
        UrlModel urlModel = ugNewFeedPendant.getResourceUrl().get(0);
        l.b(urlModel, "");
        String str = urlModel.getUrlList().get(0);
        l.b(str, "");
        return str;
    }

    public static String q(UgAwemeActivitySetting ugAwemeActivitySetting) {
        UgNewFeedPendant ugNewFeedPendant;
        if (ugAwemeActivitySetting != null) {
            try {
                ugNewFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            } catch (Exception unused) {
                return "";
            }
        } else {
            ugNewFeedPendant = null;
        }
        if (ugNewFeedPendant == null) {
            l.b();
        }
        UrlModel urlModel = ugNewFeedPendant.getResourceUrl().get(1);
        l.b(urlModel, "");
        String str = urlModel.getUrlList().get(0);
        l.b(str, "");
        return str;
    }

    public static boolean v(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            l.b(newFeedPendant, "");
            Integer showTimes = newFeedPendant.getShowTimes();
            l.b(showTimes, "");
            if (!b.C2935b.f114627a.a(showTimes.intValue(), d.a())) {
                return false;
            }
            return true;
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    public static List<UgActivityTasks> e(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            List<UgActivityTasks> activityTasks = ugAwemeActivitySetting.getActivityTasks();
            ArrayList arrayList = new ArrayList();
            if (activityTasks != null && (!activityTasks.isEmpty())) {
                for (UgActivityTasks ugActivityTasks : activityTasks) {
                    l.b(ugActivityTasks, "");
                    if (d(ugActivityTasks) == 1 && l.a((Object) ugActivityTasks.getShow(), (Object) true) && ugActivityTasks.getTime() != null) {
                        arrayList.add(ugActivityTasks);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public static boolean u(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        try {
            UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
            l.b(newFeedPendant, "");
            UgFrequentLimit frequentLimit = newFeedPendant.getFrequentLimit();
            l.b(frequentLimit, "");
            Integer daysWindow = frequentLimit.getDaysWindow();
            UgNewFeedPendant newFeedPendant2 = ugAwemeActivitySetting.getNewFeedPendant();
            l.b(newFeedPendant2, "");
            UgFrequentLimit frequentLimit2 = newFeedPendant2.getFrequentLimit();
            l.b(frequentLimit2, "");
            Integer maxClose = frequentLimit2.getMaxClose();
            UgNewFeedPendant newFeedPendant3 = ugAwemeActivitySetting.getNewFeedPendant();
            l.b(newFeedPendant3, "");
            UgFrequentLimit frequentLimit3 = newFeedPendant3.getFrequentLimit();
            l.b(frequentLimit3, "");
            Integer daysNoShow = frequentLimit3.getDaysNoShow();
            b bVar = b.C2935b.f114627a;
            l.b(daysWindow, "");
            int intValue = daysWindow.intValue();
            l.b(maxClose, "");
            int intValue2 = maxClose.intValue();
            l.b(daysNoShow, "");
            if (!bVar.a(intValue, intValue2, daysNoShow.intValue())) {
                return false;
            }
            return true;
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }
}

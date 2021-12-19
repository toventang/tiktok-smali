package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.e.a;
import com.ss.android.ugc.aweme.detail.h.b;
import com.ss.android.ugc.aweme.detail.ui.z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.List;

public final class ad {
    static {
        Covode.recordClassIndex(46609);
    }

    public static boolean a(Aweme aweme) {
        if (aweme.getAwemeRawAd() != null) {
            String type = aweme.getAwemeRawAd().getType();
            int maskFormStyle = aweme.getAwemeRawAd().getMaskFormStyle();
            if (!TextUtils.equals(type, "form") || maskFormStyle != 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean a(i iVar) {
        b bVar;
        if (iVar == null) {
            return false;
        }
        List<Fragment> f2 = iVar.f();
        if (com.bytedance.common.utility.collection.b.a((Collection) f2)) {
            return false;
        }
        for (Fragment fragment : f2) {
            if (fragment != null && !(fragment instanceof a)) {
                if ((fragment instanceof z) && (bVar = ((z) fragment).f79992k) != null && bVar.f79697i) {
                    return true;
                }
                if (fragment instanceof d) {
                    Dialog dialog = ((d) fragment).getDialog();
                    if (dialog != null) {
                        return dialog.isShowing();
                    }
                } else if (fragment instanceof com.ss.android.ugc.aweme.comment.f.d) {
                    return ((com.ss.android.ugc.aweme.comment.f.d) fragment).a();
                }
            }
        }
        return false;
    }

    public static String a(Context context, Aweme aweme, boolean z) {
        if (context == null || aweme == null || !aweme.isAd()) {
            return "";
        }
        return b(context, aweme, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r1.equals("redpacket") == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r1.equals("dial") == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r1.equals("coupon") == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.ad.b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }
}

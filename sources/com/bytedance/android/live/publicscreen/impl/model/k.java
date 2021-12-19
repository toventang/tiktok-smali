package com.bytedance.android.live.publicscreen.impl.model;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.impl.a.b;
import com.bytedance.android.live.publicscreen.impl.model.chat.c;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.chatroom.ui.an;
import com.bytedance.android.livesdk.chatroom.ui.da;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.au;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.bh;
import com.bytedance.android.livesdk.model.message.bw;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.android.livesdk.model.message.ck;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.model.message.j;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.model.message.p;
import com.bytedance.android.livesdk.model.message.s;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;

public final class k {
    static {
        Covode.recordClassIndex(6856);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.k$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12485a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.model.k.AnonymousClass1.<clinit>():void");
        }
    }

    public static int a(int i2) {
        return y.e().getResources().getColor(i2);
    }

    public static com.bytedance.android.live.publicscreen.a.d.k<? extends a> a(a aVar) {
        switch (AnonymousClass1.f12485a[aVar.L.ordinal()]) {
            case 1:
                i iVar = (i) aVar;
                l.d(iVar, "");
                if (com.bytedance.android.live.publicscreen.impl.a.a.f12211a.contains(Long.valueOf(iVar.f19628a))) {
                    return new b(iVar);
                }
                return new com.bytedance.android.live.publicscreen.impl.model.chat.b(iVar);
            case 2:
                return new c((s) aVar);
            case 3:
                return new e((com.bytedance.android.livesdk.model.message.y) aVar);
            case 4:
                return new d((p) aVar);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new g((ai) aVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new i((az) aVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return new m((bx) aVar);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                ce ceVar = (ce) aVar;
                if (ceVar.f19474i == 1) {
                    return new p(ceVar);
                }
                return new q(ceVar);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return new c((n) aVar);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return new o((cc) aVar);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                return new n((bw) aVar);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                return new b((j) aVar);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return new s((ck) aVar);
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return new a((com.bytedance.android.livesdk.model.message.a) aVar);
            case 15:
                return new j((bh) aVar);
            case 16:
                return new l((com.bytedance.android.livesdk.model.message.e.b) aVar);
            case 17:
                return new h((au) aVar);
            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                com.bytedance.android.livesdk.gift.model.y yVar = (com.bytedance.android.livesdk.gift.model.y) aVar;
                if (yVar.O != null) {
                    return new r(yVar);
                }
                return null;
            default:
                return null;
        }
    }

    public static Spannable a(User user, String str, String str2, int i2, int i3) {
        if (user == null || TextUtils.isEmpty(g.a(user)) || TextUtils.isEmpty(g.a(user)) || TextUtils.isEmpty(str2)) {
            return com.bytedance.android.livesdk.chatroom.f.c.f15496a;
        }
        String a2 = g.a(user);
        da daVar = new da(user, a(i2));
        an anVar = new an(user, a(i3));
        SpannableString spannableString = new SpannableString(a2 + str + str2);
        spannableString.setSpan(daVar, 0, a2.length(), 33);
        spannableString.setSpan(anVar, a2.length(), spannableString.length(), 18);
        return spannableString;
    }

    public static Spannable b(User user, String str, String str2, int i2, int i3) {
        if (user == null || TextUtils.isEmpty(g.a(user)) || TextUtils.isEmpty(g.a(user)) || TextUtils.isEmpty(str2)) {
            return com.bytedance.android.livesdk.chatroom.f.c.f15496a;
        }
        String a2 = g.a(user);
        da daVar = new da(user, a(i2));
        an anVar = new an(user, a(i3));
        SpannableString spannableString = new SpannableString(a2 + str + str2);
        spannableString.setSpan(daVar, 0, a2.length() + 1, 33);
        spannableString.setSpan(anVar, a2.length() + 1, spannableString.length(), 18);
        return spannableString;
    }
}

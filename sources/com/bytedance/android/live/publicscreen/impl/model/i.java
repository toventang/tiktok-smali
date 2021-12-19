package com.bytedance.android.live.publicscreen.impl.model;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.chatroom.ui.an;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;

public final class i extends k<az> {
    static {
        Covode.recordClassIndex(6854);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((az) this.f12190d).f19234f;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final b F() {
        if (!C() || ((az) this.f12190d).s == null) {
            return super.F();
        }
        return ((az) this.f12190d).s;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final int h_() {
        if (((az) this.f12190d).f19236h == 1) {
            return 2131234661;
        }
        return super.h_();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.f
    public final boolean k() {
        if (((az) this.f12190d).f19236h != 1) {
            return false;
        }
        if (C() || this.f12190d.O.f23219k != 0) {
            return true;
        }
        return false;
    }

    private boolean s() {
        if (!C() || ((az) this.f12190d).f19236h != 1) {
            return false;
        }
        if (((!TextUtils.equals(((az) this.f12190d).t, "live_merge-live_cover") || !TextUtils.equals(((az) this.f12190d).v, "hour")) && !TextUtils.equals(((az) this.f12190d).t, "live_detail-hourly_rank")) || !TextUtils.equals(((az) this.f12190d).u, "click")) {
            return false;
        }
        return true;
    }

    private boolean t() {
        if (!C() || !TextUtils.equals(((az) this.f12190d).u, "click")) {
            return false;
        }
        if ((TextUtils.equals(((az) this.f12190d).t, "live_merge-live_cover") && TextUtils.equals(((az) this.f12190d).v, "week")) || TextUtils.equals(((az) this.f12190d).t, "live_detail-weekly_rank") || TextUtils.equals(((az) this.f12190d).t, "live_detail-weekly_rank_notice")) {
            return true;
        }
        if (!TextUtils.equals(((az) this.f12190d).t, "homepage_hot-live_cell") || !TextUtils.equals(((az) this.f12190d).v, "week")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        String a2;
        switch (((az) this.f12190d).f19236h) {
            case 1:
                ((e) a.a(e.class)).getTextMessageConfig();
                ((e) a.a(e.class)).getTextMessageConfig();
                User user = ((az) this.f12190d).f19234f;
                if (t()) {
                    a2 = y.a((int) R.string.dtf, "");
                } else if (s()) {
                    a2 = y.a((int) R.string.e99);
                    if (((az) this.f12190d).f19235g) {
                        a2 = y.a((int) R.string.gv3, Long.valueOf((long) ((az) this.f12190d).f19237i), a2);
                    }
                } else {
                    a2 = a((az) this.f12190d);
                }
                return k.a(user, "  ", a2, R.color.a1t, R.color.a0e);
            case 2:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            default:
                User user2 = ((az) this.f12190d).f19234f;
                String a3 = a((az) this.f12190d);
                ((e) a.a(e.class)).getTextMessageConfig();
                ((e) a.a(e.class)).getTextMessageConfig();
                return k.a(user2, "  ", a3, R.color.y6, R.color.y8);
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                User b2 = b();
                String a4 = a((az) this.f12190d);
                ((e) a.a(e.class)).getTextMessageConfig();
                SpannableString spannableString = new SpannableString(a4);
                spannableString.setSpan(new an(b2, k.a((int) R.color.a0b)), 0, spannableString.length(), 18);
                return spannableString;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                String str = "Top" + ((long) ((az) this.f12190d).f19237i);
                String a5 = a((az) this.f12190d);
                if (com.bytedance.android.live.uikit.c.a.a(y.e())) {
                    str = ((long) ((az) this.f12190d).f19237i) + "Top";
                    a5 = new StringBuffer(a5).reverse().toString();
                }
                String[] split = a5.split(str);
                if (split[0].length() == a5.length()) {
                    return c.f15496a;
                }
                SpannableString spannableString2 = new SpannableString(a5);
                ((e) a.a(e.class)).getTextMessageConfig();
                int a6 = k.a((int) R.color.a0b);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a6);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(a6);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(a6);
                spannableString2.setSpan(foregroundColorSpan2, 0, split[0].length(), 18);
                spannableString2.setSpan(foregroundColorSpan, split[0].length(), split[0].length() + str.length(), 18);
                spannableString2.setSpan(foregroundColorSpan3, split[0].length() + str.length(), a5.length(), 18);
                spannableString2.setSpan(new an(b(), a6), 0, spannableString2.length(), 18);
                return spannableString2;
        }
    }

    public i(az azVar) {
        super(azVar);
    }

    private static boolean b(az azVar) {
        if (azVar.f19238j == null || azVar.f19238j.getUserAttr() == null || !azVar.f19238j.getUserAttr().f19031c) {
            return false;
        }
        return true;
    }

    private static String c(az azVar) {
        if (azVar.n == null) {
            if (azVar.f19236h != 1) {
                azVar.n = "";
            } else {
                azVar.n = a(R.string.gvb, new Object[0]);
            }
        }
        return azVar.n;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.g
    public final void b(g gVar) {
        super.b(gVar);
        if (s() || t()) {
            ((az) this.f12190d).x = true;
            ((az) this.f12190d).y = false;
            return;
        }
        ((az) this.f12190d).x = false;
        ((az) this.f12190d).y = true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static String a(az azVar) {
        String a2;
        String a3;
        String a4;
        String str = "";
        if (azVar == null) {
            return str;
        }
        if (azVar.f19238j == null) {
            a2 = str;
        } else {
            a2 = com.bytedance.android.livesdk.ac.g.a(azVar.f19238j);
        }
        User user = azVar.f19234f;
        switch (azVar.f19236h) {
            case 1:
                if (!azVar.f19235g) {
                    return c(azVar);
                }
                return a(R.string.gv3, Long.valueOf((long) azVar.f19237i), c(azVar));
            case 2:
                if (!azVar.f19235g) {
                    return a(R.string.gvf, new Object[0]);
                }
                return a(R.string.gv4, Long.valueOf((long) azVar.f19237i));
            case 3:
                if (b(azVar)) {
                    if (user == null) {
                        return str;
                    }
                    return a(R.string.gvp, com.bytedance.android.livesdk.ac.g.a(user), a2);
                } else if (user == null) {
                    return str;
                } else {
                    return com.bytedance.android.livesdk.ac.g.a(user) + a(R.string.gvo, new Object[0]);
                }
            case 4:
                if (b(azVar)) {
                    if (user == null) {
                        return str;
                    }
                    return a(R.string.gvr, com.bytedance.android.livesdk.ac.g.a(user), a2);
                } else if (user == null) {
                    return str;
                } else {
                    return com.bytedance.android.livesdk.ac.g.a(user) + a(R.string.gvq, new Object[0]);
                }
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return com.bytedance.android.livesdk.ac.g.a(user) + " " + a(R.string.gvm, new Object[0]);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return com.bytedance.android.livesdk.ac.g.a(user) + " " + a(R.string.gv_, new Object[0]);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                if (((long) azVar.f19237i) > 0) {
                    if (azVar.f19239k) {
                        return a(R.string.gv9, com.bytedance.android.livesdk.ac.g.a(user), Long.valueOf((long) azVar.f19237i));
                    }
                    return a(R.string.gv8, com.bytedance.android.livesdk.ac.g.a(user), Long.valueOf((long) azVar.f19237i));
                }
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                Object[] objArr = new Object[2];
                if (user == null) {
                    a3 = str;
                } else {
                    a3 = com.bytedance.android.livesdk.ac.g.a(user);
                }
                objArr[0] = a3;
                if (azVar.f19238j != null) {
                    str = com.bytedance.android.livesdk.ac.g.a(azVar.f19238j);
                }
                objArr[1] = str;
                return a(R.string.gvp, objArr);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                Object[] objArr2 = new Object[2];
                if (user == null) {
                    a4 = str;
                } else {
                    a4 = com.bytedance.android.livesdk.ac.g.a(user);
                }
                objArr2[0] = a4;
                if (azVar.f19238j != null) {
                    str = com.bytedance.android.livesdk.ac.g.a(azVar.f19238j);
                }
                objArr2[1] = str;
                return a(R.string.gvr, objArr2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                if (b(azVar)) {
                    if (user == null) {
                        return str;
                    }
                    return com.bytedance.android.livesdk.ac.g.a(user) + a(R.string.gvd, new Object[0]);
                } else if (user == null) {
                    return str;
                } else {
                    return com.bytedance.android.livesdk.ac.g.a(user) + a(R.string.gvc, new Object[0]);
                }
        }
        return str;
    }

    private static String a(int i2, Object... objArr) {
        Context e2 = y.e();
        if (objArr.length > 0) {
            return e2.getResources().getString(i2, objArr);
        }
        return e2.getResources().getString(i2);
    }
}

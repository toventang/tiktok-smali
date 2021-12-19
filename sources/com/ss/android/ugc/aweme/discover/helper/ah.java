package com.ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static final ah f81068a = new ah();

    public static final boolean a(int i2) {
        return (i2 == 1 || i2 == 2) ? false : true;
    }

    private ah() {
    }

    static {
        Covode.recordClassIndex(50391);
    }

    public static final String a(Context context, Integer num) {
        if (!(context == null || num == null)) {
            if (num.intValue() == 1) {
                String string = context.getResources().getString(R.string.c06);
                l.b(string, "");
                return string;
            } else if (num.intValue() == 2) {
                String string2 = context.getResources().getString(R.string.bbg);
                l.b(string2, "");
                return string2;
            }
        }
        return "";
    }

    public static String a(Context context, String str) {
        if (!(context == null || str == null)) {
            int hashCode = str.hashCode();
            if (hashCode != -600094315) {
                if (hashCode != 301801488) {
                }
                String string = context.getString(R.string.c06);
                l.b(string, "");
                return string;
            } else if (str.equals("friends")) {
                String string2 = context.getString(R.string.bbg);
                l.b(string2, "");
                return string2;
            }
        }
        return "";
    }

    public static final String a(Context context, User user) {
        if (context == null || user == null) {
            return "";
        }
        String a2 = a(context, Integer.valueOf(user.getFollowStatus()));
        if (a2.length() > 0 && a2 != null) {
            return a2;
        }
        String relationShip = user.getRelationShip();
        if (TextUtils.equals(relationShip, "suggested")) {
            String string = context.getResources().getString(R.string.fhj);
            l.b(string, "");
            return string;
        } else if (TextUtils.equals(relationShip, "contacts")) {
            String string2 = context.getResources().getString(R.string.c2x);
            l.b(string2, "");
            return string2;
        } else if (TextUtils.equals(relationShip, "facebook")) {
            String string3 = context.getResources().getString(R.string.f2u);
            l.b(string3, "");
            return string3;
        } else if (TextUtils.equals(relationShip, "follower")) {
            String string4 = context.getResources().getString(R.string.c0l);
            l.b(string4, "");
            return string4;
        } else if (!TextUtils.equals(relationShip, "twitter")) {
            return "";
        } else {
            String string5 = context.getResources().getString(R.string.h0c);
            l.b(string5, "");
            return string5;
        }
    }
}

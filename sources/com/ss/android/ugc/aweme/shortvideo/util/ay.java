package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.a;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import com.ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.zhiliaoapp.musically.R;
import h.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public final class ay {

    /* renamed from: a  reason: collision with root package name */
    public static final ay f132244a = new ay();

    private ay() {
    }

    static {
        Covode.recordClassIndex(86605);
    }

    public static final void a(Context context, MentionEditText mentionEditText) {
        String str;
        ArrayList<TextExtraStruct> arrayList;
        Resources resources;
        BcAdModel c2 = l.f115658a.z().c();
        String str2 = null;
        if (c2 != null) {
            str = c2.ad;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (mentionEditText != null) {
                arrayList = mentionEditText.getStarAtlasExtraList();
            } else {
                arrayList = null;
            }
            if (b.a((Collection) arrayList)) {
                if (context != null && (resources = context.getResources()) != null) {
                    int color = resources.getColor(R.color.a2);
                    if (mentionEditText != null) {
                        mentionEditText.setStarAtlasMentionTextColor(color);
                    } else {
                        return;
                    }
                } else if (mentionEditText == null) {
                    return;
                }
                if (str != null) {
                    str2 = p.a(str, "#", "", false);
                }
                mentionEditText.addMentionText(1, str2, "", "", true);
            }
        }
    }

    public static final void a(Context context, MentionEditText mentionEditText, boolean z) {
        String str;
        TagBAUser tagBAUser;
        BcAdModel c2 = l.f115658a.z().c();
        String str2 = null;
        if (c2 == null || (tagBAUser = c2.baUser) == null) {
            str = null;
        } else {
            str = tagBAUser.getHandleName();
        }
        BcAdModel c3 = l.f115658a.z().c();
        if (c3 != null) {
            str2 = c3.partnerWith;
        }
        if (!TextUtils.isEmpty(str) && mentionEditText != null) {
            StringBuilder sb = new StringBuilder();
            if (str2 == null) {
                str2 = "";
            }
            String a2 = a.a(str2, Arrays.copyOf(new Object[]{"@".concat(String.valueOf(str))}, 1));
            h.f.b.l.b(a2, "");
            mentionEditText.d(sb.append(a2).append(" ").toString());
            if (z) {
                a(context, mentionEditText);
            }
        }
    }
}

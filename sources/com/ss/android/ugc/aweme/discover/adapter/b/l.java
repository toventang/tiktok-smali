package com.ss.android.ugc.aweme.discover.adapter.b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.a.a;
import com.ss.android.ugc.aweme.discover.a.d;
import com.ss.android.ugc.aweme.discover.h.b;
import com.ss.android.ugc.aweme.discover.helper.ah;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.profile.f.aj;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.i;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class l {
    static {
        Covode.recordClassIndex(50097);
    }

    public static final boolean a(e eVar) {
        i iVar;
        if (eVar == null || (iVar = eVar.f121524g) == null || !iVar.isRichSug()) {
            return false;
        }
        return true;
    }

    public static final int a(e eVar, String str) {
        String str2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.b()) {
            return 1;
        }
        if (eVar.f121525h == 5) {
            return 5;
        }
        if (a(eVar)) {
            if (!a.a(str)) {
                return 2;
            }
            i iVar = eVar.f121524g;
            if (iVar != null) {
                str2 = iVar.getUsername();
            } else {
                str2 = null;
            }
            if (hl.a(str2)) {
                return 4;
            }
            return 2;
        } else if (eVar.f121525h == 3) {
            return 3;
        } else {
            return 0;
        }
    }

    public static final CharSequence a(e eVar, View view, b bVar) {
        String str = "";
        h.f.b.l.d(eVar, str);
        h.f.b.l.d(view, str);
        h.f.b.l.d(bVar, str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = view.getContext();
        h.f.b.l.b(context, str);
        String str2 = eVar.f121519b;
        if (str2 != null) {
            str = str2;
        }
        List<? extends Position> list = eVar.f121521d;
        if (list == null) {
            list = new ArrayList<>();
        }
        spannableStringBuilder.append((CharSequence) bVar.a(context, str, list));
        return spannableStringBuilder;
    }

    public static final CharSequence b(e eVar, View view, b bVar) {
        String str;
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(bVar, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (eVar.f121524g.isVerifiedUser()) {
            spannableStringBuilder.append((CharSequence) " T");
            spannableStringBuilder.setSpan(new aj(view.getContext(), R.drawable.abm), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 33);
        }
        Context context = view.getContext();
        i iVar = eVar.f121524g;
        if (iVar != null) {
            str = iVar.getUserRelationType();
        } else {
            str = null;
        }
        String a2 = ah.a(context, str);
        if (a2.length() > 0 && d.c()) {
            spannableStringBuilder.append((CharSequence) " • ");
            spannableStringBuilder.append((CharSequence) a2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(view.getContext(), R.color.c5)), (spannableStringBuilder.length() - 3) - a2.length(), spannableStringBuilder.length(), 33);
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length() - a2.length();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(styleSpan, length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) by.a()), length, length2, 18);
        }
        return spannableStringBuilder;
    }
}

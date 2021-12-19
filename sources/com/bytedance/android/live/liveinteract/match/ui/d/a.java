package com.bytedance.android.live.liveinteract.match.ui.d;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.liveinteract.match.ui.view.TaskMarqueeTextView;
import com.bytedance.android.livesdk.i18n.b;
import com.bytedance.android.livesdkapi.depend.model.live.a.f;
import com.bytedance.android.livesdkapi.depend.model.live.a.g;
import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10842a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(5796);
    }

    public static final SpannableStringBuilder a(f fVar) {
        if (fVar == null || TextUtils.isEmpty(fVar.f23083a)) {
            return new SpannableStringBuilder("");
        }
        String str = fVar.f23083a;
        List list = fVar.f23084b;
        if (list == null) {
            list = z.INSTANCE;
        }
        String a2 = b.a().a(str);
        if (a2 == null) {
            a2 = "";
        }
        String a3 = a(a2, list);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(a3)) {
            int a4 = p.a((CharSequence) a3, "{", 0, false, 6);
            int a5 = p.a((CharSequence) a3, "}", 0, false, 6);
            if (p.e((CharSequence) a3, (CharSequence) "{") && p.e((CharSequence) a3, (CharSequence) "}")) {
                a3 = p.a(p.a(a3, "{", ""), "}", "");
            }
            spannableStringBuilder.append((CharSequence) a3);
            if (a4 >= 0 && a5 > a4) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FACE15")), a4, a5 - 1, 34);
            }
        }
        return spannableStringBuilder;
    }

    private static String a(String str, List<g> list) {
        if (!p.a((CharSequence) str, (CharSequence) "<", false) || !p.a((CharSequence) str, (CharSequence) ">", false)) {
            return str;
        }
        Iterator<g> it = list.iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                return p.a(p.a(str, "<", str2, false), ">", str2, false);
            }
            g next = it.next();
            if (!TextUtils.isEmpty(next.f23085a)) {
                String str3 = next.f23085a;
                if (str3 == null) {
                    l.b();
                }
                if (p.a((CharSequence) str, (CharSequence) str3, false)) {
                    String str4 = next.f23085a;
                    if (str4 == null) {
                        l.b();
                    }
                    String str5 = next.f23086b;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    str = p.a(str, str4, str2, false);
                }
            }
        }
    }

    public static final SpannableStringBuilder a(TaskMarqueeTextView taskMarqueeTextView, SpannableStringBuilder spannableStringBuilder, boolean z) {
        l.d(taskMarqueeTextView, "");
        l.d(spannableStringBuilder, "");
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            return new SpannableStringBuilder("");
        }
        if (z) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(11, true), 0, spannableStringBuilder.length(), 34);
            int i2 = 19;
            if (com.bytedance.android.live.uikit.c.a.a(taskMarqueeTextView.getContext())) {
                i2 = 21;
            }
            taskMarqueeTextView.setGravity(i2);
            taskMarqueeTextView.f10972a = false;
            taskMarqueeTextView.setSelected(true);
        } else {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder.length(), 34);
            taskMarqueeTextView.setGravity(17);
            taskMarqueeTextView.a();
        }
        return spannableStringBuilder;
    }
}

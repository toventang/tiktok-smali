package com.ss.android.ugc.aweme.comment.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.util.d;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(44866);
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comment f72838a;

        static {
            Covode.recordClassIndex(44867);
        }

        a(Comment comment) {
            this.f72838a = comment;
        }

        public final void onClick(View view) {
            l.d(view, "");
            c.a(new com.ss.android.ugc.aweme.comment.c.f(this.f72838a, "click_button"));
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f72839a;

        static {
            Covode.recordClassIndex(44868);
        }

        public b(h.f.a.a aVar) {
            this.f72839a = aVar;
        }

        public final void onClick(View view) {
            l.d(view, "");
            this.f72839a.invoke();
        }
    }

    private static String e(Comment comment) {
        l.d(comment, "");
        String string = d.a().getResources().getString(R.string.als);
        l.b(string, "");
        return string;
    }

    public static final String a(Comment comment) {
        l.d(comment, "");
        com.ss.android.ugc.aweme.comment.adapter.d a2 = com.ss.android.ugc.aweme.comment.adapter.d.a();
        l.b(a2, "");
        if (!a2.f71352a) {
            return b(comment);
        }
        if (TextUtils.isEmpty(comment.getTimeFormat())) {
            comment.setTimeFormat(b(comment));
        }
        String timeFormat = comment.getTimeFormat();
        l.b(timeFormat, "");
        return timeFormat;
    }

    public static final String b(Comment comment) {
        l.d(comment, "");
        if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
            aa.a aVar = aa.s;
            return aa.a.a(((long) comment.getCreateTime()) * 1000);
        }
        Context j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 == null) {
            j2 = d.a();
        }
        String a2 = ib.a(j2, ((long) comment.getCreateTime()) * 1000);
        l.b(a2, "");
        return a2;
    }

    private static boolean d(Comment comment) {
        l.d(comment, "");
        if (TextUtils.isEmpty(comment.getReplyToUserName()) || TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0") || comment.getAliasAweme() != null || comment.isTranslated() || com.ss.android.ugc.aweme.comment.a.a.b()) {
            return false;
        }
        return true;
    }

    public static final String a(s sVar) {
        String replace;
        l.d(sVar, "");
        if (TextUtils.isEmpty(sVar.mTimeDesc)) {
            if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
                aa.a aVar = aa.s;
                replace = new h.m.l("(.)").replace(aa.a.a(sVar.getCommentTime() * 1000), "$1⁠");
            } else {
                String a2 = ib.a(d.a(), sVar.getCommentTime() * 1000);
                l.b(a2, "");
                replace = new h.m.l("(.)").replace(a2, "$1⁠");
            }
            sVar.mTimeDesc = replace;
        }
        String str = sVar.mTimeDesc;
        l.b(str, "");
        return str;
    }

    public static final String c(Comment comment) {
        String str = "";
        l.d(comment, str);
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            return text == null ? str : text;
        }
        String string = d.a().getString(R.string.c0w);
        l.b(string, str);
        String text2 = comment.getText();
        if (!(text2 == null || text2.length() == 0)) {
            string = string + " • ";
        }
        StringBuilder append = new StringBuilder().append(string);
        String text3 = comment.getText();
        if (text3 != null) {
            str = text3;
        }
        return append.append(str).toString();
    }

    private static com.bytedance.tux.tag.a a(Context context) {
        l.d(context, "");
        com.bytedance.tux.tag.a aVar = new com.bytedance.tux.tag.a(context);
        String string = context.getResources().getString(R.string.all);
        l.b(string, "");
        aVar.a(string);
        aVar.a(Integer.valueOf((int) R.raw.icon_pin_fill));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        aVar.d(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        aVar.c(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        aVar.a();
        aVar.e(androidx.core.content.b.c(context, R.color.f159926j));
        aVar.a(androidx.core.content.b.c(context, R.color.md));
        aVar.b(androidx.core.content.b.c(context, R.color.c5));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        aVar.f45046b = h.g.a.a(TypedValue.applyDimension(1, 5.0f, system3.getDisplayMetrics()));
        return aVar;
    }

    public static final String a(Comment comment, boolean z) {
        l.d(comment, "");
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb = new StringBuilder(text);
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = d.a().getString(R.string.c0w);
            l.b(string, "");
            String text2 = comment.getText();
            if (!(text2 == null || text2.length() == 0)) {
                string = string + " • ";
            }
            sb.insert(0, string);
        }
        if (d(comment)) {
            String string2 = d.a().getString(R.string.alr, comment.getReplyToUserName(), "");
            l.b(string2, "");
            sb.insert(0, string2);
        }
        if (comment.getCommentType() == 1 && comment.isAuthorPin()) {
            sb.insert(0, "​");
        }
        if (z) {
            sb.append(" ").append(a(comment));
            if (com.ss.android.ugc.aweme.comment.a.a.a() && comment.getAliasAweme() == null) {
                sb.append(" ").append(e(comment)).append(" ");
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final List<TextExtraStruct> a(Comment comment, Context context, boolean z) {
        ArrayList arrayList;
        String str;
        int length;
        String str2;
        int length2;
        String str3;
        String str4;
        int length3;
        l.d(comment, "");
        l.d(context, "");
        if (comment.getTextExtra() != null) {
            arrayList = new ArrayList(comment.getTextExtra().size());
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                TextExtraStruct clone = textExtraStruct.clone();
                l.b(clone, "");
                arrayList.add(clone);
            }
        } else {
            arrayList = new ArrayList();
        }
        String text = comment.getText();
        if (comment.getCommentType() == 1 && comment.isAuthorPin()) {
            text = "​".concat(String.valueOf(text));
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(a(context));
            textExtraStruct2.setStart(0);
            textExtraStruct2.setEnd(1);
            arrayList.add(textExtraStruct2);
        }
        if (!z) {
            TextExtraStruct textExtraStruct3 = new TextExtraStruct();
            textExtraStruct3.setType(65281);
            int color = d.a().getResources().getColor(R.color.c2);
            if (!com.ss.android.ugc.aweme.comment.a.a.a() || comment.getAliasAweme() != null) {
                String a2 = a(comment);
                if (text == null) {
                    str = "";
                } else {
                    str = text;
                }
                length = str.length() + 1;
                if (text == null) {
                    str2 = "";
                } else {
                    str2 = text;
                }
                length2 = str2.length() + a2.length() + 1;
                textExtraStruct3.setCustomSpan(new d.a(n.c(13.0d), color));
            } else {
                String str5 = a(comment) + " " + e(comment) + " ";
                if (text == null) {
                    str3 = "";
                } else {
                    str3 = text;
                }
                length = str3.length() + 1;
                if (text == null) {
                    str4 = "";
                } else {
                    str4 = text;
                }
                length2 = str4.length() + str5.length() + 1;
                if (gb.a()) {
                    length3 = 0;
                } else {
                    length3 = a(comment).length();
                }
                textExtraStruct3.setCustomSpan(new d.b(n.c(13.0d), color, com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g), length3, e(comment).length() + 1));
                TextExtraStruct textExtraStruct4 = new TextExtraStruct();
                textExtraStruct4.setType(65281);
                textExtraStruct4.setCustomSpan(new a(comment));
                textExtraStruct4.setStart(length);
                textExtraStruct4.setEnd(length2);
                arrayList.add(textExtraStruct4);
            }
            textExtraStruct3.setStart(length);
            textExtraStruct3.setEnd(length2);
            arrayList.add(textExtraStruct3);
        }
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c0w);
            l.b(string, "");
            if (!(text == null || text.length() == 0)) {
                string = string + " • ";
            }
            int length4 = string.length();
            for (TextExtraStruct textExtraStruct5 : arrayList) {
                textExtraStruct5.setStart(textExtraStruct5.getStart() + length4);
                textExtraStruct5.setEnd(textExtraStruct5.getEnd() + length4);
                textExtraStruct5.setUserId(textExtraStruct5.getUserId());
            }
        }
        if (d(comment)) {
            String string2 = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.alr, comment.getReplyToUserName(), "");
            l.b(string2, "");
            int length5 = string2.length();
            for (TextExtraStruct textExtraStruct6 : arrayList) {
                textExtraStruct6.setStart(textExtraStruct6.getStart() + length5);
                textExtraStruct6.setEnd(textExtraStruct6.getEnd() + length5);
            }
            TextExtraStruct textExtraStruct7 = new TextExtraStruct();
            textExtraStruct7.setType(65282);
            textExtraStruct7.setColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.bx));
            textExtraStruct7.setBoldText(true);
            String replyToUserName = comment.getReplyToUserName();
            l.b(replyToUserName, "");
            int a3 = p.a((CharSequence) string2, replyToUserName, 0, false, 6);
            textExtraStruct7.setStart(a3);
            textExtraStruct7.setUserId(comment.getReplyToUserId());
            textExtraStruct7.setEnd(a3 + comment.getReplyToUserName().length());
            arrayList.add(textExtraStruct7);
        }
        return arrayList;
    }
}

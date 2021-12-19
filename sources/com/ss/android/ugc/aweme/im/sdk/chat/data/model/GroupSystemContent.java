package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.b.d;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import h.j.h;
import h.m.p;
import java.util.Arrays;
import java.util.List;

public final class GroupSystemContent extends SystemContent {
    public static final Companion Companion = new Companion(null);
    private static final Typeface tf = b.a().a(d.f33801g);
    @c(a = "group_name")
    private String groupName;
    @c(a = "max_display_object_users")
    private int maxObjectUsers;
    @c(a = "max_display_subject_users")
    private int maxSubjectUsers;
    @c(a = "object_users")
    private List<? extends IMUser> objectUsers;
    @c(a = "subject_users")
    private List<? extends IMUser> subjectUsers;

    public static final class Companion {
        static {
            Covode.recordClassIndex(64042);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getMaxObjectUsers() {
        return this.maxObjectUsers;
    }

    public final int getMaxSubjectUsers() {
        return this.maxSubjectUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getObjectUsers() {
        return this.objectUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getSubjectUsers() {
        return this.subjectUsers;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String spannableStringBuilder = getNoticeText(false).toString();
        l.b(spannableStringBuilder, "");
        return spannableStringBuilder;
    }

    static {
        Covode.recordClassIndex(64041);
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setMaxObjectUsers(int i2) {
        this.maxObjectUsers = i2;
    }

    public final void setMaxSubjectUsers(int i2) {
        this.maxSubjectUsers = i2;
    }

    public final void setObjectUsers(List<? extends IMUser> list) {
        this.objectUsers = list;
    }

    public final void setSubjectUsers(List<? extends IMUser> list) {
        this.subjectUsers = list;
    }

    public final SpannableStringBuilder getNoticeText(boolean z) {
        IMUser iMUser;
        switch (this.type) {
            case 103101:
                return formatTips$default(this, R.string.c89, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103102:
                return formatTips(R.string.c8h, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]", "[[1]]"}, getSystemUsersSpans(this.objectUsers, 1, z));
            case 103103:
                return formatTips$default(this, R.string.c8i, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103104:
                return formatTips$default(this, R.string.c8k, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]"}, null, 8, null);
            case 103105:
                return formatTips(R.string.c8_, getSystemUsersSpans(this.subjectUsers, 1, z), new String[]{"[[0]]", "[[1]]"}, getSystemUsersSpans(this.objectUsers, this.maxObjectUsers, z));
            case 103106:
                SpannableStringBuilder systemUsersSpans = getSystemUsersSpans(this.subjectUsers, 1, z);
                String[] strArr = new String[2];
                strArr[0] = "[[0]]";
                String str = this.groupName;
                if (str == null) {
                    str = "";
                }
                strArr[1] = str;
                return formatTips$default(this, R.string.c8g, systemUsersSpans, strArr, null, 8, null);
            case 103107:
                List<? extends IMUser> list = this.subjectUsers;
                if (list == null || (iMUser = (IMUser) n.h((List) list)) == null || !(!l.a((Object) iMUser.getUid(), (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b()))) {
                    return new SpannableStringBuilder(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c8f));
                }
                return new SpannableStringBuilder(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c8e, iMUser.getDisplayName()));
            default:
                return new SpannableStringBuilder(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c9g));
        }
    }

    private final SpannableStringBuilder getSystemUsersSpans(List<? extends IMUser> list, int i2, boolean z) {
        int i3 = i2;
        if (i3 <= 0) {
            i3 = 1;
        }
        int c2 = androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.c4);
        e.a.a();
        List<IMUser> a2 = e.a(list);
        a.C0730a aVar = new a.C0730a();
        int c3 = h.c(a2.size(), i3);
        int i4 = 2;
        if (a2.size() - i3 == 1 && a2.size() >= 2) {
            c3 = a2.size() - 2;
        }
        List<IMUser> subList = a2.subList(0, c3);
        int i5 = 0;
        for (T t : subList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                n.a();
            }
            T t2 = t;
            String displayName = t2.getDisplayName();
            if ((displayName == null || displayName.length() == 0) && (displayName = t2.getUid()) == null) {
                displayName = "";
            }
            if (z) {
                d.a a3 = com.ss.android.ugc.aweme.im.sdk.chat.b.d.a(c2, t2.getUid(), t2.getSecUid(), false);
                SystemContent.Key key = new SystemContent.Key();
                key.action = 9;
                a3.f100224a = key;
                Object[] objArr = new Object[i4];
                objArr[0] = new com.bytedance.tux.f.a.b(62);
                objArr[1] = a3;
                List<Object> b2 = n.b(objArr);
                l.d(displayName, "");
                l.d(b2, "");
                int length = aVar.f33382a.length();
                a.c.a(aVar.f33382a, displayName);
                int length2 = aVar.f33382a.length();
                for (Object obj : b2) {
                    aVar.f33382a.setSpan(obj, length, length2, 33);
                }
            } else {
                aVar.b(displayName);
            }
            if (i5 != subList.size() - 1) {
                aVar.a(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.b9o) + ' ');
            }
            i5 = i6;
            i4 = 2;
        }
        if (a2.size() <= c3) {
            return aVar.f33382a;
        }
        String string = com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.c9h, "{{%s}}", String.valueOf(a2.size() - c3));
        l.b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        int a4 = p.a((CharSequence) spannableStringBuilder, "{{%s}}", 0, false, 6);
        SpannableStringBuilder replace = spannableStringBuilder.replace(a4, a4 + 6, (CharSequence) aVar.f33382a);
        l.b(replace, "");
        return replace;
    }

    private final SpannableStringBuilder formatTips(int i2, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2) {
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        try {
            spannableStringBuilder3.append((CharSequence) com.bytedance.ies.ugc.appcontext.d.a().getString(i2, Arrays.copyOf(strArr, strArr.length)));
            int a2 = p.a((CharSequence) spannableStringBuilder3, "[[0]]", 0, false, 6);
            spannableStringBuilder3.replace(a2, a2 + 5, (CharSequence) spannableStringBuilder);
            if (spannableStringBuilder2 != null) {
                int a3 = p.a((CharSequence) spannableStringBuilder3, "[[1]]", 0, false, 6);
                spannableStringBuilder3.replace(a3, a3 + 5, (CharSequence) spannableStringBuilder2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return spannableStringBuilder3;
    }

    static /* synthetic */ SpannableStringBuilder getSystemUsersSpans$default(GroupSystemContent groupSystemContent, List list, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return groupSystemContent.getSystemUsersSpans(list, i2, z);
    }

    static /* synthetic */ SpannableStringBuilder formatTips$default(GroupSystemContent groupSystemContent, int i2, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            spannableStringBuilder2 = null;
        }
        return groupSystemContent.formatTips(i2, spannableStringBuilder, strArr, spannableStringBuilder2);
    }
}

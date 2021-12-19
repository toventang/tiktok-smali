package com.ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.inbox.b.c;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.f;
import com.ss.android.ugc.aweme.notification.ab.e;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f113872a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(73226);
    }

    public static List<f> a() {
        int i2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(a.b.a(), R.string.dkc, R.raw.icon_bubble_line_fill, R.string.djs, R.string.dk4, 2131231278));
        arrayList.add(new f(3, R.string.dki, R.raw.icon_heart_fill, R.string.dkq, R.string.dkp, 2131231283));
        arrayList.add(new f(44, R.string.dkf, R.raw.icon_bubble_ellipsis_right_fill, R.string.dk0, R.string.djz, 2131231281));
        if (QnaService.a().enablePublicQna()) {
            arrayList.add(new f(84, R.string.cu, R.raw.icon_qa_fill_ltr, R.string.ct, R.string.cs, R.drawable.o7));
        }
        if (g.d()) {
            i2 = R.string.d3d;
        } else {
            i2 = R.string.dke;
        }
        arrayList.add(new f(26, i2, R.raw.icon_at_fill, R.string.dkw, R.string.dkv, R.drawable.oe));
        if (!c.h()) {
            arrayList.add(new f(7, R.string.dkg, R.raw.icon_person_fill, R.string.dka, R.string.dk_, 2131231282));
        }
        if (e.a()) {
            arrayList.add(new f(599, R.string.ck6, R.raw.icon_store_fill, R.string.cmk, R.string.cmj, 2131231284));
        }
        arrayList.add(new f(37, R.string.dkk, R.raw.icon_tiktok_logo, R.string.dl3, R.string.dl2, 2131231285));
        return arrayList;
    }
}

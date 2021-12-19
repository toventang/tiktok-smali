package com.ss.android.ugc.aweme.comment;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.k;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

final /* synthetic */ class e implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f71791a;

    static {
        Covode.recordClassIndex(44148);
    }

    e(b bVar) {
        this.f71791a = bVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        List e2;
        b bVar = this.f71791a;
        if (bVar.f71468b instanceof k) {
            k kVar = (k) bVar.f71468b;
            if (!(kVar.v == null || (e2 = kVar.v.e()) == null)) {
                User curUser = b.g().getCurUser();
                int[] iArr = {-1, -1};
                for (int i2 = 0; i2 < e2.size(); i2++) {
                    User user = ((Comment) e2.get(i2)).getUser();
                    if (user != null && TextUtils.equals(user.getUid(), curUser.getUid())) {
                        user.setNickname(curUser.getNickname());
                        user.setAvatarThumb(curUser.getAvatarThumb());
                        if (iArr[0] == -1) {
                            iArr[0] = i2;
                        }
                        iArr[1] = i2;
                    }
                }
                if (iArr[0] >= 0) {
                    kVar.v.notifyItemRangeChanged(iArr[0], (iArr[1] - iArr[0]) + 1);
                }
            }
        }
    }
}

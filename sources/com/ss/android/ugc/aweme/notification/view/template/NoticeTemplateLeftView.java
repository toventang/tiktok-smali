package com.ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.notice.repo.list.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.a.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notification.h.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class NoticeTemplateLeftView extends g {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f113988a;

    static {
        Covode.recordClassIndex(73288);
    }

    public NoticeTemplateLeftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final View a(int i2) {
        if (this.f113988a == null) {
            this.f113988a = new SparseArray();
        }
        View view = (View) this.f113988a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f113988a.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final h getTemplatePosition() {
        return h.Left;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final String b(View view) {
        c cVar;
        e templateNotice;
        c cVar2;
        f fVar;
        List<User> list;
        e templateNotice2 = getTemplateNotice();
        if (templateNotice2 == null || (cVar = templateNotice2.f112844b) == null || ((cVar.f112802a == null && ((fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null || list.size() <= 1)) || (templateNotice = getTemplateNotice()) == null || (cVar2 = templateNotice.f112844b) == null)) {
            return null;
        }
        return cVar2.f112803b;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final boolean a(View view) {
        c cVar;
        f fVar;
        List<User> list;
        User user;
        String str;
        e eVar;
        String b2 = b(view);
        if (b2 != null) {
            a(b2);
            return true;
        }
        e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f112844b) == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null || (user = (User) n.h((List) list)) == null) {
            return false;
        }
        if (!(user.getUid() == null || user.getSecUid() == null)) {
            a mBridge = getMBridge();
            if (mBridge != null) {
                mBridge.o();
            }
            MusNotice mBaseNotice = getMBaseNotice();
            if (mBaseNotice == null || (eVar = mBaseNotice.templateNotice) == null) {
                str = null;
            } else {
                str = eVar.f112850h;
            }
            MusNotice mBaseNotice2 = getMBaseNotice();
            if (mBaseNotice2 == null || mBaseNotice2.type != 225 || TextUtils.isEmpty(str)) {
                a mBridge2 = getMBridge();
                if (mBridge2 != null) {
                    String uid = user.getUid();
                    l.b(uid, "");
                    String secUid = user.getSecUid();
                    l.b(secUid, "");
                    mBridge2.c(uid, secUid, "");
                }
            } else {
                a mBridge3 = getMBridge();
                if (mBridge3 != null) {
                    mBridge3.a(user, "click_head");
                }
                t.a(t.a(), str);
                return true;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final void a(MusNotice musNotice, a aVar) {
        c cVar;
        List list;
        l.d(musNotice, "");
        l.d(aVar, "");
        super.a(musNotice, aVar);
        ((AvatarImageWithVerify) a(R.id.cx8)).setOnClickListener(this);
        ((ConstraintLayout) a(R.id.cx7)).setOnClickListener(this);
        e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f112844b) == null) {
            AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) a(R.id.cx8);
            l.b(avatarImageWithVerify, "");
            avatarImageWithVerify.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.cx7);
            l.b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ((AvatarImageWithVerify) a(R.id.cx8)).setUserData(null);
            return;
        }
        AvatarImageWithVerify avatarImageWithVerify2 = (AvatarImageWithVerify) a(R.id.cx8);
        l.b(avatarImageWithVerify2, "");
        avatarImageWithVerify2.setVisibility(0);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.cx7);
        l.b(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
        f fVar = cVar.f112805d;
        if (fVar == null || (list = fVar.f112824a) == null) {
            list = z.INSTANCE;
        }
        if (cVar.f112802a != null) {
            ((AvatarImageWithVerify) a(R.id.cx8)).setUserData(new UserVerify(cVar.f112802a, null, null, null, 14, null));
        } else if (list.size() == 1) {
            ((AvatarImageWithVerify) a(R.id.cx8)).setUserData(new UserVerify(((User) list.get(0)).getAvatarThumb(), ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) list.get(0)).getVerificationType())));
            ((AvatarImageWithVerify) a(R.id.cx8)).a();
        } else if (list.size() > 1) {
            AvatarImageWithVerify avatarImageWithVerify3 = (AvatarImageWithVerify) a(R.id.cx8);
            l.b(avatarImageWithVerify3, "");
            avatarImageWithVerify3.setVisibility(8);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) a(R.id.cx7);
            l.b(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) a(R.id.cx_), ((User) list.get(0)).getAvatarThumb());
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) a(R.id.cxa), ((User) list.get(1)).getAvatarThumb());
        } else {
            ((AvatarImageWithVerify) a(R.id.cx8)).setUserData(null);
        }
    }

    private /* synthetic */ NoticeTemplateLeftView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateLeftView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.l7, this, true);
        ((AvatarImageWithVerify) a(R.id.cx8)).setRequestImgSize(em.a(101));
        com.ss.android.ugc.aweme.notification.g.a.a(a(R.id.cx7));
    }
}

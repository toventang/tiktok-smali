package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public class ax implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123670a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123671b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123672c;

    /* renamed from: d  reason: collision with root package name */
    private final String f123673d;

    static final class b implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123674a = new b();

        static {
            Covode.recordClassIndex(81187);
        }

        b() {
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i2, int i3, Intent intent) {
        }
    }

    static {
        Covode.recordClassIndex(81185);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.gbu;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "video_tag_edit";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_person_plus;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_person_plus;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81186);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        int i2;
        List<InteractionTagUserInfo> list;
        String str;
        String authorUid;
        String str2 = "";
        l.d(context, str2);
        l.d(sharePackage, str2);
        CommentService e2 = CommentServiceImpl.e();
        String str3 = this.f123672c;
        Aweme aweme = this.f123671b;
        AwemeStatus status = aweme.getStatus();
        if (status != null) {
            i2 = status.getPrivateStatus();
        } else {
            i2 = 0;
        }
        InteractionTagInfo interactionTagInfo = this.f123671b.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            list = interactionTagInfo.getTaggedUsers();
        } else {
            list = null;
        }
        e2.a(context, str3, aweme, i2, list, b.f123674a);
        d a2 = new d().a("enter_from", this.f123672c);
        Aweme aweme2 = this.f123671b;
        if (aweme2 == null || (str = aweme2.getAid()) == null) {
            str = str2;
        }
        d a3 = a2.a("group_id", str);
        Aweme aweme3 = this.f123671b;
        if (!(aweme3 == null || (authorUid = aweme3.getAuthorUid()) == null)) {
            str2 = authorUid;
        }
        r.a("click_tag_edit", a3.a("author_id", str2).a("click_type", "click_edit").a("anchor_type", this.f123673d).f66730a);
    }

    public ax(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        this.f123671b = aweme;
        this.f123672c = str;
        this.f123673d = str2;
    }
}

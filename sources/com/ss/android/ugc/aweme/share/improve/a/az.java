package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public class az implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123678a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123679b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123680c;

    /* renamed from: d  reason: collision with root package name */
    private final String f123681d;

    static {
        Covode.recordClassIndex(81189);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.gbx;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "video_tag_remove";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_person_x_mark;
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
        return R.raw.icon_person_x_mark;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81190);
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
        String str;
        String authorUid;
        String str2 = "";
        l.d(context, str2);
        l.d(sharePackage, str2);
        Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
        if (a2 != null && (a2 instanceof e)) {
            CommentService e2 = CommentServiceImpl.e();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            e2.a((e) a2, this.f123679b, this.f123680c, this.f123681d);
        }
        d a3 = new d().a("enter_from", this.f123680c);
        Aweme aweme = this.f123679b;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = str2;
        }
        d a4 = a3.a("group_id", str);
        Aweme aweme2 = this.f123679b;
        if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
            str2 = authorUid;
        }
        r.a("click_tag_edit", a4.a("author_id", str2).a("click_type", "click_remove").a("anchor_type", this.f123681d).f66730a);
    }

    public az(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        this.f123679b = aweme;
        this.f123680c = str;
        this.f123681d = str2;
    }
}

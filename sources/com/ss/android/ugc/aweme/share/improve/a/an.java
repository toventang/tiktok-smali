package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.share.m.j;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.upvote.event.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class an implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123637a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123638b;

    /* renamed from: c  reason: collision with root package name */
    private final s<ag> f123639c;

    /* renamed from: d  reason: collision with root package name */
    private final String f123640d;

    static {
        Covode.recordClassIndex(81159);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcr;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_flag;
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
        return R.raw.icon_flag;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81160);
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
        l.d(context, "");
        l.d(sharePackage, "");
        d a2 = new d().a("author_id", this.f123638b.getAuthorUid()).a("enter_from", this.f123640d).a("group_id", ac.e(this.f123638b)).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f123638b)));
        l.b(a2, "");
        d a3 = c.a(a2, this.f123638b, this.f123640d);
        com.ss.android.ugc.aweme.story.b.h.a(a3, this.f123638b);
        r.a("report", a3.f66730a);
        if (!j.a(this.f123638b)) {
            return;
        }
        if (m.a(this.f123638b)) {
            aw.a(context, this.f123638b, this.f123639c, null, null, null, 56);
            return;
        }
        s<ag> sVar = this.f123639c;
        if (sVar != null) {
            sVar.a(new ag(1, this.f123638b));
        }
    }

    public an(Aweme aweme, s<ag> sVar, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123638b = aweme;
        this.f123639c = sVar;
        this.f123640d = str;
    }
}

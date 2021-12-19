package com.ss.android.ugc.aweme.share.business;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.d;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.g;
import com.ss.android.ugc.aweme.utils.z;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f123375a;

    /* renamed from: b  reason: collision with root package name */
    public final String f123376b;

    /* renamed from: c  reason: collision with root package name */
    public final s<ag> f123377c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f123378d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f123379e;

    /* renamed from: f  reason: collision with root package name */
    private final Aweme f123380f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f123381g;

    static {
        Covode.recordClassIndex(81028);
    }

    public final Dialog a() {
        boolean z;
        String str;
        boolean z2;
        e.b a2 = new e.b().a(AwemeSharePackage.a.a(this.f123380f, this.f123378d, 0, null, null, 28)).a(new d());
        a2.f124668g = new com.ss.android.ugc.aweme.share.improve.f.a();
        e.b a3 = a2.a(new C3195a(this));
        Aweme aweme = this.f123380f;
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<Boolean> isPrivateAvailable = inst.getIsPrivateAvailable();
        l.b(isPrivateAvailable, "");
        Boolean c2 = isPrivateAvailable.c();
        if (z.d(aweme) || z.c(aweme)) {
            z = true;
        } else {
            z = false;
        }
        IAccountUserService g2 = b.g();
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        boolean isMe = g2.isMe(str);
        l.b(c2, "");
        if (!c2.booleanValue() || !z || !isMe) {
            z2 = false;
        } else {
            z2 = true;
        }
        new c(aweme, z2, this.f123378d, a3, this.f123377c, this.f123376b, this.f123375a, "more_board").a();
        if (a.C3228a.a(this.f123378d)) {
            return null;
        }
        Activity activity = this.f123378d;
        if ((activity instanceof androidx.fragment.app.e) && !a.C3228a.a(activity)) {
            try {
                if (a3.f124663b.size() > 0) {
                    new com.ss.android.ugc.aweme.share.more.a.a(a3.a()).show(((androidx.fragment.app.e) this.f123378d).getSupportFragmentManager(), "AwemeMore");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.a$a  reason: collision with other inner class name */
    public static final class C3195a extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f123382a;

        static {
            Covode.recordClassIndex(81029);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3195a(a aVar) {
            this.f123382a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.g, com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            this.f123382a.f123377c.a(new ag(28));
        }
    }

    public a(Activity activity, Fragment fragment, Aweme aweme, s<ag> sVar, Bundle bundle) {
        l.d(activity, "");
        l.d(fragment, "");
        l.d(aweme, "");
        l.d(sVar, "");
        l.d(bundle, "");
        this.f123378d = activity;
        this.f123379e = fragment;
        this.f123380f = aweme;
        this.f123377c = sVar;
        this.f123381g = bundle;
        this.f123375a = bundle.getInt("page_type");
        String string = bundle.getString("event_type", "");
        l.b(string, "");
        this.f123376b = string;
    }
}

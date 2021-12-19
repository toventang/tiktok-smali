package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.aweme.video.v;

public class aq extends TiktokBaseMainHelper {

    /* renamed from: a  reason: collision with root package name */
    public boolean f109165a;

    static {
        Covode.recordClassIndex(69904);
    }

    @Override // com.ss.android.ugc.aweme.main.m, com.ss.android.ugc.aweme.main.TiktokBaseMainHelper
    public final void a() {
        super.a();
        v.O().C();
        k.a();
        BusinessComponentServiceUtils.getMainHelperService();
        AwemeService.b().a();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        boolean a2 = CommentServiceImpl.e().a(this.f109124b);
        this.f109165a = a2;
        if (!a2) {
            return false;
        }
        CommentServiceImpl.e().b(this.f109124b);
        return true;
    }

    public aq(Activity activity) {
        super(activity);
    }
}

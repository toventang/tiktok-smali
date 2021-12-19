package com.ss.android.ugc.aweme.aw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.h.c;
import com.ss.android.ugc.aweme.bp;
import com.ss.android.ugc.aweme.notice.api.ab.b;
import java.util.Collections;

public final class a implements bp {

    /* renamed from: a  reason: collision with root package name */
    boolean f67614a;

    /* renamed from: b  reason: collision with root package name */
    Activity f67615b;

    static {
        Covode.recordClassIndex(41624);
    }

    @Override // com.ss.android.ugc.aweme.bp
    public final void a() {
        this.f67614a = this.f67615b.getIntent().getBooleanExtra("restart_from_logout", false);
        if (b.b()) {
            com.ss.android.ugc.aweme.notice.api.b.a().a();
            if (com.ss.android.ugc.aweme.account.b.b().isEnableMultiAccountLogin()) {
                com.ss.android.ugc.aweme.notice.api.b.a(com.ss.android.ugc.aweme.account.b.g().allUidList(), "cold_start");
            } else {
                com.ss.android.ugc.aweme.notice.api.b.a(Collections.singletonList(com.ss.android.ugc.aweme.account.b.g().getCurUserId()), "cold_start");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bp
    public final void b() {
        com.ss.android.b.a.a.a.a(new Runnable(this.f67615b, new b(this)) {
            /* class com.ss.android.ugc.aweme.utils.fh.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f142911a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f142912b;

            static {
                Covode.recordClassIndex(93520);
            }

            public final void run() {
                fh.a(this.f142911a, false, this.f142912b, false);
            }

            {
                this.f142911a = r1;
                this.f142912b = r2;
            }
        });
        SharePrefCache.inst().getIsContactDialogShown().b(true);
        SharePrefCache.inst().getHasEnterBindPhone().b(true);
        SharePrefCache.inst().getIsProfileBubbleShown().b(false);
        c.a(d.a(), "story").b("open", false);
        if (!b.b() && com.ss.android.ugc.aweme.account.b.b().isEnableMultiAccountLogin()) {
            com.ss.android.ugc.aweme.notice.api.b.a(com.ss.android.ugc.aweme.account.b.g().allUidList(), "boot_delay");
        }
    }

    public a(Activity activity) {
        this.f67615b = activity;
    }

    @Override // com.ss.android.ugc.aweme.bp
    public final void a(Intent intent) {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.f.b(intent));
    }
}

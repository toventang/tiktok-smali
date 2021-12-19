package com.ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;

public final class z implements INewUserJourneyService {

    /* renamed from: a  reason: collision with root package name */
    public static final z f105220a = new z();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ INewUserJourneyService f105221b;

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final p a(int i2) {
        return this.f105221b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final r a() {
        return this.f105221b.a();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> a(Intent intent) {
        l.d(intent, "");
        return this.f105221b.a(intent);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void a(Activity activity, Intent intent) {
        this.f105221b.a(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void a(Activity activity, boolean z, boolean z2) {
        l.d(activity, "");
        this.f105221b.a(activity, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void a(Context context) {
        l.d(context, "");
        this.f105221b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean a(Activity activity) {
        l.d(activity, "");
        return this.f105221b.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean a(boolean z) {
        return this.f105221b.a(z);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void b() {
        this.f105221b.b();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean b(Activity activity) {
        l.d(activity, "");
        return this.f105221b.b(activity);
    }

    static {
        Covode.recordClassIndex(67448);
    }

    private z() {
        INewUserJourneyService c2 = NewUserJourneyService.c();
        l.b(c2, "");
        this.f105221b = c2;
    }
}

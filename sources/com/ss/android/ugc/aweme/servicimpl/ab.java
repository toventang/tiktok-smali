package com.ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.setting.services.IPrivacySettingService;
import com.ss.android.ugc.aweme.setting.services.PrivacySettingService;
import h.f.b.l;
import h.z;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f121843a = new ab();

    private ab() {
    }

    public static final class a implements w {

        /* renamed from: a  reason: collision with root package name */
        private final IPrivacySettingService f121844a = PrivacySettingService.a();

        /* renamed from: com.ss.android.ugc.aweme.servicimpl.ab$a$a  reason: collision with other inner class name */
        final /* synthetic */ class C3154a implements IPrivacySettingService.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.a f121845a;

            static {
                Covode.recordClassIndex(79896);
            }

            C3154a(h.f.a.a aVar) {
                this.f121845a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.setting.services.IPrivacySettingService.a
            public final /* synthetic */ void a() {
                l.b(this.f121845a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(79895);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.w
        public final void b(Activity activity) {
            this.f121844a.b(activity);
        }

        @Override // com.ss.android.ugc.aweme.port.in.w
        public final boolean a(Activity activity) {
            l.d(activity, "");
            return this.f121844a.a(activity);
        }

        @Override // com.ss.android.ugc.aweme.port.in.w
        public final void a(Activity activity, h.f.a.a<z> aVar) {
            l.d(activity, "");
            l.d(aVar, "");
            this.f121844a.a(activity, new C3154a(aVar));
        }
    }

    static {
        Covode.recordClassIndex(79894);
    }
}

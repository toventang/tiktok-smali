package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c {
    static {
        Covode.recordClassIndex(48095);
    }

    public static final class a implements c.a {
        static {
            Covode.recordClassIndex(48096);
        }

        a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment.c$a$a  reason: collision with other inner class name */
        static final class View$OnTouchListenerC1802a implements View.OnTouchListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f77699a;

            static {
                Covode.recordClassIndex(48097);
            }

            View$OnTouchListenerC1802a(View view) {
                this.f77699a = view;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f77699a.clearFocus();
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c.a
        public final h a(Context context, ViewGroup viewGroup) {
            l.d(context, "");
            l.d(viewGroup, "");
            IComplianceBusinessService d2 = com.ss.android.ugc.aweme.compliance.api.a.d();
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            View a2 = d2.a(context2, viewGroup);
            if (a2 == null) {
                l.b();
            }
            a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            viewGroup.setOnTouchListener(new View$OnTouchListenerC1802a(a2));
            return new h(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final c.a a() {
        return new a();
    }
}

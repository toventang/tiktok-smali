package com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel;

import android.content.Context;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.c.b;
import h.f.b.l;

public abstract class AppealDialogViewModel<T extends b> extends ac {

    /* renamed from: e  reason: collision with root package name */
    public static final a f76812e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final Context f76813a;

    /* renamed from: c  reason: collision with root package name */
    public final t<T> f76814c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final AppealStatusResponse f76815d;

    static {
        Covode.recordClassIndex(47482);
    }

    public abstract T a(AppealStatusResponse appealStatusResponse);

    public static final class a {
        static {
            Covode.recordClassIndex(47483);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public AppealDialogViewModel(Context context, AppealStatusResponse appealStatusResponse) {
        l.d(context, "");
        l.d(appealStatusResponse, "");
        this.f76813a = context;
        this.f76815d = appealStatusResponse;
    }
}

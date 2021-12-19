package com.ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class o extends a {

    /* renamed from: a  reason: collision with root package name */
    j f63516a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f63517b;

    static {
        Covode.recordClassIndex(39150);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        j jVar = this.f63516a;
        if (jVar != null) {
            Dialog dialog = jVar.f63467c;
            if (dialog != null) {
                dialog.dismiss();
            }
            Dialog dialog2 = jVar.f63468d;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            Dialog dialog3 = jVar.f63469e;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
        super.onDestroyView();
        HashMap hashMap = this.f63517b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            e activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.I18nSignUpActivity");
            this.f63516a = new j((I18nSignUpActivity) activity, view, arguments.getBoolean("view_type"), arguments.getBoolean("is_from_new_user_journey", false), arguments.getBoolean("age_gate_block", false), arguments.getBoolean("is_fullscreen", false), arguments.getBoolean("is_expandable_dialog", false));
            if (arguments.getBoolean("show_learn_feed_toast")) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.cvj).a();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.gh, viewGroup, false);
    }
}

package com.google.ar.core;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

final class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InstallActivity f53401a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f53402b;

    static {
        Covode.recordClassIndex(33056);
    }

    af(InstallActivity installActivity) {
        this.f53401a = installActivity;
    }

    af(InstallActivity installActivity, byte b2) {
        this.f53402b = 1;
        this.f53401a = installActivity;
    }

    public final void onClick(View view) {
        if (this.f53402b != 0) {
            this.f53401a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
            return;
        }
        this.f53401a.animateToSpinner();
        this.f53401a.startInstaller();
    }
}

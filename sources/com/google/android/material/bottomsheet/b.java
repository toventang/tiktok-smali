package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.i;
import com.bytedance.covode.number.Covode;

public class b extends i {
    static {
        Covode.recordClassIndex(32486);
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        return new a(getContext(), getTheme());
    }
}

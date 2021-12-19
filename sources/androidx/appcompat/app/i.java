package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;

public class i extends d {
    static {
        Covode.recordClassIndex(276);
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        return new h(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.d
    public void setupDialog(Dialog dialog, int i2) {
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (!(i2 == 1 || i2 == 2)) {
                if (i2 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            hVar.cg_();
            return;
        }
        super.setupDialog(dialog, i2);
    }
}

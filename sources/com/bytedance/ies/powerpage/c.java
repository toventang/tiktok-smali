package com.bytedance.ies.powerpage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public abstract /* synthetic */ class c {
    static {
        Covode.recordClassIndex(20577);
    }

    public static void a(b bVar) {
        Fragment fragment = (Fragment) bVar;
        if (fragment.getActivity() instanceof b) {
            ((b) fragment.getActivity()).onBackPressed_Activity();
        }
    }

    public static void a(b bVar, int i2, int i3, Intent intent) {
        Fragment fragment = (Fragment) bVar;
        if (fragment.getActivity() instanceof b) {
            ((b) fragment.getActivity()).onActivityResult_Activity(i2, i3, intent);
        }
    }
}

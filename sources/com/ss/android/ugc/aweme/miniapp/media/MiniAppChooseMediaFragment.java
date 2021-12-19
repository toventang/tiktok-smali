package com.ss.android.ugc.aweme.miniapp.media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MiniAppChooseMediaFragment extends Fragment {
    static {
        Covode.recordClassIndex(70182);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(4329);
        View view = new View(getContext());
        MethodCollector.o(4329);
        return view;
    }
}

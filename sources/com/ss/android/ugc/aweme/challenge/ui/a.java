package com.ss.android.ugc.aweme.challenge.ui;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f70030a;

    static {
        Covode.recordClassIndex(43203);
    }

    public String b() {
        return "";
    }

    public void c() {
        SparseArray sparseArray = this.f70030a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public JSONObject a() {
        return new JSONObject();
    }
}

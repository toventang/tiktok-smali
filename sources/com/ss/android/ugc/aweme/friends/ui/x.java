package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import h.f.a.m;
import h.f.b.l;
import h.z;

public abstract class x extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private String f97288a = "";

    static {
        Covode.recordClassIndex(61802);
    }

    public abstract void a(RecommendContact recommendContact, int i2);

    public abstract void setDislikeListener(m<? super RecommendContact, ? super Integer, z> mVar);

    public final String getEnterFrom() {
        return this.f97288a;
    }

    public final void setEnterFrom(String str) {
        this.f97288a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        l.d(context, "");
    }
}

package com.bytedance.android.livesdk.ad;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

public abstract class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    protected int f13647a = 0;

    static {
        Covode.recordClassIndex(7569);
    }

    public abstract <T> void a(T t);

    public a(View view) {
        super(view);
        if (Logger.debug()) {
            com.bytedance.android.live.core.c.a.a(3, StringSet.type, "0");
        }
    }
}

package com.ss.android.ugc.aweme.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import java.util.List;

public interface IEOYService {
    static {
        Covode.recordClassIndex(79354);
    }

    String a();

    List<k> a(b bVar);

    void a(boolean z, TextView textView, TextView textView2, View view);

    boolean a(Context context, String str);

    boolean a(ViewGroup viewGroup, String str);

    boolean a(TextView textView);

    boolean a(String str);

    void b(String str);
}

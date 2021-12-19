package com.ss.android.ugc.aweme.notice.api.helper;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public interface LogHelper {
    static {
        Covode.recordClassIndex(72481);
    }

    void a(Context context, String str, String str2, long j2);

    void a(String str);

    void a(String str, RecyclerView recyclerView);

    void a(String str, String str2);

    void a(String str, String str2, String str3);

    void a(String str, String str2, String str3, String str4, String str5, String str6);

    void a(String str, String str2, String str3, String str4, String str5, String str6, int i2);

    void b(String str, String str2);

    void c(String str, String str2);

    void d(String str, String str2);
}

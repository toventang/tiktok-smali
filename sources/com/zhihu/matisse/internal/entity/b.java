package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f156429a;

    /* renamed from: b  reason: collision with root package name */
    private String f156430b;

    /* renamed from: c  reason: collision with root package name */
    private String f156431c;

    static {
        Covode.recordClassIndex(103888);
    }

    public b(String str) {
        this.f156431c = str;
    }

    public b(String str, byte b2) {
        this.f156429a = 1;
        this.f156431c = str;
    }

    public static void a(Context context, b bVar) {
        if (bVar != null) {
            int i2 = bVar.f156429a;
            if (i2 == 1) {
                com.zhihu.matisse.internal.ui.widget.b.a(bVar.f156430b, bVar.f156431c).show(((e) context).getSupportFragmentManager(), com.zhihu.matisse.internal.ui.widget.b.class.getName());
            } else if (i2 != 2) {
                Toast makeText = Toast.makeText(context, bVar.f156431c, 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            }
        }
    }
}

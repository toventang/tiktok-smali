package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.zhihu.matisse.internal.entity.Album;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public CursorAdapter f156516a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f156517b;

    /* renamed from: c  reason: collision with root package name */
    public aa f156518c;

    /* renamed from: d  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f156519d;

    static {
        Covode.recordClassIndex(103922);
    }

    public a(Context context) {
        aa aaVar = new aa(context, null, R.attr.a2t);
        this.f156518c = aaVar;
        aaVar.b();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f156518c.b((int) (216.0f * f2));
        this.f156518c.f1476h = (int) (16.0f * f2);
        this.f156518c.a((int) (f2 * -48.0f));
        this.f156518c.q = new AdapterView.OnItemClickListener() {
            /* class com.zhihu.matisse.internal.ui.widget.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103923);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                a.this.a(adapterView.getContext(), i2);
                if (a.this.f156519d != null) {
                    a.this.f156519d.onItemSelected(adapterView, view, i2, j2);
                }
            }
        };
    }

    private static int a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(17694722);
        if (matchConfig == null) {
            return resources.getInteger(17694722);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(17694722);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(17694722);
        }
    }

    public final void a(Context context, int i2) {
        this.f156518c.d();
        Cursor cursor = this.f156516a.getCursor();
        cursor.moveToPosition(i2);
        String a2 = Album.a(cursor).a(context);
        if (this.f156517b.getVisibility() == 0) {
            this.f156517b.setText(a2);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f156517b.setAlpha(0.0f);
        this.f156517b.setVisibility(0);
        this.f156517b.setText(a2);
        this.f156517b.animate().alpha(1.0f).setDuration((long) a(context.getResources())).start();
    }
}

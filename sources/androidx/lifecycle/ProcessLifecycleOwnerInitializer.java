package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    static {
        Covode.recordClassIndex(1282);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!j.f3529a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new j.a());
        }
        Context context2 = getContext();
        w wVar = w.f3548i;
        wVar.f3553e = new Handler();
        wVar.f3554f.a(i.a.ON_CREATE);
        Context applicationContext2 = context2.getApplicationContext();
        if (a.f107168c && applicationContext2 == null) {
            applicationContext2 = a.f107166a;
        }
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new c() {
            /* class androidx.lifecycle.w.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1343);
            }

            @Override // androidx.lifecycle.c
            public final void onActivityStopped(Activity activity) {
                w wVar = w.this;
                wVar.f3549a--;
                wVar.a();
            }

            @Override // androidx.lifecycle.c
            public final void onActivityPaused(Activity activity) {
                w wVar = w.this;
                wVar.f3550b--;
                if (wVar.f3550b == 0) {
                    wVar.f3553e.postDelayed(wVar.f3555g, 700);
                }
            }

            @Override // androidx.lifecycle.c
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ((x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f3560a = w.this.f3556h;
            }
        });
        return true;
    }
}

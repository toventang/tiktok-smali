package androidx.browser.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1776a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1777b;

    static {
        Covode.recordClassIndex(544);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f1778a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f1779b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f1780c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Bundle> f1781d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1782e;

        static {
            Covode.recordClassIndex(545);
        }

        public a() {
            this(null);
        }

        public final c a() {
            ArrayList<Bundle> arrayList = this.f1779b;
            if (arrayList != null) {
                this.f1778a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1781d;
            if (arrayList2 != null) {
                this.f1778a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1778a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1782e);
            return new c(this.f1778a, this.f1780c);
        }

        public a(e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f1778a = intent;
            IBinder iBinder = null;
            this.f1779b = null;
            this.f1780c = null;
            this.f1781d = null;
            this.f1782e = true;
            if (eVar != null) {
                intent.setPackage(eVar.f1785b.getPackageName());
            }
            Bundle bundle = new Bundle();
            androidx.core.app.c.a(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.f1784a.asBinder() : iBinder);
            intent.putExtras(bundle);
        }
    }

    c(Intent intent, Bundle bundle) {
        this.f1776a = intent;
        this.f1777b = bundle;
    }

    public final void a(Context context, Uri uri) {
        this.f1776a.setData(uri);
        b.a(context, this.f1776a, this.f1777b);
    }
}

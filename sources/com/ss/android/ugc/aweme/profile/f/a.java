package com.ss.android.ugc.aweme.profile.f;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.i18n.musically.cut.j;
import com.ss.android.ugc.aweme.profile.f.p;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    protected String f116380a;

    /* renamed from: com.ss.android.ugc.aweme.profile.f.a$a  reason: collision with other inner class name */
    public interface AbstractC2970a extends p.a {
        static {
            Covode.recordClassIndex(75139);
        }

        void a();

        void a(Activity activity, View view);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(75136);
    }

    @Override // com.ss.android.ugc.aweme.profile.f.p
    public final boolean a(int i2, int i3, Intent intent) {
        return i2 == 10004;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.profile.f.p
    public final String b() {
        return this.f116380a;
    }

    public final void a() {
        new j().a(this.f116440b, new j.a() {
            /* class com.ss.android.ugc.aweme.profile.f.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75137);
            }

            @Override // com.ss.android.ugc.aweme.i18n.musically.cut.j.a
            public final void a(String str) {
                if (a.this.f116446h != null) {
                    ((AbstractC2970a) a.this.f116446h).a(str);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        if (this.f116446h != null) {
            ((AbstractC2970a) this.f116446h).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        if (!f()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(View view) {
        if (this.f116446h != null) {
            ((AbstractC2970a) this.f116446h).a(this.f116440b, view);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        String str;
        String str2;
        String[] stringArray = this.f116441c.getStringArray(R.array.ag);
        a.b bVar = new a.b();
        a.e[] eVarArr = new a.e[3];
        a.e eVar = new a.e();
        String str3 = "";
        if (stringArray.length > 0) {
            str = stringArray[0];
        } else {
            str = str3;
        }
        eVarArr[0] = eVar.a(str).a(new b(this));
        a.e eVar2 = new a.e();
        if (stringArray.length >= 2) {
            str2 = stringArray[1];
        } else {
            str2 = str3;
        }
        eVarArr[1] = eVar2.a(str2).a(new c(this));
        a.e eVar3 = new a.e();
        if (stringArray.length >= 3) {
            str3 = stringArray[2];
        }
        eVarArr[2] = eVar3.a(str3).a(new d(this, view));
        bVar.a(eVarArr).b().show(this.f116442d.getFragmentManager(), "Click Avatar Video");
    }

    public final void a(int i2, List<d> list) {
        b(i2, this.f116380a, list);
    }

    public final void a(String str, List<d> list) {
        this.f116380a = str;
        b(0, str, list);
    }

    private void b(int i2, final String str, final List<d> list) {
        com.ss.android.b.a.a.a.a(new Runnable() {
            /* class com.ss.android.ugc.aweme.profile.f.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(75138);
            }

            public final void run() {
                b.g().uploadVideoAvatar(a.this.f116445g, Api.f66571f + "?uid=" + b.g().getCurUserId(), 4194304, str, list);
                b.g().getCurUser().setAvatarUpdateReminder(false);
            }
        }, i2);
    }

    public a(Activity activity, Fragment fragment, WeakHandler weakHandler, AbstractC2970a aVar) {
        super(activity, fragment, weakHandler, aVar);
    }
}

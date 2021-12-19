package com.ss.android.ugc.aweme.arch;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import java.util.List;

public final class a<T> implements u<b> {

    /* renamed from: a  reason: collision with root package name */
    protected c<T> f66986a;

    /* renamed from: b  reason: collision with root package name */
    protected DataCenter f66987b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC1507a<T> f66988c;

    /* renamed from: com.ss.android.ugc.aweme.arch.a$a  reason: collision with other inner class name */
    public interface AbstractC1507a<T> {
        static {
            Covode.recordClassIndex(41288);
        }

        c<T> a(View view);

        void a();

        String b();

        String c();

        String d();

        DataCenter e();
    }

    static {
        Covode.recordClassIndex(41287);
    }

    public a(AbstractC1507a<T> aVar) {
        this.f66987b = aVar.e();
        this.f66988c = aVar;
    }

    private static boolean a(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 1) {
                return true;
            }
            return false;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            return false;
        }
    }

    public final void a(View view) {
        if (this.f66987b == null) {
            this.f66987b = this.f66988c.e();
        }
        if (this.f66987b != null) {
            if (!TextUtils.isEmpty(this.f66988c.b())) {
                this.f66987b.a(this.f66988c.b(), (u<b>) this);
            }
            if (!TextUtils.isEmpty(this.f66988c.c())) {
                this.f66987b.a(this.f66988c.c(), (u<b>) this);
            }
            if (!TextUtils.isEmpty(this.f66988c.d())) {
                this.f66987b.a(this.f66988c.d(), (u<b>) this);
            }
        }
        this.f66986a = this.f66988c.a(view);
        this.f66988c.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        b bVar2 = bVar;
        if (this.f66986a != null && bVar2 != null && !TextUtils.isEmpty(bVar2.f67014a)) {
            String str = bVar2.f67014a;
            if (TextUtils.equals(str, this.f66988c.c())) {
                if (bVar2.a() != 0) {
                    this.f66986a.b();
                }
            } else if (TextUtils.equals(str, this.f66988c.d())) {
                if (bVar2.a() == 0) {
                }
            } else if (TextUtils.equals(str, this.f66988c.b())) {
                b bVar3 = (b) this.f66987b.a(this.f66988c.b());
                int intValue = ((Integer) bVar3.a("action_type")).intValue();
                if (intValue == 1) {
                    this.f66986a.a((List) bVar3.a("list_data"), a(bVar3.a("list_hasmore")));
                } else if (intValue == 2) {
                    this.f66986a.b((List) bVar3.a("list_data"), a(bVar3.a("list_hasmore")));
                }
            }
        }
    }
}

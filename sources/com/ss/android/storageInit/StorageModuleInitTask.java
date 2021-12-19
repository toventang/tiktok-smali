package com.ss.android.storageInit;

import android.content.Context;
import com.aweme.storage.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.u.c;
import com.bytedance.u.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class StorageModuleInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public a f60979a;

    /* renamed from: b  reason: collision with root package name */
    public b f60980b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<com.bytedance.u.a> f60981c = new ArrayList<>();

    static {
        Covode.recordClassIndex(37574);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StorageModuleInitTask f60982a;

        static {
            Covode.recordClassIndex(37575);
        }

        @Override // com.bytedance.u.c
        public final List<com.bytedance.u.a> a() {
            if (this.f60982a.f60981c.size() == 0) {
                if (b.f5939a || com.aweme.storage.a.c.f5941a) {
                    this.f60982a.f60979a = new a();
                    ArrayList<com.bytedance.u.a> arrayList = this.f60982a.f60981c;
                    a aVar = this.f60982a.f60979a;
                    if (aVar == null) {
                        l.b();
                    }
                    arrayList.add(aVar);
                }
                if (com.ss.android.storageInit.a.a.f60983a) {
                    this.f60982a.f60980b = new b();
                    ArrayList<com.bytedance.u.a> arrayList2 = this.f60982a.f60981c;
                    b bVar = this.f60982a.f60980b;
                    if (bVar == null) {
                        l.b();
                    }
                    arrayList2.add(bVar);
                }
            }
            return this.f60982a.f60981c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(StorageModuleInitTask storageModuleInitTask) {
            this.f60982a = storageModuleInitTask;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        d.f45711c = new a(this);
    }
}

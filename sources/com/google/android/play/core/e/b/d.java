package com.google.android.play.core.e.b;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.r;
import com.google.android.play.core.e.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f53286a;

    /* renamed from: b  reason: collision with root package name */
    private final List f53287b;

    /* renamed from: c  reason: collision with root package name */
    private final List f53288c;

    static {
        Covode.recordClassIndex(32921);
    }

    d(a aVar, List list, List list2) {
        this.f53286a = aVar;
        this.f53287b = list;
        this.f53288c = list2;
    }

    public final void run() {
        a aVar = this.f53286a;
        List<File> list = this.f53287b;
        List list2 = this.f53288c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file : list) {
            String a2 = r.a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, aVar.f53266b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", a.a(a2));
            intent.putExtra("split_id", a2);
            arrayList.add(intent);
            arrayList2.add(a.a(r.a(file)));
        }
        f c2 = aVar.c();
        if (c2 != null) {
            aVar.f53268d.execute(new h(aVar, c2.e(), arrayList, arrayList2, list2));
        }
    }
}

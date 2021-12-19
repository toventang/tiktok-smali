package com.ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.a.d;
import h.f.b.l;

public abstract class f extends a {
    static {
        Covode.recordClassIndex(81863);
    }

    public abstract String e();

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public boolean b(Context context) {
        l.d(context, "");
        String e2 = e();
        if (TextUtils.isEmpty(e2)) {
            return true;
        }
        if (e2 == null) {
            l.b();
        }
        return d.a(context, e2);
    }

    protected static String a(m mVar) {
        l.d(mVar, "");
        String str = mVar.f124582e;
        if (str == null || str.length() == 0) {
            return mVar.f124581d;
        }
        return mVar.f124582e + ' ' + mVar.f124581d;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        String e2 = e();
        if (TextUtils.isEmpty(e2)) {
            return true;
        }
        if (e2 == null) {
            l.b();
        }
        return d.a(context, e2);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("image/*");
        intent.setPackage(e());
        intent.putExtra("android.intent.extra.STREAM", lVar.f124575b);
        intent.putExtra("android.intent.extra.TEXT", lVar.f124577d);
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage(e());
        intent.putExtra("android.intent.extra.TEXT", a(mVar));
        return a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setType("video/*");
        intent.setPackage(e());
        intent.putExtra("android.intent.extra.STREAM", nVar.f124583b);
        intent.putExtra("android.intent.extra.TEXT", nVar.f124585d);
        return a(context, intent);
    }
}

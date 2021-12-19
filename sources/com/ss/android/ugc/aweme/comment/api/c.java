package com.ss.android.ugc.aweme.comment.api;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f71461a = new c();

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71462a = new a();

        static {
            Covode.recordClassIndex(43986);
        }

        a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(43985);
    }

    private static void a(Context context, int i2, boolean z) {
        if (!z && i2 != 0) {
            String string = context.getResources().getString(i2);
            l.b(string, "");
            a(context, string, z);
        }
    }

    private static void a(Context context, String str, boolean z) {
        if (!z) {
            try {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(str).a();
            } catch (Exception e2) {
                Logger.throwException(e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(android.content.Context r6, java.lang.Exception r7, int r8, boolean r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 454
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.api.c.a(android.content.Context, java.lang.Exception, int, boolean, boolean):boolean");
    }
}

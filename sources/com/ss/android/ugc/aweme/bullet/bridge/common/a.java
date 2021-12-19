package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import c.b.d;
import c.b.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.utils.fl;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;

final /* synthetic */ class a implements b.AbstractC1579b {

    /* renamed from: a  reason: collision with root package name */
    private final UploadFileMethod f69064a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f69065b;

    static {
        Covode.recordClassIndex(42586);
    }

    a(UploadFileMethod uploadFileMethod, Activity activity) {
        this.f69064a = uploadFileMethod;
        this.f69065b = activity;
    }

    @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
    public final void a(String[] strArr, int[] iArr) {
        UploadFileMethod uploadFileMethod = this.f69064a;
        Activity activity = this.f69065b;
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                try {
                    com.zhihu.matisse.a.a(activity).a(com.zhihu.matisse.b.ofImage()).a().c().a(1).d().b().a(new com.zhihu.matisse.a.a() {
                        /* class com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(42583);
                        }

                        @Override // com.zhihu.matisse.a.a
                        public final com.zhihu.matisse.internal.entity.b a(Context context, Item item) {
                            Uri uri = item.f156423c;
                            if (uri == null || m.a(uri.toString())) {
                                return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.dq6), (byte) 0);
                            }
                            try {
                                if (d.a(com.bytedance.ies.ugc.appcontext.d.a(), uri) == null) {
                                    return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.dq6), (byte) 0);
                                }
                            } catch (FileNotFoundException e2) {
                                e2.printStackTrace();
                            }
                            if (UploadFileMethod.this.n == 0 || e.a(com.bytedance.ies.ugc.appcontext.d.a(), uri) <= UploadFileMethod.this.n) {
                                return null;
                            }
                            return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.e0, fl.a(UploadFileMethod.this.n)), (byte) 0);
                        }
                    }).b(10003);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                    com.ss.android.newmedia.d.a(activity);
                }
            } else {
                new com.bytedance.tux.g.b(activity).a(activity.getString(R.string.doy)).b();
                uploadFileMethod.k();
            }
        }
    }
}

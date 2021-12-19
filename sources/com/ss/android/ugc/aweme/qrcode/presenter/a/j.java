package com.ss.android.ugc.aweme.qrcode.presenter.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.b;
import androidx.fragment.app.e;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.qrcode.e.g;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.utils.cp;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    protected a f119795a;

    /* renamed from: b  reason: collision with root package name */
    protected e f119796b;

    /* renamed from: c  reason: collision with root package name */
    public String f119797c = "";

    public interface a {
        static {
            Covode.recordClassIndex(77839);
        }

        void d();

        void e();

        View getView();
    }

    static {
        Covode.recordClassIndex(77833);
    }

    public final void b() {
        this.f119795a = null;
        this.f119796b = null;
    }

    public final void c() {
        this.f119795a.d();
        com.ss.android.b.a.a.a.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.qrcode.presenter.a.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77834);
            }

            public final void run() {
                if (TextUtils.isEmpty(j.this.f119797c)) {
                    j.this.f119797c = d.b(new StringBuilder().append(System.currentTimeMillis()).toString()) + ".png";
                }
                if (j.this.f119795a != null) {
                    final Uri a2 = g.a(j.this.f119795a.getView(), j.this.f119797c, j.this.f119796b);
                    com.ss.android.b.a.a.a.b(new Runnable() {
                        /* class com.ss.android.ugc.aweme.qrcode.presenter.a.j.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(77835);
                        }

                        public final void run() {
                            if (j.this.f119795a != null) {
                                j.this.f119795a.e();
                            }
                        }
                    });
                }
            }
        });
    }

    public final void a() {
        if (b.a(this.f119796b, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            c();
        } else {
            d();
        }
    }

    public final void d() {
        com.ss.android.ugc.aweme.ce.b.a(this.f119796b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.AbstractC1579b() {
            /* class com.ss.android.ugc.aweme.qrcode.presenter.a.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(77836);
            }

            @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
            public final void a(String[] strArr, int[] iArr) {
                if (iArr.length > 0 && iArr[0] == -1 && !androidx.core.app.a.a((Activity) j.this.f119796b, strArr[0])) {
                    bt.a(j.this.f119796b, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.qrcode.presenter.a.j.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(77837);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                        }
                    }, new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.qrcode.presenter.a.j.AnonymousClass2.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(77838);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            cp.a(j.this.f119796b);
                        }
                    }).show();
                }
            }
        });
    }
}

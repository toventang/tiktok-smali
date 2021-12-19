package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.utils.cp;
import com.ss.android.ugc.aweme.utils.permission.e;
import com.zhiliaoapp.musically.R;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    b f99858a;

    /* renamed from: b  reason: collision with root package name */
    private a f99859b;

    public interface a {
        static {
            Covode.recordClassIndex(63665);
        }

        void a(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(63666);
        }

        void a(Intent intent);
    }

    static {
        Covode.recordClassIndex(63661);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(Activity activity, a aVar) {
        this.f99859b = aVar;
        SmartRouter.buildRoute(activity, "//profile/avatar_choose").open(2, new k(this));
    }

    public final void a(final Activity activity, final a aVar) {
        if (e.c(activity) == 0) {
            b(activity, aVar);
        } else {
            com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.AbstractC1579b() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(63662);
                }

                @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                public final void a(String[] strArr, int[] iArr) {
                    Activity activity = activity;
                    if (activity != null && !activity.isFinishing()) {
                        if (iArr[0] == 0) {
                            j.this.b(activity, aVar);
                            return;
                        }
                        Activity activity2 = activity;
                        c a2 = new c.a(activity2, R.style.l9).a(R.string.di0).b(R.string.dhy).b(R.string.a9e, new DialogInterface.OnClickListener(activity2) {
                            /* class com.ss.android.ugc.aweme.i18n.musically.cut.j.AnonymousClass3 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ Activity f99864a;

                            static {
                                Covode.recordClassIndex(63664);
                            }

                            {
                                this.f99864a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                this.f99864a.finish();
                            }
                        }).a(R.string.asg, new DialogInterface.OnClickListener(activity2) {
                            /* class com.ss.android.ugc.aweme.i18n.musically.cut.j.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ Activity f99863a;

                            static {
                                Covode.recordClassIndex(63663);
                            }

                            {
                                this.f99863a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                cp.a(this.f99863a);
                            }
                        }).a();
                        try {
                            a2.setCancelable(false);
                            a2.setCanceledOnTouchOutside(false);
                            a2.show();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1) {
            if (i2 == 2) {
                this.f99859b.a(a(intent, "mp4"));
            } else if (i2 == 3) {
                this.f99858a.a(intent);
            }
        }
    }
}
